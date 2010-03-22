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
import java.util.Map;
import java.util.HashMap;
public class InternalFractalIdtParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_INCLUDELIB", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'struct'", "'union'", "'null'", "'const'", "'volatile'", "'void'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'", "'#ifndef'", "'#endif'", "';'", "'typedef'", "'{'", "'}'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'...'", "'#include'", "'@'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=5;
    public static final int RULE_INCLUDELIB=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalFractalIdtParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[341+1];
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:61:1: entryRuleIdtFile : ruleIdtFile EOF ;
    public final void entryRuleIdtFile() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:62:1: ( ruleIdtFile EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:63:1: ruleIdtFile EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileRule()); 
            }
            pushFollow(FOLLOW_ruleIdtFile_in_entryRuleIdtFile67);
            ruleIdtFile();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdtFile74); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:70:1: ruleIdtFile : ( ( rule__IdtFile__Group__0 ) ) ;
    public final void ruleIdtFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:74:2: ( ( ( rule__IdtFile__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:75:1: ( ( rule__IdtFile__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:75:1: ( ( rule__IdtFile__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:76:1: ( rule__IdtFile__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:77:1: ( rule__IdtFile__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:77:2: rule__IdtFile__Group__0
            {
            pushFollow(FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile101);
            rule__IdtFile__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:89:1: entryRuleConstantDefinitionBegin : ruleConstantDefinitionBegin EOF ;
    public final void entryRuleConstantDefinitionBegin() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:90:1: ( ruleConstantDefinitionBegin EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:91:1: ruleConstantDefinitionBegin EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin128);
            ruleConstantDefinitionBegin();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionBegin135); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:98:1: ruleConstantDefinitionBegin : ( ( rule__ConstantDefinitionBegin__Group__0 ) ) ;
    public final void ruleConstantDefinitionBegin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:102:2: ( ( ( rule__ConstantDefinitionBegin__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:103:1: ( ( rule__ConstantDefinitionBegin__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:103:1: ( ( rule__ConstantDefinitionBegin__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:104:1: ( rule__ConstantDefinitionBegin__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:105:1: ( rule__ConstantDefinitionBegin__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:105:2: rule__ConstantDefinitionBegin__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__0_in_ruleConstantDefinitionBegin162);
            rule__ConstantDefinitionBegin__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:117:1: entryRuleConstantDefinitionEnd : ruleConstantDefinitionEnd EOF ;
    public final void entryRuleConstantDefinitionEnd() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:118:1: ( ruleConstantDefinitionEnd EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:119:1: ruleConstantDefinitionEnd EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd189);
            ruleConstantDefinitionEnd();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinitionEnd196); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:126:1: ruleConstantDefinitionEnd : ( ( rule__ConstantDefinitionEnd__Group__0 ) ) ;
    public final void ruleConstantDefinitionEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:130:2: ( ( ( rule__ConstantDefinitionEnd__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:131:1: ( ( rule__ConstantDefinitionEnd__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:131:1: ( ( rule__ConstantDefinitionEnd__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:132:1: ( rule__ConstantDefinitionEnd__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:133:1: ( rule__ConstantDefinitionEnd__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:133:2: rule__ConstantDefinitionEnd__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionEnd__Group__0_in_ruleConstantDefinitionEnd223);
            rule__ConstantDefinitionEnd__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:147:1: entryRuleTypeDefinition : ruleTypeDefinition EOF ;
    public final void entryRuleTypeDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:148:1: ( ruleTypeDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:149:1: ruleTypeDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition252);
            ruleTypeDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition259); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:156:1: ruleTypeDefinition : ( ( rule__TypeDefinition__Group__0 ) ) ;
    public final void ruleTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:160:2: ( ( ( rule__TypeDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:161:1: ( ( rule__TypeDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:161:1: ( ( rule__TypeDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:162:1: ( rule__TypeDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:163:1: ( rule__TypeDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:163:2: rule__TypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition286);
            rule__TypeDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:175:1: entryRuleTypedefSpecification : ruleTypedefSpecification EOF ;
    public final void entryRuleTypedefSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:176:1: ( ruleTypedefSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:177:1: ruleTypedefSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification313);
            ruleTypedefSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefSpecification320); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:184:1: ruleTypedefSpecification : ( ( rule__TypedefSpecification__Group__0 ) ) ;
    public final void ruleTypedefSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:188:2: ( ( ( rule__TypedefSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:189:1: ( ( rule__TypedefSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:189:1: ( ( rule__TypedefSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:190:1: ( rule__TypedefSpecification__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:191:1: ( rule__TypedefSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:191:2: rule__TypedefSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification347);
            rule__TypedefSpecification__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:203:1: entryRuleQualifiedTypeSpecification : ruleQualifiedTypeSpecification EOF ;
    public final void entryRuleQualifiedTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:204:1: ( ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:205:1: ruleQualifiedTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualifiedTypeSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification374);
            ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getQualifiedTypeSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification381); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:212:1: ruleQualifiedTypeSpecification : ( ( rule__QualifiedTypeSpecification__Group__0 ) ) ;
    public final void ruleQualifiedTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:216:2: ( ( ( rule__QualifiedTypeSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:217:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:217:1: ( ( rule__QualifiedTypeSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:218:1: ( rule__QualifiedTypeSpecification__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:219:1: ( rule__QualifiedTypeSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:219:2: rule__QualifiedTypeSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification408);
            rule__QualifiedTypeSpecification__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getQualifiedTypeSpecificationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:231:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:232:1: ( ruleTypeSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:233:1: ruleTypeSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification435);
            ruleTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypeSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecification442); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:240:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:244:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:245:1: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:245:1: ( ( rule__TypeSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:246:1: ( rule__TypeSpecification__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:247:1: ( rule__TypeSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:247:2: rule__TypeSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification469);
            rule__TypeSpecification__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:259:1: entryRuleTypedefName : ruleTypedefName EOF ;
    public final void entryRuleTypedefName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:260:1: ( ruleTypedefName EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:261:1: ruleTypedefName EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypedefName_in_entryRuleTypedefName496);
            ruleTypedefName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedefName503); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:268:1: ruleTypedefName : ( ruleFullyQualifiedName ) ;
    public final void ruleTypedefName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:272:2: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:273:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:273:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:274:1: ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName530);
            ruleFullyQualifiedName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefNameAccess().getFullyQualifiedNameParserRuleCall()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:287:1: entryRuleStructOrUnionSpecification : ruleStructOrUnionSpecification EOF ;
    public final void entryRuleStructOrUnionSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:288:1: ( ruleStructOrUnionSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:289:1: ruleStructOrUnionSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification556);
            ruleStructOrUnionSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionSpecification563); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:296:1: ruleStructOrUnionSpecification : ( ( rule__StructOrUnionSpecification__Alternatives ) ) ;
    public final void ruleStructOrUnionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:300:2: ( ( ( rule__StructOrUnionSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:301:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:301:1: ( ( rule__StructOrUnionSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:302:1: ( rule__StructOrUnionSpecification__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:303:1: ( rule__StructOrUnionSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:303:2: rule__StructOrUnionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification590);
            rule__StructOrUnionSpecification__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionSpecificationAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:315:1: entryRuleStructOrUnionDefinition : ruleStructOrUnionDefinition EOF ;
    public final void entryRuleStructOrUnionDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:316:1: ( ruleStructOrUnionDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:317:1: ruleStructOrUnionDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition617);
            ruleStructOrUnionDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnionDefinition624); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:324:1: ruleStructOrUnionDefinition : ( ( rule__StructOrUnionDefinition__Group__0 ) ) ;
    public final void ruleStructOrUnionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:328:2: ( ( ( rule__StructOrUnionDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:329:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:329:1: ( ( rule__StructOrUnionDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:330:1: ( rule__StructOrUnionDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:331:1: ( rule__StructOrUnionDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:331:2: rule__StructOrUnionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition651);
            rule__StructOrUnionDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:343:1: entryRuleStructorUnionReference : ruleStructorUnionReference EOF ;
    public final void entryRuleStructorUnionReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:344:1: ( ruleStructorUnionReference EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:345:1: ruleStructorUnionReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructorUnionReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference678);
            ruleStructorUnionReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructorUnionReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructorUnionReference685); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:352:1: ruleStructorUnionReference : ( ( rule__StructorUnionReference__Group__0 ) ) ;
    public final void ruleStructorUnionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:356:2: ( ( ( rule__StructorUnionReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:357:1: ( ( rule__StructorUnionReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:357:1: ( ( rule__StructorUnionReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:358:1: ( rule__StructorUnionReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructorUnionReferenceAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:359:1: ( rule__StructorUnionReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:359:2: rule__StructorUnionReference__Group__0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference712);
            rule__StructorUnionReference__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructorUnionReferenceAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:371:1: entryRuleStructOrUnion : ruleStructOrUnion EOF ;
    public final void entryRuleStructOrUnion() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:372:1: ( ruleStructOrUnion EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:373:1: ruleStructOrUnion EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionRule()); 
            }
            pushFollow(FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion739);
            ruleStructOrUnion();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructOrUnion746); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:380:1: ruleStructOrUnion : ( ( rule__StructOrUnion__Alternatives ) ) ;
    public final void ruleStructOrUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:384:2: ( ( ( rule__StructOrUnion__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:385:1: ( ( rule__StructOrUnion__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:385:1: ( ( rule__StructOrUnion__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:386:1: ( rule__StructOrUnion__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:387:1: ( rule__StructOrUnion__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:387:2: rule__StructOrUnion__Alternatives
            {
            pushFollow(FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion773);
            rule__StructOrUnion__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:399:1: entryRuleStructMember : ruleStructMember EOF ;
    public final void entryRuleStructMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:400:1: ( ruleStructMember EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:401:1: ruleStructMember EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberRule()); 
            }
            pushFollow(FOLLOW_ruleStructMember_in_entryRuleStructMember800);
            ruleStructMember();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructMember807); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:408:1: ruleStructMember : ( ( rule__StructMember__Group__0 ) ) ;
    public final void ruleStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:412:2: ( ( ( rule__StructMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:413:1: ( ( rule__StructMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:413:1: ( ( rule__StructMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:414:1: ( rule__StructMember__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:415:1: ( rule__StructMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:415:2: rule__StructMember__Group__0
            {
            pushFollow(FOLLOW_rule__StructMember__Group__0_in_ruleStructMember834);
            rule__StructMember__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:427:1: entryRuleEnumSpecification : ruleEnumSpecification EOF ;
    public final void entryRuleEnumSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:428:1: ( ruleEnumSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:429:1: ruleEnumSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification861);
            ruleEnumSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecification868); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:436:1: ruleEnumSpecification : ( ( rule__EnumSpecification__Alternatives ) ) ;
    public final void ruleEnumSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:440:2: ( ( ( rule__EnumSpecification__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:441:1: ( ( rule__EnumSpecification__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:441:1: ( ( rule__EnumSpecification__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:442:1: ( rule__EnumSpecification__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumSpecificationAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:443:1: ( rule__EnumSpecification__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:443:2: rule__EnumSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification895);
            rule__EnumSpecification__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumSpecificationAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:455:1: entryRuleEnumDefinition : ruleEnumDefinition EOF ;
    public final void entryRuleEnumDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:456:1: ( ruleEnumDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:457:1: ruleEnumDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition922);
            ruleEnumDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDefinition929); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:464:1: ruleEnumDefinition : ( ( rule__EnumDefinition__Group__0 ) ) ;
    public final void ruleEnumDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:468:2: ( ( ( rule__EnumDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:469:1: ( ( rule__EnumDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:469:1: ( ( rule__EnumDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:470:1: ( rule__EnumDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:471:1: ( rule__EnumDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:471:2: rule__EnumDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition956);
            rule__EnumDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:483:1: entryRuleEnumReference : ruleEnumReference EOF ;
    public final void entryRuleEnumReference() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:484:1: ( ruleEnumReference EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:485:1: ruleEnumReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleEnumReference_in_entryRuleEnumReference983);
            ruleEnumReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumReference990); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:492:1: ruleEnumReference : ( ( rule__EnumReference__Group__0 ) ) ;
    public final void ruleEnumReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:496:2: ( ( ( rule__EnumReference__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:497:1: ( ( rule__EnumReference__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:497:1: ( ( rule__EnumReference__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:498:1: ( rule__EnumReference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumReferenceAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:499:1: ( rule__EnumReference__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:499:2: rule__EnumReference__Group__0
            {
            pushFollow(FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference1017);
            rule__EnumReference__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumReferenceAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:511:1: entryRuleEnumMemberList : ruleEnumMemberList EOF ;
    public final void entryRuleEnumMemberList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:512:1: ( ruleEnumMemberList EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:513:1: ruleEnumMemberList EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListRule()); 
            }
            pushFollow(FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1044);
            ruleEnumMemberList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMemberList1051); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:520:1: ruleEnumMemberList : ( ( rule__EnumMemberList__Group__0 ) ) ;
    public final void ruleEnumMemberList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:524:2: ( ( ( rule__EnumMemberList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:525:1: ( ( rule__EnumMemberList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:525:1: ( ( rule__EnumMemberList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:526:1: ( rule__EnumMemberList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:527:1: ( rule__EnumMemberList__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:527:2: rule__EnumMemberList__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList1078);
            rule__EnumMemberList__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:539:1: entryRuleEnumMember : ruleEnumMember EOF ;
    public final void entryRuleEnumMember() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:540:1: ( ruleEnumMember EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:541:1: ruleEnumMember EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberRule()); 
            }
            pushFollow(FOLLOW_ruleEnumMember_in_entryRuleEnumMember1105);
            ruleEnumMember();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumMember1112); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:548:1: ruleEnumMember : ( ( rule__EnumMember__Group__0 ) ) ;
    public final void ruleEnumMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:552:2: ( ( ( rule__EnumMember__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:553:1: ( ( rule__EnumMember__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:553:1: ( ( rule__EnumMember__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:554:1: ( rule__EnumMember__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:555:1: ( rule__EnumMember__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:555:2: rule__EnumMember__Group__0
            {
            pushFollow(FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1139);
            rule__EnumMember__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:567:1: entryRuleDeclarators : ruleDeclarators EOF ;
    public final void entryRuleDeclarators() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:568:1: ( ruleDeclarators EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:569:1: ruleDeclarators EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarators_in_entryRuleDeclarators1166);
            ruleDeclarators();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarators1173); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:576:1: ruleDeclarators : ( ( rule__Declarators__Group__0 ) ) ;
    public final void ruleDeclarators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:580:2: ( ( ( rule__Declarators__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:581:1: ( ( rule__Declarators__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:581:1: ( ( rule__Declarators__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:582:1: ( rule__Declarators__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:583:1: ( rule__Declarators__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:583:2: rule__Declarators__Group__0
            {
            pushFollow(FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1200);
            rule__Declarators__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:595:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:596:1: ( ruleDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:597:1: ruleDeclarator EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1227);
            ruleDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator1234); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:604:1: ruleDeclarator : ( ( rule__Declarator__Group__0 ) ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:608:2: ( ( ( rule__Declarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:609:1: ( ( rule__Declarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:609:1: ( ( rule__Declarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:610:1: ( rule__Declarator__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:611:1: ( rule__Declarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:611:2: rule__Declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1261);
            rule__Declarator__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRulePointerSpecification
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:623:1: entryRulePointerSpecification : rulePointerSpecification EOF ;
    public final void entryRulePointerSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:624:1: ( rulePointerSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:625:1: rulePointerSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPointerSpecificationRule()); 
            }
            pushFollow(FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification1288);
            rulePointerSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPointerSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePointerSpecification1295); if (failed) return ;

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
    // $ANTLR end entryRulePointerSpecification


    // $ANTLR start rulePointerSpecification
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:632:1: rulePointerSpecification : ( ( rule__PointerSpecification__Group__0 ) ) ;
    public final void rulePointerSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:636:2: ( ( ( rule__PointerSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:637:1: ( ( rule__PointerSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:637:1: ( ( rule__PointerSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:638:1: ( rule__PointerSpecification__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPointerSpecificationAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:639:1: ( rule__PointerSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:639:2: rule__PointerSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__PointerSpecification__Group__0_in_rulePointerSpecification1322);
            rule__PointerSpecification__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPointerSpecificationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePointerSpecification


    // $ANTLR start entryRuleQualified_PointerSpecification
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:651:1: entryRuleQualified_PointerSpecification : ruleQualified_PointerSpecification EOF ;
    public final void entryRuleQualified_PointerSpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:652:1: ( ruleQualified_PointerSpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:653:1: ruleQualified_PointerSpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualified_PointerSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification1349);
            ruleQualified_PointerSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getQualified_PointerSpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualified_PointerSpecification1356); if (failed) return ;

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
    // $ANTLR end entryRuleQualified_PointerSpecification


    // $ANTLR start ruleQualified_PointerSpecification
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:660:1: ruleQualified_PointerSpecification : ( ( rule__Qualified_PointerSpecification__Group__0 ) ) ;
    public final void ruleQualified_PointerSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:664:2: ( ( ( rule__Qualified_PointerSpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:665:1: ( ( rule__Qualified_PointerSpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:665:1: ( ( rule__Qualified_PointerSpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:666:1: ( rule__Qualified_PointerSpecification__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualified_PointerSpecificationAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:667:1: ( rule__Qualified_PointerSpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:667:2: rule__Qualified_PointerSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__Qualified_PointerSpecification__Group__0_in_ruleQualified_PointerSpecification1383);
            rule__Qualified_PointerSpecification__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getQualified_PointerSpecificationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualified_PointerSpecification


    // $ANTLR start entryRuleDirectDeclarator
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:679:1: entryRuleDirectDeclarator : ruleDirectDeclarator EOF ;
    public final void entryRuleDirectDeclarator() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:680:1: ( ruleDirectDeclarator EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:681:1: ruleDirectDeclarator EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorRule()); 
            }
            pushFollow(FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1410);
            ruleDirectDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectDeclarator1417); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:688:1: ruleDirectDeclarator : ( ( rule__DirectDeclarator__Group__0 ) ) ;
    public final void ruleDirectDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:692:2: ( ( ( rule__DirectDeclarator__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:693:1: ( ( rule__DirectDeclarator__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:693:1: ( ( rule__DirectDeclarator__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:694:1: ( rule__DirectDeclarator__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:695:1: ( rule__DirectDeclarator__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:695:2: rule__DirectDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1444);
            rule__DirectDeclarator__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:707:1: entryRuleArraySpecification : ruleArraySpecification EOF ;
    public final void entryRuleArraySpecification() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:708:1: ( ruleArraySpecification EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:709:1: ruleArraySpecification EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1471);
            ruleArraySpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getArraySpecificationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySpecification1478); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:716:1: ruleArraySpecification : ( ( rule__ArraySpecification__Group__0 ) ) ;
    public final void ruleArraySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:720:2: ( ( ( rule__ArraySpecification__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:721:1: ( ( rule__ArraySpecification__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:721:1: ( ( rule__ArraySpecification__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:722:1: ( rule__ArraySpecification__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:723:1: ( rule__ArraySpecification__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:723:2: rule__ArraySpecification__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1505);
            rule__ArraySpecification__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:735:1: entryRuleFullyQualifiedName : ruleFullyQualifiedName EOF ;
    public final void entryRuleFullyQualifiedName() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:736:1: ( ruleFullyQualifiedName EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:737:1: ruleFullyQualifiedName EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFullyQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1532);
            ruleFullyQualifiedName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFullyQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullyQualifiedName1539); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:744:1: ruleFullyQualifiedName : ( ( rule__FullyQualifiedName__Group__0 ) ) ;
    public final void ruleFullyQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:748:2: ( ( ( rule__FullyQualifiedName__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:749:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:749:1: ( ( rule__FullyQualifiedName__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:750:1: ( rule__FullyQualifiedName__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:751:1: ( rule__FullyQualifiedName__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:751:2: rule__FullyQualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1566);
            rule__FullyQualifiedName__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFullyQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:763:1: entryRuleConstantDefinition : ruleConstantDefinition EOF ;
    public final void entryRuleConstantDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:764:1: ( ruleConstantDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:765:1: ruleConstantDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1593);
            ruleConstantDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition1600); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:772:1: ruleConstantDefinition : ( ( rule__ConstantDefinition__Group__0 ) ) ;
    public final void ruleConstantDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:776:2: ( ( ( rule__ConstantDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:777:1: ( ( rule__ConstantDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:777:1: ( ( rule__ConstantDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:778:1: ( rule__ConstantDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:779:1: ( rule__ConstantDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:779:2: rule__ConstantDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1627);
            rule__ConstantDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:791:1: entryRuleInterfaceDefinition : ruleInterfaceDefinition EOF ;
    public final void entryRuleInterfaceDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:792:1: ( ruleInterfaceDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:793:1: ruleInterfaceDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1654);
            ruleInterfaceDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDefinition1661); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:800:1: ruleInterfaceDefinition : ( ( rule__InterfaceDefinition__Group__0 ) ) ;
    public final void ruleInterfaceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:804:2: ( ( ( rule__InterfaceDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:805:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:805:1: ( ( rule__InterfaceDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:806:1: ( rule__InterfaceDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:807:1: ( rule__InterfaceDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:807:2: rule__InterfaceDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1688);
            rule__InterfaceDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:819:1: entryRuleMethodDefinition : ruleMethodDefinition EOF ;
    public final void entryRuleMethodDefinition() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:820:1: ( ruleMethodDefinition EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:821:1: ruleMethodDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1715);
            ruleMethodDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodDefinition1722); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:828:1: ruleMethodDefinition : ( ( rule__MethodDefinition__Group__0 ) ) ;
    public final void ruleMethodDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:832:2: ( ( ( rule__MethodDefinition__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:833:1: ( ( rule__MethodDefinition__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:833:1: ( ( rule__MethodDefinition__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:834:1: ( rule__MethodDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:835:1: ( rule__MethodDefinition__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:835:2: rule__MethodDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1749);
            rule__MethodDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:847:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:848:1: ( ruleParameterList EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:849:1: ruleParameterList EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1776);
            ruleParameterList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1783); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:856:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:860:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:861:1: ( ( rule__ParameterList__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:861:1: ( ( rule__ParameterList__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:862:1: ( rule__ParameterList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:863:1: ( rule__ParameterList__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:863:2: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1810);
            rule__ParameterList__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:875:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:876:1: ( ruleParameter EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:877:1: ruleParameter EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1837);
            ruleParameter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1844); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:884:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:888:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:889:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:889:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:890:1: ( rule__Parameter__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:891:1: ( rule__Parameter__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:891:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1871);
            rule__Parameter__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:903:1: entryRuleIncludeDirective : ruleIncludeDirective EOF ;
    public final void entryRuleIncludeDirective() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:904:1: ( ruleIncludeDirective EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:905:1: ruleIncludeDirective EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeDirectiveRule()); 
            }
            pushFollow(FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1898);
            ruleIncludeDirective();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeDirectiveRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDirective1905); if (failed) return ;

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:912:1: ruleIncludeDirective : ( ( rule__IncludeDirective__Group__0 ) ) ;
    public final void ruleIncludeDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:916:2: ( ( ( rule__IncludeDirective__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:917:1: ( ( rule__IncludeDirective__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:917:1: ( ( rule__IncludeDirective__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:918:1: ( rule__IncludeDirective__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeDirectiveAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:919:1: ( rule__IncludeDirective__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:919:2: rule__IncludeDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1932);
            rule__IncludeDirective__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeDirectiveAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start entryRuleAnnotations
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:931:1: entryRuleAnnotations : ruleAnnotations EOF ;
    public final void entryRuleAnnotations() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:932:1: ( ruleAnnotations EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:933:1: ruleAnnotations EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationsRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_entryRuleAnnotations1959);
            ruleAnnotations();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotations1966); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotations


    // $ANTLR start ruleAnnotations
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:940:1: ruleAnnotations : ( ( rule__Annotations__Group__0 ) ) ;
    public final void ruleAnnotations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:944:2: ( ( ( rule__Annotations__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:945:1: ( ( rule__Annotations__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:945:1: ( ( rule__Annotations__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:946:1: ( rule__Annotations__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationsAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:947:1: ( rule__Annotations__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:947:2: rule__Annotations__Group__0
            {
            pushFollow(FOLLOW_rule__Annotations__Group__0_in_ruleAnnotations1993);
            rule__Annotations__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotations


    // $ANTLR start entryRuleAnnotation
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:959:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:960:1: ( ruleAnnotation EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:961:1: ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation2020);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation2027); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:968:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:972:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:973:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:973:1: ( ( rule__Annotation__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:974:1: ( rule__Annotation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:975:1: ( rule__Annotation__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:975:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation2054);
            rule__Annotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleAnnotationParameters
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:987:1: entryRuleAnnotationParameters : ruleAnnotationParameters EOF ;
    public final void entryRuleAnnotationParameters() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:988:1: ( ruleAnnotationParameters EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:989:1: ruleAnnotationParameters EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters2081);
            ruleAnnotationParameters();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationParameters2088); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotationParameters


    // $ANTLR start ruleAnnotationParameters
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:996:1: ruleAnnotationParameters : ( ( rule__AnnotationParameters__Group__0 ) ) ;
    public final void ruleAnnotationParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1000:2: ( ( ( rule__AnnotationParameters__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1001:1: ( ( rule__AnnotationParameters__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1001:1: ( ( rule__AnnotationParameters__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1002:1: ( rule__AnnotationParameters__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1003:1: ( rule__AnnotationParameters__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1003:2: rule__AnnotationParameters__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationParameters__Group__0_in_ruleAnnotationParameters2115);
            rule__AnnotationParameters__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotationParameters


    // $ANTLR start entryRuleAnnotationValuePairs
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1015:1: entryRuleAnnotationValuePairs : ruleAnnotationValuePairs EOF ;
    public final void entryRuleAnnotationValuePairs() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1016:1: ( ruleAnnotationValuePairs EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1017:1: ruleAnnotationValuePairs EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs2142);
            ruleAnnotationValuePairs();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValuePairs2149); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotationValuePairs


    // $ANTLR start ruleAnnotationValuePairs
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1024:1: ruleAnnotationValuePairs : ( ( rule__AnnotationValuePairs__Group__0 ) ) ;
    public final void ruleAnnotationValuePairs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1028:2: ( ( ( rule__AnnotationValuePairs__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1029:1: ( ( rule__AnnotationValuePairs__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1029:1: ( ( rule__AnnotationValuePairs__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1030:1: ( rule__AnnotationValuePairs__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1031:1: ( rule__AnnotationValuePairs__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1031:2: rule__AnnotationValuePairs__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationValuePairs__Group__0_in_ruleAnnotationValuePairs2176);
            rule__AnnotationValuePairs__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotationValuePairs


    // $ANTLR start entryRuleAnnotationValuePair
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1043:1: entryRuleAnnotationValuePair : ruleAnnotationValuePair EOF ;
    public final void entryRuleAnnotationValuePair() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1044:1: ( ruleAnnotationValuePair EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1045:1: ruleAnnotationValuePair EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair2203);
            ruleAnnotationValuePair();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValuePair2210); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotationValuePair


    // $ANTLR start ruleAnnotationValuePair
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1052:1: ruleAnnotationValuePair : ( ( rule__AnnotationValuePair__Group__0 ) ) ;
    public final void ruleAnnotationValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1056:2: ( ( ( rule__AnnotationValuePair__Group__0 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1057:1: ( ( rule__AnnotationValuePair__Group__0 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1057:1: ( ( rule__AnnotationValuePair__Group__0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1058:1: ( rule__AnnotationValuePair__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairAccess().getGroup()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1059:1: ( rule__AnnotationValuePair__Group__0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1059:2: rule__AnnotationValuePair__Group__0
            {
            pushFollow(FOLLOW_rule__AnnotationValuePair__Group__0_in_ruleAnnotationValuePair2237);
            rule__AnnotationValuePair__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotationValuePair


    // $ANTLR start entryRuleAnnotationValue
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1071:1: entryRuleAnnotationValue : ruleAnnotationValue EOF ;
    public final void entryRuleAnnotationValue() throws RecognitionException {
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1072:1: ( ruleAnnotationValue EOF )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1073:1: ruleAnnotationValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue2264);
            ruleAnnotationValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationValue2271); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotationValue


    // $ANTLR start ruleAnnotationValue
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1080:1: ruleAnnotationValue : ( ( rule__AnnotationValue__Alternatives ) ) ;
    public final void ruleAnnotationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1084:2: ( ( ( rule__AnnotationValue__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1085:1: ( ( rule__AnnotationValue__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1085:1: ( ( rule__AnnotationValue__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1086:1: ( rule__AnnotationValue__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValueAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1087:1: ( rule__AnnotationValue__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1087:2: rule__AnnotationValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AnnotationValue__Alternatives_in_ruleAnnotationValue2298);
            rule__AnnotationValue__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotationValue


    // $ANTLR start ruleTypeQualifier
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1100:1: ruleTypeQualifier : ( ( rule__TypeQualifier__Alternatives ) ) ;
    public final void ruleTypeQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1104:1: ( ( ( rule__TypeQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1105:1: ( ( rule__TypeQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1105:1: ( ( rule__TypeQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1106:1: ( rule__TypeQualifier__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeQualifierAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1107:1: ( rule__TypeQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1107:2: rule__TypeQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier2335);
            rule__TypeQualifier__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeQualifierAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1119:1: ruleTypeSpecifier : ( ( rule__TypeSpecifier__Alternatives ) ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1123:1: ( ( ( rule__TypeSpecifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1124:1: ( ( rule__TypeSpecifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1124:1: ( ( rule__TypeSpecifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1125:1: ( rule__TypeSpecifier__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeSpecifierAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1126:1: ( rule__TypeSpecifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1126:2: rule__TypeSpecifier__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier2371);
            rule__TypeSpecifier__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeSpecifierAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1138:1: ruleParameterQualifier : ( ( rule__ParameterQualifier__Alternatives ) ) ;
    public final void ruleParameterQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1142:1: ( ( ( rule__ParameterQualifier__Alternatives ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1143:1: ( ( rule__ParameterQualifier__Alternatives ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1143:1: ( ( rule__ParameterQualifier__Alternatives ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1144:1: ( rule__ParameterQualifier__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterQualifierAccess().getAlternatives()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1145:1: ( rule__ParameterQualifier__Alternatives )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1145:2: rule__ParameterQualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier2407);
            rule__ParameterQualifier__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterQualifierAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1156:1: rule__IdtFile__Alternatives_3 : ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) );
    public final void rule__IdtFile__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1160:1: ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==56) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==43||LA1_0==47) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1156:1: rule__IdtFile__Alternatives_3 : ( ( ( rule__IdtFile__ConstantAssignment_3_0 ) ) | ( ( rule__IdtFile__TypeAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1161:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1161:1: ( ( rule__IdtFile__ConstantAssignment_3_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1162:1: ( rule__IdtFile__ConstantAssignment_3_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1163:1: ( rule__IdtFile__ConstantAssignment_3_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1163:2: rule__IdtFile__ConstantAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_rule__IdtFile__Alternatives_32442);
                    rule__IdtFile__ConstantAssignment_3_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getIdtFileAccess().getConstantAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1167:6: ( ( rule__IdtFile__TypeAssignment_3_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1167:6: ( ( rule__IdtFile__TypeAssignment_3_1 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1168:1: ( rule__IdtFile__TypeAssignment_3_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1169:1: ( rule__IdtFile__TypeAssignment_3_1 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1169:2: rule__IdtFile__TypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__IdtFile__TypeAssignment_3_1_in_rule__IdtFile__Alternatives_32460);
                    rule__IdtFile__TypeAssignment_3_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getIdtFileAccess().getTypeAssignment_3_1()); 
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
    // $ANTLR end rule__IdtFile__Alternatives_3


    // $ANTLR start rule__TypeDefinition__Alternatives_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1179:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );
    public final void rule__TypeDefinition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1183:1: ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt2=1;
                }
                break;
            case 13:
            case 14:
                {
                alt2=2;
                }
                break;
            case 47:
                {
                alt2=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1179:1: rule__TypeDefinition__Alternatives_0 : ( ( ruleTypedefSpecification ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1184:1: ( ruleTypedefSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1184:1: ( ruleTypedefSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1185:1: ruleTypedefSpecification
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_02494);
                    ruleTypedefSpecification();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1190:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1190:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1191:1: ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02511);
                    ruleStructOrUnionSpecification();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1196:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1196:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1197:1: ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02528);
                    ruleEnumSpecification();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
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
    // $ANTLR end rule__TypeDefinition__Alternatives_0


    // $ANTLR start rule__TypeSpecification__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1207:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1211:1: ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
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
            case 47:
                {
                alt4=3;
                }
                break;
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
                {
                alt4=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1207:1: rule__TypeSpecification__Alternatives : ( ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) ) | ( ruleStructOrUnionSpecification ) | ( ruleEnumSpecification ) | ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1212:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1212:1: ( ( rule__TypeSpecification__TypeDefNameAssignment_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1213:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1214:1: ( rule__TypeSpecification__TypeDefNameAssignment_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1214:2: rule__TypeSpecification__TypeDefNameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2560);
                    rule__TypeSpecification__TypeDefNameAssignment_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecificationAccess().getTypeDefNameAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1218:6: ( ruleStructOrUnionSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1218:6: ( ruleStructOrUnionSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1219:1: ruleStructOrUnionSpecification
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2578);
                    ruleStructOrUnionSpecification();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1224:6: ( ruleEnumSpecification )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1224:6: ( ruleEnumSpecification )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1225:1: ruleEnumSpecification
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2595);
                    ruleEnumSpecification();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1230:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1230:6: ( ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1231:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) ) ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1231:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1232:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1233:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1233:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2614);
                    rule__TypeSpecification__TypeSpecifierAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    }

                    }

                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1236:1: ( ( rule__TypeSpecification__TypeSpecifierAssignment_3 )* )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1237:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1238:1: ( rule__TypeSpecification__TypeSpecifierAssignment_3 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=18 && LA3_0<=37)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1238:2: rule__TypeSpecification__TypeSpecifierAssignment_3
                    	    {
                    	    pushFollow(FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2626);
                    	    rule__TypeSpecification__TypeSpecifierAssignment_3();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierAssignment_3()); 
                    }

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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1248:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );
    public final void rule__StructOrUnionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1252:1: ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==42||LA5_3==48||(LA5_3>=50 && LA5_3<=52)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==44) ) {
                        alt5=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1248:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==44) ) {
                    alt5=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1248:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==14) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==42||LA5_3==48||(LA5_3>=50 && LA5_3<=52)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==44) ) {
                        alt5=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1248:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_2==44) ) {
                    alt5=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1248:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1248:1: rule__StructOrUnionSpecification__Alternatives : ( ( ruleStructOrUnionDefinition ) | ( ruleStructorUnionReference ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1253:1: ( ruleStructOrUnionDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1253:1: ( ruleStructOrUnionDefinition )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1254:1: ruleStructOrUnionDefinition
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2662);
                    ruleStructOrUnionDefinition();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1259:6: ( ruleStructorUnionReference )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1259:6: ( ruleStructorUnionReference )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1260:1: ruleStructorUnionReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2679);
                    ruleStructorUnionReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
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
    // $ANTLR end rule__StructOrUnionSpecification__Alternatives


    // $ANTLR start rule__StructOrUnion__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1270:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );
    public final void rule__StructOrUnion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1274:1: ( ( 'struct' ) | ( 'union' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1270:1: rule__StructOrUnion__Alternatives : ( ( 'struct' ) | ( 'union' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1275:1: ( 'struct' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1275:1: ( 'struct' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1276:1: 'struct'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__StructOrUnion__Alternatives2712); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1283:6: ( 'union' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1283:6: ( 'union' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1284:1: 'union'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__StructOrUnion__Alternatives2732); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
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
    // $ANTLR end rule__StructOrUnion__Alternatives


    // $ANTLR start rule__EnumSpecification__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1296:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );
    public final void rule__EnumSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1300:1: ( ( ruleEnumDefinition ) | ( ruleEnumReference ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==44) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==42||LA7_2==48||(LA7_2>=50 && LA7_2<=52)) ) {
                        alt7=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1296:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==44) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1296:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1296:1: rule__EnumSpecification__Alternatives : ( ( ruleEnumDefinition ) | ( ruleEnumReference ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1301:1: ( ruleEnumDefinition )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1301:1: ( ruleEnumDefinition )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1302:1: ruleEnumDefinition
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2766);
                    ruleEnumDefinition();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1307:6: ( ruleEnumReference )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1307:6: ( ruleEnumReference )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1308:1: ruleEnumReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2783);
                    ruleEnumReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
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
    // $ANTLR end rule__EnumSpecification__Alternatives


    // $ANTLR start rule__DirectDeclarator__Alternatives_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1318:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );
    public final void rule__DirectDeclarator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1322:1: ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==51) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1318:1: rule__DirectDeclarator__Alternatives_0 : ( ( ( rule__DirectDeclarator__IdAssignment_0_0 ) ) | ( ( rule__DirectDeclarator__Group_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1323:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1323:1: ( ( rule__DirectDeclarator__IdAssignment_0_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1324:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1325:1: ( rule__DirectDeclarator__IdAssignment_0_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1325:2: rule__DirectDeclarator__IdAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02815);
                    rule__DirectDeclarator__IdAssignment_0_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getDirectDeclaratorAccess().getIdAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1329:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1329:6: ( ( rule__DirectDeclarator__Group_0_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1330:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1331:1: ( rule__DirectDeclarator__Group_0_1__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1331:2: rule__DirectDeclarator__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02833);
                    rule__DirectDeclarator__Group_0_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getDirectDeclaratorAccess().getGroup_0_1()); 
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
    // $ANTLR end rule__DirectDeclarator__Alternatives_0


    // $ANTLR start rule__ArraySpecification__Alternatives_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1340:1: rule__ArraySpecification__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__ArraySpecification__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1344:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1340:1: rule__ArraySpecification__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1345:1: ( RULE_INT )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1345:1: ( RULE_INT )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1346:1: RULE_INT
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySpecification__Alternatives_12866); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getArraySpecificationAccess().getINTTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1351:6: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1351:6: ( RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1352:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArraySpecification__Alternatives_12883); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getArraySpecificationAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end rule__ArraySpecification__Alternatives_1


    // $ANTLR start rule__MethodDefinition__Alternatives_3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1362:1: rule__MethodDefinition__Alternatives_3 : ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) | ( ( rule__MethodDefinition__Group_3_1__0 ) ) );
    public final void rule__MethodDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1366:1: ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) | ( ( rule__MethodDefinition__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 13:
                case 14:
                case 16:
                case 17:
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
                case 39:
                case 47:
                case 61:
                    {
                    alt10=2;
                    }
                    break;
                case 18:
                    {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==52) ) {
                        int LA10_5 = input.LA(4);

                        if ( (synpred13()) ) {
                            alt10=1;
                        }
                        else if ( (true) ) {
                            alt10=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1362:1: rule__MethodDefinition__Alternatives_3 : ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) | ( ( rule__MethodDefinition__Group_3_1__0 ) ) );", 10, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_3==RULE_ID||(LA10_3>=18 && LA10_3<=37)||LA10_3==48||(LA10_3>=50 && LA10_3<=51)) ) {
                        alt10=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1362:1: rule__MethodDefinition__Alternatives_3 : ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) | ( ( rule__MethodDefinition__Group_3_1__0 ) ) );", 10, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                    {
                    alt10=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1362:1: rule__MethodDefinition__Alternatives_3 : ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) | ( ( rule__MethodDefinition__Group_3_1__0 ) ) );", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1362:1: rule__MethodDefinition__Alternatives_3 : ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) | ( ( rule__MethodDefinition__Group_3_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:1: ( ( rule__MethodDefinition__Group_3_0__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:1: ( ( rule__MethodDefinition__Group_3_0__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1368:1: ( rule__MethodDefinition__Group_3_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMethodDefinitionAccess().getGroup_3_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:1: ( rule__MethodDefinition__Group_3_0__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:2: rule__MethodDefinition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_3_0__0_in_rule__MethodDefinition__Alternatives_32915);
                    rule__MethodDefinition__Group_3_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMethodDefinitionAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1373:6: ( ( rule__MethodDefinition__Group_3_1__0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1373:6: ( ( rule__MethodDefinition__Group_3_1__0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1374:1: ( rule__MethodDefinition__Group_3_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMethodDefinitionAccess().getGroup_3_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1375:1: ( rule__MethodDefinition__Group_3_1__0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1375:2: rule__MethodDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__MethodDefinition__Group_3_1__0_in_rule__MethodDefinition__Alternatives_32933);
                    rule__MethodDefinition__Group_3_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getMethodDefinitionAccess().getGroup_3_1()); 
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
    // $ANTLR end rule__MethodDefinition__Alternatives_3


    // $ANTLR start rule__IncludeDirective__Alternatives_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1384:1: rule__IncludeDirective__Alternatives_1 : ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) );
    public final void rule__IncludeDirective__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1388:1: ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INCLUDELIB) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1384:1: rule__IncludeDirective__Alternatives_1 : ( ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) ) | ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1389:1: ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1389:1: ( ( rule__IncludeDirective__ImportedURIAssignment_1_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1390:1: ( rule__IncludeDirective__ImportedURIAssignment_1_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1391:1: ( rule__IncludeDirective__ImportedURIAssignment_1_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1391:2: rule__IncludeDirective__ImportedURIAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__IncludeDirective__ImportedURIAssignment_1_0_in_rule__IncludeDirective__Alternatives_12966);
                    rule__IncludeDirective__ImportedURIAssignment_1_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getIncludeDirectiveAccess().getImportedURIAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1395:6: ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1395:6: ( ( rule__IncludeDirective__IncludeIDAssignment_1_1 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1396:1: ( rule__IncludeDirective__IncludeIDAssignment_1_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1397:1: ( rule__IncludeDirective__IncludeIDAssignment_1_1 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1397:2: rule__IncludeDirective__IncludeIDAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__IncludeDirective__IncludeIDAssignment_1_1_in_rule__IncludeDirective__Alternatives_12984);
                    rule__IncludeDirective__IncludeIDAssignment_1_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getIncludeDirectiveAccess().getIncludeIDAssignment_1_1()); 
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
    // $ANTLR end rule__IncludeDirective__Alternatives_1


    // $ANTLR start rule__AnnotationParameters__Alternatives_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1406:1: rule__AnnotationParameters__Alternatives_2 : ( ( ( rule__AnnotationParameters__ValuePairAssignment_2_0 ) ) | ( ( rule__AnnotationParameters__ValueAssignment_2_1 ) ) );
    public final void rule__AnnotationParameters__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1410:1: ( ( ( rule__AnnotationParameters__ValuePairAssignment_2_0 ) ) | ( ( rule__AnnotationParameters__ValueAssignment_2_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==52) ) {
                    alt12=2;
                }
                else if ( (LA12_1==49) ) {
                    alt12=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1406:1: rule__AnnotationParameters__Alternatives_2 : ( ( ( rule__AnnotationParameters__ValuePairAssignment_2_0 ) ) | ( ( rule__AnnotationParameters__ValueAssignment_2_1 ) ) );", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_INT||LA12_0==RULE_BOOLEAN||LA12_0==15) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1406:1: rule__AnnotationParameters__Alternatives_2 : ( ( ( rule__AnnotationParameters__ValuePairAssignment_2_0 ) ) | ( ( rule__AnnotationParameters__ValueAssignment_2_1 ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1411:1: ( ( rule__AnnotationParameters__ValuePairAssignment_2_0 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1411:1: ( ( rule__AnnotationParameters__ValuePairAssignment_2_0 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1412:1: ( rule__AnnotationParameters__ValuePairAssignment_2_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationParametersAccess().getValuePairAssignment_2_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1413:1: ( rule__AnnotationParameters__ValuePairAssignment_2_0 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1413:2: rule__AnnotationParameters__ValuePairAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__AnnotationParameters__ValuePairAssignment_2_0_in_rule__AnnotationParameters__Alternatives_23017);
                    rule__AnnotationParameters__ValuePairAssignment_2_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationParametersAccess().getValuePairAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1417:6: ( ( rule__AnnotationParameters__ValueAssignment_2_1 ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1417:6: ( ( rule__AnnotationParameters__ValueAssignment_2_1 ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1418:1: ( rule__AnnotationParameters__ValueAssignment_2_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationParametersAccess().getValueAssignment_2_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1419:1: ( rule__AnnotationParameters__ValueAssignment_2_1 )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1419:2: rule__AnnotationParameters__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__AnnotationParameters__ValueAssignment_2_1_in_rule__AnnotationParameters__Alternatives_23035);
                    rule__AnnotationParameters__ValueAssignment_2_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationParametersAccess().getValueAssignment_2_1()); 
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
    // $ANTLR end rule__AnnotationParameters__Alternatives_2


    // $ANTLR start rule__AnnotationValue__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1428:1: rule__AnnotationValue__Alternatives : ( ( RULE_INT ) | ( 'null' ) | ( RULE_BOOLEAN ) | ( RULE_ID ) );
    public final void rule__AnnotationValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1432:1: ( ( RULE_INT ) | ( 'null' ) | ( RULE_BOOLEAN ) | ( RULE_ID ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case 15:
                {
                alt13=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1428:1: rule__AnnotationValue__Alternatives : ( ( RULE_INT ) | ( 'null' ) | ( RULE_BOOLEAN ) | ( RULE_ID ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1433:1: ( RULE_INT )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1433:1: ( RULE_INT )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1434:1: RULE_INT
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationValueAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AnnotationValue__Alternatives3068); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationValueAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1439:6: ( 'null' )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1439:6: ( 'null' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1440:1: 'null'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationValueAccess().getNullKeyword_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__AnnotationValue__Alternatives3086); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationValueAccess().getNullKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1447:6: ( RULE_BOOLEAN )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1447:6: ( RULE_BOOLEAN )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1448:1: RULE_BOOLEAN
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationValueAccess().getBooleanTerminalRuleCall_2()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__AnnotationValue__Alternatives3105); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationValueAccess().getBooleanTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1453:6: ( RULE_ID )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1453:6: ( RULE_ID )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1454:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationValueAccess().getIDTerminalRuleCall_3()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationValue__Alternatives3122); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationValueAccess().getIDTerminalRuleCall_3()); 
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
    // $ANTLR end rule__AnnotationValue__Alternatives


    // $ANTLR start rule__TypeQualifier__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1464:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );
    public final void rule__TypeQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1468:1: ( ( ( 'const' ) ) | ( ( 'volatile' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1464:1: rule__TypeQualifier__Alternatives : ( ( ( 'const' ) ) | ( ( 'volatile' ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1469:1: ( ( 'const' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1469:1: ( ( 'const' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1470:1: ( 'const' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1471:1: ( 'const' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1471:3: 'const'
                    {
                    match(input,16,FOLLOW_16_in_rule__TypeQualifier__Alternatives3155); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1476:6: ( ( 'volatile' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1476:6: ( ( 'volatile' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1477:1: ( 'volatile' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1478:1: ( 'volatile' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1478:3: 'volatile'
                    {
                    match(input,17,FOLLOW_17_in_rule__TypeQualifier__Alternatives3176); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
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
    // $ANTLR end rule__TypeQualifier__Alternatives


    // $ANTLR start rule__TypeSpecifier__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1488:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );
    public final void rule__TypeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1492:1: ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) )
            int alt15=20;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                alt15=2;
                }
                break;
            case 20:
                {
                alt15=3;
                }
                break;
            case 21:
                {
                alt15=4;
                }
                break;
            case 22:
                {
                alt15=5;
                }
                break;
            case 23:
                {
                alt15=6;
                }
                break;
            case 24:
                {
                alt15=7;
                }
                break;
            case 25:
                {
                alt15=8;
                }
                break;
            case 26:
                {
                alt15=9;
                }
                break;
            case 27:
                {
                alt15=10;
                }
                break;
            case 28:
                {
                alt15=11;
                }
                break;
            case 29:
                {
                alt15=12;
                }
                break;
            case 30:
                {
                alt15=13;
                }
                break;
            case 31:
                {
                alt15=14;
                }
                break;
            case 32:
                {
                alt15=15;
                }
                break;
            case 33:
                {
                alt15=16;
                }
                break;
            case 34:
                {
                alt15=17;
                }
                break;
            case 35:
                {
                alt15=18;
                }
                break;
            case 36:
                {
                alt15=19;
                }
                break;
            case 37:
                {
                alt15=20;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1488:1: rule__TypeSpecifier__Alternatives : ( ( ( 'void' ) ) | ( ( 'char' ) ) | ( ( 'short' ) ) | ( ( 'int' ) ) | ( ( 'long' ) ) | ( ( 'float' ) ) | ( ( 'double' ) ) | ( ( 'signed' ) ) | ( ( 'unsigned' ) ) | ( ( 'string' ) ) | ( ( 'int8_t' ) ) | ( ( 'uint8_t' ) ) | ( ( 'int16_t' ) ) | ( ( 'uint16_t' ) ) | ( ( 'int32_t' ) ) | ( ( 'uint32_t' ) ) | ( ( 'int64_t' ) ) | ( ( 'uint64_t' ) ) | ( ( 'intptr_t' ) ) | ( ( 'uintptr_t' ) ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1493:1: ( ( 'void' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1493:1: ( ( 'void' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1494:1: ( 'void' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1495:1: ( 'void' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1495:3: 'void'
                    {
                    match(input,18,FOLLOW_18_in_rule__TypeSpecifier__Alternatives3212); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1500:6: ( ( 'char' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1500:6: ( ( 'char' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1501:1: ( 'char' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1502:1: ( 'char' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1502:3: 'char'
                    {
                    match(input,19,FOLLOW_19_in_rule__TypeSpecifier__Alternatives3233); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1507:6: ( ( 'short' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1507:6: ( ( 'short' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1508:1: ( 'short' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1509:1: ( 'short' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1509:3: 'short'
                    {
                    match(input,20,FOLLOW_20_in_rule__TypeSpecifier__Alternatives3254); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1514:6: ( ( 'int' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1514:6: ( ( 'int' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1515:1: ( 'int' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1516:1: ( 'int' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1516:3: 'int'
                    {
                    match(input,21,FOLLOW_21_in_rule__TypeSpecifier__Alternatives3275); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1521:6: ( ( 'long' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1521:6: ( ( 'long' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1522:1: ( 'long' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1523:1: ( 'long' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1523:3: 'long'
                    {
                    match(input,22,FOLLOW_22_in_rule__TypeSpecifier__Alternatives3296); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1528:6: ( ( 'float' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1528:6: ( ( 'float' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1529:1: ( 'float' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1530:1: ( 'float' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1530:3: 'float'
                    {
                    match(input,23,FOLLOW_23_in_rule__TypeSpecifier__Alternatives3317); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1535:6: ( ( 'double' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1535:6: ( ( 'double' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1536:1: ( 'double' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1537:1: ( 'double' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1537:3: 'double'
                    {
                    match(input,24,FOLLOW_24_in_rule__TypeSpecifier__Alternatives3338); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1542:6: ( ( 'signed' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1542:6: ( ( 'signed' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1543:1: ( 'signed' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1544:1: ( 'signed' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1544:3: 'signed'
                    {
                    match(input,25,FOLLOW_25_in_rule__TypeSpecifier__Alternatives3359); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1549:6: ( ( 'unsigned' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1549:6: ( ( 'unsigned' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1550:1: ( 'unsigned' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1551:1: ( 'unsigned' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1551:3: 'unsigned'
                    {
                    match(input,26,FOLLOW_26_in_rule__TypeSpecifier__Alternatives3380); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1556:6: ( ( 'string' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1556:6: ( ( 'string' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1557:1: ( 'string' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1558:1: ( 'string' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1558:3: 'string'
                    {
                    match(input,27,FOLLOW_27_in_rule__TypeSpecifier__Alternatives3401); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1563:6: ( ( 'int8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1563:6: ( ( 'int8_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1564:1: ( 'int8_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1565:1: ( 'int8_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1565:3: 'int8_t'
                    {
                    match(input,28,FOLLOW_28_in_rule__TypeSpecifier__Alternatives3422); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1570:6: ( ( 'uint8_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1570:6: ( ( 'uint8_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1571:1: ( 'uint8_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1572:1: ( 'uint8_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1572:3: 'uint8_t'
                    {
                    match(input,29,FOLLOW_29_in_rule__TypeSpecifier__Alternatives3443); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1577:6: ( ( 'int16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1577:6: ( ( 'int16_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1578:1: ( 'int16_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1579:1: ( 'int16_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1579:3: 'int16_t'
                    {
                    match(input,30,FOLLOW_30_in_rule__TypeSpecifier__Alternatives3464); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1584:6: ( ( 'uint16_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1584:6: ( ( 'uint16_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1585:1: ( 'uint16_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1586:1: ( 'uint16_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1586:3: 'uint16_t'
                    {
                    match(input,31,FOLLOW_31_in_rule__TypeSpecifier__Alternatives3485); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1591:6: ( ( 'int32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1591:6: ( ( 'int32_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1592:1: ( 'int32_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1593:1: ( 'int32_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1593:3: 'int32_t'
                    {
                    match(input,32,FOLLOW_32_in_rule__TypeSpecifier__Alternatives3506); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1598:6: ( ( 'uint32_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1598:6: ( ( 'uint32_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1599:1: ( 'uint32_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1600:1: ( 'uint32_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1600:3: 'uint32_t'
                    {
                    match(input,33,FOLLOW_33_in_rule__TypeSpecifier__Alternatives3527); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1605:6: ( ( 'int64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1605:6: ( ( 'int64_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1606:1: ( 'int64_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1607:1: ( 'int64_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1607:3: 'int64_t'
                    {
                    match(input,34,FOLLOW_34_in_rule__TypeSpecifier__Alternatives3548); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1612:6: ( ( 'uint64_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1612:6: ( ( 'uint64_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1613:1: ( 'uint64_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1614:1: ( 'uint64_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1614:3: 'uint64_t'
                    {
                    match(input,35,FOLLOW_35_in_rule__TypeSpecifier__Alternatives3569); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1619:6: ( ( 'intptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1619:6: ( ( 'intptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1620:1: ( 'intptr_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1621:1: ( 'intptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1621:3: 'intptr_t'
                    {
                    match(input,36,FOLLOW_36_in_rule__TypeSpecifier__Alternatives3590); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1626:6: ( ( 'uintptr_t' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1626:6: ( ( 'uintptr_t' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1627:1: ( 'uintptr_t' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1628:1: ( 'uintptr_t' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1628:3: 'uintptr_t'
                    {
                    match(input,37,FOLLOW_37_in_rule__TypeSpecifier__Alternatives3611); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
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
    // $ANTLR end rule__TypeSpecifier__Alternatives


    // $ANTLR start rule__ParameterQualifier__Alternatives
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1638:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__ParameterQualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1642:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            else if ( (LA16_0==39) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1638:1: rule__ParameterQualifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1643:1: ( ( 'in' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1643:1: ( ( 'in' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1644:1: ( 'in' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1645:1: ( 'in' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1645:3: 'in'
                    {
                    match(input,38,FOLLOW_38_in_rule__ParameterQualifier__Alternatives3647); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1650:6: ( ( 'out' ) )
                    {
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1650:6: ( ( 'out' ) )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1651:1: ( 'out' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                    }
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1652:1: ( 'out' )
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1652:3: 'out'
                    {
                    match(input,39,FOLLOW_39_in_rule__ParameterQualifier__Alternatives3668); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
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
    // $ANTLR end rule__ParameterQualifier__Alternatives


    // $ANTLR start rule__IdtFile__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1664:1: rule__IdtFile__Group__0 : ( ( rule__IdtFile__BegindefAssignment_0 ) ) rule__IdtFile__Group__1 ;
    public final void rule__IdtFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1668:1: ( ( ( rule__IdtFile__BegindefAssignment_0 ) ) rule__IdtFile__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1669:1: ( ( rule__IdtFile__BegindefAssignment_0 ) ) rule__IdtFile__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1669:1: ( ( rule__IdtFile__BegindefAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1670:1: ( rule__IdtFile__BegindefAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getBegindefAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1671:1: ( rule__IdtFile__BegindefAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1671:2: rule__IdtFile__BegindefAssignment_0
            {
            pushFollow(FOLLOW_rule__IdtFile__BegindefAssignment_0_in_rule__IdtFile__Group__03705);
            rule__IdtFile__BegindefAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getBegindefAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__03714);
            rule__IdtFile__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1682:1: rule__IdtFile__Group__1 : ( ( rule__IdtFile__DefAssignment_1 ) ) rule__IdtFile__Group__2 ;
    public final void rule__IdtFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1686:1: ( ( ( rule__IdtFile__DefAssignment_1 ) ) rule__IdtFile__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1687:1: ( ( rule__IdtFile__DefAssignment_1 ) ) rule__IdtFile__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1687:1: ( ( rule__IdtFile__DefAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1688:1: ( rule__IdtFile__DefAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getDefAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1689:1: ( rule__IdtFile__DefAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1689:2: rule__IdtFile__DefAssignment_1
            {
            pushFollow(FOLLOW_rule__IdtFile__DefAssignment_1_in_rule__IdtFile__Group__13742);
            rule__IdtFile__DefAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getDefAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__2_in_rule__IdtFile__Group__13751);
            rule__IdtFile__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1700:1: rule__IdtFile__Group__2 : ( ( rule__IdtFile__IncludesAssignment_2 )* ) rule__IdtFile__Group__3 ;
    public final void rule__IdtFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1704:1: ( ( ( rule__IdtFile__IncludesAssignment_2 )* ) rule__IdtFile__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1705:1: ( ( rule__IdtFile__IncludesAssignment_2 )* ) rule__IdtFile__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1705:1: ( ( rule__IdtFile__IncludesAssignment_2 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1706:1: ( rule__IdtFile__IncludesAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getIncludesAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1707:1: ( rule__IdtFile__IncludesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==60) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1707:2: rule__IdtFile__IncludesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__IncludesAssignment_2_in_rule__IdtFile__Group__23779);
            	    rule__IdtFile__IncludesAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getIncludesAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__3_in_rule__IdtFile__Group__23789);
            rule__IdtFile__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1718:1: rule__IdtFile__Group__3 : ( ( rule__IdtFile__Alternatives_3 )* ) rule__IdtFile__Group__4 ;
    public final void rule__IdtFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1722:1: ( ( ( rule__IdtFile__Alternatives_3 )* ) rule__IdtFile__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1723:1: ( ( rule__IdtFile__Alternatives_3 )* ) rule__IdtFile__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1723:1: ( ( rule__IdtFile__Alternatives_3 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1724:1: ( rule__IdtFile__Alternatives_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getAlternatives_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1725:1: ( rule__IdtFile__Alternatives_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=13 && LA18_0<=14)||LA18_0==43||LA18_0==47||LA18_0==56) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1725:2: rule__IdtFile__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__IdtFile__Alternatives_3_in_rule__IdtFile__Group__33817);
            	    rule__IdtFile__Alternatives_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getAlternatives_3()); 
            }

            }

            pushFollow(FOLLOW_rule__IdtFile__Group__4_in_rule__IdtFile__Group__33827);
            rule__IdtFile__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1736:1: rule__IdtFile__Group__4 : ( ( rule__IdtFile__EnddefAssignment_4 ) ) ;
    public final void rule__IdtFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1740:1: ( ( ( rule__IdtFile__EnddefAssignment_4 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1741:1: ( ( rule__IdtFile__EnddefAssignment_4 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1741:1: ( ( rule__IdtFile__EnddefAssignment_4 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1742:1: ( rule__IdtFile__EnddefAssignment_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getEnddefAssignment_4()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1743:1: ( rule__IdtFile__EnddefAssignment_4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1743:2: rule__IdtFile__EnddefAssignment_4
            {
            pushFollow(FOLLOW_rule__IdtFile__EnddefAssignment_4_in_rule__IdtFile__Group__43855);
            rule__IdtFile__EnddefAssignment_4();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getEnddefAssignment_4()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1763:1: rule__ConstantDefinitionBegin__Group__0 : ( '#ifndef' ) rule__ConstantDefinitionBegin__Group__1 ;
    public final void rule__ConstantDefinitionBegin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1767:1: ( ( '#ifndef' ) rule__ConstantDefinitionBegin__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1768:1: ( '#ifndef' ) rule__ConstantDefinitionBegin__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1768:1: ( '#ifndef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1769:1: '#ifndef'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ConstantDefinitionBegin__Group__03900); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__Group__1_in_rule__ConstantDefinitionBegin__Group__03910);
            rule__ConstantDefinitionBegin__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1783:1: rule__ConstantDefinitionBegin__Group__1 : ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinitionBegin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1787:1: ( ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1788:1: ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1788:1: ( ( rule__ConstantDefinitionBegin__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1789:1: ( rule__ConstantDefinitionBegin__IdAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1790:1: ( rule__ConstantDefinitionBegin__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1790:2: rule__ConstantDefinitionBegin__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionBegin__IdAssignment_1_in_rule__ConstantDefinitionBegin__Group__13938);
            rule__ConstantDefinitionBegin__IdAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getIdAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1804:1: rule__ConstantDefinitionEnd__Group__0 : ( '#endif' ) rule__ConstantDefinitionEnd__Group__1 ;
    public final void rule__ConstantDefinitionEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1808:1: ( ( '#endif' ) rule__ConstantDefinitionEnd__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1809:1: ( '#endif' ) rule__ConstantDefinitionEnd__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1809:1: ( '#endif' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1810:1: '#endif'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ConstantDefinitionEnd__Group__03977); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ConstantDefinitionEnd__Group__1_in_rule__ConstantDefinitionEnd__Group__03987);
            rule__ConstantDefinitionEnd__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1824:1: rule__ConstantDefinitionEnd__Group__1 : ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinitionEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1828:1: ( ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1829:1: ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1829:1: ( ( rule__ConstantDefinitionEnd__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1830:1: ( rule__ConstantDefinitionEnd__IdAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1831:1: ( rule__ConstantDefinitionEnd__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1831:2: rule__ConstantDefinitionEnd__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinitionEnd__IdAssignment_1_in_rule__ConstantDefinitionEnd__Group__14015);
            rule__ConstantDefinitionEnd__IdAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndAccess().getIdAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1846:1: rule__TypeDefinition__Group__0 : ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 ;
    public final void rule__TypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1850:1: ( ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1851:1: ( ( rule__TypeDefinition__Alternatives_0 ) ) rule__TypeDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1851:1: ( ( rule__TypeDefinition__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1852:1: ( rule__TypeDefinition__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1853:1: ( rule__TypeDefinition__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1853:2: rule__TypeDefinition__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__04054);
            rule__TypeDefinition__Alternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getAlternatives_0()); 
            }

            }

            pushFollow(FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__04063);
            rule__TypeDefinition__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1864:1: rule__TypeDefinition__Group__1 : ( ';' ) ;
    public final void rule__TypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1868:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1869:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1869:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1870:1: ';'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__TypeDefinition__Group__14092); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1887:1: rule__TypedefSpecification__Group__0 : ( 'typedef' ) rule__TypedefSpecification__Group__1 ;
    public final void rule__TypedefSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1891:1: ( ( 'typedef' ) rule__TypedefSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1892:1: ( 'typedef' ) rule__TypedefSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1892:1: ( 'typedef' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1893:1: 'typedef'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__TypedefSpecification__Group__04132); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__04142);
            rule__TypedefSpecification__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1907:1: rule__TypedefSpecification__Group__1 : ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 ;
    public final void rule__TypedefSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1911:1: ( ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1912:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) ) rule__TypedefSpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1912:1: ( ( rule__TypedefSpecification__QualifedTypeAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1913:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1914:1: ( rule__TypedefSpecification__QualifedTypeAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1914:2: rule__TypedefSpecification__QualifedTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__14170);
            rule__TypedefSpecification__QualifedTypeAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__14179);
            rule__TypedefSpecification__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1925:1: rule__TypedefSpecification__Group__2 : ( ( rule__TypedefSpecification__DecAssignment_2 ) ) ;
    public final void rule__TypedefSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1929:1: ( ( ( rule__TypedefSpecification__DecAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1930:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1930:1: ( ( rule__TypedefSpecification__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1931:1: ( rule__TypedefSpecification__DecAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1932:1: ( rule__TypedefSpecification__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1932:2: rule__TypedefSpecification__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__24207);
            rule__TypedefSpecification__DecAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationAccess().getDecAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1948:1: rule__QualifiedTypeSpecification__Group__0 : ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 ;
    public final void rule__QualifiedTypeSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1952:1: ( ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1953:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* ) rule__QualifiedTypeSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1953:1: ( ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1954:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1955:1: ( rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=16 && LA19_0<=17)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1955:2: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__04247);
            	    rule__QualifiedTypeSpecification__TypeQualifierAssignment_0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__04257);
            rule__QualifiedTypeSpecification__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1966:1: rule__QualifiedTypeSpecification__Group__1 : ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) ;
    public final void rule__QualifiedTypeSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1970:1: ( ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1971:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1971:1: ( ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1972:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1973:1: ( rule__QualifiedTypeSpecification__TypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1973:2: rule__QualifiedTypeSpecification__TypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__14285);
            rule__QualifiedTypeSpecification__TypeSpecAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1987:1: rule__StructOrUnionDefinition__Group__0 : ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 ;
    public final void rule__StructOrUnionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1991:1: ( ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1992:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) ) rule__StructOrUnionDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1992:1: ( ( rule__StructOrUnionDefinition__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1993:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1994:1: ( rule__StructOrUnionDefinition__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1994:2: rule__StructOrUnionDefinition__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__04323);
            rule__StructOrUnionDefinition__StructAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getStructAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__04332);
            rule__StructOrUnionDefinition__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2005:1: rule__StructOrUnionDefinition__Group__1 : ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 ;
    public final void rule__StructOrUnionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2009:1: ( ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2010:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? ) rule__StructOrUnionDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2010:1: ( ( rule__StructOrUnionDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2011:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2012:1: ( rule__StructOrUnionDefinition__IdAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2012:2: rule__StructOrUnionDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__14360);
                    rule__StructOrUnionDefinition__IdAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getIdAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__14370);
            rule__StructOrUnionDefinition__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2023:1: rule__StructOrUnionDefinition__Group__2 : ( '{' ) rule__StructOrUnionDefinition__Group__3 ;
    public final void rule__StructOrUnionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2027:1: ( ( '{' ) rule__StructOrUnionDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2028:1: ( '{' ) rule__StructOrUnionDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2028:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2029:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__StructOrUnionDefinition__Group__24399); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__24409);
            rule__StructOrUnionDefinition__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2043:1: rule__StructOrUnionDefinition__Group__3 : ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 ;
    public final void rule__StructOrUnionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2047:1: ( ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2048:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* ) rule__StructOrUnionDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2048:1: ( ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2049:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2050:1: ( rule__StructOrUnionDefinition__StructMemberAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=13 && LA21_0<=14)||(LA21_0>=16 && LA21_0<=37)||LA21_0==47||LA21_0==61) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2050:2: rule__StructOrUnionDefinition__StructMemberAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__34437);
            	    rule__StructOrUnionDefinition__StructMemberAssignment_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__34447);
            rule__StructOrUnionDefinition__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2061:1: rule__StructOrUnionDefinition__Group__4 : ( '}' ) ;
    public final void rule__StructOrUnionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2065:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2066:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2066:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2067:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,45,FOLLOW_45_in_rule__StructOrUnionDefinition__Group__44476); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2090:1: rule__StructorUnionReference__Group__0 : ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 ;
    public final void rule__StructorUnionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2094:1: ( ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2095:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) ) rule__StructorUnionReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2095:1: ( ( rule__StructorUnionReference__StructAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2096:1: ( rule__StructorUnionReference__StructAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2097:1: ( rule__StructorUnionReference__StructAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2097:2: rule__StructorUnionReference__StructAssignment_0
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__04521);
            rule__StructorUnionReference__StructAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructorUnionReferenceAccess().getStructAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__04530);
            rule__StructorUnionReference__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2108:1: rule__StructorUnionReference__Group__1 : ( ( rule__StructorUnionReference__IdAssignment_1 ) ) ;
    public final void rule__StructorUnionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2112:1: ( ( ( rule__StructorUnionReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2113:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2113:1: ( ( rule__StructorUnionReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2114:1: ( rule__StructorUnionReference__IdAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2115:1: ( rule__StructorUnionReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2115:2: rule__StructorUnionReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__14558);
            rule__StructorUnionReference__IdAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructorUnionReferenceAccess().getIdAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2129:1: rule__StructMember__Group__0 : ( ( rule__StructMember__AnnotationsAssignment_0 ) ) rule__StructMember__Group__1 ;
    public final void rule__StructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2133:1: ( ( ( rule__StructMember__AnnotationsAssignment_0 ) ) rule__StructMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2134:1: ( ( rule__StructMember__AnnotationsAssignment_0 ) ) rule__StructMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2134:1: ( ( rule__StructMember__AnnotationsAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2135:1: ( rule__StructMember__AnnotationsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2136:1: ( rule__StructMember__AnnotationsAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2136:2: rule__StructMember__AnnotationsAssignment_0
            {
            pushFollow(FOLLOW_rule__StructMember__AnnotationsAssignment_0_in_rule__StructMember__Group__04596);
            rule__StructMember__AnnotationsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getAnnotationsAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__04605);
            rule__StructMember__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2147:1: rule__StructMember__Group__1 : ( ( rule__StructMember__QualTypeAssignment_1 ) ) rule__StructMember__Group__2 ;
    public final void rule__StructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2151:1: ( ( ( rule__StructMember__QualTypeAssignment_1 ) ) rule__StructMember__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2152:1: ( ( rule__StructMember__QualTypeAssignment_1 ) ) rule__StructMember__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2152:1: ( ( rule__StructMember__QualTypeAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2153:1: ( rule__StructMember__QualTypeAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getQualTypeAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2154:1: ( rule__StructMember__QualTypeAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2154:2: rule__StructMember__QualTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__StructMember__QualTypeAssignment_1_in_rule__StructMember__Group__14633);
            rule__StructMember__QualTypeAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getQualTypeAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__14642);
            rule__StructMember__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2165:1: rule__StructMember__Group__2 : ( ( rule__StructMember__DecAssignment_2 ) ) rule__StructMember__Group__3 ;
    public final void rule__StructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2169:1: ( ( ( rule__StructMember__DecAssignment_2 ) ) rule__StructMember__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2170:1: ( ( rule__StructMember__DecAssignment_2 ) ) rule__StructMember__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2170:1: ( ( rule__StructMember__DecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2171:1: ( rule__StructMember__DecAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getDecAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2172:1: ( rule__StructMember__DecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2172:2: rule__StructMember__DecAssignment_2
            {
            pushFollow(FOLLOW_rule__StructMember__DecAssignment_2_in_rule__StructMember__Group__24670);
            rule__StructMember__DecAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getDecAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__24679);
            rule__StructMember__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2183:1: rule__StructMember__Group__3 : ( ( rule__StructMember__Group_3__0 )? ) rule__StructMember__Group__4 ;
    public final void rule__StructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2187:1: ( ( ( rule__StructMember__Group_3__0 )? ) rule__StructMember__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2188:1: ( ( rule__StructMember__Group_3__0 )? ) rule__StructMember__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2188:1: ( ( rule__StructMember__Group_3__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2189:1: ( rule__StructMember__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getGroup_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2190:1: ( rule__StructMember__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2190:2: rule__StructMember__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StructMember__Group_3__0_in_rule__StructMember__Group__34707);
                    rule__StructMember__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getGroup_3()); 
            }

            }

            pushFollow(FOLLOW_rule__StructMember__Group__4_in_rule__StructMember__Group__34717);
            rule__StructMember__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__StructMember__Group__4
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2201:1: rule__StructMember__Group__4 : ( ';' ) ;
    public final void rule__StructMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2205:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2206:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2206:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2207:1: ';'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getSemicolonKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__StructMember__Group__44746); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group__4


    // $ANTLR start rule__StructMember__Group_3__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2230:1: rule__StructMember__Group_3__0 : ( ':' ) rule__StructMember__Group_3__1 ;
    public final void rule__StructMember__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2234:1: ( ( ':' ) rule__StructMember__Group_3__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2235:1: ( ':' ) rule__StructMember__Group_3__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2235:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2236:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getColonKeyword_3_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__StructMember__Group_3__04792); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getColonKeyword_3_0()); 
            }

            }

            pushFollow(FOLLOW_rule__StructMember__Group_3__1_in_rule__StructMember__Group_3__04802);
            rule__StructMember__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group_3__0


    // $ANTLR start rule__StructMember__Group_3__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2250:1: rule__StructMember__Group_3__1 : ( RULE_INT ) ;
    public final void rule__StructMember__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2254:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2255:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2255:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2256:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_3_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StructMember__Group_3__14830); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getINTTerminalRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__Group_3__1


    // $ANTLR start rule__EnumDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2271:1: rule__EnumDefinition__Group__0 : ( 'enum' ) rule__EnumDefinition__Group__1 ;
    public final void rule__EnumDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2275:1: ( ( 'enum' ) rule__EnumDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2276:1: ( 'enum' ) rule__EnumDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2276:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2277:1: 'enum'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__EnumDefinition__Group__04868); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__04878);
            rule__EnumDefinition__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2291:1: rule__EnumDefinition__Group__1 : ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 ;
    public final void rule__EnumDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2295:1: ( ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2296:1: ( ( rule__EnumDefinition__IdAssignment_1 )? ) rule__EnumDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2296:1: ( ( rule__EnumDefinition__IdAssignment_1 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2297:1: ( rule__EnumDefinition__IdAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2298:1: ( rule__EnumDefinition__IdAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2298:2: rule__EnumDefinition__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__14906);
                    rule__EnumDefinition__IdAssignment_1();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getIdAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__14916);
            rule__EnumDefinition__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2309:1: rule__EnumDefinition__Group__2 : ( '{' ) rule__EnumDefinition__Group__3 ;
    public final void rule__EnumDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2313:1: ( ( '{' ) rule__EnumDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2314:1: ( '{' ) rule__EnumDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2314:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2315:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__EnumDefinition__Group__24945); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__24955);
            rule__EnumDefinition__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2329:1: rule__EnumDefinition__Group__3 : ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 ;
    public final void rule__EnumDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2333:1: ( ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2334:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) ) rule__EnumDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2334:1: ( ( rule__EnumDefinition__EnumMemberListAssignment_3 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2335:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2336:1: ( rule__EnumDefinition__EnumMemberListAssignment_3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2336:2: rule__EnumDefinition__EnumMemberListAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__34983);
            rule__EnumDefinition__EnumMemberListAssignment_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34992);
            rule__EnumDefinition__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2347:1: rule__EnumDefinition__Group__4 : ( '}' ) ;
    public final void rule__EnumDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2351:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2352:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2352:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2353:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,45,FOLLOW_45_in_rule__EnumDefinition__Group__45021); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2376:1: rule__EnumReference__Group__0 : ( 'enum' ) rule__EnumReference__Group__1 ;
    public final void rule__EnumReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2380:1: ( ( 'enum' ) rule__EnumReference__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2381:1: ( 'enum' ) rule__EnumReference__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2381:1: ( 'enum' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2382:1: 'enum'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__EnumReference__Group__05067); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumReferenceAccess().getEnumKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__05077);
            rule__EnumReference__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2396:1: rule__EnumReference__Group__1 : ( ( rule__EnumReference__IdAssignment_1 ) ) ;
    public final void rule__EnumReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2400:1: ( ( ( rule__EnumReference__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2401:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2401:1: ( ( rule__EnumReference__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2402:1: ( rule__EnumReference__IdAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2403:1: ( rule__EnumReference__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2403:2: rule__EnumReference__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__15105);
            rule__EnumReference__IdAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumReferenceAccess().getIdAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2417:1: rule__EnumMemberList__Group__0 : ( ruleEnumMember ) rule__EnumMemberList__Group__1 ;
    public final void rule__EnumMemberList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2421:1: ( ( ruleEnumMember ) rule__EnumMemberList__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2422:1: ( ruleEnumMember ) rule__EnumMemberList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2422:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2423:1: ruleEnumMember
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__05143);
            ruleEnumMember();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListAccess().getEnumMemberParserRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__05151);
            rule__EnumMemberList__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2435:1: rule__EnumMemberList__Group__1 : ( ( rule__EnumMemberList__Group_1__0 )* ) ;
    public final void rule__EnumMemberList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2439:1: ( ( ( rule__EnumMemberList__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2440:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2440:1: ( ( rule__EnumMemberList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2441:1: ( rule__EnumMemberList__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListAccess().getGroup_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2442:1: ( rule__EnumMemberList__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2442:2: rule__EnumMemberList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__15179);
            	    rule__EnumMemberList__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2456:1: rule__EnumMemberList__Group_1__0 : ( ',' ) rule__EnumMemberList__Group_1__1 ;
    public final void rule__EnumMemberList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2460:1: ( ( ',' ) rule__EnumMemberList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2461:1: ( ',' ) rule__EnumMemberList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2461:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2462:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__EnumMemberList__Group_1__05219); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__05229);
            rule__EnumMemberList__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2476:1: rule__EnumMemberList__Group_1__1 : ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) ;
    public final void rule__EnumMemberList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2480:1: ( ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2481:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2481:1: ( ( rule__EnumMemberList__EnumMemberAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2482:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2483:1: ( rule__EnumMemberList__EnumMemberAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2483:2: rule__EnumMemberList__EnumMemberAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__15257);
            rule__EnumMemberList__EnumMemberAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListAccess().getEnumMemberAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2497:1: rule__EnumMember__Group__0 : ( ( rule__EnumMember__AnnotationsAssignment_0 ) ) rule__EnumMember__Group__1 ;
    public final void rule__EnumMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2501:1: ( ( ( rule__EnumMember__AnnotationsAssignment_0 ) ) rule__EnumMember__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2502:1: ( ( rule__EnumMember__AnnotationsAssignment_0 ) ) rule__EnumMember__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2502:1: ( ( rule__EnumMember__AnnotationsAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2503:1: ( rule__EnumMember__AnnotationsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2504:1: ( rule__EnumMember__AnnotationsAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2504:2: rule__EnumMember__AnnotationsAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumMember__AnnotationsAssignment_0_in_rule__EnumMember__Group__05295);
            rule__EnumMember__AnnotationsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getAnnotationsAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__05304);
            rule__EnumMember__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2515:1: rule__EnumMember__Group__1 : ( ( rule__EnumMember__IdAssignment_1 ) ) rule__EnumMember__Group__2 ;
    public final void rule__EnumMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2519:1: ( ( ( rule__EnumMember__IdAssignment_1 ) ) rule__EnumMember__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2520:1: ( ( rule__EnumMember__IdAssignment_1 ) ) rule__EnumMember__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2520:1: ( ( rule__EnumMember__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2521:1: ( rule__EnumMember__IdAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2522:1: ( rule__EnumMember__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2522:2: rule__EnumMember__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumMember__IdAssignment_1_in_rule__EnumMember__Group__15332);
            rule__EnumMember__IdAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getIdAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumMember__Group__2_in_rule__EnumMember__Group__15341);
            rule__EnumMember__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__EnumMember__Group__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2533:1: rule__EnumMember__Group__2 : ( ( rule__EnumMember__Group_2__0 )? ) ;
    public final void rule__EnumMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2537:1: ( ( ( rule__EnumMember__Group_2__0 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2538:1: ( ( rule__EnumMember__Group_2__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2538:1: ( ( rule__EnumMember__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2539:1: ( rule__EnumMember__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getGroup_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2540:1: ( rule__EnumMember__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2540:2: rule__EnumMember__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumMember__Group_2__0_in_rule__EnumMember__Group__25369);
                    rule__EnumMember__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group__2


    // $ANTLR start rule__EnumMember__Group_2__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2556:1: rule__EnumMember__Group_2__0 : ( '=' ) rule__EnumMember__Group_2__1 ;
    public final void rule__EnumMember__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2560:1: ( ( '=' ) rule__EnumMember__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2561:1: ( '=' ) rule__EnumMember__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2561:1: ( '=' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2562:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__EnumMember__Group_2__05411); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__EnumMember__Group_2__1_in_rule__EnumMember__Group_2__05421);
            rule__EnumMember__Group_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group_2__0


    // $ANTLR start rule__EnumMember__Group_2__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2576:1: rule__EnumMember__Group_2__1 : ( RULE_INT ) ;
    public final void rule__EnumMember__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2580:1: ( ( RULE_INT ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2581:1: ( RULE_INT )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2581:1: ( RULE_INT )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2582:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_2_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumMember__Group_2__15449); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getINTTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__Group_2__1


    // $ANTLR start rule__Declarators__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2597:1: rule__Declarators__Group__0 : ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 ;
    public final void rule__Declarators__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2601:1: ( ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2602:1: ( ( rule__Declarators__DecAssignment_0 ) ) rule__Declarators__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2602:1: ( ( rule__Declarators__DecAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2603:1: ( rule__Declarators__DecAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2604:1: ( rule__Declarators__DecAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2604:2: rule__Declarators__DecAssignment_0
            {
            pushFollow(FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__05486);
            rule__Declarators__DecAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getDecAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__05495);
            rule__Declarators__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2615:1: rule__Declarators__Group__1 : ( ( rule__Declarators__Group_1__0 )* ) ;
    public final void rule__Declarators__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2619:1: ( ( ( rule__Declarators__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2620:1: ( ( rule__Declarators__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2620:1: ( ( rule__Declarators__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2621:1: ( rule__Declarators__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getGroup_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2622:1: ( rule__Declarators__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==48) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2622:2: rule__Declarators__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__15523);
            	    rule__Declarators__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2636:1: rule__Declarators__Group_1__0 : ( ',' ) rule__Declarators__Group_1__1 ;
    public final void rule__Declarators__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2640:1: ( ( ',' ) rule__Declarators__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2641:1: ( ',' ) rule__Declarators__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2641:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2642:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Declarators__Group_1__05563); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__05573);
            rule__Declarators__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2656:1: rule__Declarators__Group_1__1 : ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) ;
    public final void rule__Declarators__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2660:1: ( ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2661:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2661:1: ( ( rule__Declarators__DeclaratorListAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2662:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2663:1: ( rule__Declarators__DeclaratorListAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2663:2: rule__Declarators__DeclaratorListAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__15601);
            rule__Declarators__DeclaratorListAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getDeclaratorListAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2677:1: rule__Declarator__Group__0 : ( ( rule__Declarator__PointerAssignment_0 ) ) rule__Declarator__Group__1 ;
    public final void rule__Declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2681:1: ( ( ( rule__Declarator__PointerAssignment_0 ) ) rule__Declarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2682:1: ( ( rule__Declarator__PointerAssignment_0 ) ) rule__Declarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2682:1: ( ( rule__Declarator__PointerAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2683:1: ( rule__Declarator__PointerAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorAccess().getPointerAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2684:1: ( rule__Declarator__PointerAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2684:2: rule__Declarator__PointerAssignment_0
            {
            pushFollow(FOLLOW_rule__Declarator__PointerAssignment_0_in_rule__Declarator__Group__05639);
            rule__Declarator__PointerAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorAccess().getPointerAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__05648);
            rule__Declarator__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2695:1: rule__Declarator__Group__1 : ( ( rule__Declarator__DcAssignment_1 ) ) ;
    public final void rule__Declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2699:1: ( ( ( rule__Declarator__DcAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2700:1: ( ( rule__Declarator__DcAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2700:1: ( ( rule__Declarator__DcAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2701:1: ( rule__Declarator__DcAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2702:1: ( rule__Declarator__DcAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2702:2: rule__Declarator__DcAssignment_1
            {
            pushFollow(FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__15676);
            rule__Declarator__DcAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorAccess().getDcAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__PointerSpecification__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2716:1: rule__PointerSpecification__Group__0 : ( () ) rule__PointerSpecification__Group__1 ;
    public final void rule__PointerSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2720:1: ( ( () ) rule__PointerSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2721:1: ( () ) rule__PointerSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2721:1: ( () )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2722:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPointerSpecificationAccess().getPointerSpecificationAction_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2723:1: ()
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2725:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPointerSpecificationAccess().getPointerSpecificationAction_0()); 
            }

            }

            pushFollow(FOLLOW_rule__PointerSpecification__Group__1_in_rule__PointerSpecification__Group__05724);
            rule__PointerSpecification__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PointerSpecification__Group__0


    // $ANTLR start rule__PointerSpecification__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2736:1: rule__PointerSpecification__Group__1 : ( ( rule__PointerSpecification__QualifiedPointerAssignment_1 )* ) ;
    public final void rule__PointerSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2740:1: ( ( ( rule__PointerSpecification__QualifiedPointerAssignment_1 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2741:1: ( ( rule__PointerSpecification__QualifiedPointerAssignment_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2741:1: ( ( rule__PointerSpecification__QualifiedPointerAssignment_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2742:1: ( rule__PointerSpecification__QualifiedPointerAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2743:1: ( rule__PointerSpecification__QualifiedPointerAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==50) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2743:2: rule__PointerSpecification__QualifiedPointerAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PointerSpecification__QualifiedPointerAssignment_1_in_rule__PointerSpecification__Group__15752);
            	    rule__PointerSpecification__QualifiedPointerAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PointerSpecification__Group__1


    // $ANTLR start rule__Qualified_PointerSpecification__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2757:1: rule__Qualified_PointerSpecification__Group__0 : ( () ) rule__Qualified_PointerSpecification__Group__1 ;
    public final void rule__Qualified_PointerSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2761:1: ( ( () ) rule__Qualified_PointerSpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2762:1: ( () ) rule__Qualified_PointerSpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2762:1: ( () )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2763:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualified_PointerSpecificationAccess().getQualified_PointerSpecificationAction_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2764:1: ()
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2766:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getQualified_PointerSpecificationAccess().getQualified_PointerSpecificationAction_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Qualified_PointerSpecification__Group__1_in_rule__Qualified_PointerSpecification__Group__05801);
            rule__Qualified_PointerSpecification__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Qualified_PointerSpecification__Group__0


    // $ANTLR start rule__Qualified_PointerSpecification__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2777:1: rule__Qualified_PointerSpecification__Group__1 : ( '*' ) rule__Qualified_PointerSpecification__Group__2 ;
    public final void rule__Qualified_PointerSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2781:1: ( ( '*' ) rule__Qualified_PointerSpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2782:1: ( '*' ) rule__Qualified_PointerSpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2782:1: ( '*' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2783:1: '*'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualified_PointerSpecificationAccess().getAsteriskKeyword_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__Qualified_PointerSpecification__Group__15830); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getQualified_PointerSpecificationAccess().getAsteriskKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Qualified_PointerSpecification__Group__2_in_rule__Qualified_PointerSpecification__Group__15840);
            rule__Qualified_PointerSpecification__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Qualified_PointerSpecification__Group__1


    // $ANTLR start rule__Qualified_PointerSpecification__Group__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2797:1: rule__Qualified_PointerSpecification__Group__2 : ( ( rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 )* ) ;
    public final void rule__Qualified_PointerSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2801:1: ( ( ( rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2802:1: ( ( rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2802:1: ( ( rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2803:1: ( rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2804:1: ( rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=16 && LA28_0<=17)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2804:2: rule__Qualified_PointerSpecification__TypeQualifierAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Qualified_PointerSpecification__TypeQualifierAssignment_2_in_rule__Qualified_PointerSpecification__Group__25868);
            	    rule__Qualified_PointerSpecification__TypeQualifierAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Qualified_PointerSpecification__Group__2


    // $ANTLR start rule__DirectDeclarator__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2820:1: rule__DirectDeclarator__Group__0 : ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 ;
    public final void rule__DirectDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2824:1: ( ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2825:1: ( ( rule__DirectDeclarator__Alternatives_0 ) ) rule__DirectDeclarator__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2825:1: ( ( rule__DirectDeclarator__Alternatives_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2826:1: ( rule__DirectDeclarator__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2827:1: ( rule__DirectDeclarator__Alternatives_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2827:2: rule__DirectDeclarator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__05909);
            rule__DirectDeclarator__Alternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getAlternatives_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__05918);
            rule__DirectDeclarator__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2838:1: rule__DirectDeclarator__Group__1 : ( ( rule__DirectDeclarator__ArrayAssignment_1 )* ) ;
    public final void rule__DirectDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2842:1: ( ( ( rule__DirectDeclarator__ArrayAssignment_1 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2843:1: ( ( rule__DirectDeclarator__ArrayAssignment_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2843:1: ( ( rule__DirectDeclarator__ArrayAssignment_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2844:1: ( rule__DirectDeclarator__ArrayAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getArrayAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2845:1: ( rule__DirectDeclarator__ArrayAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==53) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2845:2: rule__DirectDeclarator__ArrayAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DirectDeclarator__ArrayAssignment_1_in_rule__DirectDeclarator__Group__15946);
            	    rule__DirectDeclarator__ArrayAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getArrayAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2859:1: rule__DirectDeclarator__Group_0_1__0 : ( '(' ) rule__DirectDeclarator__Group_0_1__1 ;
    public final void rule__DirectDeclarator__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2863:1: ( ( '(' ) rule__DirectDeclarator__Group_0_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2864:1: ( '(' ) rule__DirectDeclarator__Group_0_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2864:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2865:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__DirectDeclarator__Group_0_1__05986); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__05996);
            rule__DirectDeclarator__Group_0_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2879:1: rule__DirectDeclarator__Group_0_1__1 : ( ( rule__DirectDeclarator__DecAssignment_0_1_1 ) ) rule__DirectDeclarator__Group_0_1__2 ;
    public final void rule__DirectDeclarator__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2883:1: ( ( ( rule__DirectDeclarator__DecAssignment_0_1_1 ) ) rule__DirectDeclarator__Group_0_1__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2884:1: ( ( rule__DirectDeclarator__DecAssignment_0_1_1 ) ) rule__DirectDeclarator__Group_0_1__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2884:1: ( ( rule__DirectDeclarator__DecAssignment_0_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2885:1: ( rule__DirectDeclarator__DecAssignment_0_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getDecAssignment_0_1_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2886:1: ( rule__DirectDeclarator__DecAssignment_0_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2886:2: rule__DirectDeclarator__DecAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__DirectDeclarator__DecAssignment_0_1_1_in_rule__DirectDeclarator__Group_0_1__16024);
            rule__DirectDeclarator__DecAssignment_0_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getDecAssignment_0_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__16033);
            rule__DirectDeclarator__Group_0_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2897:1: rule__DirectDeclarator__Group_0_1__2 : ( ')' ) ;
    public final void rule__DirectDeclarator__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2901:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2902:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2902:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2903:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__DirectDeclarator__Group_0_1__26062); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2922:1: rule__ArraySpecification__Group__0 : ( '[' ) rule__ArraySpecification__Group__1 ;
    public final void rule__ArraySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2926:1: ( ( '[' ) rule__ArraySpecification__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2927:1: ( '[' ) rule__ArraySpecification__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2927:1: ( '[' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2928:1: '['
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__ArraySpecification__Group__06104); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__06114);
            rule__ArraySpecification__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2942:1: rule__ArraySpecification__Group__1 : ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2 ;
    public final void rule__ArraySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2946:1: ( ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2947:1: ( ( rule__ArraySpecification__Alternatives_1 ) ) rule__ArraySpecification__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2947:1: ( ( rule__ArraySpecification__Alternatives_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2948:1: ( rule__ArraySpecification__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2949:1: ( rule__ArraySpecification__Alternatives_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2949:2: rule__ArraySpecification__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ArraySpecification__Alternatives_1_in_rule__ArraySpecification__Group__16142);
            rule__ArraySpecification__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__16151);
            rule__ArraySpecification__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2960:1: rule__ArraySpecification__Group__2 : ( ']' ) ;
    public final void rule__ArraySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2964:1: ( ( ']' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2965:1: ( ']' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2965:1: ( ']' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2966:1: ']'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__ArraySpecification__Group__26180); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2985:1: rule__FullyQualifiedName__Group__0 : ( RULE_ID ) rule__FullyQualifiedName__Group__1 ;
    public final void rule__FullyQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2989:1: ( ( RULE_ID ) rule__FullyQualifiedName__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2990:1: ( RULE_ID ) rule__FullyQualifiedName__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2990:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:2991:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__06221); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__06229);
            rule__FullyQualifiedName__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3003:1: rule__FullyQualifiedName__Group__1 : ( ( rule__FullyQualifiedName__Group_1__0 )* ) ;
    public final void rule__FullyQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3007:1: ( ( ( rule__FullyQualifiedName__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3008:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3008:1: ( ( rule__FullyQualifiedName__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3009:1: ( rule__FullyQualifiedName__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3010:1: ( rule__FullyQualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3010:2: rule__FullyQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__16257);
            	    rule__FullyQualifiedName__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getFullyQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3024:1: rule__FullyQualifiedName__Group_1__0 : ( '.' ) rule__FullyQualifiedName__Group_1__1 ;
    public final void rule__FullyQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3028:1: ( ( '.' ) rule__FullyQualifiedName__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3029:1: ( '.' ) rule__FullyQualifiedName__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3029:1: ( '.' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3030:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__FullyQualifiedName__Group_1__06297); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFullyQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__06307);
            rule__FullyQualifiedName__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3044:1: rule__FullyQualifiedName__Group_1__1 : ( RULE_ID ) ;
    public final void rule__FullyQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3048:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3049:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3049:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3050:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__16335); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFullyQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3065:1: rule__ConstantDefinition__Group__0 : ( '#define' ) rule__ConstantDefinition__Group__1 ;
    public final void rule__ConstantDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3069:1: ( ( '#define' ) rule__ConstantDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3070:1: ( '#define' ) rule__ConstantDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3070:1: ( '#define' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3071:1: '#define'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__ConstantDefinition__Group__06373); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__06383);
            rule__ConstantDefinition__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3085:1: rule__ConstantDefinition__Group__1 : ( ( rule__ConstantDefinition__IdAssignment_1 ) ) ;
    public final void rule__ConstantDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3089:1: ( ( ( rule__ConstantDefinition__IdAssignment_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3090:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3090:1: ( ( rule__ConstantDefinition__IdAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3091:1: ( rule__ConstantDefinition__IdAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3092:1: ( rule__ConstantDefinition__IdAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3092:2: rule__ConstantDefinition__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__16411);
            rule__ConstantDefinition__IdAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getIdAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3106:1: rule__InterfaceDefinition__Group__0 : ( ( rule__InterfaceDefinition__AnnotationsAssignment_0 ) ) rule__InterfaceDefinition__Group__1 ;
    public final void rule__InterfaceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3110:1: ( ( ( rule__InterfaceDefinition__AnnotationsAssignment_0 ) ) rule__InterfaceDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3111:1: ( ( rule__InterfaceDefinition__AnnotationsAssignment_0 ) ) rule__InterfaceDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3111:1: ( ( rule__InterfaceDefinition__AnnotationsAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3112:1: ( rule__InterfaceDefinition__AnnotationsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3113:1: ( rule__InterfaceDefinition__AnnotationsAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3113:2: rule__InterfaceDefinition__AnnotationsAssignment_0
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__AnnotationsAssignment_0_in_rule__InterfaceDefinition__Group__06449);
            rule__InterfaceDefinition__AnnotationsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__06458);
            rule__InterfaceDefinition__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3124:1: rule__InterfaceDefinition__Group__1 : ( 'interface' ) rule__InterfaceDefinition__Group__2 ;
    public final void rule__InterfaceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3128:1: ( ( 'interface' ) rule__InterfaceDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3129:1: ( 'interface' ) rule__InterfaceDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3129:1: ( 'interface' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3130:1: 'interface'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__InterfaceDefinition__Group__16487); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__16497);
            rule__InterfaceDefinition__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3144:1: rule__InterfaceDefinition__Group__2 : ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__3 ;
    public final void rule__InterfaceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3148:1: ( ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3149:1: ( ( 'unmanaged' )? ) rule__InterfaceDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3149:1: ( ( 'unmanaged' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3150:1: ( 'unmanaged' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3151:1: ( 'unmanaged' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3152:2: 'unmanaged'
                    {
                    match(input,58,FOLLOW_58_in_rule__InterfaceDefinition__Group__26527); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__26539);
            rule__InterfaceDefinition__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3164:1: rule__InterfaceDefinition__Group__3 : ( ( rule__InterfaceDefinition__FqnAssignment_3 ) ) rule__InterfaceDefinition__Group__4 ;
    public final void rule__InterfaceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3168:1: ( ( ( rule__InterfaceDefinition__FqnAssignment_3 ) ) rule__InterfaceDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3169:1: ( ( rule__InterfaceDefinition__FqnAssignment_3 ) ) rule__InterfaceDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3169:1: ( ( rule__InterfaceDefinition__FqnAssignment_3 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3170:1: ( rule__InterfaceDefinition__FqnAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3171:1: ( rule__InterfaceDefinition__FqnAssignment_3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3171:2: rule__InterfaceDefinition__FqnAssignment_3
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__FqnAssignment_3_in_rule__InterfaceDefinition__Group__36567);
            rule__InterfaceDefinition__FqnAssignment_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getFqnAssignment_3()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__36576);
            rule__InterfaceDefinition__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3182:1: rule__InterfaceDefinition__Group__4 : ( ( rule__InterfaceDefinition__Group_4__0 )? ) rule__InterfaceDefinition__Group__5 ;
    public final void rule__InterfaceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3186:1: ( ( ( rule__InterfaceDefinition__Group_4__0 )? ) rule__InterfaceDefinition__Group__5 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3187:1: ( ( rule__InterfaceDefinition__Group_4__0 )? ) rule__InterfaceDefinition__Group__5
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3187:1: ( ( rule__InterfaceDefinition__Group_4__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3188:1: ( rule__InterfaceDefinition__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getGroup_4()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3189:1: ( rule__InterfaceDefinition__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3189:2: rule__InterfaceDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__InterfaceDefinition__Group_4__0_in_rule__InterfaceDefinition__Group__46604);
                    rule__InterfaceDefinition__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getGroup_4()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__46614);
            rule__InterfaceDefinition__Group__5();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3200:1: rule__InterfaceDefinition__Group__5 : ( '{' ) rule__InterfaceDefinition__Group__6 ;
    public final void rule__InterfaceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3204:1: ( ( '{' ) rule__InterfaceDefinition__Group__6 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3205:1: ( '{' ) rule__InterfaceDefinition__Group__6
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3205:1: ( '{' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3206:1: '{'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,44,FOLLOW_44_in_rule__InterfaceDefinition__Group__56643); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__56653);
            rule__InterfaceDefinition__Group__6();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3220:1: rule__InterfaceDefinition__Group__6 : ( ( rule__InterfaceDefinition__MethodDefAssignment_6 )* ) rule__InterfaceDefinition__Group__7 ;
    public final void rule__InterfaceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3224:1: ( ( ( rule__InterfaceDefinition__MethodDefAssignment_6 )* ) rule__InterfaceDefinition__Group__7 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3225:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_6 )* ) rule__InterfaceDefinition__Group__7
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3225:1: ( ( rule__InterfaceDefinition__MethodDefAssignment_6 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3226:1: ( rule__InterfaceDefinition__MethodDefAssignment_6 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_6()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3227:1: ( rule__InterfaceDefinition__MethodDefAssignment_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=13 && LA33_0<=14)||(LA33_0>=16 && LA33_0<=37)||LA33_0==47||LA33_0==61) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3227:2: rule__InterfaceDefinition__MethodDefAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_6_in_rule__InterfaceDefinition__Group__66681);
            	    rule__InterfaceDefinition__MethodDefAssignment_6();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getMethodDefAssignment_6()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group__7_in_rule__InterfaceDefinition__Group__66691);
            rule__InterfaceDefinition__Group__7();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__InterfaceDefinition__Group__7
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3238:1: rule__InterfaceDefinition__Group__7 : ( '}' ) ;
    public final void rule__InterfaceDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3242:1: ( ( '}' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3243:1: ( '}' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3243:1: ( '}' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3244:1: '}'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,45,FOLLOW_45_in_rule__InterfaceDefinition__Group__76720); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group__7


    // $ANTLR start rule__InterfaceDefinition__Group_4__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3273:1: rule__InterfaceDefinition__Group_4__0 : ( ':' ) rule__InterfaceDefinition__Group_4__1 ;
    public final void rule__InterfaceDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3277:1: ( ( ':' ) rule__InterfaceDefinition__Group_4__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3278:1: ( ':' ) rule__InterfaceDefinition__Group_4__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3278:1: ( ':' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3279:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__InterfaceDefinition__Group_4__06772); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0()); 
            }

            }

            pushFollow(FOLLOW_rule__InterfaceDefinition__Group_4__1_in_rule__InterfaceDefinition__Group_4__06782);
            rule__InterfaceDefinition__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group_4__0


    // $ANTLR start rule__InterfaceDefinition__Group_4__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3293:1: rule__InterfaceDefinition__Group_4__1 : ( ( rule__InterfaceDefinition__Fqn2Assignment_4_1 ) ) ;
    public final void rule__InterfaceDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3297:1: ( ( ( rule__InterfaceDefinition__Fqn2Assignment_4_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3298:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_4_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3298:1: ( ( rule__InterfaceDefinition__Fqn2Assignment_4_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3299:1: ( rule__InterfaceDefinition__Fqn2Assignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_4_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3300:1: ( rule__InterfaceDefinition__Fqn2Assignment_4_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3300:2: rule__InterfaceDefinition__Fqn2Assignment_4_1
            {
            pushFollow(FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_4_1_in_rule__InterfaceDefinition__Group_4__16810);
            rule__InterfaceDefinition__Fqn2Assignment_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getFqn2Assignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Group_4__1


    // $ANTLR start rule__MethodDefinition__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3314:1: rule__MethodDefinition__Group__0 : ( ( rule__MethodDefinition__AnnotationsAssignment_0 ) ) rule__MethodDefinition__Group__1 ;
    public final void rule__MethodDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3318:1: ( ( ( rule__MethodDefinition__AnnotationsAssignment_0 ) ) rule__MethodDefinition__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3319:1: ( ( rule__MethodDefinition__AnnotationsAssignment_0 ) ) rule__MethodDefinition__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3319:1: ( ( rule__MethodDefinition__AnnotationsAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3320:1: ( rule__MethodDefinition__AnnotationsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3321:1: ( rule__MethodDefinition__AnnotationsAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3321:2: rule__MethodDefinition__AnnotationsAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodDefinition__AnnotationsAssignment_0_in_rule__MethodDefinition__Group__06848);
            rule__MethodDefinition__AnnotationsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getAnnotationsAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__06857);
            rule__MethodDefinition__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3332:1: rule__MethodDefinition__Group__1 : ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_1 ) ) rule__MethodDefinition__Group__2 ;
    public final void rule__MethodDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3336:1: ( ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_1 ) ) rule__MethodDefinition__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3337:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_1 ) ) rule__MethodDefinition__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3337:1: ( ( rule__MethodDefinition__QualifiedTypeSpecAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3338:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3339:1: ( rule__MethodDefinition__QualifiedTypeSpecAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3339:2: rule__MethodDefinition__QualifiedTypeSpecAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_1_in_rule__MethodDefinition__Group__16885);
            rule__MethodDefinition__QualifiedTypeSpecAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__16894);
            rule__MethodDefinition__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3350:1: rule__MethodDefinition__Group__2 : ( ( rule__MethodDefinition__IdAssignment_2 ) ) rule__MethodDefinition__Group__3 ;
    public final void rule__MethodDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3354:1: ( ( ( rule__MethodDefinition__IdAssignment_2 ) ) rule__MethodDefinition__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3355:1: ( ( rule__MethodDefinition__IdAssignment_2 ) ) rule__MethodDefinition__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3355:1: ( ( rule__MethodDefinition__IdAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3356:1: ( rule__MethodDefinition__IdAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getIdAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3357:1: ( rule__MethodDefinition__IdAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3357:2: rule__MethodDefinition__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__MethodDefinition__IdAssignment_2_in_rule__MethodDefinition__Group__26922);
            rule__MethodDefinition__IdAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getIdAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__26931);
            rule__MethodDefinition__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3368:1: rule__MethodDefinition__Group__3 : ( ( rule__MethodDefinition__Alternatives_3 ) ) rule__MethodDefinition__Group__4 ;
    public final void rule__MethodDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3372:1: ( ( ( rule__MethodDefinition__Alternatives_3 ) ) rule__MethodDefinition__Group__4 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3373:1: ( ( rule__MethodDefinition__Alternatives_3 ) ) rule__MethodDefinition__Group__4
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3373:1: ( ( rule__MethodDefinition__Alternatives_3 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3374:1: ( rule__MethodDefinition__Alternatives_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getAlternatives_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3375:1: ( rule__MethodDefinition__Alternatives_3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3375:2: rule__MethodDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__MethodDefinition__Alternatives_3_in_rule__MethodDefinition__Group__36959);
            rule__MethodDefinition__Alternatives_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getAlternatives_3()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group__4_in_rule__MethodDefinition__Group__36968);
            rule__MethodDefinition__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__MethodDefinition__Group__4
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3386:1: rule__MethodDefinition__Group__4 : ( ';' ) ;
    public final void rule__MethodDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3390:1: ( ( ';' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3391:1: ( ';' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3391:1: ( ';' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3392:1: ';'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__MethodDefinition__Group__46997); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group__4


    // $ANTLR start rule__MethodDefinition__Group_3_0__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3415:1: rule__MethodDefinition__Group_3_0__0 : ( '(' ) rule__MethodDefinition__Group_3_0__1 ;
    public final void rule__MethodDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3419:1: ( ( '(' ) rule__MethodDefinition__Group_3_0__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3420:1: ( '(' ) rule__MethodDefinition__Group_3_0__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3420:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3421:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3_0_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__MethodDefinition__Group_3_0__07043); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3_0_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_3_0__1_in_rule__MethodDefinition__Group_3_0__07053);
            rule__MethodDefinition__Group_3_0__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_3_0__0


    // $ANTLR start rule__MethodDefinition__Group_3_0__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3435:1: rule__MethodDefinition__Group_3_0__1 : ( ( 'void' )? ) rule__MethodDefinition__Group_3_0__2 ;
    public final void rule__MethodDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3439:1: ( ( ( 'void' )? ) rule__MethodDefinition__Group_3_0__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3440:1: ( ( 'void' )? ) rule__MethodDefinition__Group_3_0__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3440:1: ( ( 'void' )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3441:1: ( 'void' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_3_0_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3442:1: ( 'void' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3443:2: 'void'
                    {
                    match(input,18,FOLLOW_18_in_rule__MethodDefinition__Group_3_0__17083); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getVoidKeyword_3_0_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_3_0__2_in_rule__MethodDefinition__Group_3_0__17095);
            rule__MethodDefinition__Group_3_0__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_3_0__1


    // $ANTLR start rule__MethodDefinition__Group_3_0__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3455:1: rule__MethodDefinition__Group_3_0__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3459:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3460:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3460:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3461:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_3_0_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__MethodDefinition__Group_3_0__27124); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_3_0__2


    // $ANTLR start rule__MethodDefinition__Group_3_1__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3480:1: rule__MethodDefinition__Group_3_1__0 : ( '(' ) rule__MethodDefinition__Group_3_1__1 ;
    public final void rule__MethodDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3484:1: ( ( '(' ) rule__MethodDefinition__Group_3_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3485:1: ( '(' ) rule__MethodDefinition__Group_3_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3485:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3486:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3_1_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__MethodDefinition__Group_3_1__07166); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_3_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_3_1__1_in_rule__MethodDefinition__Group_3_1__07176);
            rule__MethodDefinition__Group_3_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_3_1__0


    // $ANTLR start rule__MethodDefinition__Group_3_1__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3500:1: rule__MethodDefinition__Group_3_1__1 : ( ( rule__MethodDefinition__ParameterListAssignment_3_1_1 ) ) rule__MethodDefinition__Group_3_1__2 ;
    public final void rule__MethodDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3504:1: ( ( ( rule__MethodDefinition__ParameterListAssignment_3_1_1 ) ) rule__MethodDefinition__Group_3_1__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3505:1: ( ( rule__MethodDefinition__ParameterListAssignment_3_1_1 ) ) rule__MethodDefinition__Group_3_1__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3505:1: ( ( rule__MethodDefinition__ParameterListAssignment_3_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3506:1: ( rule__MethodDefinition__ParameterListAssignment_3_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_3_1_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3507:1: ( rule__MethodDefinition__ParameterListAssignment_3_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3507:2: rule__MethodDefinition__ParameterListAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__MethodDefinition__ParameterListAssignment_3_1_1_in_rule__MethodDefinition__Group_3_1__17204);
            rule__MethodDefinition__ParameterListAssignment_3_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getParameterListAssignment_3_1_1()); 
            }

            }

            pushFollow(FOLLOW_rule__MethodDefinition__Group_3_1__2_in_rule__MethodDefinition__Group_3_1__17213);
            rule__MethodDefinition__Group_3_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_3_1__1


    // $ANTLR start rule__MethodDefinition__Group_3_1__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3518:1: rule__MethodDefinition__Group_3_1__2 : ( ')' ) ;
    public final void rule__MethodDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3522:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3523:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3523:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3524:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_3_1_2()); 
            }
            match(input,52,FOLLOW_52_in_rule__MethodDefinition__Group_3_1__27242); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__Group_3_1__2


    // $ANTLR start rule__ParameterList__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3543:1: rule__ParameterList__Group__0 : ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3547:1: ( ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3548:1: ( ( rule__ParameterList__ParamAssignment_0 ) ) rule__ParameterList__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3548:1: ( ( rule__ParameterList__ParamAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3549:1: ( rule__ParameterList__ParamAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getParamAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3550:1: ( rule__ParameterList__ParamAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3550:2: rule__ParameterList__ParamAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__07283);
            rule__ParameterList__ParamAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getParamAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__07292);
            rule__ParameterList__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3561:1: rule__ParameterList__Group__1 : ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3565:1: ( ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3566:1: ( ( rule__ParameterList__Group_1__0 )* ) rule__ParameterList__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3566:1: ( ( rule__ParameterList__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3567:1: ( rule__ParameterList__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getGroup_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3568:1: ( rule__ParameterList__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==RULE_ID||(LA35_1>=13 && LA35_1<=14)||(LA35_1>=16 && LA35_1<=39)||LA35_1==47||LA35_1==61) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3568:2: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__17320);
            	    rule__ParameterList__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getGroup_1()); 
            }

            }

            pushFollow(FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__17330);
            rule__ParameterList__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3579:1: rule__ParameterList__Group__2 : ( ( rule__ParameterList__Group_2__0 )? ) ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3583:1: ( ( ( rule__ParameterList__Group_2__0 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3584:1: ( ( rule__ParameterList__Group_2__0 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3584:1: ( ( rule__ParameterList__Group_2__0 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3585:1: ( rule__ParameterList__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getGroup_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3586:1: ( rule__ParameterList__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3586:2: rule__ParameterList__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__27358);
                    rule__ParameterList__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3602:1: rule__ParameterList__Group_1__0 : ( ',' ) rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3606:1: ( ( ',' ) rule__ParameterList__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3607:1: ( ',' ) rule__ParameterList__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3607:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3608:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__ParameterList__Group_1__07400); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__07410);
            rule__ParameterList__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3622:1: rule__ParameterList__Group_1__1 : ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3626:1: ( ( ( rule__ParameterList__ParamsAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3627:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3627:1: ( ( rule__ParameterList__ParamsAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3628:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3629:1: ( rule__ParameterList__ParamsAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3629:2: rule__ParameterList__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__17438);
            rule__ParameterList__ParamsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getParamsAssignment_1_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3643:1: rule__ParameterList__Group_2__0 : ( ',' ) rule__ParameterList__Group_2__1 ;
    public final void rule__ParameterList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3647:1: ( ( ',' ) rule__ParameterList__Group_2__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3648:1: ( ',' ) rule__ParameterList__Group_2__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3648:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3649:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__ParameterList__Group_2__07477); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getCommaKeyword_2_0()); 
            }

            }

            pushFollow(FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__07487);
            rule__ParameterList__Group_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3663:1: rule__ParameterList__Group_2__1 : ( '...' ) ;
    public final void rule__ParameterList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3667:1: ( ( '...' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3668:1: ( '...' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3668:1: ( '...' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3669:1: '...'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 
            }
            match(input,59,FOLLOW_59_in_rule__ParameterList__Group_2__17516); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3686:1: rule__Parameter__Group__0 : ( ( rule__Parameter__AnnotationsAssignment_0 ) ) rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3690:1: ( ( ( rule__Parameter__AnnotationsAssignment_0 ) ) rule__Parameter__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3691:1: ( ( rule__Parameter__AnnotationsAssignment_0 ) ) rule__Parameter__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3691:1: ( ( rule__Parameter__AnnotationsAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3692:1: ( rule__Parameter__AnnotationsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAnnotationsAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3693:1: ( rule__Parameter__AnnotationsAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3693:2: rule__Parameter__AnnotationsAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__AnnotationsAssignment_0_in_rule__Parameter__Group__07555);
            rule__Parameter__AnnotationsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getAnnotationsAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07564);
            rule__Parameter__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3704:1: rule__Parameter__Group__1 : ( ( rule__Parameter__ParameterQualifierAssignment_1 )* ) rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3708:1: ( ( ( rule__Parameter__ParameterQualifierAssignment_1 )* ) rule__Parameter__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3709:1: ( ( rule__Parameter__ParameterQualifierAssignment_1 )* ) rule__Parameter__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3709:1: ( ( rule__Parameter__ParameterQualifierAssignment_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3710:1: ( rule__Parameter__ParameterQualifierAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterQualifierAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3711:1: ( rule__Parameter__ParameterQualifierAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=38 && LA37_0<=39)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3711:2: rule__Parameter__ParameterQualifierAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__ParameterQualifierAssignment_1_in_rule__Parameter__Group__17592);
            	    rule__Parameter__ParameterQualifierAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getParameterQualifierAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__17602);
            rule__Parameter__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3722:1: rule__Parameter__Group__2 : ( ( rule__Parameter__QualifiedTypeSpecAssignment_2 ) ) rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3726:1: ( ( ( rule__Parameter__QualifiedTypeSpecAssignment_2 ) ) rule__Parameter__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3727:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_2 ) ) rule__Parameter__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3727:1: ( ( rule__Parameter__QualifiedTypeSpecAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3728:1: ( rule__Parameter__QualifiedTypeSpecAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3729:1: ( rule__Parameter__QualifiedTypeSpecAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3729:2: rule__Parameter__QualifiedTypeSpecAssignment_2
            {
            pushFollow(FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_2_in_rule__Parameter__Group__27630);
            rule__Parameter__QualifiedTypeSpecAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getQualifiedTypeSpecAssignment_2()); 
            }

            }

            pushFollow(FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__27639);
            rule__Parameter__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
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


    // $ANTLR start rule__Parameter__Group__3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3740:1: rule__Parameter__Group__3 : ( ( rule__Parameter__DecAssignment_3 )? ) ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3744:1: ( ( ( rule__Parameter__DecAssignment_3 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3745:1: ( ( rule__Parameter__DecAssignment_3 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3745:1: ( ( rule__Parameter__DecAssignment_3 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3746:1: ( rule__Parameter__DecAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getDecAssignment_3()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3747:1: ( rule__Parameter__DecAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||(LA38_0>=50 && LA38_0<=51)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3747:2: rule__Parameter__DecAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Parameter__DecAssignment_3_in_rule__Parameter__Group__37667);
                    rule__Parameter__DecAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getDecAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__Group__3


    // $ANTLR start rule__IncludeDirective__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3765:1: rule__IncludeDirective__Group__0 : ( '#include' ) rule__IncludeDirective__Group__1 ;
    public final void rule__IncludeDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3769:1: ( ( '#include' ) rule__IncludeDirective__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3770:1: ( '#include' ) rule__IncludeDirective__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3770:1: ( '#include' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3771:1: '#include'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__IncludeDirective__Group__07711); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__07721);
            rule__IncludeDirective__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3785:1: rule__IncludeDirective__Group__1 : ( ( rule__IncludeDirective__Alternatives_1 ) ) ;
    public final void rule__IncludeDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3789:1: ( ( ( rule__IncludeDirective__Alternatives_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3790:1: ( ( rule__IncludeDirective__Alternatives_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3790:1: ( ( rule__IncludeDirective__Alternatives_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3791:1: ( rule__IncludeDirective__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3792:1: ( rule__IncludeDirective__Alternatives_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3792:2: rule__IncludeDirective__Alternatives_1
            {
            pushFollow(FOLLOW_rule__IncludeDirective__Alternatives_1_in_rule__IncludeDirective__Group__17749);
            rule__IncludeDirective__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__Annotations__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3806:1: rule__Annotations__Group__0 : ( () ) rule__Annotations__Group__1 ;
    public final void rule__Annotations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3810:1: ( ( () ) rule__Annotations__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3811:1: ( () ) rule__Annotations__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3811:1: ( () )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3812:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationsAccess().getAnnotationsAction_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3813:1: ()
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3815:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationsAccess().getAnnotationsAction_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Annotations__Group__1_in_rule__Annotations__Group__07797);
            rule__Annotations__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotations__Group__0


    // $ANTLR start rule__Annotations__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3826:1: rule__Annotations__Group__1 : ( ( rule__Annotations__AnnotationsAssignment_1 )* ) ;
    public final void rule__Annotations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3830:1: ( ( ( rule__Annotations__AnnotationsAssignment_1 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3831:1: ( ( rule__Annotations__AnnotationsAssignment_1 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3831:1: ( ( rule__Annotations__AnnotationsAssignment_1 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3832:1: ( rule__Annotations__AnnotationsAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3833:1: ( rule__Annotations__AnnotationsAssignment_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==61) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3833:2: rule__Annotations__AnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Annotations__AnnotationsAssignment_1_in_rule__Annotations__Group__17825);
            	    rule__Annotations__AnnotationsAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotations__Group__1


    // $ANTLR start rule__Annotation__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3847:1: rule__Annotation__Group__0 : ( '@' ) rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3851:1: ( ( '@' ) rule__Annotation__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3852:1: ( '@' ) rule__Annotation__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3852:1: ( '@' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3853:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__Annotation__Group__07865); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__07875);
            rule__Annotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__0


    // $ANTLR start rule__Annotation__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3867:1: rule__Annotation__Group__1 : ( ( rule__Annotation__FqnAssignment_1 ) ) rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3871:1: ( ( ( rule__Annotation__FqnAssignment_1 ) ) rule__Annotation__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3872:1: ( ( rule__Annotation__FqnAssignment_1 ) ) rule__Annotation__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3872:1: ( ( rule__Annotation__FqnAssignment_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3873:1: ( rule__Annotation__FqnAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getFqnAssignment_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3874:1: ( rule__Annotation__FqnAssignment_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3874:2: rule__Annotation__FqnAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__FqnAssignment_1_in_rule__Annotation__Group__17903);
            rule__Annotation__FqnAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getFqnAssignment_1()); 
            }

            }

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__17912);
            rule__Annotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__1


    // $ANTLR start rule__Annotation__Group__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3885:1: rule__Annotation__Group__2 : ( ( rule__Annotation__AnnotationParamatersAssignment_2 )? ) ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3889:1: ( ( ( rule__Annotation__AnnotationParamatersAssignment_2 )? ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3890:1: ( ( rule__Annotation__AnnotationParamatersAssignment_2 )? )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3890:1: ( ( rule__Annotation__AnnotationParamatersAssignment_2 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3891:1: ( rule__Annotation__AnnotationParamatersAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAnnotationParamatersAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3892:1: ( rule__Annotation__AnnotationParamatersAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3892:2: rule__Annotation__AnnotationParamatersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Annotation__AnnotationParamatersAssignment_2_in_rule__Annotation__Group__27940);
                    rule__Annotation__AnnotationParamatersAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getAnnotationParamatersAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__2


    // $ANTLR start rule__AnnotationParameters__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3908:1: rule__AnnotationParameters__Group__0 : ( () ) rule__AnnotationParameters__Group__1 ;
    public final void rule__AnnotationParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3912:1: ( ( () ) rule__AnnotationParameters__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3913:1: ( () ) rule__AnnotationParameters__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3913:1: ( () )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3914:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getAnnotationParametersAction_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3915:1: ()
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3917:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getAnnotationParametersAction_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationParameters__Group__1_in_rule__AnnotationParameters__Group__07991);
            rule__AnnotationParameters__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationParameters__Group__0


    // $ANTLR start rule__AnnotationParameters__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3928:1: rule__AnnotationParameters__Group__1 : ( '(' ) rule__AnnotationParameters__Group__2 ;
    public final void rule__AnnotationParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3932:1: ( ( '(' ) rule__AnnotationParameters__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3933:1: ( '(' ) rule__AnnotationParameters__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3933:1: ( '(' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3934:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__AnnotationParameters__Group__18020); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationParameters__Group__2_in_rule__AnnotationParameters__Group__18030);
            rule__AnnotationParameters__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationParameters__Group__1


    // $ANTLR start rule__AnnotationParameters__Group__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3948:1: rule__AnnotationParameters__Group__2 : ( ( rule__AnnotationParameters__Alternatives_2 )? ) rule__AnnotationParameters__Group__3 ;
    public final void rule__AnnotationParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3952:1: ( ( ( rule__AnnotationParameters__Alternatives_2 )? ) rule__AnnotationParameters__Group__3 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3953:1: ( ( rule__AnnotationParameters__Alternatives_2 )? ) rule__AnnotationParameters__Group__3
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3953:1: ( ( rule__AnnotationParameters__Alternatives_2 )? )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3954:1: ( rule__AnnotationParameters__Alternatives_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getAlternatives_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3955:1: ( rule__AnnotationParameters__Alternatives_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_BOOLEAN)||LA41_0==15) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3955:2: rule__AnnotationParameters__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__AnnotationParameters__Alternatives_2_in_rule__AnnotationParameters__Group__28058);
                    rule__AnnotationParameters__Alternatives_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getAlternatives_2()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationParameters__Group__3_in_rule__AnnotationParameters__Group__28068);
            rule__AnnotationParameters__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationParameters__Group__2


    // $ANTLR start rule__AnnotationParameters__Group__3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3966:1: rule__AnnotationParameters__Group__3 : ( ')' ) ;
    public final void rule__AnnotationParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3970:1: ( ( ')' ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3971:1: ( ')' )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3971:1: ( ')' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3972:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__AnnotationParameters__Group__38097); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationParameters__Group__3


    // $ANTLR start rule__AnnotationValuePairs__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3993:1: rule__AnnotationValuePairs__Group__0 : ( ( rule__AnnotationValuePairs__FirstAssignment_0 ) ) rule__AnnotationValuePairs__Group__1 ;
    public final void rule__AnnotationValuePairs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3997:1: ( ( ( rule__AnnotationValuePairs__FirstAssignment_0 ) ) rule__AnnotationValuePairs__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3998:1: ( ( rule__AnnotationValuePairs__FirstAssignment_0 ) ) rule__AnnotationValuePairs__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3998:1: ( ( rule__AnnotationValuePairs__FirstAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:3999:1: ( rule__AnnotationValuePairs__FirstAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getFirstAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4000:1: ( rule__AnnotationValuePairs__FirstAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4000:2: rule__AnnotationValuePairs__FirstAssignment_0
            {
            pushFollow(FOLLOW_rule__AnnotationValuePairs__FirstAssignment_0_in_rule__AnnotationValuePairs__Group__08140);
            rule__AnnotationValuePairs__FirstAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getFirstAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationValuePairs__Group__1_in_rule__AnnotationValuePairs__Group__08149);
            rule__AnnotationValuePairs__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePairs__Group__0


    // $ANTLR start rule__AnnotationValuePairs__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4011:1: rule__AnnotationValuePairs__Group__1 : ( ( rule__AnnotationValuePairs__Group_1__0 )* ) ;
    public final void rule__AnnotationValuePairs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4015:1: ( ( ( rule__AnnotationValuePairs__Group_1__0 )* ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4016:1: ( ( rule__AnnotationValuePairs__Group_1__0 )* )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4016:1: ( ( rule__AnnotationValuePairs__Group_1__0 )* )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4017:1: ( rule__AnnotationValuePairs__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getGroup_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4018:1: ( rule__AnnotationValuePairs__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==48) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4018:2: rule__AnnotationValuePairs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AnnotationValuePairs__Group_1__0_in_rule__AnnotationValuePairs__Group__18177);
            	    rule__AnnotationValuePairs__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePairs__Group__1


    // $ANTLR start rule__AnnotationValuePairs__Group_1__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4032:1: rule__AnnotationValuePairs__Group_1__0 : ( ',' ) rule__AnnotationValuePairs__Group_1__1 ;
    public final void rule__AnnotationValuePairs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4036:1: ( ( ',' ) rule__AnnotationValuePairs__Group_1__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4037:1: ( ',' ) rule__AnnotationValuePairs__Group_1__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4037:1: ( ',' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4038:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getCommaKeyword_1_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__AnnotationValuePairs__Group_1__08217); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getCommaKeyword_1_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationValuePairs__Group_1__1_in_rule__AnnotationValuePairs__Group_1__08227);
            rule__AnnotationValuePairs__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePairs__Group_1__0


    // $ANTLR start rule__AnnotationValuePairs__Group_1__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4052:1: rule__AnnotationValuePairs__Group_1__1 : ( ( rule__AnnotationValuePairs__ListValueAssignment_1_1 ) ) ;
    public final void rule__AnnotationValuePairs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4056:1: ( ( ( rule__AnnotationValuePairs__ListValueAssignment_1_1 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4057:1: ( ( rule__AnnotationValuePairs__ListValueAssignment_1_1 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4057:1: ( ( rule__AnnotationValuePairs__ListValueAssignment_1_1 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4058:1: ( rule__AnnotationValuePairs__ListValueAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getListValueAssignment_1_1()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4059:1: ( rule__AnnotationValuePairs__ListValueAssignment_1_1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4059:2: rule__AnnotationValuePairs__ListValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AnnotationValuePairs__ListValueAssignment_1_1_in_rule__AnnotationValuePairs__Group_1__18255);
            rule__AnnotationValuePairs__ListValueAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getListValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePairs__Group_1__1


    // $ANTLR start rule__AnnotationValuePair__Group__0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4073:1: rule__AnnotationValuePair__Group__0 : ( ( rule__AnnotationValuePair__IdAssignment_0 ) ) rule__AnnotationValuePair__Group__1 ;
    public final void rule__AnnotationValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4077:1: ( ( ( rule__AnnotationValuePair__IdAssignment_0 ) ) rule__AnnotationValuePair__Group__1 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4078:1: ( ( rule__AnnotationValuePair__IdAssignment_0 ) ) rule__AnnotationValuePair__Group__1
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4078:1: ( ( rule__AnnotationValuePair__IdAssignment_0 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4079:1: ( rule__AnnotationValuePair__IdAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairAccess().getIdAssignment_0()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4080:1: ( rule__AnnotationValuePair__IdAssignment_0 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4080:2: rule__AnnotationValuePair__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__AnnotationValuePair__IdAssignment_0_in_rule__AnnotationValuePair__Group__08293);
            rule__AnnotationValuePair__IdAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairAccess().getIdAssignment_0()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationValuePair__Group__1_in_rule__AnnotationValuePair__Group__08302);
            rule__AnnotationValuePair__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePair__Group__0


    // $ANTLR start rule__AnnotationValuePair__Group__1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4091:1: rule__AnnotationValuePair__Group__1 : ( '=' ) rule__AnnotationValuePair__Group__2 ;
    public final void rule__AnnotationValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4095:1: ( ( '=' ) rule__AnnotationValuePair__Group__2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4096:1: ( '=' ) rule__AnnotationValuePair__Group__2
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4096:1: ( '=' )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4097:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__AnnotationValuePair__Group__18331); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_1()); 
            }

            }

            pushFollow(FOLLOW_rule__AnnotationValuePair__Group__2_in_rule__AnnotationValuePair__Group__18341);
            rule__AnnotationValuePair__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePair__Group__1


    // $ANTLR start rule__AnnotationValuePair__Group__2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4111:1: rule__AnnotationValuePair__Group__2 : ( ( rule__AnnotationValuePair__ValueAssignment_2 ) ) ;
    public final void rule__AnnotationValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4115:1: ( ( ( rule__AnnotationValuePair__ValueAssignment_2 ) ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4116:1: ( ( rule__AnnotationValuePair__ValueAssignment_2 ) )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4116:1: ( ( rule__AnnotationValuePair__ValueAssignment_2 ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4117:1: ( rule__AnnotationValuePair__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairAccess().getValueAssignment_2()); 
            }
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4118:1: ( rule__AnnotationValuePair__ValueAssignment_2 )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4118:2: rule__AnnotationValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AnnotationValuePair__ValueAssignment_2_in_rule__AnnotationValuePair__Group__28369);
            rule__AnnotationValuePair__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePair__Group__2


    // $ANTLR start rule__IdtFile__BegindefAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4134:1: rule__IdtFile__BegindefAssignment_0 : ( ruleConstantDefinitionBegin ) ;
    public final void rule__IdtFile__BegindefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4138:1: ( ( ruleConstantDefinitionBegin ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4139:1: ( ruleConstantDefinitionBegin )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4139:1: ( ruleConstantDefinitionBegin )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4140:1: ruleConstantDefinitionBegin
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionBegin_in_rule__IdtFile__BegindefAssignment_08409);
            ruleConstantDefinitionBegin();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4149:1: rule__IdtFile__DefAssignment_1 : ( ruleConstantDefinition ) ;
    public final void rule__IdtFile__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4153:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4154:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4154:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4155:1: ruleConstantDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__IdtFile__DefAssignment_18440);
            ruleConstantDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4164:1: rule__IdtFile__IncludesAssignment_2 : ( ruleIncludeDirective ) ;
    public final void rule__IdtFile__IncludesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4168:1: ( ( ruleIncludeDirective ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4169:1: ( ruleIncludeDirective )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4169:1: ( ruleIncludeDirective )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4170:1: ruleIncludeDirective
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleIncludeDirective_in_rule__IdtFile__IncludesAssignment_28471);
            ruleIncludeDirective();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4179:1: rule__IdtFile__ConstantAssignment_3_0 : ( ruleConstantDefinition ) ;
    public final void rule__IdtFile__ConstantAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4183:1: ( ( ruleConstantDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4184:1: ( ruleConstantDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4184:1: ( ruleConstantDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4185:1: ruleConstantDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinition_in_rule__IdtFile__ConstantAssignment_3_08502);
            ruleConstantDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4194:1: rule__IdtFile__TypeAssignment_3_1 : ( ruleTypeDefinition ) ;
    public final void rule__IdtFile__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4198:1: ( ( ruleTypeDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4199:1: ( ruleTypeDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4199:1: ( ruleTypeDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4200:1: ruleTypeDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_rule__IdtFile__TypeAssignment_3_18533);
            ruleTypeDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4209:1: rule__IdtFile__EnddefAssignment_4 : ( ruleConstantDefinitionEnd ) ;
    public final void rule__IdtFile__EnddefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4213:1: ( ( ruleConstantDefinitionEnd ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4214:1: ( ruleConstantDefinitionEnd )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4214:1: ( ruleConstantDefinitionEnd )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4215:1: ruleConstantDefinitionEnd
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIdtFileAccess().getEnddefConstantDefinitionEndParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleConstantDefinitionEnd_in_rule__IdtFile__EnddefAssignment_48564);
            ruleConstantDefinitionEnd();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIdtFileAccess().getEnddefConstantDefinitionEndParserRuleCall_4_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4224:1: rule__ConstantDefinitionBegin__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinitionBegin__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4228:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4229:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4229:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4230:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinitionBegin__IdAssignment_18595); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4239:1: rule__ConstantDefinitionEnd__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinitionEnd__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4243:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4244:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4244:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4245:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionEndAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinitionEnd__IdAssignment_18626); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionEndAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4258:1: rule__TypedefSpecification__QualifedTypeAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__TypedefSpecification__QualifedTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4262:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4263:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4263:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4264:1: ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_18661);
            ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4273:1: rule__TypedefSpecification__DecAssignment_2 : ( ruleDeclarators ) ;
    public final void rule__TypedefSpecification__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4277:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4278:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4278:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4279:1: ruleDeclarators
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_28692);
            ruleDeclarators();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4288:1: rule__QualifiedTypeSpecification__TypeQualifierAssignment_0 : ( ruleTypeQualifier ) ;
    public final void rule__QualifiedTypeSpecification__TypeQualifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4292:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4293:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4293:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4294:1: ruleTypeQualifier
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_08723);
            ruleTypeQualifier();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4303:1: rule__QualifiedTypeSpecification__TypeSpecAssignment_1 : ( ruleTypeSpecification ) ;
    public final void rule__QualifiedTypeSpecification__TypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4307:1: ( ( ruleTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4308:1: ( ruleTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4308:1: ( ruleTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4309:1: ruleTypeSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_18754);
            ruleTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4318:1: rule__TypeSpecification__TypeDefNameAssignment_0 : ( ruleTypedefName ) ;
    public final void rule__TypeSpecification__TypeDefNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4322:1: ( ( ruleTypedefName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4323:1: ( ruleTypedefName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4323:1: ( ruleTypedefName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4324:1: ruleTypedefName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_08785);
            ruleTypedefName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypeSpecificationAccess().getTypeDefNameTypedefNameParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4333:1: rule__TypeSpecification__TypeSpecifierAssignment_3 : ( ruleTypeSpecifier ) ;
    public final void rule__TypeSpecification__TypeSpecifierAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4337:1: ( ( ruleTypeSpecifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4338:1: ( ruleTypeSpecifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4338:1: ( ruleTypeSpecifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4339:1: ruleTypeSpecifier
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_38816);
            ruleTypeSpecifier();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4348:1: rule__StructOrUnionDefinition__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructOrUnionDefinition__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4352:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4353:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4353:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4354:1: ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_08847);
            ruleStructOrUnion();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4363:1: rule__StructOrUnionDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructOrUnionDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4367:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4368:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4368:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4369:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructOrUnionDefinition__IdAssignment_18878); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4378:1: rule__StructOrUnionDefinition__StructMemberAssignment_3 : ( ruleStructMember ) ;
    public final void rule__StructOrUnionDefinition__StructMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4382:1: ( ( ruleStructMember ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4383:1: ( ruleStructMember )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4383:1: ( ruleStructMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4384:1: ruleStructMember
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_38909);
            ruleStructMember();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4393:1: rule__StructorUnionReference__StructAssignment_0 : ( ruleStructOrUnion ) ;
    public final void rule__StructorUnionReference__StructAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4397:1: ( ( ruleStructOrUnion ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4398:1: ( ruleStructOrUnion )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4398:1: ( ruleStructOrUnion )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4399:1: ruleStructOrUnion
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_08940);
            ruleStructOrUnion();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4408:1: rule__StructorUnionReference__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructorUnionReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4412:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4413:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4413:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4414:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructorUnionReference__IdAssignment_18971); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructorUnionReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__StructMember__AnnotationsAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4423:1: rule__StructMember__AnnotationsAssignment_0 : ( ruleAnnotations ) ;
    public final void rule__StructMember__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4427:1: ( ( ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4428:1: ( ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4428:1: ( ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4429:1: ruleAnnotations
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_rule__StructMember__AnnotationsAssignment_09002);
            ruleAnnotations();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__AnnotationsAssignment_0


    // $ANTLR start rule__StructMember__QualTypeAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4438:1: rule__StructMember__QualTypeAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__StructMember__QualTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4442:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4443:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4443:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4444:1: ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_19033);
            ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__QualTypeAssignment_1


    // $ANTLR start rule__StructMember__DecAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4453:1: rule__StructMember__DecAssignment_2 : ( ruleDeclarators ) ;
    public final void rule__StructMember__DecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4457:1: ( ( ruleDeclarators ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4458:1: ( ruleDeclarators )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4458:1: ( ruleDeclarators )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4459:1: ruleDeclarators
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_29064);
            ruleDeclarators();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructMember__DecAssignment_2


    // $ANTLR start rule__EnumDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4468:1: rule__EnumDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4472:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4473:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4473:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4474:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDefinition__IdAssignment_19095); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4483:1: rule__EnumDefinition__EnumMemberListAssignment_3 : ( ruleEnumMemberList ) ;
    public final void rule__EnumDefinition__EnumMemberListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4487:1: ( ( ruleEnumMemberList ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4488:1: ( ruleEnumMemberList )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4488:1: ( ruleEnumMemberList )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4489:1: ruleEnumMemberList
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_39126);
            ruleEnumMemberList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4498:1: rule__EnumReference__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4502:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4503:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4503:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4504:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumReference__IdAssignment_19157); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4513:1: rule__EnumMemberList__EnumMemberAssignment_1_1 : ( ruleEnumMember ) ;
    public final void rule__EnumMemberList__EnumMemberAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4517:1: ( ( ruleEnumMember ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4518:1: ( ruleEnumMember )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4518:1: ( ruleEnumMember )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4519:1: ruleEnumMember
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_19188);
            ruleEnumMember();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__EnumMember__AnnotationsAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4528:1: rule__EnumMember__AnnotationsAssignment_0 : ( ruleAnnotations ) ;
    public final void rule__EnumMember__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4532:1: ( ( ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4533:1: ( ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4533:1: ( ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4534:1: ruleAnnotations
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_rule__EnumMember__AnnotationsAssignment_09219);
            ruleAnnotations();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__AnnotationsAssignment_0


    // $ANTLR start rule__EnumMember__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4543:1: rule__EnumMember__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumMember__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4547:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4548:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4548:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4549:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumMember__IdAssignment_19250); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEnumMemberAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumMember__IdAssignment_1


    // $ANTLR start rule__Declarators__DecAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4558:1: rule__Declarators__DecAssignment_0 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4562:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4563:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4563:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4564:1: ruleDeclarator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_09281);
            ruleDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4573:1: rule__Declarators__DeclaratorListAssignment_1_1 : ( ruleDeclarator ) ;
    public final void rule__Declarators__DeclaratorListAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4577:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4578:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4578:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4579:1: ruleDeclarator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_19312);
            ruleDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__Declarator__PointerAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4588:1: rule__Declarator__PointerAssignment_0 : ( rulePointerSpecification ) ;
    public final void rule__Declarator__PointerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4592:1: ( ( rulePointerSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4593:1: ( rulePointerSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4593:1: ( rulePointerSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4594:1: rulePointerSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePointerSpecification_in_rule__Declarator__PointerAssignment_09343);
            rulePointerSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Declarator__PointerAssignment_0


    // $ANTLR start rule__Declarator__DcAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4603:1: rule__Declarator__DcAssignment_1 : ( ruleDirectDeclarator ) ;
    public final void rule__Declarator__DcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4607:1: ( ( ruleDirectDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4608:1: ( ruleDirectDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4608:1: ( ruleDirectDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4609:1: ruleDirectDeclarator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_19374);
            ruleDirectDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__PointerSpecification__QualifiedPointerAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4618:1: rule__PointerSpecification__QualifiedPointerAssignment_1 : ( ruleQualified_PointerSpecification ) ;
    public final void rule__PointerSpecification__QualifiedPointerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4622:1: ( ( ruleQualified_PointerSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4623:1: ( ruleQualified_PointerSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4623:1: ( ruleQualified_PointerSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4624:1: ruleQualified_PointerSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerQualified_PointerSpecificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualified_PointerSpecification_in_rule__PointerSpecification__QualifiedPointerAssignment_19405);
            ruleQualified_PointerSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPointerSpecificationAccess().getQualifiedPointerQualified_PointerSpecificationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PointerSpecification__QualifiedPointerAssignment_1


    // $ANTLR start rule__Qualified_PointerSpecification__TypeQualifierAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4633:1: rule__Qualified_PointerSpecification__TypeQualifierAssignment_2 : ( ruleTypeQualifier ) ;
    public final void rule__Qualified_PointerSpecification__TypeQualifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4637:1: ( ( ruleTypeQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4638:1: ( ruleTypeQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4638:1: ( ruleTypeQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4639:1: ruleTypeQualifier
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTypeQualifier_in_rule__Qualified_PointerSpecification__TypeQualifierAssignment_29436);
            ruleTypeQualifier();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getQualified_PointerSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Qualified_PointerSpecification__TypeQualifierAssignment_2


    // $ANTLR start rule__DirectDeclarator__IdAssignment_0_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4648:1: rule__DirectDeclarator__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__DirectDeclarator__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4652:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4653:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4653:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4654:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectDeclarator__IdAssignment_0_09467); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getIdIDTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__DirectDeclarator__DecAssignment_0_1_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4663:1: rule__DirectDeclarator__DecAssignment_0_1_1 : ( ruleDeclarator ) ;
    public final void rule__DirectDeclarator__DecAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4667:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4668:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4668:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4669:1: ruleDeclarator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getDecDeclaratorParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__DecAssignment_0_1_19498);
            ruleDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getDecDeclaratorParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__DecAssignment_0_1_1


    // $ANTLR start rule__DirectDeclarator__ArrayAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4678:1: rule__DirectDeclarator__ArrayAssignment_1 : ( ruleArraySpecification ) ;
    public final void rule__DirectDeclarator__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4682:1: ( ( ruleArraySpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4683:1: ( ruleArraySpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4683:1: ( ruleArraySpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4684:1: ruleArraySpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__ArrayAssignment_19529);
            ruleArraySpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DirectDeclarator__ArrayAssignment_1


    // $ANTLR start rule__ConstantDefinition__IdAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4693:1: rule__ConstantDefinition__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConstantDefinition__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4697:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4698:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4698:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4699:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantDefinition__IdAssignment_19560); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__InterfaceDefinition__AnnotationsAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4708:1: rule__InterfaceDefinition__AnnotationsAssignment_0 : ( ruleAnnotations ) ;
    public final void rule__InterfaceDefinition__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4712:1: ( ( ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4713:1: ( ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4713:1: ( ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4714:1: ruleAnnotations
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_rule__InterfaceDefinition__AnnotationsAssignment_09591);
            ruleAnnotations();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__AnnotationsAssignment_0


    // $ANTLR start rule__InterfaceDefinition__FqnAssignment_3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4723:1: rule__InterfaceDefinition__FqnAssignment_3 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__FqnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4727:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4728:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4728:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4729:1: ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_39622);
            ruleFullyQualifiedName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getFqnFullyQualifiedNameParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__FqnAssignment_3


    // $ANTLR start rule__InterfaceDefinition__Fqn2Assignment_4_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4738:1: rule__InterfaceDefinition__Fqn2Assignment_4_1 : ( ruleFullyQualifiedName ) ;
    public final void rule__InterfaceDefinition__Fqn2Assignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4742:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4743:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4743:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4744:1: ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_4_19653);
            ruleFullyQualifiedName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getFqn2FullyQualifiedNameParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__Fqn2Assignment_4_1


    // $ANTLR start rule__InterfaceDefinition__MethodDefAssignment_6
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4753:1: rule__InterfaceDefinition__MethodDefAssignment_6 : ( ruleMethodDefinition ) ;
    public final void rule__InterfaceDefinition__MethodDefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4757:1: ( ( ruleMethodDefinition ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4758:1: ( ruleMethodDefinition )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4758:1: ( ruleMethodDefinition )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4759:1: ruleMethodDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_69684);
            ruleMethodDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterfaceDefinition__MethodDefAssignment_6


    // $ANTLR start rule__MethodDefinition__AnnotationsAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4768:1: rule__MethodDefinition__AnnotationsAssignment_0 : ( ruleAnnotations ) ;
    public final void rule__MethodDefinition__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4772:1: ( ( ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4773:1: ( ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4773:1: ( ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4774:1: ruleAnnotations
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_rule__MethodDefinition__AnnotationsAssignment_09715);
            ruleAnnotations();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__AnnotationsAssignment_0


    // $ANTLR start rule__MethodDefinition__QualifiedTypeSpecAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4783:1: rule__MethodDefinition__QualifiedTypeSpecAssignment_1 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__MethodDefinition__QualifiedTypeSpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4787:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4788:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4788:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4789:1: ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_19746);
            ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__QualifiedTypeSpecAssignment_1


    // $ANTLR start rule__MethodDefinition__IdAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4798:1: rule__MethodDefinition__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__MethodDefinition__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4802:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4803:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4803:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4804:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MethodDefinition__IdAssignment_29777); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getIdIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__IdAssignment_2


    // $ANTLR start rule__MethodDefinition__ParameterListAssignment_3_1_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4813:1: rule__MethodDefinition__ParameterListAssignment_3_1_1 : ( ruleParameterList ) ;
    public final void rule__MethodDefinition__ParameterListAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4817:1: ( ( ruleParameterList ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4818:1: ( ruleParameterList )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4818:1: ( ruleParameterList )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4819:1: ruleParameterList
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_3_1_19808);
            ruleParameterList();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MethodDefinition__ParameterListAssignment_3_1_1


    // $ANTLR start rule__ParameterList__ParamAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4828:1: rule__ParameterList__ParamAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4832:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4833:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4833:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4834:1: ruleParameter
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_09839);
            ruleParameter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4843:1: rule__ParameterList__ParamsAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4847:1: ( ( ruleParameter ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4848:1: ( ruleParameter )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4848:1: ( ruleParameter )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4849:1: ruleParameter
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_19870);
            ruleParameter();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__Parameter__AnnotationsAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4858:1: rule__Parameter__AnnotationsAssignment_0 : ( ruleAnnotations ) ;
    public final void rule__Parameter__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4862:1: ( ( ruleAnnotations ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4863:1: ( ruleAnnotations )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4863:1: ( ruleAnnotations )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4864:1: ruleAnnotations
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotations_in_rule__Parameter__AnnotationsAssignment_09901);
            ruleAnnotations();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getAnnotationsAnnotationsParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__AnnotationsAssignment_0


    // $ANTLR start rule__Parameter__ParameterQualifierAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4873:1: rule__Parameter__ParameterQualifierAssignment_1 : ( ruleParameterQualifier ) ;
    public final void rule__Parameter__ParameterQualifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4877:1: ( ( ruleParameterQualifier ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4878:1: ( ruleParameterQualifier )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4878:1: ( ruleParameterQualifier )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4879:1: ruleParameterQualifier
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_19932);
            ruleParameterQualifier();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__ParameterQualifierAssignment_1


    // $ANTLR start rule__Parameter__QualifiedTypeSpecAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4888:1: rule__Parameter__QualifiedTypeSpecAssignment_2 : ( ruleQualifiedTypeSpecification ) ;
    public final void rule__Parameter__QualifiedTypeSpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4892:1: ( ( ruleQualifiedTypeSpecification ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4893:1: ( ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4893:1: ( ruleQualifiedTypeSpecification )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4894:1: ruleQualifiedTypeSpecification
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_29963);
            ruleQualifiedTypeSpecification();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__QualifiedTypeSpecAssignment_2


    // $ANTLR start rule__Parameter__DecAssignment_3
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4903:1: rule__Parameter__DecAssignment_3 : ( ruleDeclarator ) ;
    public final void rule__Parameter__DecAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4907:1: ( ( ruleDeclarator ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4908:1: ( ruleDeclarator )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4908:1: ( ruleDeclarator )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4909:1: ruleDeclarator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_39994);
            ruleDeclarator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameter__DecAssignment_3


    // $ANTLR start rule__IncludeDirective__ImportedURIAssignment_1_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4918:1: rule__IncludeDirective__ImportedURIAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__IncludeDirective__ImportedURIAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4922:1: ( ( RULE_STRING ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4923:1: ( RULE_STRING )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4923:1: ( RULE_STRING )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4924:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IncludeDirective__ImportedURIAssignment_1_010025); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
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
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4933:1: rule__IncludeDirective__IncludeIDAssignment_1_1 : ( RULE_INCLUDELIB ) ;
    public final void rule__IncludeDirective__IncludeIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4937:1: ( ( RULE_INCLUDELIB ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4938:1: ( RULE_INCLUDELIB )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4938:1: ( RULE_INCLUDELIB )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4939:1: RULE_INCLUDELIB
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INCLUDELIB,FOLLOW_RULE_INCLUDELIB_in_rule__IncludeDirective__IncludeIDAssignment_1_110056); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIncludeDirectiveAccess().getIncludeIDIncludeLibTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start rule__Annotations__AnnotationsAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4948:1: rule__Annotations__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Annotations__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4952:1: ( ( ruleAnnotation ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4953:1: ( ruleAnnotation )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4953:1: ( ruleAnnotation )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4954:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Annotations__AnnotationsAssignment_110087);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotations__AnnotationsAssignment_1


    // $ANTLR start rule__Annotation__FqnAssignment_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4963:1: rule__Annotation__FqnAssignment_1 : ( ruleFullyQualifiedName ) ;
    public final void rule__Annotation__FqnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4967:1: ( ( ruleFullyQualifiedName ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4968:1: ( ruleFullyQualifiedName )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4968:1: ( ruleFullyQualifiedName )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4969:1: ruleFullyQualifiedName
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getFqnFullyQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFullyQualifiedName_in_rule__Annotation__FqnAssignment_110118);
            ruleFullyQualifiedName();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getFqnFullyQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__FqnAssignment_1


    // $ANTLR start rule__Annotation__AnnotationParamatersAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4978:1: rule__Annotation__AnnotationParamatersAssignment_2 : ( ruleAnnotationParameters ) ;
    public final void rule__Annotation__AnnotationParamatersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4982:1: ( ( ruleAnnotationParameters ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4983:1: ( ruleAnnotationParameters )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4983:1: ( ruleAnnotationParameters )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4984:1: ruleAnnotationParameters
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAnnotationParamatersAnnotationParametersParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationParameters_in_rule__Annotation__AnnotationParamatersAssignment_210149);
            ruleAnnotationParameters();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getAnnotationParamatersAnnotationParametersParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__AnnotationParamatersAssignment_2


    // $ANTLR start rule__AnnotationParameters__ValuePairAssignment_2_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4993:1: rule__AnnotationParameters__ValuePairAssignment_2_0 : ( ruleAnnotationValuePairs ) ;
    public final void rule__AnnotationParameters__ValuePairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4997:1: ( ( ruleAnnotationValuePairs ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4998:1: ( ruleAnnotationValuePairs )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4998:1: ( ruleAnnotationValuePairs )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:4999:1: ruleAnnotationValuePairs
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getValuePairAnnotationValuePairsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePairs_in_rule__AnnotationParameters__ValuePairAssignment_2_010180);
            ruleAnnotationValuePairs();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getValuePairAnnotationValuePairsParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationParameters__ValuePairAssignment_2_0


    // $ANTLR start rule__AnnotationParameters__ValueAssignment_2_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5008:1: rule__AnnotationParameters__ValueAssignment_2_1 : ( ruleAnnotationValue ) ;
    public final void rule__AnnotationParameters__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5012:1: ( ( ruleAnnotationValue ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5013:1: ( ruleAnnotationValue )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5013:1: ( ruleAnnotationValue )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5014:1: ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationParametersAccess().getValueAnnotationValueParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_rule__AnnotationParameters__ValueAssignment_2_110211);
            ruleAnnotationValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationParametersAccess().getValueAnnotationValueParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationParameters__ValueAssignment_2_1


    // $ANTLR start rule__AnnotationValuePairs__FirstAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5023:1: rule__AnnotationValuePairs__FirstAssignment_0 : ( ruleAnnotationValuePair ) ;
    public final void rule__AnnotationValuePairs__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5027:1: ( ( ruleAnnotationValuePair ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5028:1: ( ruleAnnotationValuePair )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5028:1: ( ruleAnnotationValuePair )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5029:1: ruleAnnotationValuePair
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getFirstAnnotationValuePairParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePair_in_rule__AnnotationValuePairs__FirstAssignment_010242);
            ruleAnnotationValuePair();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getFirstAnnotationValuePairParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePairs__FirstAssignment_0


    // $ANTLR start rule__AnnotationValuePairs__ListValueAssignment_1_1
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5038:1: rule__AnnotationValuePairs__ListValueAssignment_1_1 : ( ruleAnnotationValuePair ) ;
    public final void rule__AnnotationValuePairs__ListValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5042:1: ( ( ruleAnnotationValuePair ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5043:1: ( ruleAnnotationValuePair )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5043:1: ( ruleAnnotationValuePair )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5044:1: ruleAnnotationValuePair
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairsAccess().getListValueAnnotationValuePairParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValuePair_in_rule__AnnotationValuePairs__ListValueAssignment_1_110273);
            ruleAnnotationValuePair();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairsAccess().getListValueAnnotationValuePairParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePairs__ListValueAssignment_1_1


    // $ANTLR start rule__AnnotationValuePair__IdAssignment_0
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5053:1: rule__AnnotationValuePair__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__AnnotationValuePair__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5057:1: ( ( RULE_ID ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5058:1: ( RULE_ID )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5058:1: ( RULE_ID )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5059:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnnotationValuePair__IdAssignment_010304); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairAccess().getIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePair__IdAssignment_0


    // $ANTLR start rule__AnnotationValuePair__ValueAssignment_2
    // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5068:1: rule__AnnotationValuePair__ValueAssignment_2 : ( ruleAnnotationValue ) ;
    public final void rule__AnnotationValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5072:1: ( ( ruleAnnotationValue ) )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5073:1: ( ruleAnnotationValue )
            {
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5073:1: ( ruleAnnotationValue )
            // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:5074:1: ruleAnnotationValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotationValue_in_rule__AnnotationValuePair__ValueAssignment_210335);
            ruleAnnotationValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AnnotationValuePair__ValueAssignment_2

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:1: ( ( ( rule__MethodDefinition__Group_3_0__0 ) ) )
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:1: ( ( rule__MethodDefinition__Group_3_0__0 ) )
        {
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1367:1: ( ( rule__MethodDefinition__Group_3_0__0 ) )
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1368:1: ( rule__MethodDefinition__Group_3_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getMethodDefinitionAccess().getGroup_3_0()); 
        }
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:1: ( rule__MethodDefinition__Group_3_0__0 )
        // ../org.ow2.fractal.mind.idl.idt.ui/src-gen/org/ow2/fractal/mind/idl/contentassist/antlr/internal/InternalFractalIdt.g:1369:2: rule__MethodDefinition__Group_3_0__0
        {
        pushFollow(FOLLOW_rule__MethodDefinition__Group_3_0__0_in_synpred132915);
        rule__MethodDefinition__Group_3_0__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13

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


 

    public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__0_in_ruleIdtFile101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__0_in_ruleConstantDefinitionBegin162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionEnd__Group__0_in_ruleConstantDefinitionEnd223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__0_in_ruleTypeDefinition286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__0_in_ruleTypedefSpecification347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__0_in_ruleQualifiedTypeSpecification408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__Alternatives_in_ruleTypeSpecification469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_entryRuleTypedefName496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedefName503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_ruleTypedefName530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionSpecification__Alternatives_in_ruleStructOrUnionSpecification590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__0_in_ruleStructOrUnionDefinition651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__0_in_ruleStructorUnionReference712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnion__Alternatives_in_ruleStructOrUnion773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructMember807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group__0_in_ruleStructMember834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumSpecification__Alternatives_in_ruleEnumSpecification895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__0_in_ruleEnumDefinition956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__0_in_ruleEnumReference1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__0_in_ruleEnumMemberList1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__0_in_ruleEnumMember1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__0_in_ruleDeclarators1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group__0_in_ruleDeclarator1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointerSpecification1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointerSpecification__Group__0_in_rulePointerSpecification1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_entryRuleQualified_PointerSpecification1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualified_PointerSpecification1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualified_PointerSpecification__Group__0_in_ruleQualified_PointerSpecification1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__0_in_ruleDirectDeclarator1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification1471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__0_in_ruleArraySpecification1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_entryRuleFullyQualifiedName1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullyQualifiedName1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__0_in_ruleFullyQualifiedName1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition1593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__0_in_ruleConstantDefinition1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__0_in_ruleInterfaceDefinition1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition1715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__0_in_ruleMethodDefinition1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__0_in_ruleParameterList1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__0_in_ruleIncludeDirective1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__0_in_ruleAnnotations1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation2020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationParameters_in_entryRuleAnnotationParameters2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationParameters2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__Group__0_in_ruleAnnotationParameters2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_entryRuleAnnotationValuePairs2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePairs2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePairs__Group__0_in_ruleAnnotationValuePairs2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair2203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePair__Group__0_in_ruleAnnotationValuePair2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue2264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValue__Alternatives_in_ruleAnnotationValue2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeQualifier__Alternatives_in_ruleTypeQualifier2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecifier__Alternatives_in_ruleTypeSpecifier2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterQualifier__Alternatives_in_ruleParameterQualifier2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__ConstantAssignment_3_0_in_rule__IdtFile__Alternatives_32442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__TypeAssignment_3_1_in_rule__IdtFile__Alternatives_32460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefSpecification_in_rule__TypeDefinition__Alternatives_02494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeDefinition__Alternatives_02511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeDefinition__Alternatives_02528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeDefNameAssignment_0_in_rule__TypeSpecification__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_rule__TypeSpecification__Alternatives2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecification_in_rule__TypeSpecification__Alternatives2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2614 = new BitSet(new long[]{0x0000003FFFFC0002L});
    public static final BitSet FOLLOW_rule__TypeSpecification__TypeSpecifierAssignment_3_in_rule__TypeSpecification__Alternatives2626 = new BitSet(new long[]{0x0000003FFFFC0002L});
    public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_rule__StructOrUnionSpecification__Alternatives2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructorUnionReference_in_rule__StructOrUnionSpecification__Alternatives2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StructOrUnion__Alternatives2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StructOrUnion__Alternatives2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDefinition_in_rule__EnumSpecification__Alternatives2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumReference_in_rule__EnumSpecification__Alternatives2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__IdAssignment_0_0_in_rule__DirectDeclarator__Alternatives_02815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__0_in_rule__DirectDeclarator__Alternatives_02833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySpecification__Alternatives_12866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArraySpecification__Alternatives_12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_0__0_in_rule__MethodDefinition__Alternatives_32915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_1__0_in_rule__MethodDefinition__Alternatives_32933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__ImportedURIAssignment_1_0_in_rule__IncludeDirective__Alternatives_12966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__IncludeIDAssignment_1_1_in_rule__IncludeDirective__Alternatives_12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__ValuePairAssignment_2_0_in_rule__AnnotationParameters__Alternatives_23017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__ValueAssignment_2_1_in_rule__AnnotationParameters__Alternatives_23035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AnnotationValue__Alternatives3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AnnotationValue__Alternatives3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__AnnotationValue__Alternatives3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationValue__Alternatives3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TypeQualifier__Alternatives3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TypeQualifier__Alternatives3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeSpecifier__Alternatives3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TypeSpecifier__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TypeSpecifier__Alternatives3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TypeSpecifier__Alternatives3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TypeSpecifier__Alternatives3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TypeSpecifier__Alternatives3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TypeSpecifier__Alternatives3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeSpecifier__Alternatives3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeSpecifier__Alternatives3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeSpecifier__Alternatives3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TypeSpecifier__Alternatives3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TypeSpecifier__Alternatives3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeSpecifier__Alternatives3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeSpecifier__Alternatives3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeSpecifier__Alternatives3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeSpecifier__Alternatives3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeSpecifier__Alternatives3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeSpecifier__Alternatives3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeSpecifier__Alternatives3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeSpecifier__Alternatives3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ParameterQualifier__Alternatives3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParameterQualifier__Alternatives3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__BegindefAssignment_0_in_rule__IdtFile__Group__03705 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__1_in_rule__IdtFile__Group__03714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__DefAssignment_1_in_rule__IdtFile__Group__13742 = new BitSet(new long[]{0x11008A0000006000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__2_in_rule__IdtFile__Group__13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__IncludesAssignment_2_in_rule__IdtFile__Group__23779 = new BitSet(new long[]{0x11008A0000006000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__3_in_rule__IdtFile__Group__23789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__Alternatives_3_in_rule__IdtFile__Group__33817 = new BitSet(new long[]{0x01008A0000006000L});
    public static final BitSet FOLLOW_rule__IdtFile__Group__4_in_rule__IdtFile__Group__33827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IdtFile__EnddefAssignment_4_in_rule__IdtFile__Group__43855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ConstantDefinitionBegin__Group__03900 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__Group__1_in_rule__ConstantDefinitionBegin__Group__03910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionBegin__IdAssignment_1_in_rule__ConstantDefinitionBegin__Group__13938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ConstantDefinitionEnd__Group__03977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionEnd__Group__1_in_rule__ConstantDefinitionEnd__Group__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinitionEnd__IdAssignment_1_in_rule__ConstantDefinitionEnd__Group__14015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Alternatives_0_in_rule__TypeDefinition__Group__04054 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TypeDefinition__Group__1_in_rule__TypeDefinition__Group__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TypeDefinition__Group__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TypedefSpecification__Group__04132 = new BitSet(new long[]{0x0000803FFFFF6020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__1_in_rule__TypedefSpecification__Group__04142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__QualifedTypeAssignment_1_in_rule__TypedefSpecification__Group__14170 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__Group__2_in_rule__TypedefSpecification__Group__14179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedefSpecification__DecAssignment_2_in_rule__TypedefSpecification__Group__24207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeQualifierAssignment_0_in_rule__QualifiedTypeSpecification__Group__04247 = new BitSet(new long[]{0x0000803FFFFF6020L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__Group__1_in_rule__QualifiedTypeSpecification__Group__04257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedTypeSpecification__TypeSpecAssignment_1_in_rule__QualifiedTypeSpecification__Group__14285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructAssignment_0_in_rule__StructOrUnionDefinition__Group__04323 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__1_in_rule__StructOrUnionDefinition__Group__04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__IdAssignment_1_in_rule__StructOrUnionDefinition__Group__14360 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__2_in_rule__StructOrUnionDefinition__Group__14370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StructOrUnionDefinition__Group__24399 = new BitSet(new long[]{0x2000A03FFFFF6020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__3_in_rule__StructOrUnionDefinition__Group__24409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__StructMemberAssignment_3_in_rule__StructOrUnionDefinition__Group__34437 = new BitSet(new long[]{0x2000A03FFFFF6020L});
    public static final BitSet FOLLOW_rule__StructOrUnionDefinition__Group__4_in_rule__StructOrUnionDefinition__Group__34447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__StructOrUnionDefinition__Group__44476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__StructAssignment_0_in_rule__StructorUnionReference__Group__04521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__Group__1_in_rule__StructorUnionReference__Group__04530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructorUnionReference__IdAssignment_1_in_rule__StructorUnionReference__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__AnnotationsAssignment_0_in_rule__StructMember__Group__04596 = new BitSet(new long[]{0x0000803FFFFF6020L});
    public static final BitSet FOLLOW_rule__StructMember__Group__1_in_rule__StructMember__Group__04605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__QualTypeAssignment_1_in_rule__StructMember__Group__14633 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_rule__StructMember__Group__2_in_rule__StructMember__Group__14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__DecAssignment_2_in_rule__StructMember__Group__24670 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__3_in_rule__StructMember__Group__24679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructMember__Group_3__0_in_rule__StructMember__Group__34707 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StructMember__Group__4_in_rule__StructMember__Group__34717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StructMember__Group__44746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__StructMember__Group_3__04792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructMember__Group_3__1_in_rule__StructMember__Group_3__04802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StructMember__Group_3__14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumDefinition__Group__04868 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__1_in_rule__EnumDefinition__Group__04878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__IdAssignment_1_in_rule__EnumDefinition__Group__14906 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__2_in_rule__EnumDefinition__Group__14916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumDefinition__Group__24945 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__3_in_rule__EnumDefinition__Group__24955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDefinition__EnumMemberListAssignment_3_in_rule__EnumDefinition__Group__34983 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__EnumDefinition__Group__4_in_rule__EnumDefinition__Group__34992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumDefinition__Group__45021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumReference__Group__05067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumReference__Group__1_in_rule__EnumReference__Group__05077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumReference__IdAssignment_1_in_rule__EnumReference__Group__15105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__Group__05143 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group__1_in_rule__EnumMemberList__Group__05151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__0_in_rule__EnumMemberList__Group__15179 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_rule__EnumMemberList__Group_1__05219 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_rule__EnumMemberList__Group_1__1_in_rule__EnumMemberList__Group_1__05229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMemberList__EnumMemberAssignment_1_1_in_rule__EnumMemberList__Group_1__15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__AnnotationsAssignment_0_in_rule__EnumMember__Group__05295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__1_in_rule__EnumMember__Group__05304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__IdAssignment_1_in_rule__EnumMember__Group__15332 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group__2_in_rule__EnumMember__Group__15341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_2__0_in_rule__EnumMember__Group__25369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EnumMember__Group_2__05411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumMember__Group_2__1_in_rule__EnumMember__Group_2__05421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumMember__Group_2__15449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DecAssignment_0_in_rule__Declarators__Group__05486 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group__1_in_rule__Declarators__Group__05495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__0_in_rule__Declarators__Group__15523 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Declarators__Group_1__05563 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_rule__Declarators__Group_1__1_in_rule__Declarators__Group_1__05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarators__DeclaratorListAssignment_1_1_in_rule__Declarators__Group_1__15601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__PointerAssignment_0_in_rule__Declarator__Group__05639 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rule__Declarator__Group__1_in_rule__Declarator__Group__05648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__DcAssignment_1_in_rule__Declarator__Group__15676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointerSpecification__Group__1_in_rule__PointerSpecification__Group__05724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointerSpecification__QualifiedPointerAssignment_1_in_rule__PointerSpecification__Group__15752 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__Qualified_PointerSpecification__Group__1_in_rule__Qualified_PointerSpecification__Group__05801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Qualified_PointerSpecification__Group__15830 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Qualified_PointerSpecification__Group__2_in_rule__Qualified_PointerSpecification__Group__15840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualified_PointerSpecification__TypeQualifierAssignment_2_in_rule__Qualified_PointerSpecification__Group__25868 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Alternatives_0_in_rule__DirectDeclarator__Group__05909 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group__1_in_rule__DirectDeclarator__Group__05918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__ArrayAssignment_1_in_rule__DirectDeclarator__Group__15946 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DirectDeclarator__Group_0_1__05986 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__1_in_rule__DirectDeclarator__Group_0_1__05996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__DecAssignment_0_1_1_in_rule__DirectDeclarator__Group_0_1__16024 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DirectDeclarator__Group_0_1__2_in_rule__DirectDeclarator__Group_0_1__16033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DirectDeclarator__Group_0_1__26062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ArraySpecification__Group__06104 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__1_in_rule__ArraySpecification__Group__06114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Alternatives_1_in_rule__ArraySpecification__Group__16142 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__ArraySpecification__Group__2_in_rule__ArraySpecification__Group__16151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ArraySpecification__Group__26180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group__06221 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group__1_in_rule__FullyQualifiedName__Group__06229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__0_in_rule__FullyQualifiedName__Group__16257 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FullyQualifiedName__Group_1__06297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FullyQualifiedName__Group_1__1_in_rule__FullyQualifiedName__Group_1__06307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FullyQualifiedName__Group_1__16335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__ConstantDefinition__Group__06373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__Group__1_in_rule__ConstantDefinition__Group__06383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantDefinition__IdAssignment_1_in_rule__ConstantDefinition__Group__16411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__AnnotationsAssignment_0_in_rule__InterfaceDefinition__Group__06449 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__1_in_rule__InterfaceDefinition__Group__06458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__InterfaceDefinition__Group__16487 = new BitSet(new long[]{0x0400000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__2_in_rule__InterfaceDefinition__Group__16497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__InterfaceDefinition__Group__26527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__3_in_rule__InterfaceDefinition__Group__26539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__FqnAssignment_3_in_rule__InterfaceDefinition__Group__36567 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__4_in_rule__InterfaceDefinition__Group__36576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_4__0_in_rule__InterfaceDefinition__Group__46604 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__5_in_rule__InterfaceDefinition__Group__46614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__InterfaceDefinition__Group__56643 = new BitSet(new long[]{0x2000A03FFFFF6020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__6_in_rule__InterfaceDefinition__Group__56653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__MethodDefAssignment_6_in_rule__InterfaceDefinition__Group__66681 = new BitSet(new long[]{0x2000A03FFFFF6020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group__7_in_rule__InterfaceDefinition__Group__66691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__InterfaceDefinition__Group__76720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__InterfaceDefinition__Group_4__06772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Group_4__1_in_rule__InterfaceDefinition__Group_4__06782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceDefinition__Fqn2Assignment_4_1_in_rule__InterfaceDefinition__Group_4__16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__AnnotationsAssignment_0_in_rule__MethodDefinition__Group__06848 = new BitSet(new long[]{0x0000803FFFFF6020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__1_in_rule__MethodDefinition__Group__06857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__QualifiedTypeSpecAssignment_1_in_rule__MethodDefinition__Group__16885 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__2_in_rule__MethodDefinition__Group__16894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__IdAssignment_2_in_rule__MethodDefinition__Group__26922 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__3_in_rule__MethodDefinition__Group__26931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Alternatives_3_in_rule__MethodDefinition__Group__36959 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group__4_in_rule__MethodDefinition__Group__36968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MethodDefinition__Group__46997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MethodDefinition__Group_3_0__07043 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_0__1_in_rule__MethodDefinition__Group_3_0__07053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MethodDefinition__Group_3_0__17083 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_0__2_in_rule__MethodDefinition__Group_3_0__17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MethodDefinition__Group_3_0__27124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MethodDefinition__Group_3_1__07166 = new BitSet(new long[]{0x200080FFFFFF6020L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_1__1_in_rule__MethodDefinition__Group_3_1__07176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__ParameterListAssignment_3_1_1_in_rule__MethodDefinition__Group_3_1__17204 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_1__2_in_rule__MethodDefinition__Group_3_1__17213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MethodDefinition__Group_3_1__27242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamAssignment_0_in_rule__ParameterList__Group__07283 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__1_in_rule__ParameterList__Group__07292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__0_in_rule__ParameterList__Group__17320 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group__2_in_rule__ParameterList__Group__17330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__0_in_rule__ParameterList__Group__27358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ParameterList__Group_1__07400 = new BitSet(new long[]{0x200080FFFFFF6020L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_1__1_in_rule__ParameterList__Group_1__07410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterList__ParamsAssignment_1_1_in_rule__ParameterList__Group_1__17438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ParameterList__Group_2__07477 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__ParameterList__Group_2__1_in_rule__ParameterList__Group_2__07487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ParameterList__Group_2__17516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__AnnotationsAssignment_0_in_rule__Parameter__Group__07555 = new BitSet(new long[]{0x000080FFFFFF6020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__ParameterQualifierAssignment_1_in_rule__Parameter__Group__17592 = new BitSet(new long[]{0x000080FFFFFF6020L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__QualifiedTypeSpecAssignment_2_in_rule__Parameter__Group__27630 = new BitSet(new long[]{0x000C000000000022L});
    public static final BitSet FOLLOW_rule__Parameter__Group__3_in_rule__Parameter__Group__27639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__DecAssignment_3_in_rule__Parameter__Group__37667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__IncludeDirective__Group__07711 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Group__1_in_rule__IncludeDirective__Group__07721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDirective__Alternatives_1_in_rule__IncludeDirective__Group__17749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__1_in_rule__Annotations__Group__07797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__AnnotationsAssignment_1_in_rule__Annotations__Group__17825 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Annotation__Group__07865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__07875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__FqnAssignment_1_in_rule__Annotation__Group__17903 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__17912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__AnnotationParamatersAssignment_2_in_rule__Annotation__Group__27940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__Group__1_in_rule__AnnotationParameters__Group__07991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__AnnotationParameters__Group__18020 = new BitSet(new long[]{0x0010000000008070L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__Group__2_in_rule__AnnotationParameters__Group__18030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__Alternatives_2_in_rule__AnnotationParameters__Group__28058 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__AnnotationParameters__Group__3_in_rule__AnnotationParameters__Group__28068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AnnotationParameters__Group__38097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePairs__FirstAssignment_0_in_rule__AnnotationValuePairs__Group__08140 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePairs__Group__1_in_rule__AnnotationValuePairs__Group__08149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePairs__Group_1__0_in_rule__AnnotationValuePairs__Group__18177 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AnnotationValuePairs__Group_1__08217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AnnotationValuePairs__Group_1__1_in_rule__AnnotationValuePairs__Group_1__08227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePairs__ListValueAssignment_1_1_in_rule__AnnotationValuePairs__Group_1__18255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePair__IdAssignment_0_in_rule__AnnotationValuePair__Group__08293 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__AnnotationValuePair__Group__1_in_rule__AnnotationValuePair__Group__08302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AnnotationValuePair__Group__18331 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_rule__AnnotationValuePair__Group__2_in_rule__AnnotationValuePair__Group__18341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnnotationValuePair__ValueAssignment_2_in_rule__AnnotationValuePair__Group__28369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_rule__IdtFile__BegindefAssignment_08409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__IdtFile__DefAssignment_18440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDirective_in_rule__IdtFile__IncludesAssignment_28471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_rule__IdtFile__ConstantAssignment_3_08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_rule__IdtFile__TypeAssignment_3_18533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_rule__IdtFile__EnddefAssignment_48564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinitionBegin__IdAssignment_18595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinitionEnd__IdAssignment_18626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__TypedefSpecification__QualifedTypeAssignment_18661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__TypedefSpecification__DecAssignment_28692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__QualifiedTypeSpecification__TypeQualifierAssignment_08723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecification_in_rule__QualifiedTypeSpecification__TypeSpecAssignment_18754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedefName_in_rule__TypeSpecification__TypeDefNameAssignment_08785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__TypeSpecification__TypeSpecifierAssignment_38816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructOrUnionDefinition__StructAssignment_08847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructOrUnionDefinition__IdAssignment_18878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructMember_in_rule__StructOrUnionDefinition__StructMemberAssignment_38909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructOrUnion_in_rule__StructorUnionReference__StructAssignment_08940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructorUnionReference__IdAssignment_18971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__StructMember__AnnotationsAssignment_09002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__StructMember__QualTypeAssignment_19033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarators_in_rule__StructMember__DecAssignment_29064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDefinition__IdAssignment_19095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMemberList_in_rule__EnumDefinition__EnumMemberListAssignment_39126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumReference__IdAssignment_19157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumMember_in_rule__EnumMemberList__EnumMemberAssignment_1_19188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__EnumMember__AnnotationsAssignment_09219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumMember__IdAssignment_19250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DecAssignment_09281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Declarators__DeclaratorListAssignment_1_19312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointerSpecification_in_rule__Declarator__PointerAssignment_09343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectDeclarator_in_rule__Declarator__DcAssignment_19374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualified_PointerSpecification_in_rule__PointerSpecification__QualifiedPointerAssignment_19405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeQualifier_in_rule__Qualified_PointerSpecification__TypeQualifierAssignment_29436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectDeclarator__IdAssignment_0_09467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__DirectDeclarator__DecAssignment_0_1_19498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySpecification_in_rule__DirectDeclarator__ArrayAssignment_19529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantDefinition__IdAssignment_19560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__InterfaceDefinition__AnnotationsAssignment_09591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__FqnAssignment_39622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__InterfaceDefinition__Fqn2Assignment_4_19653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodDefinition_in_rule__InterfaceDefinition__MethodDefAssignment_69684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__MethodDefinition__AnnotationsAssignment_09715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__MethodDefinition__QualifiedTypeSpecAssignment_19746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MethodDefinition__IdAssignment_29777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_rule__MethodDefinition__ParameterListAssignment_3_1_19808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamAssignment_09839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ParameterList__ParamsAssignment_1_19870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__Parameter__AnnotationsAssignment_09901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterQualifier_in_rule__Parameter__ParameterQualifierAssignment_19932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_rule__Parameter__QualifiedTypeSpecAssignment_29963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__Parameter__DecAssignment_39994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IncludeDirective__ImportedURIAssignment_1_010025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDELIB_in_rule__IncludeDirective__IncludeIDAssignment_1_110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Annotations__AnnotationsAssignment_110087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullyQualifiedName_in_rule__Annotation__FqnAssignment_110118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationParameters_in_rule__Annotation__AnnotationParamatersAssignment_210149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePairs_in_rule__AnnotationParameters__ValuePairAssignment_2_010180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_rule__AnnotationParameters__ValueAssignment_2_110211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePair_in_rule__AnnotationValuePairs__FirstAssignment_010242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValuePair_in_rule__AnnotationValuePairs__ListValueAssignment_1_110273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnnotationValuePair__IdAssignment_010304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationValue_in_rule__AnnotationValuePair__ValueAssignment_210335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodDefinition__Group_3_0__0_in_synpred132915 = new BitSet(new long[]{0x0000000000000002L});

}