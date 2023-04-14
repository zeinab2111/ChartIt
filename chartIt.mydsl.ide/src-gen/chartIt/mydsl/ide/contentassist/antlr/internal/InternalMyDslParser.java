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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'=='", "'Program'", "'{'", "'id='", "';'", "'}'", "'-'", "'uses :'", "'filter :'", "'condition :'", "','", "'Draw a plot :'", "'abs_column='", "'ord_column='", "'labels='", "'graph_type='", "'column'", "'as'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
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


    // $ANTLR start "entryRuleCsvLoader"
    // InternalMyDsl.g:153:1: entryRuleCsvLoader : ruleCsvLoader EOF ;
    public final void entryRuleCsvLoader() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCsvLoader EOF )
            // InternalMyDsl.g:155:1: ruleCsvLoader EOF
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
    // InternalMyDsl.g:162:1: ruleCsvLoader : ( ( rule__CsvLoader__Group__0 ) ) ;
    public final void ruleCsvLoader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__CsvLoader__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__CsvLoader__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__CsvLoader__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__CsvLoader__Group__0 )
            {
             before(grammarAccess.getCsvLoaderAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__CsvLoader__Group__0 )
            // InternalMyDsl.g:169:4: rule__CsvLoader__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleDataFiltering : ruleDataFiltering EOF ;
    public final void entryRuleDataFiltering() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDataFiltering EOF )
            // InternalMyDsl.g:180:1: ruleDataFiltering EOF
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
    // InternalMyDsl.g:187:1: ruleDataFiltering : ( ( rule__DataFiltering__Group__0 ) ) ;
    public final void ruleDataFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__DataFiltering__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__DataFiltering__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__DataFiltering__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__DataFiltering__Group__0 )
            {
             before(grammarAccess.getDataFilteringAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__DataFiltering__Group__0 )
            // InternalMyDsl.g:194:4: rule__DataFiltering__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleGraphDrawing : ruleGraphDrawing EOF ;
    public final void entryRuleGraphDrawing() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleGraphDrawing EOF )
            // InternalMyDsl.g:205:1: ruleGraphDrawing EOF
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
    // InternalMyDsl.g:212:1: ruleGraphDrawing : ( ( rule__GraphDrawing__Group__0 ) ) ;
    public final void ruleGraphDrawing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__GraphDrawing__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__GraphDrawing__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__GraphDrawing__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__GraphDrawing__Group__0 )
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__GraphDrawing__Group__0 )
            // InternalMyDsl.g:219:4: rule__GraphDrawing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getGroup()); 

            }


            }

        }
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
    // InternalMyDsl.g:228:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleColumn EOF )
            // InternalMyDsl.g:230:1: ruleColumn EOF
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
    // InternalMyDsl.g:237:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Column__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Column__Group__0 )
            // InternalMyDsl.g:244:4: rule__Column__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleRowFilter : ruleRowFilter EOF ;
    public final void entryRuleRowFilter() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleRowFilter EOF )
            // InternalMyDsl.g:255:1: ruleRowFilter EOF
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
    // InternalMyDsl.g:262:1: ruleRowFilter : ( ( rule__RowFilter__Group__0 ) ) ;
    public final void ruleRowFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__RowFilter__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__RowFilter__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__RowFilter__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__RowFilter__Group__0 )
            {
             before(grammarAccess.getRowFilterAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__RowFilter__Group__0 )
            // InternalMyDsl.g:269:4: rule__RowFilter__Group__0
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
    // InternalMyDsl.g:278:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:282:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMyDsl.g:283:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMyDsl.g:283:2: ( ( rule__Operator__Alternatives ) )
            // InternalMyDsl.g:284:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:285:3: ( rule__Operator__Alternatives )
            // InternalMyDsl.g:285:4: rule__Operator__Alternatives
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
    // InternalMyDsl.g:293:1: rule__Function__Alternatives : ( ( ruleCsvLoader ) | ( ruleDataFiltering ) | ( ruleGraphDrawing ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ruleCsvLoader ) | ( ruleDataFiltering ) | ( ruleGraphDrawing ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 24:
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
                    // InternalMyDsl.g:298:2: ( ruleCsvLoader )
                    {
                    // InternalMyDsl.g:298:2: ( ruleCsvLoader )
                    // InternalMyDsl.g:299:3: ruleCsvLoader
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
                    // InternalMyDsl.g:304:2: ( ruleDataFiltering )
                    {
                    // InternalMyDsl.g:304:2: ( ruleDataFiltering )
                    // InternalMyDsl.g:305:3: ruleDataFiltering
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
                    // InternalMyDsl.g:310:2: ( ruleGraphDrawing )
                    {
                    // InternalMyDsl.g:310:2: ( ruleGraphDrawing )
                    // InternalMyDsl.g:311:3: ruleGraphDrawing
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
    // InternalMyDsl.g:320:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:324:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:325:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:325:2: ( RULE_STRING )
                    // InternalMyDsl.g:326:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:331:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:331:2: ( RULE_ID )
                    // InternalMyDsl.g:332:3: RULE_ID
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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMyDsl.g:341:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:346:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:346:2: ( ( '>' ) )
                    // InternalMyDsl.g:347:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:348:3: ( '>' )
                    // InternalMyDsl.g:348:4: '>'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:352:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:352:2: ( ( '<' ) )
                    // InternalMyDsl.g:353:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:354:3: ( '<' )
                    // InternalMyDsl.g:354:4: '<'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:358:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:358:2: ( ( '==' ) )
                    // InternalMyDsl.g:359:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:360:3: ( '==' )
                    // InternalMyDsl.g:360:4: '=='
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2()); 

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
    // InternalMyDsl.g:368:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:373:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalMyDsl.g:380:1: rule__Program__Group__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:384:1: ( ( 'Program' ) )
            // InternalMyDsl.g:385:1: ( 'Program' )
            {
            // InternalMyDsl.g:385:1: ( 'Program' )
            // InternalMyDsl.g:386:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:395:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMyDsl.g:400:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalMyDsl.g:407:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalMyDsl.g:412:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:412:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalMyDsl.g:413:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:414:2: ( rule__Program__NameAssignment_1 )
            // InternalMyDsl.g:414:3: rule__Program__NameAssignment_1
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
    // InternalMyDsl.g:422:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMyDsl.g:427:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalMyDsl.g:434:1: rule__Program__Group__2__Impl : ( '{' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( '{' ) )
            // InternalMyDsl.g:439:1: ( '{' )
            {
            // InternalMyDsl.g:439:1: ( '{' )
            // InternalMyDsl.g:440:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:449:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalMyDsl.g:454:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:461:1: rule__Program__Group__3__Impl : ( 'id=' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( 'id=' ) )
            // InternalMyDsl.g:466:1: ( 'id=' )
            {
            // InternalMyDsl.g:466:1: ( 'id=' )
            // InternalMyDsl.g:467:2: 'id='
            {
             before(grammarAccess.getProgramAccess().getIdKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:476:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // InternalMyDsl.g:481:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:488:1: rule__Program__Group__4__Impl : ( ( rule__Program__IdAssignment_4 ) ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( ( rule__Program__IdAssignment_4 ) ) )
            // InternalMyDsl.g:493:1: ( ( rule__Program__IdAssignment_4 ) )
            {
            // InternalMyDsl.g:493:1: ( ( rule__Program__IdAssignment_4 ) )
            // InternalMyDsl.g:494:2: ( rule__Program__IdAssignment_4 )
            {
             before(grammarAccess.getProgramAccess().getIdAssignment_4()); 
            // InternalMyDsl.g:495:2: ( rule__Program__IdAssignment_4 )
            // InternalMyDsl.g:495:3: rule__Program__IdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Program__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getIdAssignment_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:503:1: rule__Program__Group__5 : rule__Program__Group__5__Impl rule__Program__Group__6 ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Program__Group__5__Impl rule__Program__Group__6 )
            // InternalMyDsl.g:508:2: rule__Program__Group__5__Impl rule__Program__Group__6
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
    // InternalMyDsl.g:515:1: rule__Program__Group__5__Impl : ( ';' ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( ( ';' ) )
            // InternalMyDsl.g:520:1: ( ';' )
            {
            // InternalMyDsl.g:520:1: ( ';' )
            // InternalMyDsl.g:521:2: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:530:1: rule__Program__Group__6 : rule__Program__Group__6__Impl rule__Program__Group__7 ;
    public final void rule__Program__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Program__Group__6__Impl rule__Program__Group__7 )
            // InternalMyDsl.g:535:2: rule__Program__Group__6__Impl rule__Program__Group__7
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
    // InternalMyDsl.g:542:1: rule__Program__Group__6__Impl : ( ( rule__Program__FunctionsAssignment_6 ) ) ;
    public final void rule__Program__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( ( rule__Program__FunctionsAssignment_6 ) ) )
            // InternalMyDsl.g:547:1: ( ( rule__Program__FunctionsAssignment_6 ) )
            {
            // InternalMyDsl.g:547:1: ( ( rule__Program__FunctionsAssignment_6 ) )
            // InternalMyDsl.g:548:2: ( rule__Program__FunctionsAssignment_6 )
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_6()); 
            // InternalMyDsl.g:549:2: ( rule__Program__FunctionsAssignment_6 )
            // InternalMyDsl.g:549:3: rule__Program__FunctionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Program__FunctionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getFunctionsAssignment_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:557:1: rule__Program__Group__7 : rule__Program__Group__7__Impl rule__Program__Group__8 ;
    public final void rule__Program__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( rule__Program__Group__7__Impl rule__Program__Group__8 )
            // InternalMyDsl.g:562:2: rule__Program__Group__7__Impl rule__Program__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:569:1: rule__Program__Group__7__Impl : ( ( rule__Program__FunctionsAssignment_7 )* ) ;
    public final void rule__Program__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( ( ( rule__Program__FunctionsAssignment_7 )* ) )
            // InternalMyDsl.g:574:1: ( ( rule__Program__FunctionsAssignment_7 )* )
            {
            // InternalMyDsl.g:574:1: ( ( rule__Program__FunctionsAssignment_7 )* )
            // InternalMyDsl.g:575:2: ( rule__Program__FunctionsAssignment_7 )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment_7()); 
            // InternalMyDsl.g:576:2: ( rule__Program__FunctionsAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=21)||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:576:3: rule__Program__FunctionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__FunctionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

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
    // InternalMyDsl.g:584:1: rule__Program__Group__8 : rule__Program__Group__8__Impl ;
    public final void rule__Program__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( rule__Program__Group__8__Impl )
            // InternalMyDsl.g:589:2: rule__Program__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__8__Impl();

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
    // InternalMyDsl.g:595:1: rule__Program__Group__8__Impl : ( '}' ) ;
    public final void rule__Program__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( ( '}' ) )
            // InternalMyDsl.g:600:1: ( '}' )
            {
            // InternalMyDsl.g:600:1: ( '}' )
            // InternalMyDsl.g:601:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:611:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:616:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:623:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:627:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:628:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:628:1: ( ( '-' )? )
            // InternalMyDsl.g:629:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:630:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:630:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:638:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:643:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:649:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:654:1: ( RULE_INT )
            {
            // InternalMyDsl.g:654:1: ( RULE_INT )
            // InternalMyDsl.g:655:2: RULE_INT
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
    // InternalMyDsl.g:665:1: rule__CsvLoader__Group__0 : rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1 ;
    public final void rule__CsvLoader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1 )
            // InternalMyDsl.g:670:2: rule__CsvLoader__Group__0__Impl rule__CsvLoader__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:677:1: rule__CsvLoader__Group__0__Impl : ( 'uses :' ) ;
    public final void rule__CsvLoader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( 'uses :' ) )
            // InternalMyDsl.g:682:1: ( 'uses :' )
            {
            // InternalMyDsl.g:682:1: ( 'uses :' )
            // InternalMyDsl.g:683:2: 'uses :'
            {
             before(grammarAccess.getCsvLoaderAccess().getUsesKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:692:1: rule__CsvLoader__Group__1 : rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2 ;
    public final void rule__CsvLoader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2 )
            // InternalMyDsl.g:697:2: rule__CsvLoader__Group__1__Impl rule__CsvLoader__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:704:1: rule__CsvLoader__Group__1__Impl : ( ( rule__CsvLoader__PathAssignment_1 ) ) ;
    public final void rule__CsvLoader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( ( ( rule__CsvLoader__PathAssignment_1 ) ) )
            // InternalMyDsl.g:709:1: ( ( rule__CsvLoader__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:709:1: ( ( rule__CsvLoader__PathAssignment_1 ) )
            // InternalMyDsl.g:710:2: ( rule__CsvLoader__PathAssignment_1 )
            {
             before(grammarAccess.getCsvLoaderAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:711:2: ( rule__CsvLoader__PathAssignment_1 )
            // InternalMyDsl.g:711:3: rule__CsvLoader__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvLoaderAccess().getPathAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:719:1: rule__CsvLoader__Group__2 : rule__CsvLoader__Group__2__Impl ;
    public final void rule__CsvLoader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( rule__CsvLoader__Group__2__Impl )
            // InternalMyDsl.g:724:2: rule__CsvLoader__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvLoader__Group__2__Impl();

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
    // InternalMyDsl.g:730:1: rule__CsvLoader__Group__2__Impl : ( ';' ) ;
    public final void rule__CsvLoader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( ';' ) )
            // InternalMyDsl.g:735:1: ( ';' )
            {
            // InternalMyDsl.g:735:1: ( ';' )
            // InternalMyDsl.g:736:2: ';'
            {
             before(grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataFiltering__Group__0"
    // InternalMyDsl.g:746:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalMyDsl.g:751:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:758:1: rule__DataFiltering__Group__0__Impl : ( 'filter :' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( ( 'filter :' ) )
            // InternalMyDsl.g:763:1: ( 'filter :' )
            {
            // InternalMyDsl.g:763:1: ( 'filter :' )
            // InternalMyDsl.g:764:2: 'filter :'
            {
             before(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:773:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalMyDsl.g:778:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:785:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__Group_1__0 )? ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:789:1: ( ( ( rule__DataFiltering__Group_1__0 )? ) )
            // InternalMyDsl.g:790:1: ( ( rule__DataFiltering__Group_1__0 )? )
            {
            // InternalMyDsl.g:790:1: ( ( rule__DataFiltering__Group_1__0 )? )
            // InternalMyDsl.g:791:2: ( rule__DataFiltering__Group_1__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_1()); 
            // InternalMyDsl.g:792:2: ( rule__DataFiltering__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:792:3: rule__DataFiltering__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:800:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalMyDsl.g:805:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:812:1: rule__DataFiltering__Group__2__Impl : ( ';' ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:1: ( ( ';' ) )
            // InternalMyDsl.g:817:1: ( ';' )
            {
            // InternalMyDsl.g:817:1: ( ';' )
            // InternalMyDsl.g:818:2: ';'
            {
             before(grammarAccess.getDataFilteringAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:827:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4 ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4 )
            // InternalMyDsl.g:832:2: rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:839:1: rule__DataFiltering__Group__3__Impl : ( 'condition :' ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( ( 'condition :' ) )
            // InternalMyDsl.g:844:1: ( 'condition :' )
            {
            // InternalMyDsl.g:844:1: ( 'condition :' )
            // InternalMyDsl.g:845:2: 'condition :'
            {
             before(grammarAccess.getDataFilteringAccess().getConditionKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getConditionKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:854:1: rule__DataFiltering__Group__4 : rule__DataFiltering__Group__4__Impl ;
    public final void rule__DataFiltering__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( rule__DataFiltering__Group__4__Impl )
            // InternalMyDsl.g:859:2: rule__DataFiltering__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__4__Impl();

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
    // InternalMyDsl.g:865:1: rule__DataFiltering__Group__4__Impl : ( ( rule__DataFiltering__Rowfilter_conditionAssignment_4 )? ) ;
    public final void rule__DataFiltering__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( ( rule__DataFiltering__Rowfilter_conditionAssignment_4 )? ) )
            // InternalMyDsl.g:870:1: ( ( rule__DataFiltering__Rowfilter_conditionAssignment_4 )? )
            {
            // InternalMyDsl.g:870:1: ( ( rule__DataFiltering__Rowfilter_conditionAssignment_4 )? )
            // InternalMyDsl.g:871:2: ( rule__DataFiltering__Rowfilter_conditionAssignment_4 )?
            {
             before(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_4()); 
            // InternalMyDsl.g:872:2: ( rule__DataFiltering__Rowfilter_conditionAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:872:3: rule__DataFiltering__Rowfilter_conditionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Rowfilter_conditionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getRowfilter_conditionAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataFiltering__Group_1__0"
    // InternalMyDsl.g:881:1: rule__DataFiltering__Group_1__0 : rule__DataFiltering__Group_1__0__Impl rule__DataFiltering__Group_1__1 ;
    public final void rule__DataFiltering__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( rule__DataFiltering__Group_1__0__Impl rule__DataFiltering__Group_1__1 )
            // InternalMyDsl.g:886:2: rule__DataFiltering__Group_1__0__Impl rule__DataFiltering__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DataFiltering__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_1__1();

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
    // $ANTLR end "rule__DataFiltering__Group_1__0"


    // $ANTLR start "rule__DataFiltering__Group_1__0__Impl"
    // InternalMyDsl.g:893:1: rule__DataFiltering__Group_1__0__Impl : ( ( rule__DataFiltering__Column_filterAssignment_1_0 ) ) ;
    public final void rule__DataFiltering__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:897:1: ( ( ( rule__DataFiltering__Column_filterAssignment_1_0 ) ) )
            // InternalMyDsl.g:898:1: ( ( rule__DataFiltering__Column_filterAssignment_1_0 ) )
            {
            // InternalMyDsl.g:898:1: ( ( rule__DataFiltering__Column_filterAssignment_1_0 ) )
            // InternalMyDsl.g:899:2: ( rule__DataFiltering__Column_filterAssignment_1_0 )
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1_0()); 
            // InternalMyDsl.g:900:2: ( rule__DataFiltering__Column_filterAssignment_1_0 )
            // InternalMyDsl.g:900:3: rule__DataFiltering__Column_filterAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Column_filterAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_1__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_1__1"
    // InternalMyDsl.g:908:1: rule__DataFiltering__Group_1__1 : rule__DataFiltering__Group_1__1__Impl ;
    public final void rule__DataFiltering__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( rule__DataFiltering__Group_1__1__Impl )
            // InternalMyDsl.g:913:2: rule__DataFiltering__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_1__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_1__1"


    // $ANTLR start "rule__DataFiltering__Group_1__1__Impl"
    // InternalMyDsl.g:919:1: rule__DataFiltering__Group_1__1__Impl : ( ( rule__DataFiltering__Group_1_1__0 )* ) ;
    public final void rule__DataFiltering__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( ( ( rule__DataFiltering__Group_1_1__0 )* ) )
            // InternalMyDsl.g:924:1: ( ( rule__DataFiltering__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:924:1: ( ( rule__DataFiltering__Group_1_1__0 )* )
            // InternalMyDsl.g:925:2: ( rule__DataFiltering__Group_1_1__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_1_1()); 
            // InternalMyDsl.g:926:2: ( rule__DataFiltering__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:926:3: rule__DataFiltering__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DataFiltering__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_1__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_1_1__0"
    // InternalMyDsl.g:935:1: rule__DataFiltering__Group_1_1__0 : rule__DataFiltering__Group_1_1__0__Impl rule__DataFiltering__Group_1_1__1 ;
    public final void rule__DataFiltering__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( rule__DataFiltering__Group_1_1__0__Impl rule__DataFiltering__Group_1_1__1 )
            // InternalMyDsl.g:940:2: rule__DataFiltering__Group_1_1__0__Impl rule__DataFiltering__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__DataFiltering__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_1_1__1();

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
    // $ANTLR end "rule__DataFiltering__Group_1_1__0"


    // $ANTLR start "rule__DataFiltering__Group_1_1__0__Impl"
    // InternalMyDsl.g:947:1: rule__DataFiltering__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( ',' ) )
            // InternalMyDsl.g:952:1: ( ',' )
            {
            // InternalMyDsl.g:952:1: ( ',' )
            // InternalMyDsl.g:953:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_1_1__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_1_1__1"
    // InternalMyDsl.g:962:1: rule__DataFiltering__Group_1_1__1 : rule__DataFiltering__Group_1_1__1__Impl ;
    public final void rule__DataFiltering__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( rule__DataFiltering__Group_1_1__1__Impl )
            // InternalMyDsl.g:967:2: rule__DataFiltering__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_1_1__1"


    // $ANTLR start "rule__DataFiltering__Group_1_1__1__Impl"
    // InternalMyDsl.g:973:1: rule__DataFiltering__Group_1_1__1__Impl : ( ( rule__DataFiltering__Column_filterAssignment_1_1_1 ) ) ;
    public final void rule__DataFiltering__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( ( rule__DataFiltering__Column_filterAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:978:1: ( ( rule__DataFiltering__Column_filterAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:978:1: ( ( rule__DataFiltering__Column_filterAssignment_1_1_1 ) )
            // InternalMyDsl.g:979:2: ( rule__DataFiltering__Column_filterAssignment_1_1_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1_1_1()); 
            // InternalMyDsl.g:980:2: ( rule__DataFiltering__Column_filterAssignment_1_1_1 )
            // InternalMyDsl.g:980:3: rule__DataFiltering__Column_filterAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Column_filterAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getColumn_filterAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_1_1__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__0"
    // InternalMyDsl.g:989:1: rule__GraphDrawing__Group__0 : rule__GraphDrawing__Group__0__Impl rule__GraphDrawing__Group__1 ;
    public final void rule__GraphDrawing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( rule__GraphDrawing__Group__0__Impl rule__GraphDrawing__Group__1 )
            // InternalMyDsl.g:994:2: rule__GraphDrawing__Group__0__Impl rule__GraphDrawing__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GraphDrawing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__1();

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
    // $ANTLR end "rule__GraphDrawing__Group__0"


    // $ANTLR start "rule__GraphDrawing__Group__0__Impl"
    // InternalMyDsl.g:1001:1: rule__GraphDrawing__Group__0__Impl : ( 'Draw a plot :' ) ;
    public final void rule__GraphDrawing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( ( 'Draw a plot :' ) )
            // InternalMyDsl.g:1006:1: ( 'Draw a plot :' )
            {
            // InternalMyDsl.g:1006:1: ( 'Draw a plot :' )
            // InternalMyDsl.g:1007:2: 'Draw a plot :'
            {
             before(grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__1"
    // InternalMyDsl.g:1016:1: rule__GraphDrawing__Group__1 : rule__GraphDrawing__Group__1__Impl rule__GraphDrawing__Group__2 ;
    public final void rule__GraphDrawing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( rule__GraphDrawing__Group__1__Impl rule__GraphDrawing__Group__2 )
            // InternalMyDsl.g:1021:2: rule__GraphDrawing__Group__1__Impl rule__GraphDrawing__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__GraphDrawing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__2();

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
    // $ANTLR end "rule__GraphDrawing__Group__1"


    // $ANTLR start "rule__GraphDrawing__Group__1__Impl"
    // InternalMyDsl.g:1028:1: rule__GraphDrawing__Group__1__Impl : ( ( rule__GraphDrawing__Group_1__0 )? ) ;
    public final void rule__GraphDrawing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1032:1: ( ( ( rule__GraphDrawing__Group_1__0 )? ) )
            // InternalMyDsl.g:1033:1: ( ( rule__GraphDrawing__Group_1__0 )? )
            {
            // InternalMyDsl.g:1033:1: ( ( rule__GraphDrawing__Group_1__0 )? )
            // InternalMyDsl.g:1034:2: ( rule__GraphDrawing__Group_1__0 )?
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_1()); 
            // InternalMyDsl.g:1035:2: ( rule__GraphDrawing__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1035:3: rule__GraphDrawing__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GraphDrawing__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGraphDrawingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__2"
    // InternalMyDsl.g:1043:1: rule__GraphDrawing__Group__2 : rule__GraphDrawing__Group__2__Impl rule__GraphDrawing__Group__3 ;
    public final void rule__GraphDrawing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( rule__GraphDrawing__Group__2__Impl rule__GraphDrawing__Group__3 )
            // InternalMyDsl.g:1048:2: rule__GraphDrawing__Group__2__Impl rule__GraphDrawing__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__GraphDrawing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__3();

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
    // $ANTLR end "rule__GraphDrawing__Group__2"


    // $ANTLR start "rule__GraphDrawing__Group__2__Impl"
    // InternalMyDsl.g:1055:1: rule__GraphDrawing__Group__2__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( ( ';' ) )
            // InternalMyDsl.g:1060:1: ( ';' )
            {
            // InternalMyDsl.g:1060:1: ( ';' )
            // InternalMyDsl.g:1061:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__2__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__3"
    // InternalMyDsl.g:1070:1: rule__GraphDrawing__Group__3 : rule__GraphDrawing__Group__3__Impl rule__GraphDrawing__Group__4 ;
    public final void rule__GraphDrawing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( rule__GraphDrawing__Group__3__Impl rule__GraphDrawing__Group__4 )
            // InternalMyDsl.g:1075:2: rule__GraphDrawing__Group__3__Impl rule__GraphDrawing__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__4();

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
    // $ANTLR end "rule__GraphDrawing__Group__3"


    // $ANTLR start "rule__GraphDrawing__Group__3__Impl"
    // InternalMyDsl.g:1082:1: rule__GraphDrawing__Group__3__Impl : ( 'abs_column=' ) ;
    public final void rule__GraphDrawing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( ( 'abs_column=' ) )
            // InternalMyDsl.g:1087:1: ( 'abs_column=' )
            {
            // InternalMyDsl.g:1087:1: ( 'abs_column=' )
            // InternalMyDsl.g:1088:2: 'abs_column='
            {
             before(grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__3__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__4"
    // InternalMyDsl.g:1097:1: rule__GraphDrawing__Group__4 : rule__GraphDrawing__Group__4__Impl rule__GraphDrawing__Group__5 ;
    public final void rule__GraphDrawing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( rule__GraphDrawing__Group__4__Impl rule__GraphDrawing__Group__5 )
            // InternalMyDsl.g:1102:2: rule__GraphDrawing__Group__4__Impl rule__GraphDrawing__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__GraphDrawing__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__5();

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
    // $ANTLR end "rule__GraphDrawing__Group__4"


    // $ANTLR start "rule__GraphDrawing__Group__4__Impl"
    // InternalMyDsl.g:1109:1: rule__GraphDrawing__Group__4__Impl : ( ( rule__GraphDrawing__Abs_columnAssignment_4 ) ) ;
    public final void rule__GraphDrawing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( ( ( rule__GraphDrawing__Abs_columnAssignment_4 ) ) )
            // InternalMyDsl.g:1114:1: ( ( rule__GraphDrawing__Abs_columnAssignment_4 ) )
            {
            // InternalMyDsl.g:1114:1: ( ( rule__GraphDrawing__Abs_columnAssignment_4 ) )
            // InternalMyDsl.g:1115:2: ( rule__GraphDrawing__Abs_columnAssignment_4 )
            {
             before(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_4()); 
            // InternalMyDsl.g:1116:2: ( rule__GraphDrawing__Abs_columnAssignment_4 )
            // InternalMyDsl.g:1116:3: rule__GraphDrawing__Abs_columnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Abs_columnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getAbs_columnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__4__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__5"
    // InternalMyDsl.g:1124:1: rule__GraphDrawing__Group__5 : rule__GraphDrawing__Group__5__Impl rule__GraphDrawing__Group__6 ;
    public final void rule__GraphDrawing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( rule__GraphDrawing__Group__5__Impl rule__GraphDrawing__Group__6 )
            // InternalMyDsl.g:1129:2: rule__GraphDrawing__Group__5__Impl rule__GraphDrawing__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__GraphDrawing__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__6();

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
    // $ANTLR end "rule__GraphDrawing__Group__5"


    // $ANTLR start "rule__GraphDrawing__Group__5__Impl"
    // InternalMyDsl.g:1136:1: rule__GraphDrawing__Group__5__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( ( ';' ) )
            // InternalMyDsl.g:1141:1: ( ';' )
            {
            // InternalMyDsl.g:1141:1: ( ';' )
            // InternalMyDsl.g:1142:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__5__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__6"
    // InternalMyDsl.g:1151:1: rule__GraphDrawing__Group__6 : rule__GraphDrawing__Group__6__Impl rule__GraphDrawing__Group__7 ;
    public final void rule__GraphDrawing__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( rule__GraphDrawing__Group__6__Impl rule__GraphDrawing__Group__7 )
            // InternalMyDsl.g:1156:2: rule__GraphDrawing__Group__6__Impl rule__GraphDrawing__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__7();

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
    // $ANTLR end "rule__GraphDrawing__Group__6"


    // $ANTLR start "rule__GraphDrawing__Group__6__Impl"
    // InternalMyDsl.g:1163:1: rule__GraphDrawing__Group__6__Impl : ( 'ord_column=' ) ;
    public final void rule__GraphDrawing__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( ( 'ord_column=' ) )
            // InternalMyDsl.g:1168:1: ( 'ord_column=' )
            {
            // InternalMyDsl.g:1168:1: ( 'ord_column=' )
            // InternalMyDsl.g:1169:2: 'ord_column='
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__6__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__7"
    // InternalMyDsl.g:1178:1: rule__GraphDrawing__Group__7 : rule__GraphDrawing__Group__7__Impl rule__GraphDrawing__Group__8 ;
    public final void rule__GraphDrawing__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( rule__GraphDrawing__Group__7__Impl rule__GraphDrawing__Group__8 )
            // InternalMyDsl.g:1183:2: rule__GraphDrawing__Group__7__Impl rule__GraphDrawing__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__GraphDrawing__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__8();

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
    // $ANTLR end "rule__GraphDrawing__Group__7"


    // $ANTLR start "rule__GraphDrawing__Group__7__Impl"
    // InternalMyDsl.g:1190:1: rule__GraphDrawing__Group__7__Impl : ( ( rule__GraphDrawing__Ord_columnAssignment_7 ) ) ;
    public final void rule__GraphDrawing__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( ( ( rule__GraphDrawing__Ord_columnAssignment_7 ) ) )
            // InternalMyDsl.g:1195:1: ( ( rule__GraphDrawing__Ord_columnAssignment_7 ) )
            {
            // InternalMyDsl.g:1195:1: ( ( rule__GraphDrawing__Ord_columnAssignment_7 ) )
            // InternalMyDsl.g:1196:2: ( rule__GraphDrawing__Ord_columnAssignment_7 )
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_7()); 
            // InternalMyDsl.g:1197:2: ( rule__GraphDrawing__Ord_columnAssignment_7 )
            // InternalMyDsl.g:1197:3: rule__GraphDrawing__Ord_columnAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Ord_columnAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__7__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__8"
    // InternalMyDsl.g:1205:1: rule__GraphDrawing__Group__8 : rule__GraphDrawing__Group__8__Impl rule__GraphDrawing__Group__9 ;
    public final void rule__GraphDrawing__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( rule__GraphDrawing__Group__8__Impl rule__GraphDrawing__Group__9 )
            // InternalMyDsl.g:1210:2: rule__GraphDrawing__Group__8__Impl rule__GraphDrawing__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__GraphDrawing__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__9();

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
    // $ANTLR end "rule__GraphDrawing__Group__8"


    // $ANTLR start "rule__GraphDrawing__Group__8__Impl"
    // InternalMyDsl.g:1217:1: rule__GraphDrawing__Group__8__Impl : ( ( rule__GraphDrawing__Group_8__0 )* ) ;
    public final void rule__GraphDrawing__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( ( ( rule__GraphDrawing__Group_8__0 )* ) )
            // InternalMyDsl.g:1222:1: ( ( rule__GraphDrawing__Group_8__0 )* )
            {
            // InternalMyDsl.g:1222:1: ( ( rule__GraphDrawing__Group_8__0 )* )
            // InternalMyDsl.g:1223:2: ( rule__GraphDrawing__Group_8__0 )*
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_8()); 
            // InternalMyDsl.g:1224:2: ( rule__GraphDrawing__Group_8__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1224:3: rule__GraphDrawing__Group_8__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__GraphDrawing__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGraphDrawingAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__8__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__9"
    // InternalMyDsl.g:1232:1: rule__GraphDrawing__Group__9 : rule__GraphDrawing__Group__9__Impl rule__GraphDrawing__Group__10 ;
    public final void rule__GraphDrawing__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( rule__GraphDrawing__Group__9__Impl rule__GraphDrawing__Group__10 )
            // InternalMyDsl.g:1237:2: rule__GraphDrawing__Group__9__Impl rule__GraphDrawing__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__GraphDrawing__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__10();

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
    // $ANTLR end "rule__GraphDrawing__Group__9"


    // $ANTLR start "rule__GraphDrawing__Group__9__Impl"
    // InternalMyDsl.g:1244:1: rule__GraphDrawing__Group__9__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( ( ';' ) )
            // InternalMyDsl.g:1249:1: ( ';' )
            {
            // InternalMyDsl.g:1249:1: ( ';' )
            // InternalMyDsl.g:1250:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__9__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__10"
    // InternalMyDsl.g:1259:1: rule__GraphDrawing__Group__10 : rule__GraphDrawing__Group__10__Impl rule__GraphDrawing__Group__11 ;
    public final void rule__GraphDrawing__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1263:1: ( rule__GraphDrawing__Group__10__Impl rule__GraphDrawing__Group__11 )
            // InternalMyDsl.g:1264:2: rule__GraphDrawing__Group__10__Impl rule__GraphDrawing__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__11();

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
    // $ANTLR end "rule__GraphDrawing__Group__10"


    // $ANTLR start "rule__GraphDrawing__Group__10__Impl"
    // InternalMyDsl.g:1271:1: rule__GraphDrawing__Group__10__Impl : ( 'labels=' ) ;
    public final void rule__GraphDrawing__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( ( 'labels=' ) )
            // InternalMyDsl.g:1276:1: ( 'labels=' )
            {
            // InternalMyDsl.g:1276:1: ( 'labels=' )
            // InternalMyDsl.g:1277:2: 'labels='
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelsKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getLabelsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__10__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__11"
    // InternalMyDsl.g:1286:1: rule__GraphDrawing__Group__11 : rule__GraphDrawing__Group__11__Impl rule__GraphDrawing__Group__12 ;
    public final void rule__GraphDrawing__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( rule__GraphDrawing__Group__11__Impl rule__GraphDrawing__Group__12 )
            // InternalMyDsl.g:1291:2: rule__GraphDrawing__Group__11__Impl rule__GraphDrawing__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__GraphDrawing__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__12();

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
    // $ANTLR end "rule__GraphDrawing__Group__11"


    // $ANTLR start "rule__GraphDrawing__Group__11__Impl"
    // InternalMyDsl.g:1298:1: rule__GraphDrawing__Group__11__Impl : ( ( rule__GraphDrawing__LabelsAssignment_11 ) ) ;
    public final void rule__GraphDrawing__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( ( ( rule__GraphDrawing__LabelsAssignment_11 ) ) )
            // InternalMyDsl.g:1303:1: ( ( rule__GraphDrawing__LabelsAssignment_11 ) )
            {
            // InternalMyDsl.g:1303:1: ( ( rule__GraphDrawing__LabelsAssignment_11 ) )
            // InternalMyDsl.g:1304:2: ( rule__GraphDrawing__LabelsAssignment_11 )
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelsAssignment_11()); 
            // InternalMyDsl.g:1305:2: ( rule__GraphDrawing__LabelsAssignment_11 )
            // InternalMyDsl.g:1305:3: rule__GraphDrawing__LabelsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__LabelsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getLabelsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__11__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__12"
    // InternalMyDsl.g:1313:1: rule__GraphDrawing__Group__12 : rule__GraphDrawing__Group__12__Impl rule__GraphDrawing__Group__13 ;
    public final void rule__GraphDrawing__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( rule__GraphDrawing__Group__12__Impl rule__GraphDrawing__Group__13 )
            // InternalMyDsl.g:1318:2: rule__GraphDrawing__Group__12__Impl rule__GraphDrawing__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__GraphDrawing__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__13();

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
    // $ANTLR end "rule__GraphDrawing__Group__12"


    // $ANTLR start "rule__GraphDrawing__Group__12__Impl"
    // InternalMyDsl.g:1325:1: rule__GraphDrawing__Group__12__Impl : ( ( rule__GraphDrawing__Group_12__0 )* ) ;
    public final void rule__GraphDrawing__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( ( rule__GraphDrawing__Group_12__0 )* ) )
            // InternalMyDsl.g:1330:1: ( ( rule__GraphDrawing__Group_12__0 )* )
            {
            // InternalMyDsl.g:1330:1: ( ( rule__GraphDrawing__Group_12__0 )* )
            // InternalMyDsl.g:1331:2: ( rule__GraphDrawing__Group_12__0 )*
            {
             before(grammarAccess.getGraphDrawingAccess().getGroup_12()); 
            // InternalMyDsl.g:1332:2: ( rule__GraphDrawing__Group_12__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1332:3: rule__GraphDrawing__Group_12__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__GraphDrawing__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGraphDrawingAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__12__Impl"


    // $ANTLR start "rule__GraphDrawing__Group__13"
    // InternalMyDsl.g:1340:1: rule__GraphDrawing__Group__13 : rule__GraphDrawing__Group__13__Impl ;
    public final void rule__GraphDrawing__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( rule__GraphDrawing__Group__13__Impl )
            // InternalMyDsl.g:1345:2: rule__GraphDrawing__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group__13__Impl();

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
    // $ANTLR end "rule__GraphDrawing__Group__13"


    // $ANTLR start "rule__GraphDrawing__Group__13__Impl"
    // InternalMyDsl.g:1351:1: rule__GraphDrawing__Group__13__Impl : ( ';' ) ;
    public final void rule__GraphDrawing__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( ( ';' ) )
            // InternalMyDsl.g:1356:1: ( ';' )
            {
            // InternalMyDsl.g:1356:1: ( ';' )
            // InternalMyDsl.g:1357:2: ';'
            {
             before(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group__13__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_1__0"
    // InternalMyDsl.g:1367:1: rule__GraphDrawing__Group_1__0 : rule__GraphDrawing__Group_1__0__Impl rule__GraphDrawing__Group_1__1 ;
    public final void rule__GraphDrawing__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( rule__GraphDrawing__Group_1__0__Impl rule__GraphDrawing__Group_1__1 )
            // InternalMyDsl.g:1372:2: rule__GraphDrawing__Group_1__0__Impl rule__GraphDrawing__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:1379:1: rule__GraphDrawing__Group_1__0__Impl : ( 'graph_type=' ) ;
    public final void rule__GraphDrawing__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( 'graph_type=' ) )
            // InternalMyDsl.g:1384:1: ( 'graph_type=' )
            {
            // InternalMyDsl.g:1384:1: ( 'graph_type=' )
            // InternalMyDsl.g:1385:2: 'graph_type='
            {
             before(grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:1394:1: rule__GraphDrawing__Group_1__1 : rule__GraphDrawing__Group_1__1__Impl ;
    public final void rule__GraphDrawing__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( rule__GraphDrawing__Group_1__1__Impl )
            // InternalMyDsl.g:1399:2: rule__GraphDrawing__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_1__1__Impl();

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
    // InternalMyDsl.g:1405:1: rule__GraphDrawing__Group_1__1__Impl : ( ( rule__GraphDrawing__Graph_typeAssignment_1_1 ) ) ;
    public final void rule__GraphDrawing__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ( rule__GraphDrawing__Graph_typeAssignment_1_1 ) ) )
            // InternalMyDsl.g:1410:1: ( ( rule__GraphDrawing__Graph_typeAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1410:1: ( ( rule__GraphDrawing__Graph_typeAssignment_1_1 ) )
            // InternalMyDsl.g:1411:2: ( rule__GraphDrawing__Graph_typeAssignment_1_1 )
            {
             before(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_1_1()); 
            // InternalMyDsl.g:1412:2: ( rule__GraphDrawing__Graph_typeAssignment_1_1 )
            // InternalMyDsl.g:1412:3: rule__GraphDrawing__Graph_typeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Graph_typeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getGraph_typeAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__GraphDrawing__Group_8__0"
    // InternalMyDsl.g:1421:1: rule__GraphDrawing__Group_8__0 : rule__GraphDrawing__Group_8__0__Impl rule__GraphDrawing__Group_8__1 ;
    public final void rule__GraphDrawing__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( rule__GraphDrawing__Group_8__0__Impl rule__GraphDrawing__Group_8__1 )
            // InternalMyDsl.g:1426:2: rule__GraphDrawing__Group_8__0__Impl rule__GraphDrawing__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_8__1();

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
    // $ANTLR end "rule__GraphDrawing__Group_8__0"


    // $ANTLR start "rule__GraphDrawing__Group_8__0__Impl"
    // InternalMyDsl.g:1433:1: rule__GraphDrawing__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GraphDrawing__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( ( ',' ) )
            // InternalMyDsl.g:1438:1: ( ',' )
            {
            // InternalMyDsl.g:1438:1: ( ',' )
            // InternalMyDsl.g:1439:2: ','
            {
             before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_8__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_8__1"
    // InternalMyDsl.g:1448:1: rule__GraphDrawing__Group_8__1 : rule__GraphDrawing__Group_8__1__Impl ;
    public final void rule__GraphDrawing__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( rule__GraphDrawing__Group_8__1__Impl )
            // InternalMyDsl.g:1453:2: rule__GraphDrawing__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_8__1__Impl();

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
    // $ANTLR end "rule__GraphDrawing__Group_8__1"


    // $ANTLR start "rule__GraphDrawing__Group_8__1__Impl"
    // InternalMyDsl.g:1459:1: rule__GraphDrawing__Group_8__1__Impl : ( ( rule__GraphDrawing__Ord_columnAssignment_8_1 ) ) ;
    public final void rule__GraphDrawing__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( ( rule__GraphDrawing__Ord_columnAssignment_8_1 ) ) )
            // InternalMyDsl.g:1464:1: ( ( rule__GraphDrawing__Ord_columnAssignment_8_1 ) )
            {
            // InternalMyDsl.g:1464:1: ( ( rule__GraphDrawing__Ord_columnAssignment_8_1 ) )
            // InternalMyDsl.g:1465:2: ( rule__GraphDrawing__Ord_columnAssignment_8_1 )
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_8_1()); 
            // InternalMyDsl.g:1466:2: ( rule__GraphDrawing__Ord_columnAssignment_8_1 )
            // InternalMyDsl.g:1466:3: rule__GraphDrawing__Ord_columnAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Ord_columnAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_8__1__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_12__0"
    // InternalMyDsl.g:1475:1: rule__GraphDrawing__Group_12__0 : rule__GraphDrawing__Group_12__0__Impl rule__GraphDrawing__Group_12__1 ;
    public final void rule__GraphDrawing__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( rule__GraphDrawing__Group_12__0__Impl rule__GraphDrawing__Group_12__1 )
            // InternalMyDsl.g:1480:2: rule__GraphDrawing__Group_12__0__Impl rule__GraphDrawing__Group_12__1
            {
            pushFollow(FOLLOW_3);
            rule__GraphDrawing__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_12__1();

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
    // $ANTLR end "rule__GraphDrawing__Group_12__0"


    // $ANTLR start "rule__GraphDrawing__Group_12__0__Impl"
    // InternalMyDsl.g:1487:1: rule__GraphDrawing__Group_12__0__Impl : ( ',' ) ;
    public final void rule__GraphDrawing__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( ( ',' ) )
            // InternalMyDsl.g:1492:1: ( ',' )
            {
            // InternalMyDsl.g:1492:1: ( ',' )
            // InternalMyDsl.g:1493:2: ','
            {
             before(grammarAccess.getGraphDrawingAccess().getCommaKeyword_12_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGraphDrawingAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_12__0__Impl"


    // $ANTLR start "rule__GraphDrawing__Group_12__1"
    // InternalMyDsl.g:1502:1: rule__GraphDrawing__Group_12__1 : rule__GraphDrawing__Group_12__1__Impl ;
    public final void rule__GraphDrawing__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( rule__GraphDrawing__Group_12__1__Impl )
            // InternalMyDsl.g:1507:2: rule__GraphDrawing__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__Group_12__1__Impl();

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
    // $ANTLR end "rule__GraphDrawing__Group_12__1"


    // $ANTLR start "rule__GraphDrawing__Group_12__1__Impl"
    // InternalMyDsl.g:1513:1: rule__GraphDrawing__Group_12__1__Impl : ( ( rule__GraphDrawing__LabelsAssignment_12_1 ) ) ;
    public final void rule__GraphDrawing__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( ( rule__GraphDrawing__LabelsAssignment_12_1 ) ) )
            // InternalMyDsl.g:1518:1: ( ( rule__GraphDrawing__LabelsAssignment_12_1 ) )
            {
            // InternalMyDsl.g:1518:1: ( ( rule__GraphDrawing__LabelsAssignment_12_1 ) )
            // InternalMyDsl.g:1519:2: ( rule__GraphDrawing__LabelsAssignment_12_1 )
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelsAssignment_12_1()); 
            // InternalMyDsl.g:1520:2: ( rule__GraphDrawing__LabelsAssignment_12_1 )
            // InternalMyDsl.g:1520:3: rule__GraphDrawing__LabelsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__GraphDrawing__LabelsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getGraphDrawingAccess().getLabelsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Group_12__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalMyDsl.g:1529:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalMyDsl.g:1534:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1541:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( ( 'column' ) )
            // InternalMyDsl.g:1546:1: ( 'column' )
            {
            // InternalMyDsl.g:1546:1: ( 'column' )
            // InternalMyDsl.g:1547:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1556:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalMyDsl.g:1561:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1568:1: rule__Column__Group__1__Impl : ( ( rule__Column__IndexAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1572:1: ( ( ( rule__Column__IndexAssignment_1 ) ) )
            // InternalMyDsl.g:1573:1: ( ( rule__Column__IndexAssignment_1 ) )
            {
            // InternalMyDsl.g:1573:1: ( ( rule__Column__IndexAssignment_1 ) )
            // InternalMyDsl.g:1574:2: ( rule__Column__IndexAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getIndexAssignment_1()); 
            // InternalMyDsl.g:1575:2: ( rule__Column__IndexAssignment_1 )
            // InternalMyDsl.g:1575:3: rule__Column__IndexAssignment_1
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
    // InternalMyDsl.g:1583:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalMyDsl.g:1588:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1595:1: rule__Column__Group__2__Impl : ( ( rule__Column__Group_2__0 )* ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( ( ( rule__Column__Group_2__0 )* ) )
            // InternalMyDsl.g:1600:1: ( ( rule__Column__Group_2__0 )* )
            {
            // InternalMyDsl.g:1600:1: ( ( rule__Column__Group_2__0 )* )
            // InternalMyDsl.g:1601:2: ( rule__Column__Group_2__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_2()); 
            // InternalMyDsl.g:1602:2: ( rule__Column__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1602:3: rule__Column__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Column__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:1610:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalMyDsl.g:1615:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

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
    // InternalMyDsl.g:1622:1: rule__Column__Group__3__Impl : ( 'as' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( ( 'as' ) )
            // InternalMyDsl.g:1627:1: ( 'as' )
            {
            // InternalMyDsl.g:1627:1: ( 'as' )
            // InternalMyDsl.g:1628:2: 'as'
            {
             before(grammarAccess.getColumnAccess().getAsKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getAsKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Column__Group__4"
    // InternalMyDsl.g:1637:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalMyDsl.g:1642:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

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
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalMyDsl.g:1649:1: rule__Column__Group__4__Impl : ( ( rule__Column__New_name_columnAssignment_4 ) ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( ( ( rule__Column__New_name_columnAssignment_4 ) ) )
            // InternalMyDsl.g:1654:1: ( ( rule__Column__New_name_columnAssignment_4 ) )
            {
            // InternalMyDsl.g:1654:1: ( ( rule__Column__New_name_columnAssignment_4 ) )
            // InternalMyDsl.g:1655:2: ( rule__Column__New_name_columnAssignment_4 )
            {
             before(grammarAccess.getColumnAccess().getNew_name_columnAssignment_4()); 
            // InternalMyDsl.g:1656:2: ( rule__Column__New_name_columnAssignment_4 )
            // InternalMyDsl.g:1656:3: rule__Column__New_name_columnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Column__New_name_columnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNew_name_columnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalMyDsl.g:1664:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( rule__Column__Group__5__Impl )
            // InternalMyDsl.g:1669:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

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
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalMyDsl.g:1675:1: rule__Column__Group__5__Impl : ( ( rule__Column__Group_5__0 )* ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( ( ( rule__Column__Group_5__0 )* ) )
            // InternalMyDsl.g:1680:1: ( ( rule__Column__Group_5__0 )* )
            {
            // InternalMyDsl.g:1680:1: ( ( rule__Column__Group_5__0 )* )
            // InternalMyDsl.g:1681:2: ( rule__Column__Group_5__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_5()); 
            // InternalMyDsl.g:1682:2: ( rule__Column__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=RULE_STRING && LA13_2<=RULE_ID)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1682:3: rule__Column__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Column__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_2__0"
    // InternalMyDsl.g:1691:1: rule__Column__Group_2__0 : rule__Column__Group_2__0__Impl rule__Column__Group_2__1 ;
    public final void rule__Column__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( rule__Column__Group_2__0__Impl rule__Column__Group_2__1 )
            // InternalMyDsl.g:1696:2: rule__Column__Group_2__0__Impl rule__Column__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Column__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_2__1();

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
    // $ANTLR end "rule__Column__Group_2__0"


    // $ANTLR start "rule__Column__Group_2__0__Impl"
    // InternalMyDsl.g:1703:1: rule__Column__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( ( ',' ) )
            // InternalMyDsl.g:1708:1: ( ',' )
            {
            // InternalMyDsl.g:1708:1: ( ',' )
            // InternalMyDsl.g:1709:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__0__Impl"


    // $ANTLR start "rule__Column__Group_2__1"
    // InternalMyDsl.g:1718:1: rule__Column__Group_2__1 : rule__Column__Group_2__1__Impl ;
    public final void rule__Column__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( rule__Column__Group_2__1__Impl )
            // InternalMyDsl.g:1723:2: rule__Column__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_2__1__Impl();

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
    // $ANTLR end "rule__Column__Group_2__1"


    // $ANTLR start "rule__Column__Group_2__1__Impl"
    // InternalMyDsl.g:1729:1: rule__Column__Group_2__1__Impl : ( ( rule__Column__IndexAssignment_2_1 ) ) ;
    public final void rule__Column__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( ( ( rule__Column__IndexAssignment_2_1 ) ) )
            // InternalMyDsl.g:1734:1: ( ( rule__Column__IndexAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1734:1: ( ( rule__Column__IndexAssignment_2_1 ) )
            // InternalMyDsl.g:1735:2: ( rule__Column__IndexAssignment_2_1 )
            {
             before(grammarAccess.getColumnAccess().getIndexAssignment_2_1()); 
            // InternalMyDsl.g:1736:2: ( rule__Column__IndexAssignment_2_1 )
            // InternalMyDsl.g:1736:3: rule__Column__IndexAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__IndexAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getIndexAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_2__1__Impl"


    // $ANTLR start "rule__Column__Group_5__0"
    // InternalMyDsl.g:1745:1: rule__Column__Group_5__0 : rule__Column__Group_5__0__Impl rule__Column__Group_5__1 ;
    public final void rule__Column__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( rule__Column__Group_5__0__Impl rule__Column__Group_5__1 )
            // InternalMyDsl.g:1750:2: rule__Column__Group_5__0__Impl rule__Column__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Column__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_5__1();

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
    // $ANTLR end "rule__Column__Group_5__0"


    // $ANTLR start "rule__Column__Group_5__0__Impl"
    // InternalMyDsl.g:1757:1: rule__Column__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( ( ',' ) )
            // InternalMyDsl.g:1762:1: ( ',' )
            {
            // InternalMyDsl.g:1762:1: ( ',' )
            // InternalMyDsl.g:1763:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_5__0__Impl"


    // $ANTLR start "rule__Column__Group_5__1"
    // InternalMyDsl.g:1772:1: rule__Column__Group_5__1 : rule__Column__Group_5__1__Impl ;
    public final void rule__Column__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( rule__Column__Group_5__1__Impl )
            // InternalMyDsl.g:1777:2: rule__Column__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_5__1__Impl();

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
    // $ANTLR end "rule__Column__Group_5__1"


    // $ANTLR start "rule__Column__Group_5__1__Impl"
    // InternalMyDsl.g:1783:1: rule__Column__Group_5__1__Impl : ( ( rule__Column__New_name_columnAssignment_5_1 ) ) ;
    public final void rule__Column__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( ( ( rule__Column__New_name_columnAssignment_5_1 ) ) )
            // InternalMyDsl.g:1788:1: ( ( rule__Column__New_name_columnAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1788:1: ( ( rule__Column__New_name_columnAssignment_5_1 ) )
            // InternalMyDsl.g:1789:2: ( rule__Column__New_name_columnAssignment_5_1 )
            {
             before(grammarAccess.getColumnAccess().getNew_name_columnAssignment_5_1()); 
            // InternalMyDsl.g:1790:2: ( rule__Column__New_name_columnAssignment_5_1 )
            // InternalMyDsl.g:1790:3: rule__Column__New_name_columnAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__New_name_columnAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNew_name_columnAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_5__1__Impl"


    // $ANTLR start "rule__RowFilter__Group__0"
    // InternalMyDsl.g:1799:1: rule__RowFilter__Group__0 : rule__RowFilter__Group__0__Impl rule__RowFilter__Group__1 ;
    public final void rule__RowFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( rule__RowFilter__Group__0__Impl rule__RowFilter__Group__1 )
            // InternalMyDsl.g:1804:2: rule__RowFilter__Group__0__Impl rule__RowFilter__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1811:1: rule__RowFilter__Group__0__Impl : ( ( rule__RowFilter__Column_nameAssignment_0 ) ) ;
    public final void rule__RowFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( ( rule__RowFilter__Column_nameAssignment_0 ) ) )
            // InternalMyDsl.g:1816:1: ( ( rule__RowFilter__Column_nameAssignment_0 ) )
            {
            // InternalMyDsl.g:1816:1: ( ( rule__RowFilter__Column_nameAssignment_0 ) )
            // InternalMyDsl.g:1817:2: ( rule__RowFilter__Column_nameAssignment_0 )
            {
             before(grammarAccess.getRowFilterAccess().getColumn_nameAssignment_0()); 
            // InternalMyDsl.g:1818:2: ( rule__RowFilter__Column_nameAssignment_0 )
            // InternalMyDsl.g:1818:3: rule__RowFilter__Column_nameAssignment_0
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
    // InternalMyDsl.g:1826:1: rule__RowFilter__Group__1 : rule__RowFilter__Group__1__Impl rule__RowFilter__Group__2 ;
    public final void rule__RowFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( rule__RowFilter__Group__1__Impl rule__RowFilter__Group__2 )
            // InternalMyDsl.g:1831:2: rule__RowFilter__Group__1__Impl rule__RowFilter__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1838:1: rule__RowFilter__Group__1__Impl : ( ( rule__RowFilter__OperatorAssignment_1 ) ) ;
    public final void rule__RowFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1842:1: ( ( ( rule__RowFilter__OperatorAssignment_1 ) ) )
            // InternalMyDsl.g:1843:1: ( ( rule__RowFilter__OperatorAssignment_1 ) )
            {
            // InternalMyDsl.g:1843:1: ( ( rule__RowFilter__OperatorAssignment_1 ) )
            // InternalMyDsl.g:1844:2: ( rule__RowFilter__OperatorAssignment_1 )
            {
             before(grammarAccess.getRowFilterAccess().getOperatorAssignment_1()); 
            // InternalMyDsl.g:1845:2: ( rule__RowFilter__OperatorAssignment_1 )
            // InternalMyDsl.g:1845:3: rule__RowFilter__OperatorAssignment_1
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
    // InternalMyDsl.g:1853:1: rule__RowFilter__Group__2 : rule__RowFilter__Group__2__Impl rule__RowFilter__Group__3 ;
    public final void rule__RowFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( rule__RowFilter__Group__2__Impl rule__RowFilter__Group__3 )
            // InternalMyDsl.g:1858:2: rule__RowFilter__Group__2__Impl rule__RowFilter__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1865:1: rule__RowFilter__Group__2__Impl : ( ( rule__RowFilter__String_valueAssignment_2 )? ) ;
    public final void rule__RowFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( ( ( rule__RowFilter__String_valueAssignment_2 )? ) )
            // InternalMyDsl.g:1870:1: ( ( rule__RowFilter__String_valueAssignment_2 )? )
            {
            // InternalMyDsl.g:1870:1: ( ( rule__RowFilter__String_valueAssignment_2 )? )
            // InternalMyDsl.g:1871:2: ( rule__RowFilter__String_valueAssignment_2 )?
            {
             before(grammarAccess.getRowFilterAccess().getString_valueAssignment_2()); 
            // InternalMyDsl.g:1872:2: ( rule__RowFilter__String_valueAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1872:3: rule__RowFilter__String_valueAssignment_2
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
    // InternalMyDsl.g:1880:1: rule__RowFilter__Group__3 : rule__RowFilter__Group__3__Impl rule__RowFilter__Group__4 ;
    public final void rule__RowFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( rule__RowFilter__Group__3__Impl rule__RowFilter__Group__4 )
            // InternalMyDsl.g:1885:2: rule__RowFilter__Group__3__Impl rule__RowFilter__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1892:1: rule__RowFilter__Group__3__Impl : ( ( rule__RowFilter__Int_valueAssignment_3 )? ) ;
    public final void rule__RowFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1896:1: ( ( ( rule__RowFilter__Int_valueAssignment_3 )? ) )
            // InternalMyDsl.g:1897:1: ( ( rule__RowFilter__Int_valueAssignment_3 )? )
            {
            // InternalMyDsl.g:1897:1: ( ( rule__RowFilter__Int_valueAssignment_3 )? )
            // InternalMyDsl.g:1898:2: ( rule__RowFilter__Int_valueAssignment_3 )?
            {
             before(grammarAccess.getRowFilterAccess().getInt_valueAssignment_3()); 
            // InternalMyDsl.g:1899:2: ( rule__RowFilter__Int_valueAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1899:3: rule__RowFilter__Int_valueAssignment_3
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
    // InternalMyDsl.g:1907:1: rule__RowFilter__Group__4 : rule__RowFilter__Group__4__Impl ;
    public final void rule__RowFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( rule__RowFilter__Group__4__Impl )
            // InternalMyDsl.g:1912:2: rule__RowFilter__Group__4__Impl
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
    // InternalMyDsl.g:1918:1: rule__RowFilter__Group__4__Impl : ( ';' ) ;
    public final void rule__RowFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( ( ';' ) )
            // InternalMyDsl.g:1923:1: ( ';' )
            {
            // InternalMyDsl.g:1923:1: ( ';' )
            // InternalMyDsl.g:1924:2: ';'
            {
             before(grammarAccess.getRowFilterAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalMyDsl.g:1934:1: rule__Program__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1939:2: ( ruleEString )
            {
            // InternalMyDsl.g:1939:2: ( ruleEString )
            // InternalMyDsl.g:1940:3: ruleEString
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


    // $ANTLR start "rule__Program__IdAssignment_4"
    // InternalMyDsl.g:1949:1: rule__Program__IdAssignment_4 : ( ruleEString ) ;
    public final void rule__Program__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1954:2: ( ruleEString )
            {
            // InternalMyDsl.g:1954:2: ( ruleEString )
            // InternalMyDsl.g:1955:3: ruleEString
            {
             before(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__IdAssignment_4"


    // $ANTLR start "rule__Program__FunctionsAssignment_6"
    // InternalMyDsl.g:1964:1: rule__Program__FunctionsAssignment_6 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1968:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:1969:2: ( ruleFunction )
            {
            // InternalMyDsl.g:1969:2: ( ruleFunction )
            // InternalMyDsl.g:1970:3: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FunctionsAssignment_6"


    // $ANTLR start "rule__Program__FunctionsAssignment_7"
    // InternalMyDsl.g:1979:1: rule__Program__FunctionsAssignment_7 : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1983:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:1984:2: ( ruleFunction )
            {
            // InternalMyDsl.g:1984:2: ( ruleFunction )
            // InternalMyDsl.g:1985:3: ruleFunction
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


    // $ANTLR start "rule__CsvLoader__PathAssignment_1"
    // InternalMyDsl.g:1994:1: rule__CsvLoader__PathAssignment_1 : ( ruleEString ) ;
    public final void rule__CsvLoader__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1999:2: ( ruleEString )
            {
            // InternalMyDsl.g:1999:2: ( ruleEString )
            // InternalMyDsl.g:2000:3: ruleEString
            {
             before(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvLoader__PathAssignment_1"


    // $ANTLR start "rule__DataFiltering__Column_filterAssignment_1_0"
    // InternalMyDsl.g:2009:1: rule__DataFiltering__Column_filterAssignment_1_0 : ( ruleColumn ) ;
    public final void rule__DataFiltering__Column_filterAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:2014:2: ( ruleColumn )
            {
            // InternalMyDsl.g:2014:2: ( ruleColumn )
            // InternalMyDsl.g:2015:3: ruleColumn
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Column_filterAssignment_1_0"


    // $ANTLR start "rule__DataFiltering__Column_filterAssignment_1_1_1"
    // InternalMyDsl.g:2024:1: rule__DataFiltering__Column_filterAssignment_1_1_1 : ( ruleColumn ) ;
    public final void rule__DataFiltering__Column_filterAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( ruleColumn ) )
            // InternalMyDsl.g:2029:2: ( ruleColumn )
            {
            // InternalMyDsl.g:2029:2: ( ruleColumn )
            // InternalMyDsl.g:2030:3: ruleColumn
            {
             before(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Column_filterAssignment_1_1_1"


    // $ANTLR start "rule__DataFiltering__Rowfilter_conditionAssignment_4"
    // InternalMyDsl.g:2039:1: rule__DataFiltering__Rowfilter_conditionAssignment_4 : ( ruleRowFilter ) ;
    public final void rule__DataFiltering__Rowfilter_conditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( ( ruleRowFilter ) )
            // InternalMyDsl.g:2044:2: ( ruleRowFilter )
            {
            // InternalMyDsl.g:2044:2: ( ruleRowFilter )
            // InternalMyDsl.g:2045:3: ruleRowFilter
            {
             before(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRowFilter();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Rowfilter_conditionAssignment_4"


    // $ANTLR start "rule__GraphDrawing__Graph_typeAssignment_1_1"
    // InternalMyDsl.g:2054:1: rule__GraphDrawing__Graph_typeAssignment_1_1 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Graph_typeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2059:2: ( ruleEString )
            {
            // InternalMyDsl.g:2059:2: ( ruleEString )
            // InternalMyDsl.g:2060:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Graph_typeAssignment_1_1"


    // $ANTLR start "rule__GraphDrawing__Abs_columnAssignment_4"
    // InternalMyDsl.g:2069:1: rule__GraphDrawing__Abs_columnAssignment_4 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Abs_columnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2074:2: ( ruleEString )
            {
            // InternalMyDsl.g:2074:2: ( ruleEString )
            // InternalMyDsl.g:2075:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Abs_columnAssignment_4"


    // $ANTLR start "rule__GraphDrawing__Ord_columnAssignment_7"
    // InternalMyDsl.g:2084:1: rule__GraphDrawing__Ord_columnAssignment_7 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Ord_columnAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2089:2: ( ruleEString )
            {
            // InternalMyDsl.g:2089:2: ( ruleEString )
            // InternalMyDsl.g:2090:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Ord_columnAssignment_7"


    // $ANTLR start "rule__GraphDrawing__Ord_columnAssignment_8_1"
    // InternalMyDsl.g:2099:1: rule__GraphDrawing__Ord_columnAssignment_8_1 : ( ruleEString ) ;
    public final void rule__GraphDrawing__Ord_columnAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2104:2: ( ruleEString )
            {
            // InternalMyDsl.g:2104:2: ( ruleEString )
            // InternalMyDsl.g:2105:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__Ord_columnAssignment_8_1"


    // $ANTLR start "rule__GraphDrawing__LabelsAssignment_11"
    // InternalMyDsl.g:2114:1: rule__GraphDrawing__LabelsAssignment_11 : ( ruleEString ) ;
    public final void rule__GraphDrawing__LabelsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2118:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2119:2: ( ruleEString )
            {
            // InternalMyDsl.g:2119:2: ( ruleEString )
            // InternalMyDsl.g:2120:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelsEStringParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getLabelsEStringParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__LabelsAssignment_11"


    // $ANTLR start "rule__GraphDrawing__LabelsAssignment_12_1"
    // InternalMyDsl.g:2129:1: rule__GraphDrawing__LabelsAssignment_12_1 : ( ruleEString ) ;
    public final void rule__GraphDrawing__LabelsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2134:2: ( ruleEString )
            {
            // InternalMyDsl.g:2134:2: ( ruleEString )
            // InternalMyDsl.g:2135:3: ruleEString
            {
             before(grammarAccess.getGraphDrawingAccess().getLabelsEStringParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGraphDrawingAccess().getLabelsEStringParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphDrawing__LabelsAssignment_12_1"


    // $ANTLR start "rule__Column__IndexAssignment_1"
    // InternalMyDsl.g:2144:1: rule__Column__IndexAssignment_1 : ( ruleEInt ) ;
    public final void rule__Column__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2149:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2149:2: ( ruleEInt )
            // InternalMyDsl.g:2150:3: ruleEInt
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


    // $ANTLR start "rule__Column__IndexAssignment_2_1"
    // InternalMyDsl.g:2159:1: rule__Column__IndexAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Column__IndexAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2164:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2164:2: ( ruleEInt )
            // InternalMyDsl.g:2165:3: ruleEInt
            {
             before(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__IndexAssignment_2_1"


    // $ANTLR start "rule__Column__New_name_columnAssignment_4"
    // InternalMyDsl.g:2174:1: rule__Column__New_name_columnAssignment_4 : ( ruleEString ) ;
    public final void rule__Column__New_name_columnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2179:2: ( ruleEString )
            {
            // InternalMyDsl.g:2179:2: ( ruleEString )
            // InternalMyDsl.g:2180:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__New_name_columnAssignment_4"


    // $ANTLR start "rule__Column__New_name_columnAssignment_5_1"
    // InternalMyDsl.g:2189:1: rule__Column__New_name_columnAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Column__New_name_columnAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2194:2: ( ruleEString )
            {
            // InternalMyDsl.g:2194:2: ( ruleEString )
            // InternalMyDsl.g:2195:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__New_name_columnAssignment_5_1"


    // $ANTLR start "rule__RowFilter__Column_nameAssignment_0"
    // InternalMyDsl.g:2204:1: rule__RowFilter__Column_nameAssignment_0 : ( ruleEString ) ;
    public final void rule__RowFilter__Column_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2209:2: ( ruleEString )
            {
            // InternalMyDsl.g:2209:2: ( ruleEString )
            // InternalMyDsl.g:2210:3: ruleEString
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
    // InternalMyDsl.g:2219:1: rule__RowFilter__OperatorAssignment_1 : ( ruleOperator ) ;
    public final void rule__RowFilter__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ruleOperator ) )
            // InternalMyDsl.g:2224:2: ( ruleOperator )
            {
            // InternalMyDsl.g:2224:2: ( ruleOperator )
            // InternalMyDsl.g:2225:3: ruleOperator
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
    // InternalMyDsl.g:2234:1: rule__RowFilter__String_valueAssignment_2 : ( ruleEString ) ;
    public final void rule__RowFilter__String_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2239:2: ( ruleEString )
            {
            // InternalMyDsl.g:2239:2: ( ruleEString )
            // InternalMyDsl.g:2240:3: ruleEString
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
    // InternalMyDsl.g:2249:1: rule__RowFilter__Int_valueAssignment_3 : ( ruleEInt ) ;
    public final void rule__RowFilter__Int_valueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2253:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2254:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2254:2: ( ruleEInt )
            // InternalMyDsl.g:2255:3: ruleEInt
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001300000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001340000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000A0070L});

}