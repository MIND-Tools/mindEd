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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_INCLUDELIB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'struct'", "'union'", "'const'", "'volatile'", "'void'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'", "'#ifndef'", "'#endif'", "';'", "'typedef'", "'{'", "'}'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'...'", "'#include'"
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


    // $ANTLR start entryRuleConstantDefinitionBegin
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:88:1: entryRuleConstantDefinitionBegin : ruleConstantDefinitionBegin EOF ;
    public final void entryRuleConstantDefinitionBegin() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:89:1: ( ruleConstantDefinitionBegin EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:90:1: ruleConstantDefinitionBegin EOF
            {
             before(grammarAccess.getConstantDefinitionBeginRule()); 
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin122);
            ruleConstantDefinitionBegin();
            _fsp--;

             after(grammarAccess.getConstantDefinitionBeginRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionBegin129); 

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
    // $ANTLR end entryRuleConstantDefinitionBegin


    // $ANTLR start ruleConstantDefinitionBegin
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:97:1: ruleConstantDefinitionBegin : ( ( rule__ConstantDefinitionBegin__Group__0 ) ) ;
    public final void ruleConstantDefinitionBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:101:2: ( ( ( rule__ConstantDefinitionBegin__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:102:1: ( ( rule__ConstantDefinitionBegin__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:102:1: ( ( rule__ConstantDefinitionBegin__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:103:1: ( rule__ConstantDefinitionBegin__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionBeginAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:104:1: ( rule__ConstantDefinitionBegin__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:104:2: rule__ConstantDefinitionBegin__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__0_in_ruleConstantDefinitionBegin156);
            rule__ConstantDefinitionBegin__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionBeginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstantDefinitionBegin


    // $ANTLR start entryRuleConstantDefinitionEnd
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:116:1: entryRuleConstantDefinitionEnd : ruleConstantDefinitionEnd EOF ;
    public final void entryRuleConstantDefinitionEnd() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:117:1: ( ruleConstantDefinitionEnd EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:118:1: ruleConstantDefinitionEnd EOF
            {
             before(grammarAccess.getConstantDefinitionEndRule()); 
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd183);
            ruleConstantDefinitionEnd();
            _fsp--;

             after(grammarAccess.getConstantDefinitionEndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionEnd190); 

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
    // $ANTLR end entryRuleConstantDefinitionEnd


    // $ANTLR start ruleConstantDefinitionEnd
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:125:1: ruleConstantDefinitionEnd : ( ( rule__ConstantDefinitionEnd__Group__0 ) ) ;
    public final void ruleConstantDefinitionEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:129:2: ( ( ( rule__ConstantDefinitionEnd__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:130:1: ( ( rule__ConstantDefinitionEnd__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:130:1: ( ( rule__ConstantDefinitionEnd__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:131:1: ( rule__ConstantDefinitionEnd__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionEndAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:132:1: ( rule__ConstantDefinitionEnd__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:132:2: rule__ConstantDefinitionEnd__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionEnd__Group__0_in_ruleConstantDefinitionEnd217);
            rule__ConstantDefinitionEnd__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstantDefinitionEnd


    // $ANTLR start entryRuleTypeDefinition
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:146:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:147:1: ( ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:148:1: ruleTypeDefinition EOF
            {
             before(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition246);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition253); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:155:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:159:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:160:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:160:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:161:1: ( rule__TypeDefinition__Group__0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:162:1: ( rule__TypeDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:162:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition280);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:174:1: entryRuleTypedefSpecification : ruleTypedefSpecification EOF ;
    public final void entryRuleTypedefSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:175:1: ( ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:176:1: ruleTypedefSpecification EOF
            {
             before(grammarAccess.getTypedefSpecificationRule()); 
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification307);
            ruleTypedefSpecification();
            _fsp--;

             after(grammarAccess.getTypedefSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification314); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:183:1: ruleTypedefSpecification : ( ( rule__TypedefSpecification__Group__0 ) ) ;
    public final void ruleTypedefSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:187:2: ( ( ( rule__TypedefSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:188:1: ( ( rule__TypedefSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:188:1: ( ( rule__TypedefSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:189:1: ( rule__TypedefSpecification__Group__0 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:190:1: ( rule__TypedefSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:190:2: rule__TypedefSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification341);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:202:1: entryRuleQualifiedTypeSpecification : ruleQualifiedTypeSpecification EOF ;
    public final void entryRuleQualifiedTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:203:1: ( ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:204:1: ruleQualifiedTypeSpecification EOF
            {
             before(grammarAccess.getQualifiedTypeSpecificationRule()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification368);
            ruleQualifiedTypeSpecification();
            _fsp--;

             after(grammarAccess.getQualifiedTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification375); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:211:1: ruleQualifiedTypeSpecification : ( ( rule__QualifiedTypeSpecification__Group__0 ) ) ;
    public final void ruleQualifiedTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:215:2: ( ( ( rule__QualifiedTypeSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:216:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:216:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:217:1: ( rule__QualifiedTypeSpecification__Group__0 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:218:1: ( rule__QualifiedTypeSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:218:2: rule__QualifiedTypeSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification402);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:230:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:231:1: ( ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:232:1: ruleTypeSpecification EOF
            {
             before(grammarAccess.getTypeSpecificationRule()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification429);
            ruleTypeSpecification();
            _fsp--;

             after(grammarAccess.getTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification436); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:239:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:243:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:244:1: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:244:1: ( ( rule__TypeSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:245:1: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:246:1: ( rule__TypeSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:246:2: rule__TypeSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification463);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:258:1: entryRuleTypedefName : ruleTypedefName EOF ;
    public final void entryRuleTypedefName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:259:1: ( ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:260:1: ruleTypedefName EOF
            {
             before(grammarAccess.getTypedefNameRule()); 
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName490);
            ruleTypedefName();
            _fsp--;

             after(grammarAccess.getTypedefNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName497); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:267:1: ruleTypedefName : ( ruleFullyQualifiedName ) ;
    public final void ruleTypedefName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:271:2: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:272:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:272:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:273:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName524);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:286:1: entryRuleStructOrUnionSpecification : ruleStructOrUnionSpecification EOF ;
    public final void entryRuleStructOrUnionSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:287:1: ( ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:288:1: ruleStructOrUnionSpecification EOF
            {
             before(grammarAccess.getStructOrUnionSpecificationRule()); 
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification550);
            ruleStructOrUnionSpecification();
            _fsp--;

             after(grammarAccess.getStructOrUnionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification557); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:295:1: ruleStructOrUnionSpecification : ( ( rule__StructOrUnionSpecification__Alternatives ) ) ;
    public final void ruleStructOrUnionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:299:2: ( ( ( rule__StructOrUnionSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:300:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:300:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:301:1: ( rule__StructOrUnionSpecification__Alternatives )
            {
             before(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:302:1: ( rule__StructOrUnionSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:302:2: rule__StructOrUnionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification584);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:314:1: entryRuleStructOrUnionDefinition : ruleStructOrUnionDefinition EOF ;
    public final void entryRuleStructOrUnionDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:315:1: ( ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:316:1: ruleStructOrUnionDefinition EOF
            {
             before(grammarAccess.getStructOrUnionDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition611);
            ruleStructOrUnionDefinition();
            _fsp--;

             after(grammarAccess.getStructOrUnionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition618); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:323:1: ruleStructOrUnionDefinition : ( ( rule__StructOrUnionDefinition__Group__0 ) ) ;
    public final void ruleStructOrUnionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:327:2: ( ( ( rule__StructOrUnionDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:328:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:328:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:329:1: ( rule__StructOrUnionDefinition__Group__0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:330:1: ( rule__StructOrUnionDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:330:2: rule__StructOrUnionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition645);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:342:1: entryRuleStructorUnionReference : ruleStructorUnionReference EOF ;
    public final void entryRuleStructorUnionReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:343:1: ( ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:344:1: ruleStructorUnionReference EOF
            {
             before(grammarAccess.getStructorUnionReferenceRule()); 
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference672);
            ruleStructorUnionReference();
            _fsp--;

             after(grammarAccess.getStructorUnionReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference679); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:351:1: ruleStructorUnionReference : ( ( rule__StructorUnionReference__Group__0 ) ) ;
    public final void ruleStructorUnionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:355:2: ( ( ( rule__StructorUnionReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:356:1: ( ( rule__StructorUnionReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:356:1: ( ( rule__StructorUnionReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:357:1: ( rule__StructorUnionReference__Group__0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:358:1: ( rule__StructorUnionReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:358:2: rule__StructorUnionReference__Group__0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference706);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:370:1: entryRuleStructOrUnion : ruleStructOrUnion EOF ;
    public final void entryRuleStructOrUnion() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:371:1: ( ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:372:1: ruleStructOrUnion EOF
            {
             before(grammarAccess.getStructOrUnionRule()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion733);
            ruleStructOrUnion();
            _fsp--;

             after(grammarAccess.getStructOrUnionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion740); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:379:1: ruleStructOrUnion : ( ( rule__StructOrUnion__Alternatives ) ) ;
    public final void ruleStructOrUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:383:2: ( ( ( rule__StructOrUnion__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:384:1: ( ( rule__StructOrUnion__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:384:1: ( ( rule__StructOrUnion__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:385:1: ( rule__StructOrUnion__Alternatives )
            {
             before(grammarAccess.getStructOrUnionAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:386:1: ( rule__StructOrUnion__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:386:2: rule__StructOrUnion__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion767);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:398:1: entryRuleStructMember : ruleStructMember EOF ;
    public final void entryRuleStructMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:399:1: ( ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:400:1: ruleStructMember EOF
            {
             before(grammarAccess.getStructMemberRule()); 
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember794);
            ruleStructMember();
            _fsp--;

             after(grammarAccess.getStructMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember801); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:407:1: ruleStructMember : ( ( rule__StructMember__Group__0 ) ) ;
    public final void ruleStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:411:2: ( ( ( rule__StructMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:412:1: ( ( rule__StructMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:412:1: ( ( rule__StructMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:413:1: ( rule__StructMember__Group__0 )
            {
             before(grammarAccess.getStructMemberAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:414:1: ( rule__StructMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:414:2: rule__StructMember__Group__0
            {
            pushFollow(FOLLOW_rule__StructMember__Group__0_in_ruleStructMember828);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:426:1: entryRuleEnumSpecification : ruleEnumSpecification EOF ;
    public final void entryRuleEnumSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:427:1: ( ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:428:1: ruleEnumSpecification EOF
            {
             before(grammarAccess.getEnumSpecificationRule()); 
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification855);
            ruleEnumSpecification();
            _fsp--;

             after(grammarAccess.getEnumSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification862); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:435:1: ruleEnumSpecification : ( ( rule__EnumSpecification__Alternatives ) ) ;
    public final void ruleEnumSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:439:2: ( ( ( rule__EnumSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:440:1: ( ( rule__EnumSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:440:1: ( ( rule__EnumSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:441:1: ( rule__EnumSpecification__Alternatives )
            {
             before(grammarAccess.getEnumSpecificationAccess().getAlternatives()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:442:1: ( rule__EnumSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:442:2: rule__EnumSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification889);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:454:1: entryRuleEnumDefinition : ruleEnumDefinition EOF ;
    public final void entryRuleEnumDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:455:1: ( ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:456:1: ruleEnumDefinition EOF
            {
             before(grammarAccess.getEnumDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition916);
            ruleEnumDefinition();
            _fsp--;

             after(grammarAccess.getEnumDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition923); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:463:1: ruleEnumDefinition : ( ( rule__EnumDefinition__Group__0 ) ) ;
    public final void ruleEnumDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:467:2: ( ( ( rule__EnumDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:468:1: ( ( rule__EnumDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:468:1: ( ( rule__EnumDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:469:1: ( rule__EnumDefinition__Group__0 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:470:1: ( rule__EnumDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:470:2: rule__EnumDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition950);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:482:1: entryRuleEnumReference : ruleEnumReference EOF ;
    public final void entryRuleEnumReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:483:1: ( ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:484:1: ruleEnumReference EOF
            {
             before(grammarAccess.getEnumReferenceRule()); 
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference977);
            ruleEnumReference();
            _fsp--;

             after(grammarAccess.getEnumReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference984); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:491:1: ruleEnumReference : ( ( rule__EnumReference__Group__0 ) ) ;
    public final void ruleEnumReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:495:2: ( ( ( rule__EnumReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:496:1: ( ( rule__EnumReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:496:1: ( ( rule__EnumReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:497:1: ( rule__EnumReference__Group__0 )
            {
             before(grammarAccess.getEnumReferenceAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:498:1: ( rule__EnumReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:498:2: rule__EnumReference__Group__0
            {
            pushFollow(FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference1011);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:510:1: entryRuleEnumMemberList : ruleEnumMemberList EOF ;
    public final void entryRuleEnumMemberList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:511:1: ( ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:512:1: ruleEnumMemberList EOF
            {
             before(grammarAccess.getEnumMemberListRule()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1038);
            ruleEnumMemberList();
            _fsp--;

             after(grammarAccess.getEnumMemberListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList1045); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:519:1: ruleEnumMemberList : ( ( rule__EnumMemberList__Group__0 ) ) ;
    public final void ruleEnumMemberList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:523:2: ( ( ( rule__EnumMemberList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:524:1: ( ( rule__EnumMemberList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:524:1: ( ( rule__EnumMemberList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:525:1: ( rule__EnumMemberList__Group__0 )
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:526:1: ( rule__EnumMemberList__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:526:2: rule__EnumMemberList__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList1072);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:538:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:539:1: ( ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:540:1: ruleEnumMember EOF
            {
             before(grammarAccess.getEnumMemberRule()); 
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1099);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1106); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:547:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:551:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:552:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:552:1: ( ( rule__EnumMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:553:1: ( rule__EnumMember__Group__0 )
            {
             before(grammarAccess.getEnumMemberAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:554:1: ( rule__EnumMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:554:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1133);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:566:1: entryRuleDeclarators : ruleDeclarators EOF ;
    public final void entryRuleDeclarators() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:567:1: ( ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:568:1: ruleDeclarators EOF
            {
             before(grammarAccess.getDeclaratorsRule()); 
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators1160);
            ruleDeclarators();
            _fsp--;

             after(grammarAccess.getDeclaratorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators1167); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:575:1: ruleDeclarators : ( ( rule__Declarators__Group__0 ) ) ;
    public final void ruleDeclarators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:579:2: ( ( ( rule__Declarators__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:580:1: ( ( rule__Declarators__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:580:1: ( ( rule__Declarators__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:581:1: ( rule__Declarators__Group__0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:582:1: ( rule__Declarators__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:582:2: rule__Declarators__Group__0
            {
            pushFollow(FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1194);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:594:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:595:1: ( ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:596:1: ruleDeclarator EOF
            {
             before(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1221);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator1228); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:603:1: ruleDeclarator : ( ( rule__Declarator__Group__0 ) ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:607:2: ( ( ( rule__Declarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:608:1: ( ( rule__Declarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:608:1: ( ( rule__Declarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:609:1: ( rule__Declarator__Group__0 )
            {
             before(grammarAccess.getDeclaratorAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:610:1: ( rule__Declarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:610:2: rule__Declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1255);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:622:1: entryRuleDirectDeclarator : ruleDirectDeclarator EOF ;
    public final void entryRuleDirectDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:623:1: ( ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:624:1: ruleDirectDeclarator EOF
            {
             before(grammarAccess.getDirectDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1282);
            ruleDirectDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator1289); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:631:1: ruleDirectDeclarator : ( ( rule__DirectDeclarator__Group__0 ) ) ;
    public final void ruleDirectDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:635:2: ( ( ( rule__DirectDeclarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:636:1: ( ( rule__DirectDeclarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:636:1: ( ( rule__DirectDeclarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:637:1: ( rule__DirectDeclarator__Group__0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:638:1: ( rule__DirectDeclarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:638:2: rule__DirectDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1316);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:650:1: entryRuleArraySpecification : ruleArraySpecification EOF ;
    public final void entryRuleArraySpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:651:1: ( ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:652:1: ruleArraySpecification EOF
            {
             before(grammarAccess.getArraySpecificationRule()); 
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1343);
            ruleArraySpecification();
            _fsp--;

             after(grammarAccess.getArraySpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification1350); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:659:1: ruleArraySpecification : ( ( rule__ArraySpecification__Group__0 ) ) ;
    public final void ruleArraySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:663:2: ( ( ( rule__ArraySpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:664:1: ( ( rule__ArraySpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:664:1: ( ( rule__ArraySpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:665:1: ( rule__ArraySpecification__Group__0 )
            {
             before(grammarAccess.getArraySpecificationAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:666:1: ( rule__ArraySpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:666:2: rule__ArraySpecification__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1377);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:678:1: entryRuleFullyQualifiedName : ruleFullyQualifiedName EOF ;
    public final void entryRuleFullyQualifiedName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:679:1: ( ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:680:1: ruleFullyQualifiedName EOF
            {
             before(grammarAccess.getFullyQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1404);
            ruleFullyQualifiedName();
            _fsp--;

             after(grammarAccess.getFullyQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName1411); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:687:1: ruleFullyQualifiedName : ( ( rule__FullyQualifiedName__Group__0 ) ) ;
    public final void ruleFullyQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:691:2: ( ( ( rule__FullyQualifiedName__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:692:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:692:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:693:1: ( rule__FullyQualifiedName__Group__0 )
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:694:1: ( rule__FullyQualifiedName__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:694:2: rule__FullyQualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1438);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:706:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:707:1: ( ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:708:1: ruleConstantDefinition EOF
            {
             before(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1465);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getConstantDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition1472); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:715:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:719:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:720:1: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:720:1: ( ( rule__ConstantDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:721:1: ( rule__ConstantDefinition__Group__0 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:722:1: ( rule__ConstantDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:722:2: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1499);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:734:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:735:1: ( ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:736:1: ruleInterfaceDefinition EOF
            {
             before(grammarAccess.getInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1526);
            ruleInterfaceDefinition();
            _fsp--;

             after(grammarAccess.getInterfaceDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition1533); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:743:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:747:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:748:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:748:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:749:1: ( rule__InterfaceDefinition__Group__0 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:750:1: ( rule__InterfaceDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:750:2: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1560);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:762:1: entryRuleMethodDefinition : ruleMethodDefinition EOF ;
    public final void entryRuleMethodDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:763:1: ( ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:764:1: ruleMethodDefinition EOF
            {
             before(grammarAccess.getMethodDefinitionRule()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1587);
            ruleMethodDefinition();
            _fsp--;

             after(grammarAccess.getMethodDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition1594); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:771:1: ruleMethodDefinition : ( ( rule__MethodDefinition__Group__0 ) ) ;
    public final void ruleMethodDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:775:2: ( ( ( rule__MethodDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:776:1: ( ( rule__MethodDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:776:1: ( ( rule__MethodDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:777:1: ( rule__MethodDefinition__Group__0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:778:1: ( rule__MethodDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:778:2: rule__MethodDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1621);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:790:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:791:1: ( ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:792:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1648);
            ruleParameterList();
            _fsp--;

             after(grammarAccess.getParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1655); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:799:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:803:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:804:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:804:1: ( ( rule__ParameterList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:805:1: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:806:1: ( rule__ParameterList__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:806:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1682);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:818:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:819:1: ( ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:820:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1709);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1716); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:827:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:831:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:832:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:832:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:833:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:834:1: ( rule__Parameter__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:834:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1743);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:846:1: entryRuleIncludeDirective : ruleIncludeDirective EOF ;
    public final void entryRuleIncludeDirective() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:847:1: ( ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:848:1: ruleIncludeDirective EOF
            {
             before(grammarAccess.getIncludeDirectiveRule()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1770);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getIncludeDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective1777); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:855:1: ruleIncludeDirective : ( ( rule__IncludeDirective__Group__0 ) ) ;
    public final void ruleIncludeDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:859:2: ( ( ( rule__IncludeDirective__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:860:1: ( ( rule__IncludeDirective__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:860:1: ( ( rule__IncludeDirective__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:861:1: ( rule__IncludeDirective__Group__0 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getGroup()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:862:1: ( rule__IncludeDirective__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:862:2: rule__IncludeDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1804);
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


    // $ANTLR start rule__IdtFile__Alternatives_3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:931:1: rule__IdtFile__Alternatives_3 : ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) );
    public final void rule__IdtFile__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:935:1: ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==54) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==41||LA1_0==45) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("931:1: rule__IdtFile__Alternatives_3 : ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:936:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:936:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:937:1: ( rule__IdtFile__ConstantAssignment_3_0 )
                    {
                     before(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:938:1: ( rule__IdtFile__ConstantAssignment_3_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:938:2: rule__IdtFile__ConstantAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_rule__IdtFile__Alternatives_31948);
                    rule__IdtFile__ConstantAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:942:6: ( ( rule__IdtFile__TypeAssignment_3_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:942:6: ( ( rule__IdtFile__TypeAssignment_3_1 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:943:1: ( rule__IdtFile__TypeAssignment_3_1 )
                    {
                     before(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:944:1: ( rule__IdtFile__TypeAssignment_3_1 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:944:2: rule__IdtFile__TypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__IdtFile__TypeAssignment_3_1_in_rule__IdtFile__Alternatives_31966);
                    rule__IdtFile__TypeAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end rule__IdtFile__Alternatives_3


    // $ANTLR start rule__TypeDefinition__Alternatives_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:954:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );
    public final void rule__TypeDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:958:1: ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 41:
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
            case 45:
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
            case 12:
            case 13:
                {
                alt4=2;
                }
                break;
            case 45:
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

                        if ( ((LA3_0>=16 && LA3_0<=35)) ) {
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

            if ( (LA5_0==12) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==40||(LA5_3>=48 && LA5_3<=49)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==42) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==42) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==13) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==40||(LA5_3>=48 && LA5_3<=49)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==42) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1023:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==42) ) {
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

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
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
                    match(input,12,FOLLOW_12_in_rule__StructOrUnion__Alternatives2218); 
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
                    match(input,13,FOLLOW_13_in_rule__StructOrUnion__Alternatives2238); 
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

            if ( (LA7_0==45) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==40||(LA7_2>=48 && LA7_2<=49)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==42) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1071:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==42) ) {
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
            else if ( (LA8_0==49) ) {
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


    // $ANTLR start rule__ArraySpecification__Alternatives_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1115:1: rule__ArraySpecification__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__ArraySpecification__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1119:1: ( ( RULE_INT ) | ( RULE_ID ) )
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
                    new NoViableAltException("1115:1: rule__ArraySpecification__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1120:1: ( RULE_INT )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1120:1: ( RULE_INT )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1121:1: RULE_INT
                    {
                     before(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySpecification__Alternatives_12372); 
                     after(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1126:6: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1126:6: ( RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1127:1: RULE_ID
                    {
                     before(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArraySpecification__Alternatives_12389); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1137:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );
    public final void rule__MethodDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1141:1: ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==49) ) {
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
                case 45:
                    {
                    alt10=2;
                    }
                    break;
                case 16:
                    {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==RULE_ID||(LA10_3>=16 && LA10_3<=35)||(LA10_3>=48 && LA10_3<=49)) ) {
                        alt10=2;
                    }
                    else if ( (LA10_3==50) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1137:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 10, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 50:
                    {
                    alt10=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1137:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1137:1: rule__MethodDefinition__Alternatives_2 : ( ( ( rule__MethodDefinition__Group_2_0__0 ) ) | ( ( rule__MethodDefinition__Group_2_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1142:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1142:1: ( ( rule__MethodDefinition__Group_2_0__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1143:1: ( rule__MethodDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1144:1: ( rule__MethodDefinition__Group_2_0__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1144:2: rule__MethodDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22421);
                    rule__MethodDefinition__Group_2_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMethodDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1148:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1148:6: ( ( rule__MethodDefinition__Group_2_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1149:1: ( rule__MethodDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getMethodDefinitionAccess().getGroup_2_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1150:1: ( rule__MethodDefinition__Group_2_1__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1150:2: rule__MethodDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22439);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1159:1: rule__IncludeDirective__Alternatives_1 : ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) );
    public final void rule__IncludeDirective__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1163:1: ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) )
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
                    new NoViableAltException("1159:1: rule__IncludeDirective__Alternatives_1 : ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1164:1: ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1164:1: ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1165:1: ( rule__IncludeDirective__ImportedURIAssignment_1_0 )
                    {
                     before(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1166:1: ( rule__IncludeDirective__ImportedURIAssignment_1_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1166:2: rule__IncludeDirective__ImportedURIAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__IncludeDirective__ImportedURIAssignment_1_0_in_rule__IncludeDirective__Alternatives_12472);
                    rule__IncludeDirective__ImportedURIAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1170:6: ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1170:6: ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1171:1: ( rule__IncludeDirective__IncludeIDAssignment_1_1 )
                    {
                     before(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1172:1: ( rule__IncludeDirective__IncludeIDAssignment_1_1 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1172:2: rule__IncludeDirective__IncludeIDAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__IncludeDirective__IncludeIDAssignment_1_1_in_rule__IncludeDirective__Alternatives_12490);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1181:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );
    public final void rule__TypeQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1185:1: ( ( ( 'const' ) ) | ( ( 'volatile' ) ) )
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
                    new NoViableAltException("1181:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1186:1: ( ( 'const' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1186:1: ( ( 'const' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1187:1: ( 'const' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1188:1: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1188:3: 'const'
                    {
                    match(input,14,FOLLOW_14_in_rule__TypeQualifier__Alternatives2524); 

                    }

                     after(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1193:6: ( ( 'volatile' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1193:6: ( ( 'volatile' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1194:1: ( 'volatile' )
                    {
                     before(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1195:1: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1195:3: 'volatile'
                    {
                    match(input,15,FOLLOW_15_in_rule__TypeQualifier__Alternatives2545); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1205:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );
    public final void rule__TypeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1209:1: ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) )
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
                    new NoViableAltException("1205:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1210:1: ( ( 'void' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1210:1: ( ( 'void' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1211:1: ( 'void' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1212:1: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1212:3: 'void'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeSpecifier__Alternatives2581); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1217:6: ( ( 'char' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1217:6: ( ( 'char' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1218:1: ( 'char' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1219:1: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1219:3: 'char'
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeSpecifier__Alternatives2602); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1224:6: ( ( 'short' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1224:6: ( ( 'short' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1225:1: ( 'short' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1226:1: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1226:3: 'short'
                    {
                    match(input,18,FOLLOW_18_in_rule__TypeSpecifier__Alternatives2623); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1231:6: ( ( 'int' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1231:6: ( ( 'int' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1232:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1233:1: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1233:3: 'int'
                    {
                    match(input,19,FOLLOW_19_in_rule__TypeSpecifier__Alternatives2644); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1238:6: ( ( 'long' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1238:6: ( ( 'long' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1239:1: ( 'long' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1240:1: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1240:3: 'long'
                    {
                    match(input,20,FOLLOW_20_in_rule__TypeSpecifier__Alternatives2665); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1245:6: ( ( 'float' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1245:6: ( ( 'float' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1246:1: ( 'float' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1247:1: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1247:3: 'float'
                    {
                    match(input,21,FOLLOW_21_in_rule__TypeSpecifier__Alternatives2686); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1252:6: ( ( 'double' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1252:6: ( ( 'double' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1253:1: ( 'double' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1254:1: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1254:3: 'double'
                    {
                    match(input,22,FOLLOW_22_in_rule__TypeSpecifier__Alternatives2707); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1259:6: ( ( 'signed' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1259:6: ( ( 'signed' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1260:1: ( 'signed' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1261:1: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1261:3: 'signed'
                    {
                    match(input,23,FOLLOW_23_in_rule__TypeSpecifier__Alternatives2728); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1266:6: ( ( 'unsigned' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1266:6: ( ( 'unsigned' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1267:1: ( 'unsigned' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1268:1: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1268:3: 'unsigned'
                    {
                    match(input,24,FOLLOW_24_in_rule__TypeSpecifier__Alternatives2749); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1273:6: ( ( 'string' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1273:6: ( ( 'string' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1274:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1275:1: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1275:3: 'string'
                    {
                    match(input,25,FOLLOW_25_in_rule__TypeSpecifier__Alternatives2770); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1280:6: ( ( 'int8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1280:6: ( ( 'int8_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1281:1: ( 'int8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1282:1: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1282:3: 'int8_t'
                    {
                    match(input,26,FOLLOW_26_in_rule__TypeSpecifier__Alternatives2791); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1287:6: ( ( 'uint8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1287:6: ( ( 'uint8_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1288:1: ( 'uint8_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1289:1: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1289:3: 'uint8_t'
                    {
                    match(input,27,FOLLOW_27_in_rule__TypeSpecifier__Alternatives2812); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1294:6: ( ( 'int16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1294:6: ( ( 'int16_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1295:1: ( 'int16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1296:1: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1296:3: 'int16_t'
                    {
                    match(input,28,FOLLOW_28_in_rule__TypeSpecifier__Alternatives2833); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1301:6: ( ( 'uint16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1301:6: ( ( 'uint16_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1302:1: ( 'uint16_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1303:1: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1303:3: 'uint16_t'
                    {
                    match(input,29,FOLLOW_29_in_rule__TypeSpecifier__Alternatives2854); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1308:6: ( ( 'int32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1308:6: ( ( 'int32_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1309:1: ( 'int32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1310:1: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1310:3: 'int32_t'
                    {
                    match(input,30,FOLLOW_30_in_rule__TypeSpecifier__Alternatives2875); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1315:6: ( ( 'uint32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1315:6: ( ( 'uint32_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1316:1: ( 'uint32_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1317:1: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1317:3: 'uint32_t'
                    {
                    match(input,31,FOLLOW_31_in_rule__TypeSpecifier__Alternatives2896); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1322:6: ( ( 'int64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1322:6: ( ( 'int64_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1323:1: ( 'int64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1324:1: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1324:3: 'int64_t'
                    {
                    match(input,32,FOLLOW_32_in_rule__TypeSpecifier__Alternatives2917); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1329:6: ( ( 'uint64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1329:6: ( ( 'uint64_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1330:1: ( 'uint64_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1331:1: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1331:3: 'uint64_t'
                    {
                    match(input,33,FOLLOW_33_in_rule__TypeSpecifier__Alternatives2938); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1336:6: ( ( 'intptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1336:6: ( ( 'intptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1337:1: ( 'intptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1338:1: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1338:3: 'intptr_t'
                    {
                    match(input,34,FOLLOW_34_in_rule__TypeSpecifier__Alternatives2959); 

                    }

                     after(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1343:6: ( ( 'uintptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1343:6: ( ( 'uintptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1344:1: ( 'uintptr_t' )
                    {
                     before(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1345:1: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1345:3: 'uintptr_t'
                    {
                    match(input,35,FOLLOW_35_in_rule__TypeSpecifier__Alternatives2980); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1355:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__ParameterQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1359:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
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
                    new NoViableAltException("1355:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1360:1: ( ( 'in' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1360:1: ( ( 'in' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1361:1: ( 'in' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1362:1: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1362:3: 'in'
                    {
                    match(input,36,FOLLOW_36_in_rule__ParameterQualifier__Alternatives3016); 

                    }

                     after(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:6: ( ( 'out' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:6: ( ( 'out' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1368:1: ( 'out' )
                    {
                     before(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:1: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:3: 'out'
                    {
                    match(input,37,FOLLOW_37_in_rule__ParameterQualifier__Alternatives3037); 

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1381:1: rule__IdtFile__Group__0 : ( ( rule__IdtFile__BegindefAssignment_0 ) ) rule__IdtFile__Group__1 ;
    public final void rule__IdtFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1385:1: ( ( ( rule__IdtFile__BegindefAssignment_0 ) ) rule__IdtFile__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1386:1: ( ( rule__IdtFile__BegindefAssignment_0 ) ) rule__IdtFile__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1386:1: ( ( rule__IdtFile__BegindefAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1387:1: ( rule__IdtFile__BegindefAssignment_0 )
            {
             before(grammarAccess.getIdtFileAccess().getBegindefAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1388:1: ( rule__IdtFile__BegindefAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1388:2: rule__IdtFile__BegindefAssignment_0
            {
            pushFollow(FOLLOW_rule__IdtFile__BegindefAssignment_0_in_rule__IdtFile__Group__03074);
            rule__IdtFile__BegindefAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIdtFileAccess().getBegindefAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__03083);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1399:1: rule__IdtFile__Group__1 : ( ( rule__IdtFile__DefAssignment_1 ) ) rule__IdtFile__Group__2 ;
    public final void rule__IdtFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1403:1: ( ( ( rule__IdtFile__DefAssignment_1 ) ) rule__IdtFile__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1404:1: ( ( rule__IdtFile__DefAssignment_1 ) ) rule__IdtFile__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1404:1: ( ( rule__IdtFile__DefAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1405:1: ( rule__IdtFile__DefAssignment_1 )
            {
             before(grammarAccess.getIdtFileAccess().getDefAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1406:1: ( rule__IdtFile__DefAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1406:2: rule__IdtFile__DefAssignment_1
            {
            pushFollow(FOLLOW_rule__IdtFile__DefAssignment_1_in_rule__IdtFile__Group__13111);
            rule__IdtFile__DefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIdtFileAccess().getDefAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__2_in_rule__IdtFile__Group__13120);
            rule__IdtFile__Group__2();
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
    // $ANTLR end rule__IdtFile__Group__1


    // $ANTLR start rule__IdtFile__Group__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1417:1: rule__IdtFile__Group__2 : ( ( rule__IdtFile__IncludesAssignment_2 )* ) rule__IdtFile__Group__3 ;
    public final void rule__IdtFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1421:1: ( ( ( rule__IdtFile__IncludesAssignment_2 )* ) rule__IdtFile__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1422:1: ( ( rule__IdtFile__IncludesAssignment_2 )* ) rule__IdtFile__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1422:1: ( ( rule__IdtFile__IncludesAssignment_2 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1423:1: ( rule__IdtFile__IncludesAssignment_2 )*
            {
             before(grammarAccess.getIdtFileAccess().getIncludesAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1424:1: ( rule__IdtFile__IncludesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==58) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1424:2: rule__IdtFile__IncludesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__IncludesAssignment_2_in_rule__IdtFile__Group__23148);
            	    rule__IdtFile__IncludesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIdtFileAccess().getIncludesAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__3_in_rule__IdtFile__Group__23158);
            rule__IdtFile__Group__3();
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
    // $ANTLR end rule__IdtFile__Group__2


    // $ANTLR start rule__IdtFile__Group__3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1435:1: rule__IdtFile__Group__3 : ( ( rule__IdtFile__Alternatives_3 )* ) rule__IdtFile__Group__4 ;
    public final void rule__IdtFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1439:1: ( ( ( rule__IdtFile__Alternatives_3 )* ) rule__IdtFile__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1440:1: ( ( rule__IdtFile__Alternatives_3 )* ) rule__IdtFile__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1440:1: ( ( rule__IdtFile__Alternatives_3 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1441:1: ( rule__IdtFile__Alternatives_3 )*
            {
             before(grammarAccess.getIdtFileAccess().getAlternatives_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1442:1: ( rule__IdtFile__Alternatives_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=12 && LA16_0<=13)||LA16_0==41||LA16_0==45||LA16_0==54) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1442:2: rule__IdtFile__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__Alternatives_3_in_rule__IdtFile__Group__33186);
            	    rule__IdtFile__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getIdtFileAccess().getAlternatives_3()); 

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__4_in_rule__IdtFile__Group__33196);
            rule__IdtFile__Group__4();
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
    // $ANTLR end rule__IdtFile__Group__3


    // $ANTLR start rule__IdtFile__Group__4
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1453:1: rule__IdtFile__Group__4 : ( ( rule__IdtFile__EnddefAssignment_4 ) ) ;
    public final void rule__IdtFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1457:1: ( ( ( rule__IdtFile__EnddefAssignment_4 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1458:1: ( ( rule__IdtFile__EnddefAssignment_4 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1458:1: ( ( rule__IdtFile__EnddefAssignment_4 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1459:1: ( rule__IdtFile__EnddefAssignment_4 )
            {
             before(grammarAccess.getIdtFileAccess().getEnddefAssignment_4()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1460:1: ( rule__IdtFile__EnddefAssignment_4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1460:2: rule__IdtFile__EnddefAssignment_4
            {
            pushFollow(FOLLOW_rule__IdtFile__EnddefAssignment_4_in_rule__IdtFile__Group__43224);
            rule__IdtFile__EnddefAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getIdtFileAccess().getEnddefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__Group__4


    // $ANTLR start rule__ConstantDefinitionBegin__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1480:1: rule__ConstantDefinitionBegin__Group__0 : ( '#ifndef' ) rule__ConstantDefinitionBegin__Group__1 ;
    public final void rule__ConstantDefinitionBegin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1484:1: ( ( '#ifndef' ) rule__ConstantDefinitionBegin__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1485:1: ( '#ifndef' ) rule__ConstantDefinitionBegin__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1485:1: ( '#ifndef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1486:1: '#ifndef'
            {
             before(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ConstantDefinitionBegin__Group__03269); 
             after(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__1_in_rule__ConstantDefinitionBegin__Group__03279);
            rule__ConstantDefinitionBegin__Group__1();
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
    // $ANTLR end rule__ConstantDefinitionBegin__Group__0


    // $ANTLR start rule__ConstantDefinitionBegin__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1500:1: rule__ConstantDefinitionBegin__Group__1 : ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinitionBegin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1504:1: ( ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1505:1: ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1505:1: ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1506:1: ( rule__ConstantDefinitionBegin__IdAssignment_1 )
            {
             before(grammarAccess.getConstantDefinitionBeginAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1507:1: ( rule__ConstantDefinitionBegin__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1507:2: rule__ConstantDefinitionBegin__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__IdAssignment_1_in_rule__ConstantDefinitionBegin__Group__13307);
            rule__ConstantDefinitionBegin__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionBeginAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinitionBegin__Group__1


    // $ANTLR start rule__ConstantDefinitionEnd__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1521:1: rule__ConstantDefinitionEnd__Group__0 : ( '#endif' ) rule__ConstantDefinitionEnd__Group__1 ;
    public final void rule__ConstantDefinitionEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1525:1: ( ( '#endif' ) rule__ConstantDefinitionEnd__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1526:1: ( '#endif' ) rule__ConstantDefinitionEnd__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1526:1: ( '#endif' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1527:1: '#endif'
            {
             before(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ConstantDefinitionEnd__Group__03346); 
             after(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinitionEnd__Group__1_in_rule__ConstantDefinitionEnd__Group__03356);
            rule__ConstantDefinitionEnd__Group__1();
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
    // $ANTLR end rule__ConstantDefinitionEnd__Group__0


    // $ANTLR start rule__ConstantDefinitionEnd__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1541:1: rule__ConstantDefinitionEnd__Group__1 : ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinitionEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1545:1: ( ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1546:1: ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1546:1: ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1547:1: ( rule__ConstantDefinitionEnd__IdAssignment_1 )
            {
             before(grammarAccess.getConstantDefinitionEndAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1548:1: ( rule__ConstantDefinitionEnd__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1548:2: rule__ConstantDefinitionEnd__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionEnd__IdAssignment_1_in_rule__ConstantDefinitionEnd__Group__13384);
            rule__ConstantDefinitionEnd__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConstantDefinitionEndAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinitionEnd__Group__1


    // $ANTLR start rule__TypeDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1563:1: rule__TypeDefinition__Group__0 : ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1567:1: ( ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1568:1: ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1568:1: ( ( rule__TypeDefinition__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1569:1: ( rule__TypeDefinition__Alternatives_0 )
            {
             before(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1570:1: ( rule__TypeDefinition__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1570:2: rule__TypeDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03423);
            rule__TypeDefinition__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03432);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1581:1: rule__TypeDefinition__Group__1 : ( ';' ) ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1585:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1586:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1586:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1587:1: ';'
            {
             before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__TypeDefinition__Group__13461); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1604:1: rule__TypedefSpecification__Group__0 : ( 'typedef' ) rule__TypedefSpecification__Group__1 ;
    public final void rule__TypedefSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1608:1: ( ( 'typedef' ) rule__TypedefSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1609:1: ( 'typedef' ) rule__TypedefSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1609:1: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1610:1: 'typedef'
            {
             before(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__TypedefSpecification__Group__03501); 
             after(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03511);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1624:1: rule__TypedefSpecification__Group__1 : ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 ;
    public final void rule__TypedefSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1628:1: ( ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1629:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1629:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1630:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1631:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1631:2: rule__TypedefSpecification__QualifedTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13539);
            rule__TypedefSpecification__QualifedTypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13548);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1642:1: rule__TypedefSpecification__Group__2 : ( ( rule__TypedefSpecification__DecAssignment_2 ) ) ;
    public final void rule__TypedefSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1646:1: ( ( ( rule__TypedefSpecification__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1647:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1647:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1648:1: ( rule__TypedefSpecification__DecAssignment_2 )
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1649:1: ( rule__TypedefSpecification__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1649:2: rule__TypedefSpecification__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23576);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1665:1: rule__QualifiedTypeSpecification__Group__0 : ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 ;
    public final void rule__QualifiedTypeSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1669:1: ( ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1670:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1670:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1671:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1672:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=14 && LA17_0<=15)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1672:2: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03616);
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

            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03626);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1683:1: rule__QualifiedTypeSpecification__Group__1 : ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) ;
    public final void rule__QualifiedTypeSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1687:1: ( ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1688:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1688:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1689:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1690:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1690:2: rule__QualifiedTypeSpecification__TypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13654);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1704:1: rule__StructOrUnionDefinition__Group__0 : ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 ;
    public final void rule__StructOrUnionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1708:1: ( ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1709:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1709:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1710:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1711:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1711:2: rule__StructOrUnionDefinition__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03692);
            rule__StructOrUnionDefinition__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03701);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1722:1: rule__StructOrUnionDefinition__Group__1 : ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 ;
    public final void rule__StructOrUnionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1726:1: ( ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1727:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1727:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1728:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1729:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1729:2: rule__StructOrUnionDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13729);
                    rule__StructOrUnionDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13739);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1740:1: rule__StructOrUnionDefinition__Group__2 : ( '{' ) rule__StructOrUnionDefinition__Group__3 ;
    public final void rule__StructOrUnionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1744:1: ( ( '{' ) rule__StructOrUnionDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1745:1: ( '{' ) rule__StructOrUnionDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1745:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1746:1: '{'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__StructOrUnionDefinition__Group__23768); 
             after(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23778);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1760:1: rule__StructOrUnionDefinition__Group__3 : ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 ;
    public final void rule__StructOrUnionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1764:1: ( ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1765:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1765:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1766:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1767:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=12 && LA19_0<=35)||LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1767:2: rule__StructOrUnionDefinition__StructMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33806);
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

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33816);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1778:1: rule__StructOrUnionDefinition__Group__4 : ( '}' ) ;
    public final void rule__StructOrUnionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1782:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1783:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1783:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1784:1: '}'
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__StructOrUnionDefinition__Group__43845); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1807:1: rule__StructorUnionReference__Group__0 : ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 ;
    public final void rule__StructorUnionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1811:1: ( ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1812:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1812:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1813:1: ( rule__StructorUnionReference__StructAssignment_0 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1814:1: ( rule__StructorUnionReference__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1814:2: rule__StructorUnionReference__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03890);
            rule__StructorUnionReference__StructAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03899);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1825:1: rule__StructorUnionReference__Group__1 : ( ( rule__StructorUnionReference__IdAssignment_1 ) ) ;
    public final void rule__StructorUnionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1829:1: ( ( ( rule__StructorUnionReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1830:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1830:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1831:1: ( rule__StructorUnionReference__IdAssignment_1 )
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1832:1: ( rule__StructorUnionReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1832:2: rule__StructorUnionReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13927);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1846:1: rule__StructMember__Group__0 : ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 ;
    public final void rule__StructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1850:1: ( ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1851:1: ( ( rule__StructMember__QualTypeAssignment_0 ) ) rule__StructMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1851:1: ( ( rule__StructMember__QualTypeAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1852:1: ( rule__StructMember__QualTypeAssignment_0 )
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1853:1: ( rule__StructMember__QualTypeAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1853:2: rule__StructMember__QualTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03965);
            rule__StructMember__QualTypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getQualTypeAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03974);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1864:1: rule__StructMember__Group__1 : ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 ;
    public final void rule__StructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1868:1: ( ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1869:1: ( ( rule__StructMember__DecAssignment_1 ) ) rule__StructMember__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1869:1: ( ( rule__StructMember__DecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1870:1: ( rule__StructMember__DecAssignment_1 )
            {
             before(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1871:1: ( rule__StructMember__DecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1871:2: rule__StructMember__DecAssignment_1
            {
            pushFollow(FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__14002);
            rule__StructMember__DecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructMemberAccess().getDecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__14011);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1882:1: rule__StructMember__Group__2 : ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 ;
    public final void rule__StructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1886:1: ( ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1887:1: ( ( rule__StructMember__Group_2__0 )? ) rule__StructMember__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1887:1: ( ( rule__StructMember__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1888:1: ( rule__StructMember__Group_2__0 )?
            {
             before(grammarAccess.getStructMemberAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1889:1: ( rule__StructMember__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1889:2: rule__StructMember__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__24039);
                    rule__StructMember__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructMemberAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__24049);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1900:1: rule__StructMember__Group__3 : ( ';' ) ;
    public final void rule__StructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1904:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1905:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1905:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1906:1: ';'
            {
             before(grammarAccess.getStructMemberAccess().getSemicolonKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__StructMember__Group__34078); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1927:1: rule__StructMember__Group_2__0 : ( ':' ) rule__StructMember__Group_2__1 ;
    public final void rule__StructMember__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1931:1: ( ( ':' ) rule__StructMember__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1932:1: ( ':' ) rule__StructMember__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1932:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1933:1: ':'
            {
             before(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__StructMember__Group_2__04122); 
             after(grammarAccess.getStructMemberAccess().getColonKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__04132);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1947:1: rule__StructMember__Group_2__1 : ( RULE_INT ) ;
    public final void rule__StructMember__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1951:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1952:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1952:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1953:1: RULE_INT
            {
             before(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StructMember__Group_2__14160); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1968:1: rule__EnumDefinition__Group__0 : ( 'enum' ) rule__EnumDefinition__Group__1 ;
    public final void rule__EnumDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1972:1: ( ( 'enum' ) rule__EnumDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1973:1: ( 'enum' ) rule__EnumDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1973:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1974:1: 'enum'
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumDefinition__Group__04198); 
             after(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__04208);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1988:1: rule__EnumDefinition__Group__1 : ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 ;
    public final void rule__EnumDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1992:1: ( ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1993:1: ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1993:1: ( ( rule__EnumDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1994:1: ( rule__EnumDefinition__IdAssignment_1 )?
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1995:1: ( rule__EnumDefinition__IdAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1995:2: rule__EnumDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__14236);
                    rule__EnumDefinition__IdAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__14246);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2006:1: rule__EnumDefinition__Group__2 : ( '{' ) rule__EnumDefinition__Group__3 ;
    public final void rule__EnumDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2010:1: ( ( '{' ) rule__EnumDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2011:1: ( '{' ) rule__EnumDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2011:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2012:1: '{'
            {
             before(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__EnumDefinition__Group__24275); 
             after(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__24285);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2026:1: rule__EnumDefinition__Group__3 : ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 ;
    public final void rule__EnumDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2030:1: ( ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2031:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2031:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2032:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2033:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2033:2: rule__EnumDefinition__EnumMemberListAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__34313);
            rule__EnumDefinition__EnumMemberListAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34322);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2044:1: rule__EnumDefinition__Group__4 : ( '}' ) ;
    public final void rule__EnumDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2048:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2049:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2049:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2050:1: '}'
            {
             before(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_43_in_rule__EnumDefinition__Group__44351); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2073:1: rule__EnumReference__Group__0 : ( 'enum' ) rule__EnumReference__Group__1 ;
    public final void rule__EnumReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2077:1: ( ( 'enum' ) rule__EnumReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2078:1: ( 'enum' ) rule__EnumReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2078:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2079:1: 'enum'
            {
             before(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumReference__Group__04397); 
             after(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04407);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2093:1: rule__EnumReference__Group__1 : ( ( rule__EnumReference__IdAssignment_1 ) ) ;
    public final void rule__EnumReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2097:1: ( ( ( rule__EnumReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2098:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2098:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2099:1: ( rule__EnumReference__IdAssignment_1 )
            {
             before(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2100:1: ( rule__EnumReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2100:2: rule__EnumReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14435);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2114:1: rule__EnumMemberList__Group__0 : ( ruleEnumMember ) rule__EnumMemberList__Group__1 ;
    public final void rule__EnumMemberList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2118:1: ( ( ruleEnumMember ) rule__EnumMemberList__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2119:1: ( ruleEnumMember ) rule__EnumMemberList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2119:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2120:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04473);
            ruleEnumMember();
            _fsp--;

             after(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04481);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2132:1: rule__EnumMemberList__Group__1 : ( ( rule__EnumMemberList__Group_1__0 )* ) ;
    public final void rule__EnumMemberList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2136:1: ( ( ( rule__EnumMemberList__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2137:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2137:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2138:1: ( rule__EnumMemberList__Group_1__0 )*
            {
             before(grammarAccess.getEnumMemberListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2139:1: ( rule__EnumMemberList__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2139:2: rule__EnumMemberList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14509);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2153:1: rule__EnumMemberList__Group_1__0 : ( ',' ) rule__EnumMemberList__Group_1__1 ;
    public final void rule__EnumMemberList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2157:1: ( ( ',' ) rule__EnumMemberList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2158:1: ( ',' ) rule__EnumMemberList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2158:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2159:1: ','
            {
             before(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__EnumMemberList__Group_1__04549); 
             after(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04559);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2173:1: rule__EnumMemberList__Group_1__1 : ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) ;
    public final void rule__EnumMemberList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2177:1: ( ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2178:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2178:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2179:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2180:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2180:2: rule__EnumMemberList__EnumMemberAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14587);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2194:1: rule__EnumMember__Group__0 : ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2198:1: ( ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2199:1: ( ( rule__EnumMember__IdAssignment_0 ) ) rule__EnumMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2199:1: ( ( rule__EnumMember__IdAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2200:1: ( rule__EnumMember__IdAssignment_0 )
            {
             before(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2201:1: ( rule__EnumMember__IdAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2201:2: rule__EnumMember__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04625);
            rule__EnumMember__IdAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEnumMemberAccess().getIdAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04634);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2212:1: rule__EnumMember__Group__1 : ( ( rule__EnumMember__Group_1__0 )? ) ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2216:1: ( ( ( rule__EnumMember__Group_1__0 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2217:1: ( ( rule__EnumMember__Group_1__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2217:1: ( ( rule__EnumMember__Group_1__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2218:1: ( rule__EnumMember__Group_1__0 )?
            {
             before(grammarAccess.getEnumMemberAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2219:1: ( rule__EnumMember__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2219:2: rule__EnumMember__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14662);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2233:1: rule__EnumMember__Group_1__0 : ( '=' ) rule__EnumMember__Group_1__1 ;
    public final void rule__EnumMember__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2237:1: ( ( '=' ) rule__EnumMember__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2238:1: ( '=' ) rule__EnumMember__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2238:1: ( '=' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2239:1: '='
            {
             before(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumMember__Group_1__04702); 
             after(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04712);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2253:1: rule__EnumMember__Group_1__1 : ( RULE_INT ) ;
    public final void rule__EnumMember__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2257:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2258:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2258:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2259:1: RULE_INT
            {
             before(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14740); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2274:1: rule__Declarators__Group__0 : ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 ;
    public final void rule__Declarators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2278:1: ( ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2279:1: ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2279:1: ( ( rule__Declarators__DecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2280:1: ( rule__Declarators__DecAssignment_0 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2281:1: ( rule__Declarators__DecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2281:2: rule__Declarators__DecAssignment_0
            {
            pushFollow(FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04777);
            rule__Declarators__DecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04786);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2292:1: rule__Declarators__Group__1 : ( ( rule__Declarators__Group_1__0 )* ) ;
    public final void rule__Declarators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2296:1: ( ( ( rule__Declarators__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2297:1: ( ( rule__Declarators__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2297:1: ( ( rule__Declarators__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2298:1: ( rule__Declarators__Group_1__0 )*
            {
             before(grammarAccess.getDeclaratorsAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2299:1: ( rule__Declarators__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2299:2: rule__Declarators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14814);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2313:1: rule__Declarators__Group_1__0 : ( ',' ) rule__Declarators__Group_1__1 ;
    public final void rule__Declarators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2317:1: ( ( ',' ) rule__Declarators__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2318:1: ( ',' ) rule__Declarators__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2318:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2319:1: ','
            {
             before(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Declarators__Group_1__04854); 
             after(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04864);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2333:1: rule__Declarators__Group_1__1 : ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) ;
    public final void rule__Declarators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2337:1: ( ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2338:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2338:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2339:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2340:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2340:2: rule__Declarators__DeclaratorListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14892);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2354:1: rule__Declarator__Group__0 : ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 ;
    public final void rule__Declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2358:1: ( ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2359:1: ( ( rule__Declarator__Group_0__0 )* ) rule__Declarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2359:1: ( ( rule__Declarator__Group_0__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2360:1: ( rule__Declarator__Group_0__0 )*
            {
             before(grammarAccess.getDeclaratorAccess().getGroup_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2361:1: ( rule__Declarator__Group_0__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2361:2: rule__Declarator__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04930);
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

            pushFollow(FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04940);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2372:1: rule__Declarator__Group__1 : ( ( rule__Declarator__DcAssignment_1 ) ) ;
    public final void rule__Declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2376:1: ( ( ( rule__Declarator__DcAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2377:1: ( ( rule__Declarator__DcAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2377:1: ( ( rule__Declarator__DcAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2378:1: ( rule__Declarator__DcAssignment_1 )
            {
             before(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2379:1: ( rule__Declarator__DcAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2379:2: rule__Declarator__DcAssignment_1
            {
            pushFollow(FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14968);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2393:1: rule__Declarator__Group_0__0 : ( '*' ) rule__Declarator__Group_0__1 ;
    public final void rule__Declarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2397:1: ( ( '*' ) rule__Declarator__Group_0__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2398:1: ( '*' ) rule__Declarator__Group_0__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2398:1: ( '*' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2399:1: '*'
            {
             before(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Declarator__Group_0__05007); 
             after(grammarAccess.getDeclaratorAccess().getAsteriskKeyword_0_0()); 

            }

            pushFollow(FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__05017);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2413:1: rule__Declarator__Group_0__1 : ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) ;
    public final void rule__Declarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2417:1: ( ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2418:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2418:1: ( ( rule__Declarator__TypeQualifierAssignment_0_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2419:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierAssignment_0_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2420:1: ( rule__Declarator__TypeQualifierAssignment_0_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=14 && LA26_0<=15)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2420:2: rule__Declarator__TypeQualifierAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__15045);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2434:1: rule__DirectDeclarator__Group__0 : ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 ;
    public final void rule__DirectDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2438:1: ( ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2439:1: ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2439:1: ( ( rule__DirectDeclarator__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2440:1: ( rule__DirectDeclarator__Alternatives_0 )
            {
             before(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2441:1: ( rule__DirectDeclarator__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2441:2: rule__DirectDeclarator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__05084);
            rule__DirectDeclarator__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__05093);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2452:1: rule__DirectDeclarator__Group__1 : ( ( ruleArraySpecification )* ) ;
    public final void rule__DirectDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2456:1: ( ( ( ruleArraySpecification )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2457:1: ( ( ruleArraySpecification )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2457:1: ( ( ruleArraySpecification )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2458:1: ( ruleArraySpecification )*
            {
             before(grammarAccess.getDirectDeclaratorAccess().getArraySpecificationParserRuleCall_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2459:1: ( ruleArraySpecification )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2459:3: ruleArraySpecification
            	    {
            	    pushFollow(FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__15122);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2473:1: rule__DirectDeclarator__Group_0_1__0 : ( '(' ) rule__DirectDeclarator__Group_0_1__1 ;
    public final void rule__DirectDeclarator__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2477:1: ( ( '(' ) rule__DirectDeclarator__Group_0_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2478:1: ( '(' ) rule__DirectDeclarator__Group_0_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2478:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2479:1: '('
            {
             before(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,49,FOLLOW_49_in_rule__DirectDeclarator__Group_0_1__05162); 
             after(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__05172);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2493:1: rule__DirectDeclarator__Group_0_1__1 : ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 ;
    public final void rule__DirectDeclarator__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2497:1: ( ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2498:1: ( ruleDeclarator ) rule__DirectDeclarator__Group_0_1__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2498:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2499:1: ruleDeclarator
            {
             before(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__15200);
            ruleDeclarator();
            _fsp--;

             after(grammarAccess.getDirectDeclaratorAccess().getDeclaratorParserRuleCall_0_1_1()); 

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__15208);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2511:1: rule__DirectDeclarator__Group_0_1__2 : ( ')' ) ;
    public final void rule__DirectDeclarator__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2515:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2516:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2516:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2517:1: ')'
            {
             before(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,50,FOLLOW_50_in_rule__DirectDeclarator__Group_0_1__25237); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2536:1: rule__ArraySpecification__Group__0 : ( '[' ) rule__ArraySpecification__Group__1 ;
    public final void rule__ArraySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2540:1: ( ( '[' ) rule__ArraySpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2541:1: ( '[' ) rule__ArraySpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2541:1: ( '[' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2542:1: '['
            {
             before(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ArraySpecification__Group__05279); 
             after(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__05289);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2556:1: rule__ArraySpecification__Group__1 : ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2 ;
    public final void rule__ArraySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2560:1: ( ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2561:1: ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2561:1: ( ( rule__ArraySpecification__Alternatives_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2562:1: ( rule__ArraySpecification__Alternatives_1 )
            {
             before(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2563:1: ( rule__ArraySpecification__Alternatives_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2563:2: rule__ArraySpecification__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Alternatives_1_in_rule__ArraySpecification__Group__15317);
            rule__ArraySpecification__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15326);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2574:1: rule__ArraySpecification__Group__2 : ( ']' ) ;
    public final void rule__ArraySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2578:1: ( ( ']' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2579:1: ( ']' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2579:1: ( ']' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2580:1: ']'
            {
             before(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            match(input,52,FOLLOW_52_in_rule__ArraySpecification__Group__25355); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2599:1: rule__FullyQualifiedName__Group__0 : ( RULE_ID ) rule__FullyQualifiedName__Group__1 ;
    public final void rule__FullyQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2603:1: ( ( RULE_ID ) rule__FullyQualifiedName__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2604:1: ( RULE_ID ) rule__FullyQualifiedName__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2604:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2605:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05396); 
             after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05404);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2617:1: rule__FullyQualifiedName__Group__1 : ( ( rule__FullyQualifiedName__Group_1__0 )* ) ;
    public final void rule__FullyQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2621:1: ( ( ( rule__FullyQualifiedName__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2622:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2622:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2623:1: ( rule__FullyQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2624:1: ( rule__FullyQualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2624:2: rule__FullyQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15432);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2638:1: rule__FullyQualifiedName__Group_1__0 : ( '.' ) rule__FullyQualifiedName__Group_1__1 ;
    public final void rule__FullyQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2642:1: ( ( '.' ) rule__FullyQualifiedName__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2643:1: ( '.' ) rule__FullyQualifiedName__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2643:1: ( '.' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2644:1: '.'
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,53,FOLLOW_53_in_rule__FullyQualifiedName__Group_1__05472); 
             after(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05482);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2658:1: rule__FullyQualifiedName__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FullyQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2662:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2663:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2663:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2664:1: RULE_ID
            {
             before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15510); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2679:1: rule__ConstantDefinition__Group__0 : ( '#define' ) rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2683:1: ( ( '#define' ) rule__ConstantDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2684:1: ( '#define' ) rule__ConstantDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2684:1: ( '#define' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2685:1: '#define'
            {
             before(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__ConstantDefinition__Group__05548); 
             after(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05558);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2699:1: rule__ConstantDefinition__Group__1 : ( ( rule__ConstantDefinition__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2703:1: ( ( ( rule__ConstantDefinition__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2704:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2704:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2705:1: ( rule__ConstantDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2706:1: ( rule__ConstantDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2706:2: rule__ConstantDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15586);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2720:1: rule__InterfaceDefinition__Group__0 : ( 'interface' ) rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2724:1: ( ( 'interface' ) rule__InterfaceDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2725:1: ( 'interface' ) rule__InterfaceDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2725:1: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2726:1: 'interface'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__InterfaceDefinition__Group__05625); 
             after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05635);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2740:1: rule__InterfaceDefinition__Group__1 : ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2744:1: ( ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2745:1: ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2745:1: ( ( 'unmanaged' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2746:1: ( 'unmanaged' )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2747:1: ( 'unmanaged' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2748:2: 'unmanaged'
                    {
                    match(input,56,FOLLOW_56_in_rule__InterfaceDefinition__Group__15665); 

                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15677);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2760:1: rule__InterfaceDefinition__Group__2 : ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2764:1: ( ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2765:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) ) rule__InterfaceDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2765:1: ( ( rule__InterfaceDefinition__FqnAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2766:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2767:1: ( rule__InterfaceDefinition__FqnAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2767:2: rule__InterfaceDefinition__FqnAssignment_2
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25705);
            rule__InterfaceDefinition__FqnAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25714);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2778:1: rule__InterfaceDefinition__Group__3 : ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2782:1: ( ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2783:1: ( ( rule__InterfaceDefinition__Group_3__0 )? ) rule__InterfaceDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2783:1: ( ( rule__InterfaceDefinition__Group_3__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2784:1: ( rule__InterfaceDefinition__Group_3__0 )?
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2785:1: ( rule__InterfaceDefinition__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2785:2: rule__InterfaceDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35742);
                    rule__InterfaceDefinition__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceDefinitionAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35752);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2796:1: rule__InterfaceDefinition__Group__4 : ( '{' ) rule__InterfaceDefinition__Group__5 ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2800:1: ( ( '{' ) rule__InterfaceDefinition__Group__5 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2801:1: ( '{' ) rule__InterfaceDefinition__Group__5
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2801:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2802:1: '{'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_42_in_rule__InterfaceDefinition__Group__45781); 
             after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45791);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2816:1: rule__InterfaceDefinition__Group__5 : ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 ;
    public final void rule__InterfaceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2820:1: ( ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2821:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* ) rule__InterfaceDefinition__Group__6
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2821:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_5 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2822:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_5()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2823:1: ( rule__InterfaceDefinition__MethodDefAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=12 && LA31_0<=35)||LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2823:2: rule__InterfaceDefinition__MethodDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55819);
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

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55829);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2834:1: rule__InterfaceDefinition__Group__6 : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2838:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2839:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2839:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2840:1: '}'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__InterfaceDefinition__Group__65858); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2867:1: rule__InterfaceDefinition__Group_3__0 : ( ':' ) rule__InterfaceDefinition__Group_3__1 ;
    public final void rule__InterfaceDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2871:1: ( ( ':' ) rule__InterfaceDefinition__Group_3__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2872:1: ( ':' ) rule__InterfaceDefinition__Group_3__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2872:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2873:1: ':'
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 
            match(input,44,FOLLOW_44_in_rule__InterfaceDefinition__Group_3__05908); 
             after(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05918);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2887:1: rule__InterfaceDefinition__Group_3__1 : ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2891:1: ( ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2892:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2892:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_3_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2893:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_3_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2894:1: ( rule__InterfaceDefinition__Fqn2Assignment_3_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2894:2: rule__InterfaceDefinition__Fqn2Assignment_3_1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15946);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2908:1: rule__MethodDefinition__Group__0 : ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 ;
    public final void rule__MethodDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2912:1: ( ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2913:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) ) rule__MethodDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2913:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2914:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2915:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2915:2: rule__MethodDefinition__QualifiedTypeSpecAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05984);
            rule__MethodDefinition__QualifiedTypeSpecAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05993);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2926:1: rule__MethodDefinition__Group__1 : ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 ;
    public final void rule__MethodDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2930:1: ( ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2931:1: ( ( rule__MethodDefinition__IdAssignment_1 ) ) rule__MethodDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2931:1: ( ( rule__MethodDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2932:1: ( rule__MethodDefinition__IdAssignment_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2933:1: ( rule__MethodDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2933:2: rule__MethodDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__16021);
            rule__MethodDefinition__IdAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getIdAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__16030);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2944:1: rule__MethodDefinition__Group__2 : ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 ;
    public final void rule__MethodDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2948:1: ( ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2949:1: ( ( rule__MethodDefinition__Alternatives_2 ) ) rule__MethodDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2949:1: ( ( rule__MethodDefinition__Alternatives_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2950:1: ( rule__MethodDefinition__Alternatives_2 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2951:1: ( rule__MethodDefinition__Alternatives_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2951:2: rule__MethodDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__26058);
            rule__MethodDefinition__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__26067);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2962:1: rule__MethodDefinition__Group__3 : ( ';' ) ;
    public final void rule__MethodDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2966:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2967:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2967:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2968:1: ';'
            {
             before(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__MethodDefinition__Group__36096); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2989:1: rule__MethodDefinition__Group_2_0__0 : ( '(' ) rule__MethodDefinition__Group_2_0__1 ;
    public final void rule__MethodDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2993:1: ( ( '(' ) rule__MethodDefinition__Group_2_0__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2994:1: ( '(' ) rule__MethodDefinition__Group_2_0__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2994:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2995:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,49,FOLLOW_49_in_rule__MethodDefinition__Group_2_0__06140); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_0_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__06150);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3009:1: rule__MethodDefinition__Group_2_0__1 : ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 ;
    public final void rule__MethodDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3013:1: ( ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3014:1: ( ( 'void' )? ) rule__MethodDefinition__Group_2_0__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3014:1: ( ( 'void' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3015:1: ( 'void' )?
            {
             before(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3016:1: ( 'void' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3017:2: 'void'
                    {
                    match(input,16,FOLLOW_16_in_rule__MethodDefinition__Group_2_0__16180); 

                    }
                    break;

            }

             after(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_2_0_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__16192);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3029:1: rule__MethodDefinition__Group_2_0__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3033:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3034:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3034:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3035:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,50,FOLLOW_50_in_rule__MethodDefinition__Group_2_0__26221); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3054:1: rule__MethodDefinition__Group_2_1__0 : ( '(' ) rule__MethodDefinition__Group_2_1__1 ;
    public final void rule__MethodDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3058:1: ( ( '(' ) rule__MethodDefinition__Group_2_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3059:1: ( '(' ) rule__MethodDefinition__Group_2_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3059:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3060:1: '('
            {
             before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,49,FOLLOW_49_in_rule__MethodDefinition__Group_2_1__06263); 
             after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_2_1_0()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__06273);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3074:1: rule__MethodDefinition__Group_2_1__1 : ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 ;
    public final void rule__MethodDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3078:1: ( ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3079:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) ) rule__MethodDefinition__Group_2_1__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3079:1: ( ( rule__MethodDefinition__ParameterListAssignment_2_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3080:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3081:1: ( rule__MethodDefinition__ParameterListAssignment_2_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3081:2: rule__MethodDefinition__ParameterListAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__16301);
            rule__MethodDefinition__ParameterListAssignment_2_1_1();
            _fsp--;


            }

             after(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_2_1_1()); 

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__16310);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3092:1: rule__MethodDefinition__Group_2_1__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3096:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3097:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3097:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3098:1: ')'
            {
             before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_2_1_2()); 
            match(input,50,FOLLOW_50_in_rule__MethodDefinition__Group_2_1__26339); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3117:1: rule__ParameterList__Group__0 : ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3121:1: ( ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3122:1: ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3122:1: ( ( rule__ParameterList__ParamAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3123:1: ( rule__ParameterList__ParamAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParamAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3124:1: ( rule__ParameterList__ParamAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3124:2: rule__ParameterList__ParamAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06380);
            rule__ParameterList__ParamAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParamAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06389);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3135:1: rule__ParameterList__Group__1 : ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3139:1: ( ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3140:1: ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3140:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3141:1: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3142:1: ( rule__ParameterList__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID||(LA33_1>=12 && LA33_1<=37)||LA33_1==45) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3142:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16417);
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

            pushFollow(FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16427);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3153:1: rule__ParameterList__Group__2 : ( ( rule__ParameterList__Group_2__0 )? ) ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3157:1: ( ( ( rule__ParameterList__Group_2__0 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3158:1: ( ( rule__ParameterList__Group_2__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3158:1: ( ( rule__ParameterList__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3159:1: ( rule__ParameterList__Group_2__0 )?
            {
             before(grammarAccess.getParameterListAccess().getGroup_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3160:1: ( rule__ParameterList__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3160:2: rule__ParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26455);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3176:1: rule__ParameterList__Group_1__0 : ( ',' ) rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3180:1: ( ( ',' ) rule__ParameterList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3181:1: ( ',' ) rule__ParameterList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3181:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3182:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__ParameterList__Group_1__06497); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06507);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3196:1: rule__ParameterList__Group_1__1 : ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3200:1: ( ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3201:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3201:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3202:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3203:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3203:2: rule__ParameterList__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16535);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3217:1: rule__ParameterList__Group_2__0 : ( ',' ) rule__ParameterList__Group_2__1 ;
    public final void rule__ParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3221:1: ( ( ',' ) rule__ParameterList__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3222:1: ( ',' ) rule__ParameterList__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3222:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3223:1: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 
            match(input,46,FOLLOW_46_in_rule__ParameterList__Group_2__06574); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06584);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3237:1: rule__ParameterList__Group_2__1 : ( '...' ) ;
    public final void rule__ParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3241:1: ( ( '...' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3242:1: ( '...' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3242:1: ( '...' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3243:1: '...'
            {
             before(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 
            match(input,57,FOLLOW_57_in_rule__ParameterList__Group_2__16613); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3260:1: rule__Parameter__Group__0 : ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3264:1: ( ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3265:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* ) rule__Parameter__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3265:1: ( ( rule__Parameter__ParameterQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3266:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierAssignment_0()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3267:1: ( rule__Parameter__ParameterQualifierAssignment_0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=36 && LA35_0<=37)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3267:2: rule__Parameter__ParameterQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06652);
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

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06662);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3278:1: rule__Parameter__Group__1 : ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3282:1: ( ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3283:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) ) rule__Parameter__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3283:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3284:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3285:1: ( rule__Parameter__QualifiedTypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3285:2: rule__Parameter__QualifiedTypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16690);
            rule__Parameter__QualifiedTypeSpecAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16699);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3296:1: rule__Parameter__Group__2 : ( ( rule__Parameter__DecAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3300:1: ( ( ( rule__Parameter__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3301:1: ( ( rule__Parameter__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3301:1: ( ( rule__Parameter__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3302:1: ( rule__Parameter__DecAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getDecAssignment_2()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3303:1: ( rule__Parameter__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3303:2: rule__Parameter__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26727);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3319:1: rule__IncludeDirective__Group__0 : ( '#include' ) rule__IncludeDirective__Group__1 ;
    public final void rule__IncludeDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3323:1: ( ( '#include' ) rule__IncludeDirective__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3324:1: ( '#include' ) rule__IncludeDirective__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3324:1: ( '#include' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3325:1: '#include'
            {
             before(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__IncludeDirective__Group__06768); 
             after(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06778);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3339:1: rule__IncludeDirective__Group__1 : ( ( rule__IncludeDirective__Alternatives_1 ) ) ;
    public final void rule__IncludeDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3343:1: ( ( ( rule__IncludeDirective__Alternatives_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3344:1: ( ( rule__IncludeDirective__Alternatives_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3344:1: ( ( rule__IncludeDirective__Alternatives_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3345:1: ( rule__IncludeDirective__Alternatives_1 )
            {
             before(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1()); 
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3346:1: ( rule__IncludeDirective__Alternatives_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3346:2: rule__IncludeDirective__Alternatives_1
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Alternatives_1_in_rule__IncludeDirective__Group__16806);
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


    // $ANTLR start rule__IdtFile__BegindefAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3360:1: rule__IdtFile__BegindefAssignment_0 : ( ruleConstantDefinitionBegin ) ;
    public final void rule__IdtFile__BegindefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3364:1: ( ( ruleConstantDefinitionBegin ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3365:1: ( ruleConstantDefinitionBegin )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3365:1: ( ruleConstantDefinitionBegin )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3366:1: ruleConstantDefinitionBegin
            {
             before(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_rule__IdtFile__BegindefAssignment_06844);
            ruleConstantDefinitionBegin();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__BegindefAssignment_0


    // $ANTLR start rule__IdtFile__DefAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3375:1: rule__IdtFile__DefAssignment_1 : ( ruleConstantDefinition ) ;
    public final void rule__IdtFile__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3379:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3380:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3380:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3381:1: ruleConstantDefinition
            {
             before(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__IdtFile__DefAssignment_16875);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__DefAssignment_1


    // $ANTLR start rule__IdtFile__IncludesAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3390:1: rule__IdtFile__IncludesAssignment_2 : ( ruleIncludeDirective ) ;
    public final void rule__IdtFile__IncludesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3394:1: ( ( ruleIncludeDirective ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3395:1: ( ruleIncludeDirective )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3395:1: ( ruleIncludeDirective )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3396:1: ruleIncludeDirective
            {
             before(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIncludeDirective_in_rule__IdtFile__IncludesAssignment_26906);
            ruleIncludeDirective();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__IncludesAssignment_2


    // $ANTLR start rule__IdtFile__ConstantAssignment_3_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3405:1: rule__IdtFile__ConstantAssignment_3_0 : ( ruleConstantDefinition ) ;
    public final void rule__IdtFile__ConstantAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3409:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3410:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3410:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3411:1: ruleConstantDefinition
            {
             before(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__IdtFile__ConstantAssignment_3_06937);
            ruleConstantDefinition();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__ConstantAssignment_3_0


    // $ANTLR start rule__IdtFile__TypeAssignment_3_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3420:1: rule__IdtFile__TypeAssignment_3_1 : ( ruleTypeDefinition ) ;
    public final void rule__IdtFile__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3424:1: ( ( ruleTypeDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3425:1: ( ruleTypeDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3425:1: ( ruleTypeDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3426:1: ruleTypeDefinition
            {
             before(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__IdtFile__TypeAssignment_3_16968);
            ruleTypeDefinition();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__TypeAssignment_3_1


    // $ANTLR start rule__IdtFile__EnddefAssignment_4
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3435:1: rule__IdtFile__EnddefAssignment_4 : ( ruleConstantDefinitionEnd ) ;
    public final void rule__IdtFile__EnddefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3439:1: ( ( ruleConstantDefinitionEnd ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3440:1: ( ruleConstantDefinitionEnd )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3440:1: ( ruleConstantDefinitionEnd )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3441:1: ruleConstantDefinitionEnd
            {
             before(grammarAccess.getIdtFileAccess().getEnddefConstantDefinitionEndParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_rule__IdtFile__EnddefAssignment_46999);
            ruleConstantDefinitionEnd();
            _fsp--;

             after(grammarAccess.getIdtFileAccess().getEnddefConstantDefinitionEndParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IdtFile__EnddefAssignment_4


    // $ANTLR start rule__ConstantDefinitionBegin__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3450:1: rule__ConstantDefinitionBegin__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinitionBegin__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3454:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3455:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3455:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3456:1: RULE_ID
            {
             before(grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinitionBegin__IdAssignment_17030); 
             after(grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinitionBegin__IdAssignment_1


    // $ANTLR start rule__ConstantDefinitionEnd__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3465:1: rule__ConstantDefinitionEnd__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinitionEnd__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3469:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3470:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3470:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3471:1: RULE_ID
            {
             before(grammarAccess.getConstantDefinitionEndAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinitionEnd__IdAssignment_17061); 
             after(grammarAccess.getConstantDefinitionEndAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstantDefinitionEnd__IdAssignment_1


    // $ANTLR start rule__TypedefSpecification__QualifedTypeAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3484:1: rule__TypedefSpecification__QualifedTypeAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__TypedefSpecification__QualifedTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3488:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3489:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3489:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3490:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_17096);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3499:1: rule__TypedefSpecification__DecAssignment_2 : ( ruleDeclarators ) ;
    public final void rule__TypedefSpecification__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3503:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3504:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3504:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3505:1: ruleDeclarators
            {
             before(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_27127);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3514:1: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 : ( ruleTypeQualifier ) ;
    public final void rule__QualifiedTypeSpecification__TypeQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3518:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3519:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3519:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3520:1: ruleTypeQualifier
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_07158);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3529:1: rule__QualifiedTypeSpecification__TypeSpecAssignment_1 : ( ruleTypeSpecification ) ;
    public final void rule__QualifiedTypeSpecification__TypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3533:1: ( ( ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3534:1: ( ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3534:1: ( ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3535:1: ruleTypeSpecification
            {
             before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_17189);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3544:1: rule__TypeSpecification__TypeDefNameAssignment_0 : ( ruleTypedefName ) ;
    public final void rule__TypeSpecification__TypeDefNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3548:1: ( ( ruleTypedefName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3549:1: ( ruleTypedefName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3549:1: ( ruleTypedefName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3550:1: ruleTypedefName
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_07220);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3559:1: rule__TypeSpecification__TypeSpecifierAssignment_3 : ( ruleTypeSpecifier ) ;
    public final void rule__TypeSpecification__TypeSpecifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3563:1: ( ( ruleTypeSpecifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3564:1: ( ruleTypeSpecifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3564:1: ( ruleTypeSpecifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3565:1: ruleTypeSpecifier
            {
             before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_37251);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3574:1: rule__StructOrUnionDefinition__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructOrUnionDefinition__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3578:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3579:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3579:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3580:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_07282);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3589:1: rule__StructOrUnionDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructOrUnionDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3593:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3594:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3594:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3595:1: RULE_ID
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructOrUnionDefinition__IdAssignment_17313); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3604:1: rule__StructOrUnionDefinition__StructMemberAssignment_3 : ( ruleStructMember ) ;
    public final void rule__StructOrUnionDefinition__StructMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3608:1: ( ( ruleStructMember ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3609:1: ( ruleStructMember )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3609:1: ( ruleStructMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3610:1: ruleStructMember
            {
             before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_37344);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3619:1: rule__StructorUnionReference__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructorUnionReference__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3623:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3624:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3624:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3625:1: ruleStructOrUnion
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_07375);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3634:1: rule__StructorUnionReference__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructorUnionReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3638:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3639:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3639:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3640:1: RULE_ID
            {
             before(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructorUnionReference__IdAssignment_17406); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3649:1: rule__StructMember__QualTypeAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__StructMember__QualTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3653:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3654:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3654:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3655:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_07437);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3664:1: rule__StructMember__DecAssignment_1 : ( ruleDeclarators ) ;
    public final void rule__StructMember__DecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3668:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3669:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3669:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3670:1: ruleDeclarators
            {
             before(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_17468);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3679:1: rule__EnumDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3683:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3684:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3684:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3685:1: RULE_ID
            {
             before(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDefinition__IdAssignment_17499); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3694:1: rule__EnumDefinition__EnumMemberListAssignment_3 : ( ruleEnumMemberList ) ;
    public final void rule__EnumDefinition__EnumMemberListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3698:1: ( ( ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3699:1: ( ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3699:1: ( ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3700:1: ruleEnumMemberList
            {
             before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37530);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3709:1: rule__EnumReference__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3713:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3714:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3714:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3715:1: RULE_ID
            {
             before(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumReference__IdAssignment_17561); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3724:1: rule__EnumMemberList__EnumMemberAssignment_1_1 : ( ruleEnumMember ) ;
    public final void rule__EnumMemberList__EnumMemberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3728:1: ( ( ruleEnumMember ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3729:1: ( ruleEnumMember )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3729:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3730:1: ruleEnumMember
            {
             before(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17592);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3739:1: rule__EnumMember__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumMember__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3743:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3744:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3744:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3745:1: RULE_ID
            {
             before(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__IdAssignment_07623); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3754:1: rule__Declarators__DecAssignment_0 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3758:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3759:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3759:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3760:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07654);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3769:1: rule__Declarators__DeclaratorListAssignment_1_1 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DeclaratorListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3773:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3774:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3774:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3775:1: ruleDeclarator
            {
             before(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17685);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3784:1: rule__Declarator__TypeQualifierAssignment_0_1 : ( ruleTypeQualifier ) ;
    public final void rule__Declarator__TypeQualifierAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3788:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3789:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3789:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3790:1: ruleTypeQualifier
            {
             before(grammarAccess.getDeclaratorAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17716);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3799:1: rule__Declarator__DcAssignment_1 : ( ruleDirectDeclarator ) ;
    public final void rule__Declarator__DcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3803:1: ( ( ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3804:1: ( ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3804:1: ( ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3805:1: ruleDirectDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17747);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3814:1: rule__DirectDeclarator__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__DirectDeclarator__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3818:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3819:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3819:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3820:1: RULE_ID
            {
             before(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectDeclarator__IdAssignment_0_07778); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3829:1: rule__ConstantDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3833:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3834:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3834:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3835:1: RULE_ID
            {
             before(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinition__IdAssignment_17809); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3844:1: rule__InterfaceDefinition__FqnAssignment_2 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__FqnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3848:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3849:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3849:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3850:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27840);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3859:1: rule__InterfaceDefinition__Fqn2Assignment_3_1 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__Fqn2Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3863:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3864:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3864:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3865:1: ruleFullyQualifiedName
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17871);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3874:1: rule__InterfaceDefinition__MethodDefAssignment_5 : ( ruleMethodDefinition ) ;
    public final void rule__InterfaceDefinition__MethodDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3878:1: ( ( ruleMethodDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3879:1: ( ruleMethodDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3879:1: ( ruleMethodDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3880:1: ruleMethodDefinition
            {
             before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57902);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3889:1: rule__MethodDefinition__QualifiedTypeSpecAssignment_0 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__MethodDefinition__QualifiedTypeSpecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3893:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3894:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3894:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3895:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07933);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3904:1: rule__MethodDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3908:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3909:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3909:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3910:1: RULE_ID
            {
             before(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodDefinition__IdAssignment_17964); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3919:1: rule__MethodDefinition__ParameterListAssignment_2_1_1 : ( ruleParameterList ) ;
    public final void rule__MethodDefinition__ParameterListAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3923:1: ( ( ruleParameterList ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3924:1: ( ruleParameterList )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3924:1: ( ruleParameterList )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3925:1: ruleParameterList
            {
             before(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17995);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3934:1: rule__ParameterList__ParamAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3938:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3939:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3939:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3940:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_08026);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3949:1: rule__ParameterList__ParamsAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3953:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3954:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3954:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3955:1: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_18057);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3964:1: rule__Parameter__ParameterQualifierAssignment_0 : ( ruleParameterQualifier ) ;
    public final void rule__Parameter__ParameterQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3968:1: ( ( ruleParameterQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3969:1: ( ruleParameterQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3969:1: ( ruleParameterQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3970:1: ruleParameterQualifier
            {
             before(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_08088);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3979:1: rule__Parameter__QualifiedTypeSpecAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__Parameter__QualifiedTypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3983:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3984:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3984:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3985:1: ruleQualifiedTypeSpecification
            {
             before(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_18119);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3994:1: rule__Parameter__DecAssignment_2 : ( ruleDeclarator ) ;
    public final void rule__Parameter__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3998:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3999:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3999:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4000:1: ruleDeclarator
            {
             before(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_28150);
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4009:1: rule__IncludeDirective__ImportedURIAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__IncludeDirective__ImportedURIAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4013:1: ( ( RULE_STRING ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4014:1: ( RULE_STRING )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4014:1: ( RULE_STRING )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4015:1: RULE_STRING
            {
             before(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IncludeDirective__ImportedURIAssignment_1_08181); 
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4024:1: rule__IncludeDirective__IncludeIDAssignment_1_1 : ( RULE_INCLUDELIB ) ;
    public final void rule__IncludeDirective__IncludeIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4028:1: ( ( RULE_INCLUDELIB ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4029:1: ( RULE_INCLUDELIB )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4029:1: ( RULE_INCLUDELIB )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4030:1: RULE_INCLUDELIB
            {
             before(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0()); 
            match(input,RULE_INCLUDELIB,FOLLOW_RULE_INCLUDELIB_in_rule__IncludeDirective__IncludeIDAssignment_1_18212); 
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


 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__0_in_ruleConstantDefinitionBegin156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionEnd__Group__0_in_ruleConstantDefinitionEnd217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group__0_in_ruleStructMember828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_rule__IdtFile__Alternatives_31948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__TypeAssignment_3_1_in_rule__IdtFile__Alternatives_31966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_02000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2120 = new BitSet(new long[]{0x0000000FFFFF0002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2132 = new BitSet(new long[]{0x0000000FFFFF0002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructOrUnion__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StructOrUnion__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySpecification__Alternatives_12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArraySpecification__Alternatives_12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__0_in_rule__MethodDefinition__Alternatives_22421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__0_in_rule__MethodDefinition__Alternatives_22439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__ImportedURIAssignment_1_0_in_rule__IncludeDirective__Alternatives_12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__IncludeIDAssignment_1_1_in_rule__IncludeDirective__Alternatives_12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TypeQualifier__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TypeQualifier__Alternatives2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeSpecifier__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeSpecifier__Alternatives2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeSpecifier__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeSpecifier__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeSpecifier__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeSpecifier__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeSpecifier__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeSpecifier__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeSpecifier__Alternatives2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeSpecifier__Alternatives2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeSpecifier__Alternatives2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeSpecifier__Alternatives2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeSpecifier__Alternatives2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeSpecifier__Alternatives2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeSpecifier__Alternatives2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeSpecifier__Alternatives2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeSpecifier__Alternatives2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeSpecifier__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeSpecifier__Alternatives2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeSpecifier__Alternatives2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParameterQualifier__Alternatives3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterQualifier__Alternatives3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__BegindefAssignment_0_in_rule__IdtFile__Group__03074 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__03083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__DefAssignment_1_in_rule__IdtFile__Group__13111 = new BitSet(new long[]{0x0440228000003000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__2_in_rule__IdtFile__Group__13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__IncludesAssignment_2_in_rule__IdtFile__Group__23148 = new BitSet(new long[]{0x0440228000003000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__3_in_rule__IdtFile__Group__23158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Alternatives_3_in_rule__IdtFile__Group__33186 = new BitSet(new long[]{0x0040228000003000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__4_in_rule__IdtFile__Group__33196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__EnddefAssignment_4_in_rule__IdtFile__Group__43224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ConstantDefinitionBegin__Group__03269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__1_in_rule__ConstantDefinitionBegin__Group__03279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__IdAssignment_1_in_rule__ConstantDefinitionBegin__Group__13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ConstantDefinitionEnd__Group__03346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionEnd__Group__1_in_rule__ConstantDefinitionEnd__Group__03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionEnd__IdAssignment_1_in_rule__ConstantDefinitionEnd__Group__13384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__03423 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__03432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeDefinition__Group__13461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TypedefSpecification__Group__03501 = new BitSet(new long[]{0x0000200FFFFFF020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__03511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__13539 = new BitSet(new long[]{0x0003000000000020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__13548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__23576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__03616 = new BitSet(new long[]{0x0000200FFFFFF020L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__03692 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__03701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__13729 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructOrUnionDefinition__Group__23768 = new BitSet(new long[]{0x0000280FFFFFF020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__23778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__33806 = new BitSet(new long[]{0x0000280FFFFFF020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__33816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StructOrUnionDefinition__Group__43845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__03890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__03899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__13927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__QualTypeAssignment_0_in_rule__StructMember__Group__03965 = new BitSet(new long[]{0x0003000000000020L});
    public static final BitSet FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__03974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__DecAssignment_1_in_rule__StructMember__Group__14002 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__14011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__0_in_rule__StructMember__Group__24039 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__24049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__StructMember__Group__34078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StructMember__Group_2__04122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructMember__Group_2__1_in_rule__StructMember__Group_2__04132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StructMember__Group_2__14160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumDefinition__Group__04198 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__04208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__14236 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__14246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumDefinition__Group__24275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__24285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__34313 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EnumDefinition__Group__44351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumReference__Group__04397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__04407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__04473 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__04481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__14509 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_rule__EnumMemberList__Group_1__04549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__04559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__14587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__IdAssignment_0_in_rule__EnumMember__Group__04625 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__04634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__0_in_rule__EnumMember__Group__14662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumMember__Group_1__04702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_1__1_in_rule__EnumMember__Group_1__04712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__Group_1__14740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__04777 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__04786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__14814 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_rule__Declarators__Group_1__04854 = new BitSet(new long[]{0x0003000000000020L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__14892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Group__04930 = new BitSet(new long[]{0x0003000000000020L});
    public static final BitSet FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__14968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Declarator__Group_0__05007 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__05017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__TypeQualifierAssignment_0_1_in_rule__Declarator__Group_0__15045 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__05084 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__Group__15122 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DirectDeclarator__Group_0_1__05162 = new BitSet(new long[]{0x0003000000000020L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__05172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__Group_0_1__15200 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__15208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__DirectDeclarator__Group_0_1__25237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ArraySpecification__Group__05279 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__05289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Alternatives_1_in_rule__ArraySpecification__Group__15317 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__15326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ArraySpecification__Group__25355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__05396 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__05404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__15432 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FullyQualifiedName__Group_1__05472 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__05482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__15510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ConstantDefinition__Group__05548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__15586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__InterfaceDefinition__Group__05625 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__05635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__InterfaceDefinition__Group__15665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__15677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__FqnAssignment_2_in_rule__InterfaceDefinition__Group__25705 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__25714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__0_in_rule__InterfaceDefinition__Group__35742 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__35752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InterfaceDefinition__Group__45781 = new BitSet(new long[]{0x0000280FFFFFF020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__45791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_5_in_rule__InterfaceDefinition__Group__55819 = new BitSet(new long[]{0x0000280FFFFFF020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__55829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__InterfaceDefinition__Group__65858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__InterfaceDefinition__Group_3__05908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_3__1_in_rule__InterfaceDefinition__Group_3__05918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_3_1_in_rule__InterfaceDefinition__Group_3__15946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_0_in_rule__MethodDefinition__Group__05984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__05993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__IdAssignment_1_in_rule__MethodDefinition__Group__16021 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__16030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Alternatives_2_in_rule__MethodDefinition__Group__26058 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__26067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MethodDefinition__Group__36096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodDefinition__Group_2_0__06140 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__1_in_rule__MethodDefinition__Group_2_0__06150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MethodDefinition__Group_2_0__16180 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_0__2_in_rule__MethodDefinition__Group_2_0__16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MethodDefinition__Group_2_0__26221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MethodDefinition__Group_2_1__06263 = new BitSet(new long[]{0x0000203FFFFFF020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__1_in_rule__MethodDefinition__Group_2_1__06273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__ParameterListAssignment_2_1_1_in_rule__MethodDefinition__Group_2_1__16301 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_2_1__2_in_rule__MethodDefinition__Group_2_1__16310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MethodDefinition__Group_2_1__26339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__06380 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__06389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__16417 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__16427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__26455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ParameterList__Group_1__06497 = new BitSet(new long[]{0x0000203FFFFFF020L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__06507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__16535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ParameterList__Group_2__06574 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__06584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__ParameterList__Group_2__16613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterQualifierAssignment_0_in_rule__Parameter__Group__06652 = new BitSet(new long[]{0x0000203FFFFFF020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_1_in_rule__Parameter__Group__16690 = new BitSet(new long[]{0x0003000000000020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__16699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DecAssignment_2_in_rule__Parameter__Group__26727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__IncludeDirective__Group__06768 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__06778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Alternatives_1_in_rule__IncludeDirective__Group__16806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_rule__IdtFile__BegindefAssignment_06844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__IdtFile__DefAssignment_16875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_rule__IdtFile__IncludesAssignment_26906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__IdtFile__ConstantAssignment_3_06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__IdtFile__TypeAssignment_3_16968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_rule__IdtFile__EnddefAssignment_46999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinitionBegin__IdAssignment_17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinitionEnd__IdAssignment_17061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_17096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_27127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_07158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_17189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_07220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_37251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_07282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructOrUnionDefinition__IdAssignment_17313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_37344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_07375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructorUnionReference__IdAssignment_17406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_07437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_17468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDefinition__IdAssignment_17499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_37530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumReference__IdAssignment_17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_17592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__IdAssignment_07623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_07654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_17685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__Declarator__TypeQualifierAssignment_0_17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_17747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectDeclarator__IdAssignment_0_07778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinition__IdAssignment_17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_27840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_3_17871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_57902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_07933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodDefinition__IdAssignment_17964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_2_1_17995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_08026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_08088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_18119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_28150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IncludeDirective__ImportedURIAssignment_1_08181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDELIB_in_rule__IncludeDirective__IncludeIDAssignment_1_18212 = new BitSet(new long[]{0x0000000000000002L});

}