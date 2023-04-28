package chartIt.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import chartIt.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'Program'", "'{'", "'id'", "'='", "';'", "'}'", "'-'", "'uses :'", "'\\''", "'filter :'", "'condition :'", "','", "'draw a plot :'", "'graph_type'", "'abs_column'", "'ord_column'", "'labels'", "'fill'", "'title'", "'column'", "'as'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgram EOF )
            // InternalMyDsl.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalMyDsl.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleFunction EOF )
            // InternalMyDsl.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:87:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Function__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Function__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Function__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Function__Alternatives )
            // InternalMyDsl.g:94:4: rule__Function__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Function__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:128:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEInt EOF )
            // InternalMyDsl.g:130:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:137:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:144:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:153:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:155:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:162:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:169:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleCsvLoader"
    // InternalMyDsl.g:178:1: entryRuleCsvLoader : ruleCsvLoader EOF ;
    public final void entryRuleCsvLoader() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleCsvLoader EOF )
            // InternalMyDsl.g:180:1: ruleCsvLoader EOF
            {
             before(grammarAccess.getCsvLoaderRule()); 
            pushFollow(FOLLOW_1);
            ruleCsvLoader();

            state._fsp--;

             after(grammarAccess.getCsvLoaderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCsvLoader"


    // $ANTLR start "ruleCsvLoader"
    // InternalMyDsl.g:187:1: ruleCsvLoader : ( ( rule__CsvLoader__Group__0 ) ) ;
    public final void ruleCsvLoader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__CsvLoader__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__CsvLoader__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__CsvLoader__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__CsvLoader__Group__0 )
            {
             before(grammarAccess.getCsvLoaderAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__CsvLoader__Group__0 )
            // InternalMyDsl.g:194:4: rule__CsvLoader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvLoaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCsvLoader"


    // $ANTLR start "entryRuleDataFiltering"
    // InternalMyDsl.g:203:1: entryRuleDataFiltering : ruleDataFiltering EOF ;
    public final void entryRuleDataFiltering() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleDataFiltering EOF )
            // InternalMyDsl.g:205:1: ruleDataFiltering EOF
            {
             before(grammarAccess.getDataFilteringRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getDataFilteringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataFiltering"


    // $ANTLR start "ruleDataFiltering"
    // InternalMyDsl.g:212:1: ruleDataFiltering : ( ( rule__DataFiltering__Group__0 ) ) ;
    public final void ruleDataFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__DataFiltering__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__DataFiltering__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__DataFiltering__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__DataFiltering__Group__0 )
            {
             before(grammarAccess.getDataFilteringAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__DataFiltering__Group__0 )
            // InternalMyDsl.g:219:4: rule__DataFiltering__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFiltering"


    // $ANTLR start "entryRuleGraphDrawing"
    // InternalMyDsl.g:228:1: entryRuleGraphDrawing : ruleGraphDrawing EOF ;
    public final void entryRuleGraphDrawing() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleGraphDrawing EOF )
            // InternalMyDsl.g:230:1: ruleGraphDrawing EOF
            {
             before(grammarAccess.getGraphDrawingRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphDrawing();

            state._fsp--;

             after(grammarAccess.getGraphDrawingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphDrawing"


    // $ANTLR start "ruleGraphDrawing"
    // InternalMyDsl.g:237:1: ruleGraphDrawing : ( ( rule__GraphDrawing__UnorderedGroup ) ) ;
    public final void ruleGraphDrawing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__GraphDrawing__UnorderedGroup ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__GraphDrawing__UnorderedGroup ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__GraphDrawing__UnorderedGroup ) )
            // InternalMyDsl.g:243:3: ( rule__GraphDrawing__UnorderedGroup )
            {
             before(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()); 
            // InternalMyDsl.g:244:3: ( rule__GraphDrawing__UnorderedGroup )
            // InternalMyDsl.g:244:4: rule__GraphDrawing__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphDrawing"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:253:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleColumn EOF )
            // InternalMyDsl.g:255:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:262:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Column__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Column__Group__0 )
            // InternalMyDsl.g:269:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleRowFilter"
    // InternalMyDsl.g:278:1: entryRuleRowFilter : ruleRowFilter EOF ;
    public final void entryRuleRowFilter() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleRowFilter EOF )
            // InternalMyDsl.g:280:1: ruleRowFilter EOF
            {
             before(grammarAccess.getRowFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleRowFilter();

            state._fsp--;

             after(grammarAccess.getRowFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRowFilter"


    // $ANTLR start "ruleRowFilter"
    // InternalMyDsl.g:287:1: ruleRowFilter : ( ( rule__RowFilter__Group__0 ) ) ;
    public final void ruleRowFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__RowFilter__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__RowFilter__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__RowFilter__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__RowFilter__Group__0 )
            {
             before(grammarAccess.getRowFilterAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__RowFilter__Group__0 )
            // InternalMyDsl.g:294:4: rule__RowFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RowFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowFilter"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:303:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:307:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMyDsl.g:308:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMyDsl.g:308:2: ( ( rule__Operator__Alternatives ) )
            // InternalMyDsl.g:309:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:310:3: ( rule__Operator__Alternatives )
            // InternalMyDsl.g:310:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Function__Alternatives"
    // InternalMyDsl.g:318:1: rule__Function__Alternatives : ( ( ruleCsvLoader ) | ( ruleDataFiltering ) | ( ruleGraphDrawing ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( ruleCsvLoader ) | ( ruleDataFiltering ) | ( ruleGraphDrawing ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:323:2: ( ruleCsvLoader )
                    {
                    // InternalMyDsl.g:323:2: ( ruleCsvLoader )
                    // InternalMyDsl.g:324:3: ruleCsvLoader
                    {
                     before(grammarAccess.getFunctionAccess().getCsvLoaderParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCsvLoader();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getCsvLoaderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:329:2: ( ruleDataFiltering )
                    {
                    // InternalMyDsl.g:329:2: ( ruleDataFiltering )
                    // InternalMyDsl.g:330:3: ruleDataFiltering
                    {
                     before(grammarAccess.getFunctionAccess().getDataFilteringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFiltering();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getDataFilteringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:335:2: ( ruleGraphDrawing )
                    {
                    // InternalMyDsl.g:335:2: ( ruleGraphDrawing )
                    // InternalMyDsl.g:336:3: ruleGraphDrawing
                    {
                     before(grammarAccess.getFunctionAccess().getGraphDrawingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphDrawing();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getGraphDrawingParserRuleCall_2()); 

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
    // $ANTLR end "rule__Function__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:345:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:350:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:350:2: ( RULE_STRING )
                    // InternalMyDsl.g:351:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:356:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:356:2: ( RULE_ID )
                    // InternalMyDsl.g:357:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:366:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:371:2: ( 'true' )
                    {
                    // InternalMyDsl.g:371:2: ( 'true' )
                    // InternalMyDsl.g:372:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:377:2: ( 'false' )
                    {
                    // InternalMyDsl.g:377:2: ( 'false' )
                    // InternalMyDsl.g:378:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMyDsl.g:387:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '!=' ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:392:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:392:2: ( ( '>' ) )
                    // InternalMyDsl.g:393:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:394:3: ( '>' )
                    // InternalMyDsl.g:394:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:398:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:398:2: ( ( '<' ) )
                    // InternalMyDsl.g:399:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:400:3: ( '<' )
                    // InternalMyDsl.g:400:4: '<'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:404:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:404:2: ( ( '==' ) )
                    // InternalMyDsl.g:405:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:406:3: ( '==' )
                    // InternalMyDsl.g:406:4: '=='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:410:2: ( ( '>=' ) )
                    {
                    // InternalMyDsl.g:410:2: ( ( '>=' ) )
                    // InternalMyDsl.g:411:3: ( '>=' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreater_than_or_equalEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:412:3: ( '>=' )
                    // InternalMyDsl.g:412:4: '>='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreater_than_or_equalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:416:2: ( ( '<=' ) )
                    {
                    // InternalMyDsl.g:416:2: ( ( '<=' ) )
                    // InternalMyDsl.g:417:3: ( '<=' )
                    {
                     before(grammarAccess.getOperatorAccess().getSmaller_than_or_equalEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:418:3: ( '<=' )
                    // InternalMyDsl.g:418:4: '<='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSmaller_than_or_equalEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:422:2: ( ( '!=' ) )
                    {
                    // InternalMyDsl.g:422:2: ( ( '!=' ) )
                    // InternalMyDsl.g:423:3: ( '!=' )
                    {
                     before(grammarAccess.getOperatorAccess().getNot_equalEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:424:3: ( '!=' )
                    // InternalMyDsl.g:424:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getNot_equalEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMyDsl.g:432:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:437:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMyDsl.g:444:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( 'Program' ) )
            // InternalMyDsl.g:449:1: ( 'Program' )
            {
            // InternalMyDsl.g:449:1: ( 'Program' )
            // InternalMyDsl.g:450:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMyDsl.g:459:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMyDsl.g:464:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMyDsl.g:471:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalMyDsl.g:476:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:476:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalMyDsl.g:477:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:478:2: ( rule__Program__NameAssignment_1 )
            // InternalMyDsl.g:478:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMyDsl.g:486:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMyDsl.g:491:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMyDsl.g:498:1: rule__Program__Group__2__Impl : ( '{' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( '{' ) )
            // InternalMyDsl.g:503:1: ( '{' )
            {
            // InternalMyDsl.g:503:1: ( '{' )
            // InternalMyDsl.g:504:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalMyDsl.g:513:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalMyDsl.g:518:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalMyDsl.g:525:1: rule__Program__Group__3__Impl : ( 'id' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( 'id' ) )
            // InternalMyDsl.g:530:1: ( 'id' )
            {
            // InternalMyDsl.g:530:1: ( 'id' )
            // InternalMyDsl.g:531:2: 'id'
            {
             before(grammarAccess.getProgramAccess().getIdKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // InternalMyDsl.g:540:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalMyDsl.g:545:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalMyDsl.g:552:1: rule__Program__Group__4__Impl : ( '=' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( '=' ) )
            // InternalMyDsl.g:557:1: ( '=' )
            {
            // InternalMyDsl.g:557:1: ( '=' )
            // InternalMyDsl.g:558:2: '='
            {
             before(grammarAccess.getProgramAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // InternalMyDsl.g:567:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalMyDsl.g:572:2: rule__Program__Group__5__Impl rule__Program__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Program__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // InternalMyDsl.g:579:1: rule__Program__Group__5__Impl : ( ( rule__Program__IdAssignment_5 ) ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( ( rule__Program__IdAssignment_5 ) ) )
            // InternalMyDsl.g:584:1: ( ( rule__Program__IdAssignment_5 ) )
            {
            // InternalMyDsl.g:584:1: ( ( rule__Program__IdAssignment_5 ) )
            // InternalMyDsl.g:585:2: ( rule__Program__IdAssignment_5 )
            {
             before(grammarAccess.getProgramAccess().getIdAssignment_5()); 
            // InternalMyDsl.g:586:2: ( rule__Program__IdAssignment_5 )
            // InternalMyDsl.g:586:3: rule__Program__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Program__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Program__Group__6"
    // InternalMyDsl.g:594:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalMyDsl.g:599:2: rule__Program__Group__6__Impl rule__Program__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6"


    // $ANTLR start "rule__Program__Group__6__Impl"
    // InternalMyDsl.g:606:1: rule__Program__Group__6__Impl : ( ';' ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( ';' ) )
            // InternalMyDsl.g:611:1: ( ';' )
            {
            // InternalMyDsl.g:611:1: ( ';' )
            // InternalMyDsl.g:612:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__6__Impl"


    // $ANTLR start "rule__Program__Group__7"
    // InternalMyDsl.g:621:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalMyDsl.g:626:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Program__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7"


    // $ANTLR start "rule__Program__Group__7__Impl"
    // InternalMyDsl.g:633:1: rule__Program__Group__7__Impl : ( ( rule__Program__FunctionsAssignment_7 ) ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ( rule__Program__FunctionsAssignment_7 ) ) )
            // InternalMyDsl.g:638:1: ( ( rule__Program__FunctionsAssignment_7 ) )
            {
            // InternalMyDsl.g:638:1: ( ( rule__Program__FunctionsAssignment_7 ) )
            // InternalMyDsl.g:639:2: ( rule__Program__FunctionsAssignment_7 )
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_7()); 
            // InternalMyDsl.g:640:2: ( rule__Program__FunctionsAssignment_7 )
            // InternalMyDsl.g:640:3: rule__Program__FunctionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Program__FunctionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getFunctionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__7__Impl"


    // $ANTLR start "rule__Program__Group__8"
    // InternalMyDsl.g:648:1: rule__Program__Group__8 : rule__Program__Group__8__Impl rule__Program__Group__9 ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( rule__Program__Group__8__Impl rule__Program__Group__9 )
            // InternalMyDsl.g:653:2: rule__Program__Group__8__Impl rule__Program__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Program__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8"


    // $ANTLR start "rule__Program__Group__8__Impl"
    // InternalMyDsl.g:660:1: rule__Program__Group__8__Impl : ( ( rule__Program__FunctionsAssignment_8 )* ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( ( rule__Program__FunctionsAssignment_8 )* ) )
            // InternalMyDsl.g:665:1: ( ( rule__Program__FunctionsAssignment_8 )* )
            {
            // InternalMyDsl.g:665:1: ( ( rule__Program__FunctionsAssignment_8 )* )
            // InternalMyDsl.g:666:2: ( rule__Program__FunctionsAssignment_8 )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_8()); 
            // InternalMyDsl.g:667:2: ( rule__Program__FunctionsAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26||LA5_0==28||LA5_0==31||(LA5_0>=33 && LA5_0<=36)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:667:3: rule__Program__FunctionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Program__FunctionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getFunctionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__8__Impl"


    // $ANTLR start "rule__Program__Group__9"
    // InternalMyDsl.g:675:1: rule__Program__Group__9 : rule__Program__Group__9__Impl ;
    public final void rule__Program__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( rule__Program__Group__9__Impl )
            // InternalMyDsl.g:680:2: rule__Program__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9"


    // $ANTLR start "rule__Program__Group__9__Impl"
    // InternalMyDsl.g:686:1: rule__Program__Group__9__Impl : ( '}' ) ;
    public final void rule__Program__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( ( '}' ) )
            // InternalMyDsl.g:691:1: ( '}' )
            {
            // InternalMyDsl.g:691:1: ( '}' )
            // InternalMyDsl.g:692:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__9__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:702:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:707:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:714:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:719:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:719:1: ( ( '-' )? )
            // InternalMyDsl.g:720:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:721:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:721:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:729:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:734:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:740:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:745:1: ( RULE_INT )
            {
            // InternalMyDsl.g:745:1: ( RULE_INT )
            // InternalMyDsl.g:746:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__CsvLoader__Group__0"
    // InternalMyDsl.g:756:1: rule__CsvLoader__Group__0 : rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1 ;
    public final void rule__CsvLoader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1 )
            // InternalMyDsl.g:761:2: rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CsvLoader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__0"


    // $ANTLR start "rule__CsvLoader__Group__0__Impl"
    // InternalMyDsl.g:768:1: rule__CsvLoader__Group__0__Impl : ( 'uses :' ) ;
    public final void rule__CsvLoader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( 'uses :' ) )
            // InternalMyDsl.g:773:1: ( 'uses :' )
            {
            // InternalMyDsl.g:773:1: ( 'uses :' )
            // InternalMyDsl.g:774:2: 'uses :'
            {
             before(grammarAccess.getCsvLoaderAccess().getUsesKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getUsesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__0__Impl"


    // $ANTLR start "rule__CsvLoader__Group__1"
    // InternalMyDsl.g:783:1: rule__CsvLoader__Group__1 : rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2 ;
    public final void rule__CsvLoader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2 )
            // InternalMyDsl.g:788:2: rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CsvLoader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__1"


    // $ANTLR start "rule__CsvLoader__Group__1__Impl"
    // InternalMyDsl.g:795:1: rule__CsvLoader__Group__1__Impl : ( '\\'' ) ;
    public final void rule__CsvLoader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( '\\'' ) )
            // InternalMyDsl.g:800:1: ( '\\'' )
            {
            // InternalMyDsl.g:800:1: ( '\\'' )
            // InternalMyDsl.g:801:2: '\\''
            {
             before(grammarAccess.getCsvLoaderAccess().getApostropheKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getApostropheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__1__Impl"


    // $ANTLR start "rule__CsvLoader__Group__2"
    // InternalMyDsl.g:810:1: rule__CsvLoader__Group__2 : rule__CsvLoader__Group__2__Impl rule__CsvLoader__Group__3 ;
    public final void rule__CsvLoader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( rule__CsvLoader__Group__2__Impl rule__CsvLoader__Group__3 )
            // InternalMyDsl.g:815:2: rule__CsvLoader__Group__2__Impl rule__CsvLoader__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CsvLoader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__2"


    // $ANTLR start "rule__CsvLoader__Group__2__Impl"
    // InternalMyDsl.g:822:1: rule__CsvLoader__Group__2__Impl : ( ( rule__CsvLoader__PathAssignment_2 ) ) ;
    public final void rule__CsvLoader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( ( rule__CsvLoader__PathAssignment_2 ) ) )
            // InternalMyDsl.g:827:1: ( ( rule__CsvLoader__PathAssignment_2 ) )
            {
            // InternalMyDsl.g:827:1: ( ( rule__CsvLoader__PathAssignment_2 ) )
            // InternalMyDsl.g:828:2: ( rule__CsvLoader__PathAssignment_2 )
            {
             before(grammarAccess.getCsvLoaderAccess().getPathAssignment_2()); 
            // InternalMyDsl.g:829:2: ( rule__CsvLoader__PathAssignment_2 )
            // InternalMyDsl.g:829:3: rule__CsvLoader__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCsvLoaderAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__2__Impl"


    // $ANTLR start "rule__CsvLoader__Group__3"
    // InternalMyDsl.g:837:1: rule__CsvLoader__Group__3 : rule__CsvLoader__Group__3__Impl rule__CsvLoader__Group__4 ;
    public final void rule__CsvLoader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( rule__CsvLoader__Group__3__Impl rule__CsvLoader__Group__4 )
            // InternalMyDsl.g:842:2: rule__CsvLoader__Group__3__Impl rule__CsvLoader__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CsvLoader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__3"


    // $ANTLR start "rule__CsvLoader__Group__3__Impl"
    // InternalMyDsl.g:849:1: rule__CsvLoader__Group__3__Impl : ( '\\'' ) ;
    public final void rule__CsvLoader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( '\\'' ) )
            // InternalMyDsl.g:854:1: ( '\\'' )
            {
            // InternalMyDsl.g:854:1: ( '\\'' )
            // InternalMyDsl.g:855:2: '\\''
            {
             before(grammarAccess.getCsvLoaderAccess().getApostropheKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getApostropheKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__3__Impl"


    // $ANTLR start "rule__CsvLoader__Group__4"
    // InternalMyDsl.g:864:1: rule__CsvLoader__Group__4 : rule__CsvLoader__Group__4__Impl ;
    public final void rule__CsvLoader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( rule__CsvLoader__Group__4__Impl )
            // InternalMyDsl.g:869:2: rule__CsvLoader__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__4"


    // $ANTLR start "rule__CsvLoader__Group__4__Impl"
    // InternalMyDsl.g:875:1: rule__CsvLoader__Group__4__Impl : ( ';' ) ;
    public final void rule__CsvLoader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( ';' ) )
            // InternalMyDsl.g:880:1: ( ';' )
            {
            // InternalMyDsl.g:880:1: ( ';' )
            // InternalMyDsl.g:881:2: ';'
            {
             before(grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__Group__4__Impl"


    // $ANTLR start "rule__DataFiltering__Group__0"
    // InternalMyDsl.g:891:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalMyDsl.g:896:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DataFiltering__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__0"


    // $ANTLR start "rule__DataFiltering__Group__0__Impl"
    // InternalMyDsl.g:903:1: rule__DataFiltering__Group__0__Impl : ( 'filter :' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( 'filter :' ) )
            // InternalMyDsl.g:908:1: ( 'filter :' )
            {
            // InternalMyDsl.g:908:1: ( 'filter :' )
            // InternalMyDsl.g:909:2: 'filter :'
            {
             before(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group__1"
    // InternalMyDsl.g:918:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalMyDsl.g:923:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DataFiltering__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__1"


    // $ANTLR start "rule__DataFiltering__Group__1__Impl"
    // InternalMyDsl.g:930:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__Column_filterAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( ( rule__DataFiltering__Column_filterAssignment_1 ) ) )
            // InternalMyDsl.g:935:1: ( ( rule__DataFiltering__Column_filterAssignment_1 ) )
            {
            // InternalMyDsl.g:935:1: ( ( rule__DataFiltering__Column_filterAssignment_1 ) )
            // InternalMyDsl.g:936:2: ( rule__DataFiltering__Column_filterAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1()); 
            // InternalMyDsl.g:937:2: ( rule__DataFiltering__Column_filterAssignment_1 )
            // InternalMyDsl.g:937:3: rule__DataFiltering__Column_filterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Column_filterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group__2"
    // InternalMyDsl.g:945:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalMyDsl.g:950:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__DataFiltering__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__2"


    // $ANTLR start "rule__DataFiltering__Group__2__Impl"
    // InternalMyDsl.g:957:1: rule__DataFiltering__Group__2__Impl : ( ( rule__DataFiltering__Group_2__0 )* ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( ( rule__DataFiltering__Group_2__0 )* ) )
            // InternalMyDsl.g:962:1: ( ( rule__DataFiltering__Group_2__0 )* )
            {
            // InternalMyDsl.g:962:1: ( ( rule__DataFiltering__Group_2__0 )* )
            // InternalMyDsl.g:963:2: ( rule__DataFiltering__Group_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2()); 
            // InternalMyDsl.g:964:2: ( rule__DataFiltering__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:964:3: rule__DataFiltering__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DataFiltering__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group__3"
    // InternalMyDsl.g:972:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4 ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4 )
            // InternalMyDsl.g:977:2: rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DataFiltering__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__3"


    // $ANTLR start "rule__DataFiltering__Group__3__Impl"
    // InternalMyDsl.g:984:1: rule__DataFiltering__Group__3__Impl : ( ';' ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ';' ) )
            // InternalMyDsl.g:989:1: ( ';' )
            {
            // InternalMyDsl.g:989:1: ( ';' )
            // InternalMyDsl.g:990:2: ';'
            {
             before(grammarAccess.getDataFilteringAccess().getSemicolonKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__3__Impl"


    // $ANTLR start "rule__DataFiltering__Group__4"
    // InternalMyDsl.g:999:1: rule__DataFiltering__Group__4 : rule__DataFiltering__Group__4__Impl rule__DataFiltering__Group__5 ;
    public final void rule__DataFiltering__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( rule__DataFiltering__Group__4__Impl rule__DataFiltering__Group__5 )
            // InternalMyDsl.g:1004:2: rule__DataFiltering__Group__4__Impl rule__DataFiltering__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__DataFiltering__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__4"


    // $ANTLR start "rule__DataFiltering__Group__4__Impl"
    // InternalMyDsl.g:1011:1: rule__DataFiltering__Group__4__Impl : ( ( 'condition :' )? ) ;
    public final void rule__DataFiltering__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( ( 'condition :' )? ) )
            // InternalMyDsl.g:1016:1: ( ( 'condition :' )? )
            {
            // InternalMyDsl.g:1016:1: ( ( 'condition :' )? )
            // InternalMyDsl.g:1017:2: ( 'condition :' )?
            {
             before(grammarAccess.getDataFilteringAccess().getConditionKeyword_4()); 
            // InternalMyDsl.g:1018:2: ( 'condition :' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1018:3: 'condition :'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getConditionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__4__Impl"


    // $ANTLR start "rule__DataFiltering__Group__5"
    // InternalMyDsl.g:1026:1: rule__DataFiltering__Group__5 : rule__DataFiltering__Group__5__Impl ;
    public final void rule__DataFiltering__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__DataFiltering__Group__5__Impl )
            // InternalMyDsl.g:1031:2: rule__DataFiltering__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__5"


    // $ANTLR start "rule__DataFiltering__Group__5__Impl"
    // InternalMyDsl.g:1037:1: rule__DataFiltering__Group__5__Impl : ( ( rule__DataFiltering__Rowfilter_conditionAssignment_5 )? ) ;
    public final void rule__DataFiltering__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( ( ( rule__DataFiltering__Rowfilter_conditionAssignment_5 )? ) )
            // InternalMyDsl.g:1042:1: ( ( rule__DataFiltering__Rowfilter_conditionAssignment_5 )? )
            {
            // InternalMyDsl.g:1042:1: ( ( rule__DataFiltering__Rowfilter_conditionAssignment_5 )? )
            // InternalMyDsl.g:1043:2: ( rule__DataFiltering__Rowfilter_conditionAssignment_5 )?
            {
             before(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_5()); 
            // InternalMyDsl.g:1044:2: ( rule__DataFiltering__Rowfilter_conditionAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1044:3: rule__DataFiltering__Rowfilter_conditionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Rowfilter_conditionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__5__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2__0"
    // InternalMyDsl.g:1053:1: rule__DataFiltering__Group_2__0 : rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 ;
    public final void rule__DataFiltering__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 )
            // InternalMyDsl.g:1058:2: rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__DataFiltering__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2__0"


    // $ANTLR start "rule__DataFiltering__Group_2__0__Impl"
    // InternalMyDsl.g:1065:1: rule__DataFiltering__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ',' ) )
            // InternalMyDsl.g:1070:1: ( ',' )
            {
            // InternalMyDsl.g:1070:1: ( ',' )
            // InternalMyDsl.g:1071:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2__1"
    // InternalMyDsl.g:1080:1: rule__DataFiltering__Group_2__1 : rule__DataFiltering__Group_2__1__Impl ;
    public final void rule__DataFiltering__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__DataFiltering__Group_2__1__Impl )
            // InternalMyDsl.g:1085:2: rule__DataFiltering__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2__1"


    // $ANTLR start "rule__DataFiltering__Group_2__1__Impl"
    // InternalMyDsl.g:1091:1: rule__DataFiltering__Group_2__1__Impl : ( ( rule__DataFiltering__Column_filterAssignment_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( ( rule__DataFiltering__Column_filterAssignment_2_1 ) ) )
            // InternalMyDsl.g:1096:1: ( ( rule__DataFiltering__Column_filterAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1096:1: ( ( rule__DataFiltering__Column_filterAssignment_2_1 ) )
            // InternalMyDsl.g:1097:2: ( rule__DataFiltering__Column_filterAssignment_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_2_1()); 
            // InternalMyDsl.g:1098:2: ( rule__DataFiltering__Column_filterAssignment_2_1 )
            // InternalMyDsl.g:1098:3: rule__DataFiltering__Column_filterAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Column_filterAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_0__0"
    // InternalMyDsl.g:1107:1: rule__GraphDrawing__Group_0__0 : rule__GraphDrawing__Group_0__0__Impl rule__GraphDrawing__Group_0__1 ;
    public final void rule__GraphDrawing__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__GraphDrawing__Group_0__0__Impl rule__GraphDrawing__Group_0__1 )
            // InternalMyDsl.g:1112:2: rule__GraphDrawing__Group_0__0__Impl rule__GraphDrawing__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__GraphDrawing__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__0"


    // $ANTLR start "rule__GraphDrawing__Group_0__0__Impl"
    // InternalMyDsl.g:1119:1: rule__GraphDrawing__Group_0__0__Impl : ( 'draw a plot :' ) ;
    public final void rule__GraphDrawing__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( 'draw a plot :' ) )
            // InternalMyDsl.g:1124:1: ( 'draw a plot :' )
            {
            // InternalMyDsl.g:1124:1: ( 'draw a plot :' )
            // InternalMyDsl.g:1125:2: 'draw a plot :'
            {
             before(grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_0__1"
    // InternalMyDsl.g:1134:1: rule__GraphDrawing__Group_0__1 : rule__GraphDrawing__Group_0__1__Impl rule__GraphDrawing__Group_0__2 ;
    public final void rule__GraphDrawing__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__GraphDrawing__Group_0__1__Impl rule__GraphDrawing__Group_0__2 )
            // InternalMyDsl.g:1139:2: rule__GraphDrawing__Group_0__1__Impl rule__GraphDrawing__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__1"


    // $ANTLR start "rule__GraphDrawing__Group_0__1__Impl"
    // InternalMyDsl.g:1146:1: rule__GraphDrawing__Group_0__1__Impl : ( 'graph_type' ) ;
    public final void rule__GraphDrawing__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( 'graph_type' ) )
            // InternalMyDsl.g:1151:1: ( 'graph_type' )
            {
            // InternalMyDsl.g:1151:1: ( 'graph_type' )
            // InternalMyDsl.g:1152:2: 'graph_type'
            {
             before(grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_0__2"
    // InternalMyDsl.g:1161:1: rule__GraphDrawing__Group_0__2 : rule__GraphDrawing__Group_0__2__Impl rule__GraphDrawing__Group_0__3 ;
    public final void rule__GraphDrawing__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__GraphDrawing__Group_0__2__Impl rule__GraphDrawing__Group_0__3 )
            // InternalMyDsl.g:1166:2: rule__GraphDrawing__Group_0__2__Impl rule__GraphDrawing__Group_0__3
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__2"


    // $ANTLR start "rule__GraphDrawing__Group_0__2__Impl"
    // InternalMyDsl.g:1173:1: rule__GraphDrawing__Group_0__2__Impl : ( '=' ) ;
    public final void rule__GraphDrawing__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( '=' ) )
            // InternalMyDsl.g:1178:1: ( '=' )
            {
            // InternalMyDsl.g:1178:1: ( '=' )
            // InternalMyDsl.g:1179:2: '='
            {
             before(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_0_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_0__3"
    // InternalMyDsl.g:1188:1: rule__GraphDrawing__Group_0__3 : rule__GraphDrawing__Group_0__3__Impl rule__GraphDrawing__Group_0__4 ;
    public final void rule__GraphDrawing__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__GraphDrawing__Group_0__3__Impl rule__GraphDrawing__Group_0__4 )
            // InternalMyDsl.g:1193:2: rule__GraphDrawing__Group_0__3__Impl rule__GraphDrawing__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__GraphDrawing__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__3"


    // $ANTLR start "rule__GraphDrawing__Group_0__3__Impl"
    // InternalMyDsl.g:1200:1: rule__GraphDrawing__Group_0__3__Impl : ( ( rule__GraphDrawing__Graph_typeAssignment_0_3 ) ) ;
    public final void rule__GraphDrawing__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ( rule__GraphDrawing__Graph_typeAssignment_0_3 ) ) )
            // InternalMyDsl.g:1205:1: ( ( rule__GraphDrawing__Graph_typeAssignment_0_3 ) )
            {
            // InternalMyDsl.g:1205:1: ( ( rule__GraphDrawing__Graph_typeAssignment_0_3 ) )
            // InternalMyDsl.g:1206:2: ( rule__GraphDrawing__Graph_typeAssignment_0_3 )
            {
             before(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_0_3()); 
            // InternalMyDsl.g:1207:2: ( rule__GraphDrawing__Graph_typeAssignment_0_3 )
            // InternalMyDsl.g:1207:3: rule__GraphDrawing__Graph_typeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Graph_typeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__3__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_0__4"
    // InternalMyDsl.g:1215:1: rule__GraphDrawing__Group_0__4 : rule__GraphDrawing__Group_0__4__Impl ;
    public final void rule__GraphDrawing__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__GraphDrawing__Group_0__4__Impl )
            // InternalMyDsl.g:1220:2: rule__GraphDrawing__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__4"


    // $ANTLR start "rule__GraphDrawing__Group_0__4__Impl"
    // InternalMyDsl.g:1226:1: rule__GraphDrawing__Group_0__4__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( ( ';' ) )
            // InternalMyDsl.g:1231:1: ( ';' )
            {
            // InternalMyDsl.g:1231:1: ( ';' )
            // InternalMyDsl.g:1232:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_0_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_0__4__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_1__0"
    // InternalMyDsl.g:1242:1: rule__GraphDrawing__Group_1__0 : rule__GraphDrawing__Group_1__0__Impl rule__GraphDrawing__Group_1__1 ;
    public final void rule__GraphDrawing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__GraphDrawing__Group_1__0__Impl rule__GraphDrawing__Group_1__1 )
            // InternalMyDsl.g:1247:2: rule__GraphDrawing__Group_1__0__Impl rule__GraphDrawing__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__0"


    // $ANTLR start "rule__GraphDrawing__Group_1__0__Impl"
    // InternalMyDsl.g:1254:1: rule__GraphDrawing__Group_1__0__Impl : ( 'abs_column' ) ;
    public final void rule__GraphDrawing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( 'abs_column' ) )
            // InternalMyDsl.g:1259:1: ( 'abs_column' )
            {
            // InternalMyDsl.g:1259:1: ( 'abs_column' )
            // InternalMyDsl.g:1260:2: 'abs_column'
            {
             before(grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_1__1"
    // InternalMyDsl.g:1269:1: rule__GraphDrawing__Group_1__1 : rule__GraphDrawing__Group_1__1__Impl rule__GraphDrawing__Group_1__2 ;
    public final void rule__GraphDrawing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__GraphDrawing__Group_1__1__Impl rule__GraphDrawing__Group_1__2 )
            // InternalMyDsl.g:1274:2: rule__GraphDrawing__Group_1__1__Impl rule__GraphDrawing__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__1"


    // $ANTLR start "rule__GraphDrawing__Group_1__1__Impl"
    // InternalMyDsl.g:1281:1: rule__GraphDrawing__Group_1__1__Impl : ( '=' ) ;
    public final void rule__GraphDrawing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( '=' ) )
            // InternalMyDsl.g:1286:1: ( '=' )
            {
            // InternalMyDsl.g:1286:1: ( '=' )
            // InternalMyDsl.g:1287:2: '='
            {
             before(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_1__2"
    // InternalMyDsl.g:1296:1: rule__GraphDrawing__Group_1__2 : rule__GraphDrawing__Group_1__2__Impl rule__GraphDrawing__Group_1__3 ;
    public final void rule__GraphDrawing__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( rule__GraphDrawing__Group_1__2__Impl rule__GraphDrawing__Group_1__3 )
            // InternalMyDsl.g:1301:2: rule__GraphDrawing__Group_1__2__Impl rule__GraphDrawing__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__GraphDrawing__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__2"


    // $ANTLR start "rule__GraphDrawing__Group_1__2__Impl"
    // InternalMyDsl.g:1308:1: rule__GraphDrawing__Group_1__2__Impl : ( ( rule__GraphDrawing__Abs_columnAssignment_1_2 ) ) ;
    public final void rule__GraphDrawing__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( ( rule__GraphDrawing__Abs_columnAssignment_1_2 ) ) )
            // InternalMyDsl.g:1313:1: ( ( rule__GraphDrawing__Abs_columnAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1313:1: ( ( rule__GraphDrawing__Abs_columnAssignment_1_2 ) )
            // InternalMyDsl.g:1314:2: ( rule__GraphDrawing__Abs_columnAssignment_1_2 )
            {
             before(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_1_2()); 
            // InternalMyDsl.g:1315:2: ( rule__GraphDrawing__Abs_columnAssignment_1_2 )
            // InternalMyDsl.g:1315:3: rule__GraphDrawing__Abs_columnAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Abs_columnAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_1__3"
    // InternalMyDsl.g:1323:1: rule__GraphDrawing__Group_1__3 : rule__GraphDrawing__Group_1__3__Impl ;
    public final void rule__GraphDrawing__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( rule__GraphDrawing__Group_1__3__Impl )
            // InternalMyDsl.g:1328:2: rule__GraphDrawing__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__3"


    // $ANTLR start "rule__GraphDrawing__Group_1__3__Impl"
    // InternalMyDsl.g:1334:1: rule__GraphDrawing__Group_1__3__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1338:1: ( ( ';' ) )
            // InternalMyDsl.g:1339:1: ( ';' )
            {
            // InternalMyDsl.g:1339:1: ( ';' )
            // InternalMyDsl.g:1340:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_1__3__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2__0"
    // InternalMyDsl.g:1350:1: rule__GraphDrawing__Group_2__0 : rule__GraphDrawing__Group_2__0__Impl rule__GraphDrawing__Group_2__1 ;
    public final void rule__GraphDrawing__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( rule__GraphDrawing__Group_2__0__Impl rule__GraphDrawing__Group_2__1 )
            // InternalMyDsl.g:1355:2: rule__GraphDrawing__Group_2__0__Impl rule__GraphDrawing__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__GraphDrawing__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2__0"


    // $ANTLR start "rule__GraphDrawing__Group_2__0__Impl"
    // InternalMyDsl.g:1362:1: rule__GraphDrawing__Group_2__0__Impl : ( ( rule__GraphDrawing__UnorderedGroup_2_0 ) ) ;
    public final void rule__GraphDrawing__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( ( ( rule__GraphDrawing__UnorderedGroup_2_0 ) ) )
            // InternalMyDsl.g:1367:1: ( ( rule__GraphDrawing__UnorderedGroup_2_0 ) )
            {
            // InternalMyDsl.g:1367:1: ( ( rule__GraphDrawing__UnorderedGroup_2_0 ) )
            // InternalMyDsl.g:1368:2: ( rule__GraphDrawing__UnorderedGroup_2_0 )
            {
             before(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()); 
            // InternalMyDsl.g:1369:2: ( rule__GraphDrawing__UnorderedGroup_2_0 )
            // InternalMyDsl.g:1369:3: rule__GraphDrawing__UnorderedGroup_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__UnorderedGroup_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2__1"
    // InternalMyDsl.g:1377:1: rule__GraphDrawing__Group_2__1 : rule__GraphDrawing__Group_2__1__Impl ;
    public final void rule__GraphDrawing__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( rule__GraphDrawing__Group_2__1__Impl )
            // InternalMyDsl.g:1382:2: rule__GraphDrawing__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2__1"


    // $ANTLR start "rule__GraphDrawing__Group_2__1__Impl"
    // InternalMyDsl.g:1388:1: rule__GraphDrawing__Group_2__1__Impl : ( ( rule__GraphDrawing__Group_2_1__0 )? ) ;
    public final void rule__GraphDrawing__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1392:1: ( ( ( rule__GraphDrawing__Group_2_1__0 )? ) )
            // InternalMyDsl.g:1393:1: ( ( rule__GraphDrawing__Group_2_1__0 )? )
            {
            // InternalMyDsl.g:1393:1: ( ( rule__GraphDrawing__Group_2_1__0 )? )
            // InternalMyDsl.g:1394:2: ( rule__GraphDrawing__Group_2_1__0 )?
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_2_1()); 
            // InternalMyDsl.g:1395:2: ( rule__GraphDrawing__Group_2_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1395:3: rule__GraphDrawing__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphDrawingAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__0"
    // InternalMyDsl.g:1404:1: rule__GraphDrawing__Group_2_0_0__0 : rule__GraphDrawing__Group_2_0_0__0__Impl rule__GraphDrawing__Group_2_0_0__1 ;
    public final void rule__GraphDrawing__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1408:1: ( rule__GraphDrawing__Group_2_0_0__0__Impl rule__GraphDrawing__Group_2_0_0__1 )
            // InternalMyDsl.g:1409:2: rule__GraphDrawing__Group_2_0_0__0__Impl rule__GraphDrawing__Group_2_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__0__Impl"
    // InternalMyDsl.g:1416:1: rule__GraphDrawing__Group_2_0_0__0__Impl : ( 'ord_column' ) ;
    public final void rule__GraphDrawing__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( 'ord_column' ) )
            // InternalMyDsl.g:1421:1: ( 'ord_column' )
            {
            // InternalMyDsl.g:1421:1: ( 'ord_column' )
            // InternalMyDsl.g:1422:2: 'ord_column'
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_2_0_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__1"
    // InternalMyDsl.g:1431:1: rule__GraphDrawing__Group_2_0_0__1 : rule__GraphDrawing__Group_2_0_0__1__Impl rule__GraphDrawing__Group_2_0_0__2 ;
    public final void rule__GraphDrawing__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( rule__GraphDrawing__Group_2_0_0__1__Impl rule__GraphDrawing__Group_2_0_0__2 )
            // InternalMyDsl.g:1436:2: rule__GraphDrawing__Group_2_0_0__1__Impl rule__GraphDrawing__Group_2_0_0__2
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__1__Impl"
    // InternalMyDsl.g:1443:1: rule__GraphDrawing__Group_2_0_0__1__Impl : ( '=' ) ;
    public final void rule__GraphDrawing__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( '=' ) )
            // InternalMyDsl.g:1448:1: ( '=' )
            {
            // InternalMyDsl.g:1448:1: ( '=' )
            // InternalMyDsl.g:1449:2: '='
            {
             before(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__2"
    // InternalMyDsl.g:1458:1: rule__GraphDrawing__Group_2_0_0__2 : rule__GraphDrawing__Group_2_0_0__2__Impl rule__GraphDrawing__Group_2_0_0__3 ;
    public final void rule__GraphDrawing__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( rule__GraphDrawing__Group_2_0_0__2__Impl rule__GraphDrawing__Group_2_0_0__3 )
            // InternalMyDsl.g:1463:2: rule__GraphDrawing__Group_2_0_0__2__Impl rule__GraphDrawing__Group_2_0_0__3
            {
            pushFollow(FOLLOW_14);
            rule__GraphDrawing__Group_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__2"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__2__Impl"
    // InternalMyDsl.g:1470:1: rule__GraphDrawing__Group_2_0_0__2__Impl : ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 ) ) ;
    public final void rule__GraphDrawing__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 ) ) )
            // InternalMyDsl.g:1475:1: ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 ) )
            {
            // InternalMyDsl.g:1475:1: ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 ) )
            // InternalMyDsl.g:1476:2: ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 )
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_2_0_0_2()); 
            // InternalMyDsl.g:1477:2: ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 )
            // InternalMyDsl.g:1477:3: rule__GraphDrawing__Ord_columnAssignment_2_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Ord_columnAssignment_2_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_2_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__3"
    // InternalMyDsl.g:1485:1: rule__GraphDrawing__Group_2_0_0__3 : rule__GraphDrawing__Group_2_0_0__3__Impl rule__GraphDrawing__Group_2_0_0__4 ;
    public final void rule__GraphDrawing__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1489:1: ( rule__GraphDrawing__Group_2_0_0__3__Impl rule__GraphDrawing__Group_2_0_0__4 )
            // InternalMyDsl.g:1490:2: rule__GraphDrawing__Group_2_0_0__3__Impl rule__GraphDrawing__Group_2_0_0__4
            {
            pushFollow(FOLLOW_14);
            rule__GraphDrawing__Group_2_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__3"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__3__Impl"
    // InternalMyDsl.g:1497:1: rule__GraphDrawing__Group_2_0_0__3__Impl : ( ( rule__GraphDrawing__Group_2_0_0_3__0 )* ) ;
    public final void rule__GraphDrawing__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( ( rule__GraphDrawing__Group_2_0_0_3__0 )* ) )
            // InternalMyDsl.g:1502:1: ( ( rule__GraphDrawing__Group_2_0_0_3__0 )* )
            {
            // InternalMyDsl.g:1502:1: ( ( rule__GraphDrawing__Group_2_0_0_3__0 )* )
            // InternalMyDsl.g:1503:2: ( rule__GraphDrawing__Group_2_0_0_3__0 )*
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_2_0_0_3()); 
            // InternalMyDsl.g:1504:2: ( rule__GraphDrawing__Group_2_0_0_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1504:3: rule__GraphDrawing__Group_2_0_0_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GraphDrawing__Group_2_0_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGraphDrawingAccess().getGroup_2_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__3__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__4"
    // InternalMyDsl.g:1512:1: rule__GraphDrawing__Group_2_0_0__4 : rule__GraphDrawing__Group_2_0_0__4__Impl ;
    public final void rule__GraphDrawing__Group_2_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1516:1: ( rule__GraphDrawing__Group_2_0_0__4__Impl )
            // InternalMyDsl.g:1517:2: rule__GraphDrawing__Group_2_0_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__4"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0__4__Impl"
    // InternalMyDsl.g:1523:1: rule__GraphDrawing__Group_2_0_0__4__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group_2_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( ';' ) )
            // InternalMyDsl.g:1528:1: ( ';' )
            {
            // InternalMyDsl.g:1528:1: ( ';' )
            // InternalMyDsl.g:1529:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_0_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0__4__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0_3__0"
    // InternalMyDsl.g:1539:1: rule__GraphDrawing__Group_2_0_0_3__0 : rule__GraphDrawing__Group_2_0_0_3__0__Impl rule__GraphDrawing__Group_2_0_0_3__1 ;
    public final void rule__GraphDrawing__Group_2_0_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1543:1: ( rule__GraphDrawing__Group_2_0_0_3__0__Impl rule__GraphDrawing__Group_2_0_0_3__1 )
            // InternalMyDsl.g:1544:2: rule__GraphDrawing__Group_2_0_0_3__0__Impl rule__GraphDrawing__Group_2_0_0_3__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_2_0_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0_3__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0_3__0__Impl"
    // InternalMyDsl.g:1551:1: rule__GraphDrawing__Group_2_0_0_3__0__Impl : ( ',' ) ;
    public final void rule__GraphDrawing__Group_2_0_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ',' ) )
            // InternalMyDsl.g:1556:1: ( ',' )
            {
            // InternalMyDsl.g:1556:1: ( ',' )
            // InternalMyDsl.g:1557:2: ','
            {
             before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_0_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0_3__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0_3__1"
    // InternalMyDsl.g:1566:1: rule__GraphDrawing__Group_2_0_0_3__1 : rule__GraphDrawing__Group_2_0_0_3__1__Impl ;
    public final void rule__GraphDrawing__Group_2_0_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( rule__GraphDrawing__Group_2_0_0_3__1__Impl )
            // InternalMyDsl.g:1571:2: rule__GraphDrawing__Group_2_0_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0_3__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_0_3__1__Impl"
    // InternalMyDsl.g:1577:1: rule__GraphDrawing__Group_2_0_0_3__1__Impl : ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 ) ) ;
    public final void rule__GraphDrawing__Group_2_0_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 ) ) )
            // InternalMyDsl.g:1582:1: ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 ) )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 ) )
            // InternalMyDsl.g:1583:2: ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 )
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_2_0_0_3_1()); 
            // InternalMyDsl.g:1584:2: ( rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 )
            // InternalMyDsl.g:1584:3: rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_2_0_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_0_3__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__0"
    // InternalMyDsl.g:1593:1: rule__GraphDrawing__Group_2_0_1__0 : rule__GraphDrawing__Group_2_0_1__0__Impl rule__GraphDrawing__Group_2_0_1__1 ;
    public final void rule__GraphDrawing__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1597:1: ( rule__GraphDrawing__Group_2_0_1__0__Impl rule__GraphDrawing__Group_2_0_1__1 )
            // InternalMyDsl.g:1598:2: rule__GraphDrawing__Group_2_0_1__0__Impl rule__GraphDrawing__Group_2_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__0__Impl"
    // InternalMyDsl.g:1605:1: rule__GraphDrawing__Group_2_0_1__0__Impl : ( 'labels' ) ;
    public final void rule__GraphDrawing__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( 'labels' ) )
            // InternalMyDsl.g:1610:1: ( 'labels' )
            {
            // InternalMyDsl.g:1610:1: ( 'labels' )
            // InternalMyDsl.g:1611:2: 'labels'
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelsKeyword_2_0_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getLabelsKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__1"
    // InternalMyDsl.g:1620:1: rule__GraphDrawing__Group_2_0_1__1 : rule__GraphDrawing__Group_2_0_1__1__Impl rule__GraphDrawing__Group_2_0_1__2 ;
    public final void rule__GraphDrawing__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1624:1: ( rule__GraphDrawing__Group_2_0_1__1__Impl rule__GraphDrawing__Group_2_0_1__2 )
            // InternalMyDsl.g:1625:2: rule__GraphDrawing__Group_2_0_1__1__Impl rule__GraphDrawing__Group_2_0_1__2
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_2_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__1__Impl"
    // InternalMyDsl.g:1632:1: rule__GraphDrawing__Group_2_0_1__1__Impl : ( '=' ) ;
    public final void rule__GraphDrawing__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( '=' ) )
            // InternalMyDsl.g:1637:1: ( '=' )
            {
            // InternalMyDsl.g:1637:1: ( '=' )
            // InternalMyDsl.g:1638:2: '='
            {
             before(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__2"
    // InternalMyDsl.g:1647:1: rule__GraphDrawing__Group_2_0_1__2 : rule__GraphDrawing__Group_2_0_1__2__Impl rule__GraphDrawing__Group_2_0_1__3 ;
    public final void rule__GraphDrawing__Group_2_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1651:1: ( rule__GraphDrawing__Group_2_0_1__2__Impl rule__GraphDrawing__Group_2_0_1__3 )
            // InternalMyDsl.g:1652:2: rule__GraphDrawing__Group_2_0_1__2__Impl rule__GraphDrawing__Group_2_0_1__3
            {
            pushFollow(FOLLOW_14);
            rule__GraphDrawing__Group_2_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__2"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__2__Impl"
    // InternalMyDsl.g:1659:1: rule__GraphDrawing__Group_2_0_1__2__Impl : ( ( rule__GraphDrawing__LabelAssignment_2_0_1_2 ) ) ;
    public final void rule__GraphDrawing__Group_2_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ( rule__GraphDrawing__LabelAssignment_2_0_1_2 ) ) )
            // InternalMyDsl.g:1664:1: ( ( rule__GraphDrawing__LabelAssignment_2_0_1_2 ) )
            {
            // InternalMyDsl.g:1664:1: ( ( rule__GraphDrawing__LabelAssignment_2_0_1_2 ) )
            // InternalMyDsl.g:1665:2: ( rule__GraphDrawing__LabelAssignment_2_0_1_2 )
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelAssignment_2_0_1_2()); 
            // InternalMyDsl.g:1666:2: ( rule__GraphDrawing__LabelAssignment_2_0_1_2 )
            // InternalMyDsl.g:1666:3: rule__GraphDrawing__LabelAssignment_2_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__LabelAssignment_2_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getLabelAssignment_2_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__3"
    // InternalMyDsl.g:1674:1: rule__GraphDrawing__Group_2_0_1__3 : rule__GraphDrawing__Group_2_0_1__3__Impl rule__GraphDrawing__Group_2_0_1__4 ;
    public final void rule__GraphDrawing__Group_2_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1678:1: ( rule__GraphDrawing__Group_2_0_1__3__Impl rule__GraphDrawing__Group_2_0_1__4 )
            // InternalMyDsl.g:1679:2: rule__GraphDrawing__Group_2_0_1__3__Impl rule__GraphDrawing__Group_2_0_1__4
            {
            pushFollow(FOLLOW_14);
            rule__GraphDrawing__Group_2_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__3"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__3__Impl"
    // InternalMyDsl.g:1686:1: rule__GraphDrawing__Group_2_0_1__3__Impl : ( ( rule__GraphDrawing__Group_2_0_1_3__0 )* ) ;
    public final void rule__GraphDrawing__Group_2_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ( rule__GraphDrawing__Group_2_0_1_3__0 )* ) )
            // InternalMyDsl.g:1691:1: ( ( rule__GraphDrawing__Group_2_0_1_3__0 )* )
            {
            // InternalMyDsl.g:1691:1: ( ( rule__GraphDrawing__Group_2_0_1_3__0 )* )
            // InternalMyDsl.g:1692:2: ( rule__GraphDrawing__Group_2_0_1_3__0 )*
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_2_0_1_3()); 
            // InternalMyDsl.g:1693:2: ( rule__GraphDrawing__Group_2_0_1_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1693:3: rule__GraphDrawing__Group_2_0_1_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GraphDrawing__Group_2_0_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGraphDrawingAccess().getGroup_2_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__3__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__4"
    // InternalMyDsl.g:1701:1: rule__GraphDrawing__Group_2_0_1__4 : rule__GraphDrawing__Group_2_0_1__4__Impl ;
    public final void rule__GraphDrawing__Group_2_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1705:1: ( rule__GraphDrawing__Group_2_0_1__4__Impl )
            // InternalMyDsl.g:1706:2: rule__GraphDrawing__Group_2_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__4"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1__4__Impl"
    // InternalMyDsl.g:1712:1: rule__GraphDrawing__Group_2_0_1__4__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group_2_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( ';' ) )
            // InternalMyDsl.g:1717:1: ( ';' )
            {
            // InternalMyDsl.g:1717:1: ( ';' )
            // InternalMyDsl.g:1718:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_1_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1__4__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1_3__0"
    // InternalMyDsl.g:1728:1: rule__GraphDrawing__Group_2_0_1_3__0 : rule__GraphDrawing__Group_2_0_1_3__0__Impl rule__GraphDrawing__Group_2_0_1_3__1 ;
    public final void rule__GraphDrawing__Group_2_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1732:1: ( rule__GraphDrawing__Group_2_0_1_3__0__Impl rule__GraphDrawing__Group_2_0_1_3__1 )
            // InternalMyDsl.g:1733:2: rule__GraphDrawing__Group_2_0_1_3__0__Impl rule__GraphDrawing__Group_2_0_1_3__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_2_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1_3__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1_3__0__Impl"
    // InternalMyDsl.g:1740:1: rule__GraphDrawing__Group_2_0_1_3__0__Impl : ( ',' ) ;
    public final void rule__GraphDrawing__Group_2_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( ( ',' ) )
            // InternalMyDsl.g:1745:1: ( ',' )
            {
            // InternalMyDsl.g:1745:1: ( ',' )
            // InternalMyDsl.g:1746:2: ','
            {
             before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_1_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1_3__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1_3__1"
    // InternalMyDsl.g:1755:1: rule__GraphDrawing__Group_2_0_1_3__1 : rule__GraphDrawing__Group_2_0_1_3__1__Impl ;
    public final void rule__GraphDrawing__Group_2_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1759:1: ( rule__GraphDrawing__Group_2_0_1_3__1__Impl )
            // InternalMyDsl.g:1760:2: rule__GraphDrawing__Group_2_0_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1_3__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_1_3__1__Impl"
    // InternalMyDsl.g:1766:1: rule__GraphDrawing__Group_2_0_1_3__1__Impl : ( ( rule__GraphDrawing__LabelAssignment_2_0_1_3_1 ) ) ;
    public final void rule__GraphDrawing__Group_2_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( ( ( rule__GraphDrawing__LabelAssignment_2_0_1_3_1 ) ) )
            // InternalMyDsl.g:1771:1: ( ( rule__GraphDrawing__LabelAssignment_2_0_1_3_1 ) )
            {
            // InternalMyDsl.g:1771:1: ( ( rule__GraphDrawing__LabelAssignment_2_0_1_3_1 ) )
            // InternalMyDsl.g:1772:2: ( rule__GraphDrawing__LabelAssignment_2_0_1_3_1 )
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelAssignment_2_0_1_3_1()); 
            // InternalMyDsl.g:1773:2: ( rule__GraphDrawing__LabelAssignment_2_0_1_3_1 )
            // InternalMyDsl.g:1773:3: rule__GraphDrawing__LabelAssignment_2_0_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__LabelAssignment_2_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getLabelAssignment_2_0_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_1_3__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__0"
    // InternalMyDsl.g:1782:1: rule__GraphDrawing__Group_2_0_2__0 : rule__GraphDrawing__Group_2_0_2__0__Impl rule__GraphDrawing__Group_2_0_2__1 ;
    public final void rule__GraphDrawing__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1786:1: ( rule__GraphDrawing__Group_2_0_2__0__Impl rule__GraphDrawing__Group_2_0_2__1 )
            // InternalMyDsl.g:1787:2: rule__GraphDrawing__Group_2_0_2__0__Impl rule__GraphDrawing__Group_2_0_2__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__0__Impl"
    // InternalMyDsl.g:1794:1: rule__GraphDrawing__Group_2_0_2__0__Impl : ( 'fill' ) ;
    public final void rule__GraphDrawing__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( 'fill' ) )
            // InternalMyDsl.g:1799:1: ( 'fill' )
            {
            // InternalMyDsl.g:1799:1: ( 'fill' )
            // InternalMyDsl.g:1800:2: 'fill'
            {
             before(grammarAccess.getGraphDrawingAccess().getFillKeyword_2_0_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getFillKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__1"
    // InternalMyDsl.g:1809:1: rule__GraphDrawing__Group_2_0_2__1 : rule__GraphDrawing__Group_2_0_2__1__Impl rule__GraphDrawing__Group_2_0_2__2 ;
    public final void rule__GraphDrawing__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( rule__GraphDrawing__Group_2_0_2__1__Impl rule__GraphDrawing__Group_2_0_2__2 )
            // InternalMyDsl.g:1814:2: rule__GraphDrawing__Group_2_0_2__1__Impl rule__GraphDrawing__Group_2_0_2__2
            {
            pushFollow(FOLLOW_19);
            rule__GraphDrawing__Group_2_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__1__Impl"
    // InternalMyDsl.g:1821:1: rule__GraphDrawing__Group_2_0_2__1__Impl : ( '=' ) ;
    public final void rule__GraphDrawing__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( ( '=' ) )
            // InternalMyDsl.g:1826:1: ( '=' )
            {
            // InternalMyDsl.g:1826:1: ( '=' )
            // InternalMyDsl.g:1827:2: '='
            {
             before(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__2"
    // InternalMyDsl.g:1836:1: rule__GraphDrawing__Group_2_0_2__2 : rule__GraphDrawing__Group_2_0_2__2__Impl rule__GraphDrawing__Group_2_0_2__3 ;
    public final void rule__GraphDrawing__Group_2_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__GraphDrawing__Group_2_0_2__2__Impl rule__GraphDrawing__Group_2_0_2__3 )
            // InternalMyDsl.g:1841:2: rule__GraphDrawing__Group_2_0_2__2__Impl rule__GraphDrawing__Group_2_0_2__3
            {
            pushFollow(FOLLOW_14);
            rule__GraphDrawing__Group_2_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__2"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__2__Impl"
    // InternalMyDsl.g:1848:1: rule__GraphDrawing__Group_2_0_2__2__Impl : ( ( rule__GraphDrawing__FillAssignment_2_0_2_2 ) ) ;
    public final void rule__GraphDrawing__Group_2_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( ( rule__GraphDrawing__FillAssignment_2_0_2_2 ) ) )
            // InternalMyDsl.g:1853:1: ( ( rule__GraphDrawing__FillAssignment_2_0_2_2 ) )
            {
            // InternalMyDsl.g:1853:1: ( ( rule__GraphDrawing__FillAssignment_2_0_2_2 ) )
            // InternalMyDsl.g:1854:2: ( rule__GraphDrawing__FillAssignment_2_0_2_2 )
            {
             before(grammarAccess.getGraphDrawingAccess().getFillAssignment_2_0_2_2()); 
            // InternalMyDsl.g:1855:2: ( rule__GraphDrawing__FillAssignment_2_0_2_2 )
            // InternalMyDsl.g:1855:3: rule__GraphDrawing__FillAssignment_2_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__FillAssignment_2_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getFillAssignment_2_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__3"
    // InternalMyDsl.g:1863:1: rule__GraphDrawing__Group_2_0_2__3 : rule__GraphDrawing__Group_2_0_2__3__Impl rule__GraphDrawing__Group_2_0_2__4 ;
    public final void rule__GraphDrawing__Group_2_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__GraphDrawing__Group_2_0_2__3__Impl rule__GraphDrawing__Group_2_0_2__4 )
            // InternalMyDsl.g:1868:2: rule__GraphDrawing__Group_2_0_2__3__Impl rule__GraphDrawing__Group_2_0_2__4
            {
            pushFollow(FOLLOW_14);
            rule__GraphDrawing__Group_2_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__3"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__3__Impl"
    // InternalMyDsl.g:1875:1: rule__GraphDrawing__Group_2_0_2__3__Impl : ( ( rule__GraphDrawing__Group_2_0_2_3__0 )* ) ;
    public final void rule__GraphDrawing__Group_2_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ( rule__GraphDrawing__Group_2_0_2_3__0 )* ) )
            // InternalMyDsl.g:1880:1: ( ( rule__GraphDrawing__Group_2_0_2_3__0 )* )
            {
            // InternalMyDsl.g:1880:1: ( ( rule__GraphDrawing__Group_2_0_2_3__0 )* )
            // InternalMyDsl.g:1881:2: ( rule__GraphDrawing__Group_2_0_2_3__0 )*
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_2_0_2_3()); 
            // InternalMyDsl.g:1882:2: ( rule__GraphDrawing__Group_2_0_2_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1882:3: rule__GraphDrawing__Group_2_0_2_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__GraphDrawing__Group_2_0_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGraphDrawingAccess().getGroup_2_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__3__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__4"
    // InternalMyDsl.g:1890:1: rule__GraphDrawing__Group_2_0_2__4 : rule__GraphDrawing__Group_2_0_2__4__Impl ;
    public final void rule__GraphDrawing__Group_2_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__GraphDrawing__Group_2_0_2__4__Impl )
            // InternalMyDsl.g:1895:2: rule__GraphDrawing__Group_2_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__4"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2__4__Impl"
    // InternalMyDsl.g:1901:1: rule__GraphDrawing__Group_2_0_2__4__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group_2_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( ( ';' ) )
            // InternalMyDsl.g:1906:1: ( ';' )
            {
            // InternalMyDsl.g:1906:1: ( ';' )
            // InternalMyDsl.g:1907:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_2_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2__4__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2_3__0"
    // InternalMyDsl.g:1917:1: rule__GraphDrawing__Group_2_0_2_3__0 : rule__GraphDrawing__Group_2_0_2_3__0__Impl rule__GraphDrawing__Group_2_0_2_3__1 ;
    public final void rule__GraphDrawing__Group_2_0_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__GraphDrawing__Group_2_0_2_3__0__Impl rule__GraphDrawing__Group_2_0_2_3__1 )
            // InternalMyDsl.g:1922:2: rule__GraphDrawing__Group_2_0_2_3__0__Impl rule__GraphDrawing__Group_2_0_2_3__1
            {
            pushFollow(FOLLOW_19);
            rule__GraphDrawing__Group_2_0_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2_3__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2_3__0__Impl"
    // InternalMyDsl.g:1929:1: rule__GraphDrawing__Group_2_0_2_3__0__Impl : ( ',' ) ;
    public final void rule__GraphDrawing__Group_2_0_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ',' ) )
            // InternalMyDsl.g:1934:1: ( ',' )
            {
            // InternalMyDsl.g:1934:1: ( ',' )
            // InternalMyDsl.g:1935:2: ','
            {
             before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_2_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2_3__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2_3__1"
    // InternalMyDsl.g:1944:1: rule__GraphDrawing__Group_2_0_2_3__1 : rule__GraphDrawing__Group_2_0_2_3__1__Impl ;
    public final void rule__GraphDrawing__Group_2_0_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__GraphDrawing__Group_2_0_2_3__1__Impl )
            // InternalMyDsl.g:1949:2: rule__GraphDrawing__Group_2_0_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_0_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2_3__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_0_2_3__1__Impl"
    // InternalMyDsl.g:1955:1: rule__GraphDrawing__Group_2_0_2_3__1__Impl : ( ( rule__GraphDrawing__FillAssignment_2_0_2_3_1 ) ) ;
    public final void rule__GraphDrawing__Group_2_0_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( ( ( rule__GraphDrawing__FillAssignment_2_0_2_3_1 ) ) )
            // InternalMyDsl.g:1960:1: ( ( rule__GraphDrawing__FillAssignment_2_0_2_3_1 ) )
            {
            // InternalMyDsl.g:1960:1: ( ( rule__GraphDrawing__FillAssignment_2_0_2_3_1 ) )
            // InternalMyDsl.g:1961:2: ( rule__GraphDrawing__FillAssignment_2_0_2_3_1 )
            {
             before(grammarAccess.getGraphDrawingAccess().getFillAssignment_2_0_2_3_1()); 
            // InternalMyDsl.g:1962:2: ( rule__GraphDrawing__FillAssignment_2_0_2_3_1 )
            // InternalMyDsl.g:1962:3: rule__GraphDrawing__FillAssignment_2_0_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__FillAssignment_2_0_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getFillAssignment_2_0_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_0_2_3__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__0"
    // InternalMyDsl.g:1971:1: rule__GraphDrawing__Group_2_1__0 : rule__GraphDrawing__Group_2_1__0__Impl rule__GraphDrawing__Group_2_1__1 ;
    public final void rule__GraphDrawing__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__GraphDrawing__Group_2_1__0__Impl rule__GraphDrawing__Group_2_1__1 )
            // InternalMyDsl.g:1976:2: rule__GraphDrawing__Group_2_1__0__Impl rule__GraphDrawing__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__0"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__0__Impl"
    // InternalMyDsl.g:1983:1: rule__GraphDrawing__Group_2_1__0__Impl : ( 'title' ) ;
    public final void rule__GraphDrawing__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( 'title' ) )
            // InternalMyDsl.g:1988:1: ( 'title' )
            {
            // InternalMyDsl.g:1988:1: ( 'title' )
            // InternalMyDsl.g:1989:2: 'title'
            {
             before(grammarAccess.getGraphDrawingAccess().getTitleKeyword_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getTitleKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__1"
    // InternalMyDsl.g:1998:1: rule__GraphDrawing__Group_2_1__1 : rule__GraphDrawing__Group_2_1__1__Impl rule__GraphDrawing__Group_2_1__2 ;
    public final void rule__GraphDrawing__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__GraphDrawing__Group_2_1__1__Impl rule__GraphDrawing__Group_2_1__2 )
            // InternalMyDsl.g:2003:2: rule__GraphDrawing__Group_2_1__1__Impl rule__GraphDrawing__Group_2_1__2
            {
            pushFollow(FOLLOW_20);
            rule__GraphDrawing__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__1"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__1__Impl"
    // InternalMyDsl.g:2010:1: rule__GraphDrawing__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__GraphDrawing__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( ( '=' ) )
            // InternalMyDsl.g:2015:1: ( '=' )
            {
            // InternalMyDsl.g:2015:1: ( '=' )
            // InternalMyDsl.g:2016:2: '='
            {
             before(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__2"
    // InternalMyDsl.g:2025:1: rule__GraphDrawing__Group_2_1__2 : rule__GraphDrawing__Group_2_1__2__Impl rule__GraphDrawing__Group_2_1__3 ;
    public final void rule__GraphDrawing__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__GraphDrawing__Group_2_1__2__Impl rule__GraphDrawing__Group_2_1__3 )
            // InternalMyDsl.g:2030:2: rule__GraphDrawing__Group_2_1__2__Impl rule__GraphDrawing__Group_2_1__3
            {
            pushFollow(FOLLOW_20);
            rule__GraphDrawing__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__2"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__2__Impl"
    // InternalMyDsl.g:2037:1: rule__GraphDrawing__Group_2_1__2__Impl : ( ( rule__GraphDrawing__TitleAssignment_2_1_2 )* ) ;
    public final void rule__GraphDrawing__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( ( rule__GraphDrawing__TitleAssignment_2_1_2 )* ) )
            // InternalMyDsl.g:2042:1: ( ( rule__GraphDrawing__TitleAssignment_2_1_2 )* )
            {
            // InternalMyDsl.g:2042:1: ( ( rule__GraphDrawing__TitleAssignment_2_1_2 )* )
            // InternalMyDsl.g:2043:2: ( rule__GraphDrawing__TitleAssignment_2_1_2 )*
            {
             before(grammarAccess.getGraphDrawingAccess().getTitleAssignment_2_1_2()); 
            // InternalMyDsl.g:2044:2: ( rule__GraphDrawing__TitleAssignment_2_1_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2044:3: rule__GraphDrawing__TitleAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__GraphDrawing__TitleAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getGraphDrawingAccess().getTitleAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__3"
    // InternalMyDsl.g:2052:1: rule__GraphDrawing__Group_2_1__3 : rule__GraphDrawing__Group_2_1__3__Impl ;
    public final void rule__GraphDrawing__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__GraphDrawing__Group_2_1__3__Impl )
            // InternalMyDsl.g:2057:2: rule__GraphDrawing__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__3"


    // $ANTLR start "rule__GraphDrawing__Group_2_1__3__Impl"
    // InternalMyDsl.g:2063:1: rule__GraphDrawing__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( ( ';' ) )
            // InternalMyDsl.g:2068:1: ( ';' )
            {
            // InternalMyDsl.g:2068:1: ( ';' )
            // InternalMyDsl.g:2069:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_1_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_2_1__3__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalMyDsl.g:2079:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalMyDsl.g:2084:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalMyDsl.g:2091:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( 'column' ) )
            // InternalMyDsl.g:2096:1: ( 'column' )
            {
            // InternalMyDsl.g:2096:1: ( 'column' )
            // InternalMyDsl.g:2097:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalMyDsl.g:2106:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalMyDsl.g:2111:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalMyDsl.g:2118:1: rule__Column__Group__1__Impl : ( ( rule__Column__IndexAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__Column__IndexAssignment_1 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__Column__IndexAssignment_1 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__Column__IndexAssignment_1 ) )
            // InternalMyDsl.g:2124:2: ( rule__Column__IndexAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getIndexAssignment_1()); 
            // InternalMyDsl.g:2125:2: ( rule__Column__IndexAssignment_1 )
            // InternalMyDsl.g:2125:3: rule__Column__IndexAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__IndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getIndexAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalMyDsl.g:2133:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalMyDsl.g:2138:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalMyDsl.g:2145:1: rule__Column__Group__2__Impl : ( 'as' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( 'as' ) )
            // InternalMyDsl.g:2150:1: ( 'as' )
            {
            // InternalMyDsl.g:2150:1: ( 'as' )
            // InternalMyDsl.g:2151:2: 'as'
            {
             before(grammarAccess.getColumnAccess().getAsKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalMyDsl.g:2160:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Column__Group__3__Impl )
            // InternalMyDsl.g:2165:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalMyDsl.g:2171:1: rule__Column__Group__3__Impl : ( ( rule__Column__New_name_columnAssignment_3 ) ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( ( ( rule__Column__New_name_columnAssignment_3 ) ) )
            // InternalMyDsl.g:2176:1: ( ( rule__Column__New_name_columnAssignment_3 ) )
            {
            // InternalMyDsl.g:2176:1: ( ( rule__Column__New_name_columnAssignment_3 ) )
            // InternalMyDsl.g:2177:2: ( rule__Column__New_name_columnAssignment_3 )
            {
             before(grammarAccess.getColumnAccess().getNew_name_columnAssignment_3()); 
            // InternalMyDsl.g:2178:2: ( rule__Column__New_name_columnAssignment_3 )
            // InternalMyDsl.g:2178:3: rule__Column__New_name_columnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Column__New_name_columnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNew_name_columnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__RowFilter__Group__0"
    // InternalMyDsl.g:2187:1: rule__RowFilter__Group__0 : rule__RowFilter__Group__0__Impl rule__RowFilter__Group__1 ;
    public final void rule__RowFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__RowFilter__Group__0__Impl rule__RowFilter__Group__1 )
            // InternalMyDsl.g:2192:2: rule__RowFilter__Group__0__Impl rule__RowFilter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__RowFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__0"


    // $ANTLR start "rule__RowFilter__Group__0__Impl"
    // InternalMyDsl.g:2199:1: rule__RowFilter__Group__0__Impl : ( ( rule__RowFilter__Column_nameAssignment_0 ) ) ;
    public final void rule__RowFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( ( rule__RowFilter__Column_nameAssignment_0 ) ) )
            // InternalMyDsl.g:2204:1: ( ( rule__RowFilter__Column_nameAssignment_0 ) )
            {
            // InternalMyDsl.g:2204:1: ( ( rule__RowFilter__Column_nameAssignment_0 ) )
            // InternalMyDsl.g:2205:2: ( rule__RowFilter__Column_nameAssignment_0 )
            {
             before(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0()); 
            // InternalMyDsl.g:2206:2: ( rule__RowFilter__Column_nameAssignment_0 )
            // InternalMyDsl.g:2206:3: rule__RowFilter__Column_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RowFilter__Column_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__0__Impl"


    // $ANTLR start "rule__RowFilter__Group__1"
    // InternalMyDsl.g:2214:1: rule__RowFilter__Group__1 : rule__RowFilter__Group__1__Impl rule__RowFilter__Group__2 ;
    public final void rule__RowFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__RowFilter__Group__1__Impl rule__RowFilter__Group__2 )
            // InternalMyDsl.g:2219:2: rule__RowFilter__Group__1__Impl rule__RowFilter__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__RowFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__1"


    // $ANTLR start "rule__RowFilter__Group__1__Impl"
    // InternalMyDsl.g:2226:1: rule__RowFilter__Group__1__Impl : ( ( rule__RowFilter__OperatorAssignment_1 ) ) ;
    public final void rule__RowFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( ( ( rule__RowFilter__OperatorAssignment_1 ) ) )
            // InternalMyDsl.g:2231:1: ( ( rule__RowFilter__OperatorAssignment_1 ) )
            {
            // InternalMyDsl.g:2231:1: ( ( rule__RowFilter__OperatorAssignment_1 ) )
            // InternalMyDsl.g:2232:2: ( rule__RowFilter__OperatorAssignment_1 )
            {
             before(grammarAccess.getRowFilterAccess().getOperatorAssignment_1()); 
            // InternalMyDsl.g:2233:2: ( rule__RowFilter__OperatorAssignment_1 )
            // InternalMyDsl.g:2233:3: rule__RowFilter__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RowFilter__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRowFilterAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__1__Impl"


    // $ANTLR start "rule__RowFilter__Group__2"
    // InternalMyDsl.g:2241:1: rule__RowFilter__Group__2 : rule__RowFilter__Group__2__Impl rule__RowFilter__Group__3 ;
    public final void rule__RowFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__RowFilter__Group__2__Impl rule__RowFilter__Group__3 )
            // InternalMyDsl.g:2246:2: rule__RowFilter__Group__2__Impl rule__RowFilter__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__RowFilter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowFilter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__2"


    // $ANTLR start "rule__RowFilter__Group__2__Impl"
    // InternalMyDsl.g:2253:1: rule__RowFilter__Group__2__Impl : ( ( rule__RowFilter__String_valueAssignment_2 )? ) ;
    public final void rule__RowFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ( rule__RowFilter__String_valueAssignment_2 )? ) )
            // InternalMyDsl.g:2258:1: ( ( rule__RowFilter__String_valueAssignment_2 )? )
            {
            // InternalMyDsl.g:2258:1: ( ( rule__RowFilter__String_valueAssignment_2 )? )
            // InternalMyDsl.g:2259:2: ( rule__RowFilter__String_valueAssignment_2 )?
            {
             before(grammarAccess.getRowFilterAccess().getString_valueAssignment_2()); 
            // InternalMyDsl.g:2260:2: ( rule__RowFilter__String_valueAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2260:3: rule__RowFilter__String_valueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RowFilter__String_valueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowFilterAccess().getString_valueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__2__Impl"


    // $ANTLR start "rule__RowFilter__Group__3"
    // InternalMyDsl.g:2268:1: rule__RowFilter__Group__3 : rule__RowFilter__Group__3__Impl rule__RowFilter__Group__4 ;
    public final void rule__RowFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__RowFilter__Group__3__Impl rule__RowFilter__Group__4 )
            // InternalMyDsl.g:2273:2: rule__RowFilter__Group__3__Impl rule__RowFilter__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__RowFilter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RowFilter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__3"


    // $ANTLR start "rule__RowFilter__Group__3__Impl"
    // InternalMyDsl.g:2280:1: rule__RowFilter__Group__3__Impl : ( ( rule__RowFilter__Int_valueAssignment_3 )? ) ;
    public final void rule__RowFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( ( ( rule__RowFilter__Int_valueAssignment_3 )? ) )
            // InternalMyDsl.g:2285:1: ( ( rule__RowFilter__Int_valueAssignment_3 )? )
            {
            // InternalMyDsl.g:2285:1: ( ( rule__RowFilter__Int_valueAssignment_3 )? )
            // InternalMyDsl.g:2286:2: ( rule__RowFilter__Int_valueAssignment_3 )?
            {
             before(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3()); 
            // InternalMyDsl.g:2287:2: ( rule__RowFilter__Int_valueAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2287:3: rule__RowFilter__Int_valueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RowFilter__Int_valueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__3__Impl"


    // $ANTLR start "rule__RowFilter__Group__4"
    // InternalMyDsl.g:2295:1: rule__RowFilter__Group__4 : rule__RowFilter__Group__4__Impl ;
    public final void rule__RowFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__RowFilter__Group__4__Impl )
            // InternalMyDsl.g:2300:2: rule__RowFilter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RowFilter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__4"


    // $ANTLR start "rule__RowFilter__Group__4__Impl"
    // InternalMyDsl.g:2306:1: rule__RowFilter__Group__4__Impl : ( ';' ) ;
    public final void rule__RowFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( ';' ) )
            // InternalMyDsl.g:2311:1: ( ';' )
            {
            // InternalMyDsl.g:2311:1: ( ';' )
            // InternalMyDsl.g:2312:2: ';'
            {
             before(grammarAccess.getRowFilterAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRowFilterAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Group__4__Impl"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup"
    // InternalMyDsl.g:2322:1: rule__GraphDrawing__UnorderedGroup : rule__GraphDrawing__UnorderedGroup__0 {...}?;
    public final void rule__GraphDrawing__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__GraphDrawing__UnorderedGroup__0 {...}?)
            // InternalMyDsl.g:2328:2: rule__GraphDrawing__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup__Impl"
    // InternalMyDsl.g:2336:1: rule__GraphDrawing__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) ) ) ) ;
    public final void rule__GraphDrawing__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:2341:1: ( ( ({...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) ) ) ) )
            // InternalMyDsl.g:2342:3: ( ({...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) ) ) )
            {
            // InternalMyDsl.g:2342:3: ( ({...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) ) ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1) ) {
                alt17=2;
            }
            else if ( LA17_0 >= 34 && LA17_0 <= 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2343:3: ({...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2343:3: ({...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) ) )
                    // InternalMyDsl.g:2344:4: {...}? => ( ( ( rule__GraphDrawing__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:2344:106: ( ( ( rule__GraphDrawing__Group_0__0 ) ) )
                    // InternalMyDsl.g:2345:5: ( ( rule__GraphDrawing__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2351:5: ( ( rule__GraphDrawing__Group_0__0 ) )
                    // InternalMyDsl.g:2352:6: ( rule__GraphDrawing__Group_0__0 )
                    {
                     before(grammarAccess.getGraphDrawingAccess().getGroup_0()); 
                    // InternalMyDsl.g:2353:6: ( rule__GraphDrawing__Group_0__0 )
                    // InternalMyDsl.g:2353:7: rule__GraphDrawing__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGraphDrawingAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2358:3: ({...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2358:3: ({...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) ) )
                    // InternalMyDsl.g:2359:4: {...}? => ( ( ( rule__GraphDrawing__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:2359:106: ( ( ( rule__GraphDrawing__Group_1__0 ) ) )
                    // InternalMyDsl.g:2360:5: ( ( rule__GraphDrawing__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2366:5: ( ( rule__GraphDrawing__Group_1__0 ) )
                    // InternalMyDsl.g:2367:6: ( rule__GraphDrawing__Group_1__0 )
                    {
                     before(grammarAccess.getGraphDrawingAccess().getGroup_1()); 
                    // InternalMyDsl.g:2368:6: ( rule__GraphDrawing__Group_1__0 )
                    // InternalMyDsl.g:2368:7: rule__GraphDrawing__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGraphDrawingAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2373:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2373:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) ) )
                    // InternalMyDsl.g:2374:4: {...}? => ( ( ( rule__GraphDrawing__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalMyDsl.g:2374:106: ( ( ( rule__GraphDrawing__Group_2__0 ) ) )
                    // InternalMyDsl.g:2375:5: ( ( rule__GraphDrawing__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2381:5: ( ( rule__GraphDrawing__Group_2__0 ) )
                    // InternalMyDsl.g:2382:6: ( rule__GraphDrawing__Group_2__0 )
                    {
                     before(grammarAccess.getGraphDrawingAccess().getGroup_2()); 
                    // InternalMyDsl.g:2383:6: ( rule__GraphDrawing__Group_2__0 )
                    // InternalMyDsl.g:2383:7: rule__GraphDrawing__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGraphDrawingAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup__Impl"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup__0"
    // InternalMyDsl.g:2396:1: rule__GraphDrawing__UnorderedGroup__0 : rule__GraphDrawing__UnorderedGroup__Impl ( rule__GraphDrawing__UnorderedGroup__1 )? ;
    public final void rule__GraphDrawing__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( rule__GraphDrawing__UnorderedGroup__Impl ( rule__GraphDrawing__UnorderedGroup__1 )? )
            // InternalMyDsl.g:2401:2: rule__GraphDrawing__UnorderedGroup__Impl ( rule__GraphDrawing__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_10);
            rule__GraphDrawing__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:2402:2: ( rule__GraphDrawing__UnorderedGroup__1 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2402:2: rule__GraphDrawing__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup__0"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup__1"
    // InternalMyDsl.g:2408:1: rule__GraphDrawing__UnorderedGroup__1 : rule__GraphDrawing__UnorderedGroup__Impl ( rule__GraphDrawing__UnorderedGroup__2 )? ;
    public final void rule__GraphDrawing__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( rule__GraphDrawing__UnorderedGroup__Impl ( rule__GraphDrawing__UnorderedGroup__2 )? )
            // InternalMyDsl.g:2413:2: rule__GraphDrawing__UnorderedGroup__Impl ( rule__GraphDrawing__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_10);
            rule__GraphDrawing__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyDsl.g:2414:2: ( rule__GraphDrawing__UnorderedGroup__2 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2414:2: rule__GraphDrawing__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup__1"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup__2"
    // InternalMyDsl.g:2420:1: rule__GraphDrawing__UnorderedGroup__2 : rule__GraphDrawing__UnorderedGroup__Impl ;
    public final void rule__GraphDrawing__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2424:1: ( rule__GraphDrawing__UnorderedGroup__Impl )
            // InternalMyDsl.g:2425:2: rule__GraphDrawing__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup__2"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup_2_0"
    // InternalMyDsl.g:2432:1: rule__GraphDrawing__UnorderedGroup_2_0 : rule__GraphDrawing__UnorderedGroup_2_0__0 {...}?;
    public final void rule__GraphDrawing__UnorderedGroup_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
        	
        try {
            // InternalMyDsl.g:2437:1: ( rule__GraphDrawing__UnorderedGroup_2_0__0 {...}?)
            // InternalMyDsl.g:2438:2: rule__GraphDrawing__UnorderedGroup_2_0__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__UnorderedGroup_2_0__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {
                throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup_2_0", "getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup_2_0"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup_2_0__Impl"
    // InternalMyDsl.g:2446:1: rule__GraphDrawing__UnorderedGroup_2_0__Impl : ( ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) ) ) ) ;
    public final void rule__GraphDrawing__UnorderedGroup_2_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:2451:1: ( ( ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) ) ) ) )
            // InternalMyDsl.g:2452:3: ( ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) ) ) )
            {
            // InternalMyDsl.g:2452:3: ( ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) ) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2) ) {
                alt20=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2453:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2453:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) ) )
                    // InternalMyDsl.g:2454:4: {...}? => ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup_2_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0)");
                    }
                    // InternalMyDsl.g:2454:110: ( ( ( rule__GraphDrawing__Group_2_0_0__0 ) ) )
                    // InternalMyDsl.g:2455:5: ( ( rule__GraphDrawing__Group_2_0_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2461:5: ( ( rule__GraphDrawing__Group_2_0_0__0 ) )
                    // InternalMyDsl.g:2462:6: ( rule__GraphDrawing__Group_2_0_0__0 )
                    {
                     before(grammarAccess.getGraphDrawingAccess().getGroup_2_0_0()); 
                    // InternalMyDsl.g:2463:6: ( rule__GraphDrawing__Group_2_0_0__0 )
                    // InternalMyDsl.g:2463:7: rule__GraphDrawing__Group_2_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_2_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGraphDrawingAccess().getGroup_2_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2468:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2468:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) ) )
                    // InternalMyDsl.g:2469:4: {...}? => ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup_2_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1)");
                    }
                    // InternalMyDsl.g:2469:110: ( ( ( rule__GraphDrawing__Group_2_0_1__0 ) ) )
                    // InternalMyDsl.g:2470:5: ( ( rule__GraphDrawing__Group_2_0_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2476:5: ( ( rule__GraphDrawing__Group_2_0_1__0 ) )
                    // InternalMyDsl.g:2477:6: ( rule__GraphDrawing__Group_2_0_1__0 )
                    {
                     before(grammarAccess.getGraphDrawingAccess().getGroup_2_0_1()); 
                    // InternalMyDsl.g:2478:6: ( rule__GraphDrawing__Group_2_0_1__0 )
                    // InternalMyDsl.g:2478:7: rule__GraphDrawing__Group_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_2_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGraphDrawingAccess().getGroup_2_0_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2483:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) ) )
                    {
                    // InternalMyDsl.g:2483:3: ({...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) ) )
                    // InternalMyDsl.g:2484:4: {...}? => ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2) ) {
                        throw new FailedPredicateException(input, "rule__GraphDrawing__UnorderedGroup_2_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2)");
                    }
                    // InternalMyDsl.g:2484:110: ( ( ( rule__GraphDrawing__Group_2_0_2__0 ) ) )
                    // InternalMyDsl.g:2485:5: ( ( rule__GraphDrawing__Group_2_0_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyDsl.g:2491:5: ( ( rule__GraphDrawing__Group_2_0_2__0 ) )
                    // InternalMyDsl.g:2492:6: ( rule__GraphDrawing__Group_2_0_2__0 )
                    {
                     before(grammarAccess.getGraphDrawingAccess().getGroup_2_0_2()); 
                    // InternalMyDsl.g:2493:6: ( rule__GraphDrawing__Group_2_0_2__0 )
                    // InternalMyDsl.g:2493:7: rule__GraphDrawing__Group_2_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_2_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGraphDrawingAccess().getGroup_2_0_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup_2_0__Impl"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup_2_0__0"
    // InternalMyDsl.g:2506:1: rule__GraphDrawing__UnorderedGroup_2_0__0 : rule__GraphDrawing__UnorderedGroup_2_0__Impl ( rule__GraphDrawing__UnorderedGroup_2_0__1 )? ;
    public final void rule__GraphDrawing__UnorderedGroup_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2510:1: ( rule__GraphDrawing__UnorderedGroup_2_0__Impl ( rule__GraphDrawing__UnorderedGroup_2_0__1 )? )
            // InternalMyDsl.g:2511:2: rule__GraphDrawing__UnorderedGroup_2_0__Impl ( rule__GraphDrawing__UnorderedGroup_2_0__1 )?
            {
            pushFollow(FOLLOW_10);
            rule__GraphDrawing__UnorderedGroup_2_0__Impl();

            state._fsp--;

            // InternalMyDsl.g:2512:2: ( rule__GraphDrawing__UnorderedGroup_2_0__1 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2512:2: rule__GraphDrawing__UnorderedGroup_2_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__UnorderedGroup_2_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup_2_0__0"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup_2_0__1"
    // InternalMyDsl.g:2518:1: rule__GraphDrawing__UnorderedGroup_2_0__1 : rule__GraphDrawing__UnorderedGroup_2_0__Impl ( rule__GraphDrawing__UnorderedGroup_2_0__2 )? ;
    public final void rule__GraphDrawing__UnorderedGroup_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( rule__GraphDrawing__UnorderedGroup_2_0__Impl ( rule__GraphDrawing__UnorderedGroup_2_0__2 )? )
            // InternalMyDsl.g:2523:2: rule__GraphDrawing__UnorderedGroup_2_0__Impl ( rule__GraphDrawing__UnorderedGroup_2_0__2 )?
            {
            pushFollow(FOLLOW_10);
            rule__GraphDrawing__UnorderedGroup_2_0__Impl();

            state._fsp--;

            // InternalMyDsl.g:2524:2: ( rule__GraphDrawing__UnorderedGroup_2_0__2 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2524:2: rule__GraphDrawing__UnorderedGroup_2_0__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__UnorderedGroup_2_0__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup_2_0__1"


    // $ANTLR start "rule__GraphDrawing__UnorderedGroup_2_0__2"
    // InternalMyDsl.g:2530:1: rule__GraphDrawing__UnorderedGroup_2_0__2 : rule__GraphDrawing__UnorderedGroup_2_0__Impl ;
    public final void rule__GraphDrawing__UnorderedGroup_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__GraphDrawing__UnorderedGroup_2_0__Impl )
            // InternalMyDsl.g:2535:2: rule__GraphDrawing__UnorderedGroup_2_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__UnorderedGroup_2_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__UnorderedGroup_2_0__2"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalMyDsl.g:2542:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2547:2: ( ruleEString )
            {
            // InternalMyDsl.g:2547:2: ( ruleEString )
            // InternalMyDsl.g:2548:3: ruleEString
            {
             before(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__IdAssignment_5"
    // InternalMyDsl.g:2557:1: rule__Program__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__Program__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2562:2: ( ruleEString )
            {
            // InternalMyDsl.g:2562:2: ( ruleEString )
            // InternalMyDsl.g:2563:3: ruleEString
            {
             before(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__IdAssignment_5"


    // $ANTLR start "rule__Program__FunctionsAssignment_7"
    // InternalMyDsl.g:2572:1: rule__Program__FunctionsAssignment_7 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2576:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:2577:2: ( ruleFunction )
            {
            // InternalMyDsl.g:2577:2: ( ruleFunction )
            // InternalMyDsl.g:2578:3: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FunctionsAssignment_7"


    // $ANTLR start "rule__Program__FunctionsAssignment_8"
    // InternalMyDsl.g:2587:1: rule__Program__FunctionsAssignment_8 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2591:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:2592:2: ( ruleFunction )
            {
            // InternalMyDsl.g:2592:2: ( ruleFunction )
            // InternalMyDsl.g:2593:3: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FunctionsAssignment_8"


    // $ANTLR start "rule__CsvLoader__PathAssignment_2"
    // InternalMyDsl.g:2602:1: rule__CsvLoader__PathAssignment_2 : ( ruleEString ) ;
    public final void rule__CsvLoader__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2607:2: ( ruleEString )
            {
            // InternalMyDsl.g:2607:2: ( ruleEString )
            // InternalMyDsl.g:2608:3: ruleEString
            {
             before(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__PathAssignment_2"


    // $ANTLR start "rule__DataFiltering__Column_filterAssignment_1"
    // InternalMyDsl.g:2617:1: rule__DataFiltering__Column_filterAssignment_1 : ( ruleColumn ) ;
    public final void rule__DataFiltering__Column_filterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:2622:2: ( ruleColumn )
            {
            // InternalMyDsl.g:2622:2: ( ruleColumn )
            // InternalMyDsl.g:2623:3: ruleColumn
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Column_filterAssignment_1"


    // $ANTLR start "rule__DataFiltering__Column_filterAssignment_2_1"
    // InternalMyDsl.g:2632:1: rule__DataFiltering__Column_filterAssignment_2_1 : ( ruleColumn ) ;
    public final void rule__DataFiltering__Column_filterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:2637:2: ( ruleColumn )
            {
            // InternalMyDsl.g:2637:2: ( ruleColumn )
            // InternalMyDsl.g:2638:3: ruleColumn
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Column_filterAssignment_2_1"


    // $ANTLR start "rule__DataFiltering__Rowfilter_conditionAssignment_5"
    // InternalMyDsl.g:2647:1: rule__DataFiltering__Rowfilter_conditionAssignment_5 : ( ruleRowFilter ) ;
    public final void rule__DataFiltering__Rowfilter_conditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( ruleRowFilter ) )
            // InternalMyDsl.g:2652:2: ( ruleRowFilter )
            {
            // InternalMyDsl.g:2652:2: ( ruleRowFilter )
            // InternalMyDsl.g:2653:3: ruleRowFilter
            {
             before(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRowFilter();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Rowfilter_conditionAssignment_5"


    // $ANTLR start "rule__GraphDrawing__Graph_typeAssignment_0_3"
    // InternalMyDsl.g:2662:1: rule__GraphDrawing__Graph_typeAssignment_0_3 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Graph_typeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2666:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2667:2: ( ruleEString )
            {
            // InternalMyDsl.g:2667:2: ( ruleEString )
            // InternalMyDsl.g:2668:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Graph_typeAssignment_0_3"


    // $ANTLR start "rule__GraphDrawing__Abs_columnAssignment_1_2"
    // InternalMyDsl.g:2677:1: rule__GraphDrawing__Abs_columnAssignment_1_2 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Abs_columnAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2682:2: ( ruleEString )
            {
            // InternalMyDsl.g:2682:2: ( ruleEString )
            // InternalMyDsl.g:2683:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Abs_columnAssignment_1_2"


    // $ANTLR start "rule__GraphDrawing__Ord_columnAssignment_2_0_0_2"
    // InternalMyDsl.g:2692:1: rule__GraphDrawing__Ord_columnAssignment_2_0_0_2 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Ord_columnAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2697:2: ( ruleEString )
            {
            // InternalMyDsl.g:2697:2: ( ruleEString )
            // InternalMyDsl.g:2698:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_2_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_2_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Ord_columnAssignment_2_0_0_2"


    // $ANTLR start "rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1"
    // InternalMyDsl.g:2707:1: rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2711:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2712:2: ( ruleEString )
            {
            // InternalMyDsl.g:2712:2: ( ruleEString )
            // InternalMyDsl.g:2713:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_2_0_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_2_0_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Ord_columnAssignment_2_0_0_3_1"


    // $ANTLR start "rule__GraphDrawing__LabelAssignment_2_0_1_2"
    // InternalMyDsl.g:2722:1: rule__GraphDrawing__LabelAssignment_2_0_1_2 : ( ruleEString ) ;
    public final void rule__GraphDrawing__LabelAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2726:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2727:2: ( ruleEString )
            {
            // InternalMyDsl.g:2727:2: ( ruleEString )
            // InternalMyDsl.g:2728:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_2_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_2_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__LabelAssignment_2_0_1_2"


    // $ANTLR start "rule__GraphDrawing__LabelAssignment_2_0_1_3_1"
    // InternalMyDsl.g:2737:1: rule__GraphDrawing__LabelAssignment_2_0_1_3_1 : ( ruleEString ) ;
    public final void rule__GraphDrawing__LabelAssignment_2_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2741:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2742:2: ( ruleEString )
            {
            // InternalMyDsl.g:2742:2: ( ruleEString )
            // InternalMyDsl.g:2743:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_2_0_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_2_0_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__LabelAssignment_2_0_1_3_1"


    // $ANTLR start "rule__GraphDrawing__FillAssignment_2_0_2_2"
    // InternalMyDsl.g:2752:1: rule__GraphDrawing__FillAssignment_2_0_2_2 : ( ruleEBoolean ) ;
    public final void rule__GraphDrawing__FillAssignment_2_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:2757:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:2757:2: ( ruleEBoolean )
            // InternalMyDsl.g:2758:3: ruleEBoolean
            {
             before(grammarAccess.getGraphDrawingAccess().getFillEBooleanParserRuleCall_2_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getFillEBooleanParserRuleCall_2_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__FillAssignment_2_0_2_2"


    // $ANTLR start "rule__GraphDrawing__FillAssignment_2_0_2_3_1"
    // InternalMyDsl.g:2767:1: rule__GraphDrawing__FillAssignment_2_0_2_3_1 : ( ruleEBoolean ) ;
    public final void rule__GraphDrawing__FillAssignment_2_0_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:2772:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:2772:2: ( ruleEBoolean )
            // InternalMyDsl.g:2773:3: ruleEBoolean
            {
             before(grammarAccess.getGraphDrawingAccess().getFillEBooleanParserRuleCall_2_0_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getFillEBooleanParserRuleCall_2_0_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__FillAssignment_2_0_2_3_1"


    // $ANTLR start "rule__GraphDrawing__TitleAssignment_2_1_2"
    // InternalMyDsl.g:2782:1: rule__GraphDrawing__TitleAssignment_2_1_2 : ( ruleEString ) ;
    public final void rule__GraphDrawing__TitleAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2787:2: ( ruleEString )
            {
            // InternalMyDsl.g:2787:2: ( ruleEString )
            // InternalMyDsl.g:2788:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getTitleEStringParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getTitleEStringParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__TitleAssignment_2_1_2"


    // $ANTLR start "rule__Column__IndexAssignment_1"
    // InternalMyDsl.g:2797:1: rule__Column__IndexAssignment_1 : ( ruleEInt ) ;
    public final void rule__Column__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2801:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2802:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2802:2: ( ruleEInt )
            // InternalMyDsl.g:2803:3: ruleEInt
            {
             before(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__IndexAssignment_1"


    // $ANTLR start "rule__Column__New_name_columnAssignment_3"
    // InternalMyDsl.g:2812:1: rule__Column__New_name_columnAssignment_3 : ( ruleEString ) ;
    public final void rule__Column__New_name_columnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2817:2: ( ruleEString )
            {
            // InternalMyDsl.g:2817:2: ( ruleEString )
            // InternalMyDsl.g:2818:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__New_name_columnAssignment_3"


    // $ANTLR start "rule__RowFilter__Column_nameAssignment_0"
    // InternalMyDsl.g:2827:1: rule__RowFilter__Column_nameAssignment_0 : ( ruleEString ) ;
    public final void rule__RowFilter__Column_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2832:2: ( ruleEString )
            {
            // InternalMyDsl.g:2832:2: ( ruleEString )
            // InternalMyDsl.g:2833:3: ruleEString
            {
             before(grammarAccess.getRowFilterAccess().getColumn_nameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRowFilterAccess().getColumn_nameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Column_nameAssignment_0"


    // $ANTLR start "rule__RowFilter__OperatorAssignment_1"
    // InternalMyDsl.g:2842:1: rule__RowFilter__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__RowFilter__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( ( ruleOperator ) )
            // InternalMyDsl.g:2847:2: ( ruleOperator )
            {
            // InternalMyDsl.g:2847:2: ( ruleOperator )
            // InternalMyDsl.g:2848:3: ruleOperator
            {
             before(grammarAccess.getRowFilterAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getRowFilterAccess().getOperatorOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__OperatorAssignment_1"


    // $ANTLR start "rule__RowFilter__String_valueAssignment_2"
    // InternalMyDsl.g:2857:1: rule__RowFilter__String_valueAssignment_2 : ( ruleEString ) ;
    public final void rule__RowFilter__String_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2862:2: ( ruleEString )
            {
            // InternalMyDsl.g:2862:2: ( ruleEString )
            // InternalMyDsl.g:2863:3: ruleEString
            {
             before(grammarAccess.getRowFilterAccess().getString_valueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRowFilterAccess().getString_valueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__String_valueAssignment_2"


    // $ANTLR start "rule__RowFilter__Int_valueAssignment_3"
    // InternalMyDsl.g:2872:1: rule__RowFilter__Int_valueAssignment_3 : ( ruleEInt ) ;
    public final void rule__RowFilter__Int_valueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2877:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2877:2: ( ruleEInt )
            // InternalMyDsl.g:2878:3: ruleEInt
            {
             before(grammarAccess.getRowFilterAccess().getInt_valueEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRowFilterAccess().getInt_valueEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowFilter__Int_valueAssignment_3"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\46\uffff";
    static final String dfa_2s = "\1\6\45\uffff";
    static final String dfa_3s = "\1\30\1\40\4\26\1\uffff\1\26\3\4\1\13\1\4\12\27\1\0\1\4\1\0\1\4\1\0\1\13\2\0\1\uffff\6\27";
    static final String dfa_4s = "\1\44\1\40\4\26\1\uffff\1\26\3\5\1\14\1\5\2\27\6\36\2\27\1\0\1\5\1\0\1\5\1\0\1\14\2\0\1\uffff\6\36";
    static final String dfa_5s = "\6\uffff\1\2\30\uffff\1\1\6\uffff";
    static final String dfa_6s = "\27\uffff\1\2\1\uffff\1\4\1\uffff\1\3\1\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
            "\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27",
            "\1\27",
            "\1\31\6\uffff\1\30",
            "\1\31\6\uffff\1\30",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\32",
            "\1\35\6\uffff\1\34",
            "\1\35\6\uffff\1\34",
            "\1\36",
            "\1\36",
            "\1\uffff",
            "\1\40\1\41",
            "\1\uffff",
            "\1\42\1\43",
            "\1\uffff",
            "\1\44\1\45",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\31\6\uffff\1\30",
            "\1\31\6\uffff\1\30",
            "\1\33\6\uffff\1\32",
            "\1\33\6\uffff\1\32",
            "\1\35\6\uffff\1\34",
            "\1\35\6\uffff\1\34"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2402:2: ( rule__GraphDrawing__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_30 = input.LA(1);

                         
                        int index18_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index18_30);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_29 = input.LA(1);

                         
                        int index18_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index18_29);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_23 = input.LA(1);

                         
                        int index18_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index18_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_27 = input.LA(1);

                         
                        int index18_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index18_27);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_25 = input.LA(1);

                         
                        int index18_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index18_25);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\27\uffff\1\3\1\uffff\1\1\1\uffff\1\4\1\uffff\1\2\1\0\7\uffff}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2414:2: ( rule__GraphDrawing__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_30 = input.LA(1);

                         
                        int index19_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index19_30);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_25 = input.LA(1);

                         
                        int index19_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index19_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_29 = input.LA(1);

                         
                        int index19_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index19_29);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_23 = input.LA(1);

                         
                        int index19_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index19_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_27 = input.LA(1);

                         
                        int index19_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 31;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index19_27);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_9s = "\33\uffff";
    static final String dfa_10s = "\1\4\32\uffff";
    static final String dfa_11s = "\1\30\3\26\1\uffff\2\4\1\13\6\27\1\4\1\0\1\4\1\0\1\13\1\0\2\27\1\uffff\4\27";
    static final String dfa_12s = "\1\45\3\26\1\uffff\2\5\1\14\6\36\1\5\1\0\1\5\1\0\1\14\1\0\2\36\1\uffff\4\36";
    static final String dfa_13s = "\4\uffff\1\2\21\uffff\1\1\4\uffff";
    static final String dfa_14s = "\17\uffff\1\1\1\uffff\1\2\1\uffff\1\0\7\uffff}>";
    static final String[] dfa_15s = {
            "\1\4\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\1\1\2\1\3\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\10\1\11",
            "\1\12\1\13",
            "\1\14\1\15",
            "\1\17\6\uffff\1\16",
            "\1\17\6\uffff\1\16",
            "\1\21\6\uffff\1\20",
            "\1\21\6\uffff\1\20",
            "\1\23\6\uffff\1\22",
            "\1\23\6\uffff\1\22",
            "\1\24\1\25",
            "\1\uffff",
            "\1\27\1\30",
            "\1\uffff",
            "\1\31\1\32",
            "\1\uffff",
            "\1\17\6\uffff\1\16",
            "\1\17\6\uffff\1\16",
            "",
            "\1\21\6\uffff\1\20",
            "\1\21\6\uffff\1\20",
            "\1\23\6\uffff\1\22",
            "\1\23\6\uffff\1\22"
    };

    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_9;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "2512:2: ( rule__GraphDrawing__UnorderedGroup_2_0__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_19 = input.LA(1);

                         
                        int index21_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {s = 4;}

                         
                        input.seek(index21_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_15 = input.LA(1);

                         
                        int index21_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {s = 4;}

                         
                        input.seek(index21_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_17 = input.LA(1);

                         
                        int index21_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {s = 4;}

                         
                        input.seek(index21_17);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_9;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_13;
            this.special = dfa_14;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "2524:2: ( rule__GraphDrawing__UnorderedGroup_2_0__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_19 = input.LA(1);

                         
                        int index22_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {s = 4;}

                         
                        input.seek(index22_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {s = 4;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_17 = input.LA(1);

                         
                        int index22_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1) ) {s = 22;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {s = 4;}

                         
                        input.seek(index22_17);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001E94000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001E95000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001E94000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002800070L});

}
