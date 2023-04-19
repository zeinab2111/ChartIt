package chartIt.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import chartIt.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'id='", "';'", "'}'", "'-'", "'uses :'", "'filter :'", "','", "'condition :'", "'Draw a plot :'", "'graph_type='", "'abs_column='", "'ord_column='", "'labels='", "'column'", "'as'", "'>'", "'<'", "'=='"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id=' ( (lv_id_4_0= ruleEString ) ) otherlv_5= ';' ( (lv_functions_6_0= ruleFunction ) ) ( (lv_functions_7_0= ruleFunction ) )* otherlv_8= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_functions_6_0 = null;

        EObject lv_functions_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id=' ( (lv_id_4_0= ruleEString ) ) otherlv_5= ';' ( (lv_functions_6_0= ruleFunction ) ) ( (lv_functions_7_0= ruleFunction ) )* otherlv_8= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id=' ( (lv_id_4_0= ruleEString ) ) otherlv_5= ';' ( (lv_functions_6_0= ruleFunction ) ) ( (lv_functions_7_0= ruleFunction ) )* otherlv_8= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id=' ( (lv_id_4_0= ruleEString ) ) otherlv_5= ';' ( (lv_functions_6_0= ruleFunction ) ) ( (lv_functions_7_0= ruleFunction ) )* otherlv_8= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id=' ( (lv_id_4_0= ruleEString ) ) otherlv_5= ';' ( (lv_functions_6_0= ruleFunction ) ) ( (lv_functions_7_0= ruleFunction ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getIdKeyword_3());
            		
            // InternalMyDsl.g:111:3: ( (lv_id_4_0= ruleEString ) )
            // InternalMyDsl.g:112:4: (lv_id_4_0= ruleEString )
            {
            // InternalMyDsl.g:112:4: (lv_id_4_0= ruleEString )
            // InternalMyDsl.g:113:5: lv_id_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_id_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_4_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getSemicolonKeyword_5());
            		
            // InternalMyDsl.g:134:3: ( (lv_functions_6_0= ruleFunction ) )
            // InternalMyDsl.g:135:4: (lv_functions_6_0= ruleFunction )
            {
            // InternalMyDsl.g:135:4: (lv_functions_6_0= ruleFunction )
            // InternalMyDsl.g:136:5: lv_functions_6_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_functions_6_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"functions",
            						lv_functions_6_0,
            						"chartIt.mydsl.MyDsl.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:153:3: ( (lv_functions_7_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:154:4: (lv_functions_7_0= ruleFunction )
            	    {
            	    // InternalMyDsl.g:154:4: (lv_functions_7_0= ruleFunction )
            	    // InternalMyDsl.g:155:5: lv_functions_7_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_functions_7_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_7_0,
            	    						"chartIt.mydsl.MyDsl.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:180:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:180:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:181:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:187:1: ruleFunction returns [EObject current=null] : (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_CsvLoader_0 = null;

        EObject this_DataFiltering_1 = null;

        EObject this_GraphDrawing_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:193:2: ( (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing ) )
            // InternalMyDsl.g:194:2: (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing )
            {
            // InternalMyDsl.g:194:2: (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:195:3: this_CsvLoader_0= ruleCsvLoader
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getCsvLoaderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CsvLoader_0=ruleCsvLoader();

                    state._fsp--;


                    			current = this_CsvLoader_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:204:3: this_DataFiltering_1= ruleDataFiltering
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getDataFilteringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFiltering_1=ruleDataFiltering();

                    state._fsp--;


                    			current = this_DataFiltering_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:213:3: this_GraphDrawing_2= ruleGraphDrawing
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getGraphDrawingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphDrawing_2=ruleGraphDrawing();

                    state._fsp--;


                    			current = this_GraphDrawing_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:225:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:225:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:226:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:232:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:238:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:239:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:239:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:240:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:248:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:259:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:259:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:260:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:266:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:272:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:273:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:273:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:274:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:274:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:275:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCsvLoader"
    // InternalMyDsl.g:292:1: entryRuleCsvLoader returns [EObject current=null] : iv_ruleCsvLoader= ruleCsvLoader EOF ;
    public final EObject entryRuleCsvLoader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvLoader = null;


        try {
            // InternalMyDsl.g:292:50: (iv_ruleCsvLoader= ruleCsvLoader EOF )
            // InternalMyDsl.g:293:2: iv_ruleCsvLoader= ruleCsvLoader EOF
            {
             newCompositeNode(grammarAccess.getCsvLoaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvLoader=ruleCsvLoader();

            state._fsp--;

             current =iv_ruleCsvLoader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCsvLoader"


    // $ANTLR start "ruleCsvLoader"
    // InternalMyDsl.g:299:1: ruleCsvLoader returns [EObject current=null] : (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleCsvLoader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:305:2: ( (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:306:2: (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:306:2: (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalMyDsl.g:307:3: otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCsvLoaderAccess().getUsesKeyword_0());
            		
            // InternalMyDsl.g:311:3: ( (lv_path_1_0= ruleEString ) )
            // InternalMyDsl.g:312:4: (lv_path_1_0= ruleEString )
            {
            // InternalMyDsl.g:312:4: (lv_path_1_0= ruleEString )
            // InternalMyDsl.g:313:5: lv_path_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_path_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCsvLoaderRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCsvLoaderAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCsvLoader"


    // $ANTLR start "entryRuleDataFiltering"
    // InternalMyDsl.g:338:1: entryRuleDataFiltering returns [EObject current=null] : iv_ruleDataFiltering= ruleDataFiltering EOF ;
    public final EObject entryRuleDataFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFiltering = null;


        try {
            // InternalMyDsl.g:338:54: (iv_ruleDataFiltering= ruleDataFiltering EOF )
            // InternalMyDsl.g:339:2: iv_ruleDataFiltering= ruleDataFiltering EOF
            {
             newCompositeNode(grammarAccess.getDataFilteringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFiltering=ruleDataFiltering();

            state._fsp--;

             current =iv_ruleDataFiltering; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataFiltering"


    // $ANTLR start "ruleDataFiltering"
    // InternalMyDsl.g:345:1: ruleDataFiltering returns [EObject current=null] : (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? ) ;
    public final EObject ruleDataFiltering() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_column_filter_1_0 = null;

        EObject lv_column_filter_3_0 = null;

        EObject lv_rowfilter_condition_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:351:2: ( (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? ) )
            // InternalMyDsl.g:352:2: (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? )
            {
            // InternalMyDsl.g:352:2: (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? )
            // InternalMyDsl.g:353:3: otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFilteringAccess().getFilterKeyword_0());
            		
            // InternalMyDsl.g:357:3: ( (lv_column_filter_1_0= ruleColumn ) )
            // InternalMyDsl.g:358:4: (lv_column_filter_1_0= ruleColumn )
            {
            // InternalMyDsl.g:358:4: (lv_column_filter_1_0= ruleColumn )
            // InternalMyDsl.g:359:5: lv_column_filter_1_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_column_filter_1_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataFilteringRule());
            					}
            					add(
            						current,
            						"column_filter",
            						lv_column_filter_1_0,
            						"chartIt.mydsl.MyDsl.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:376:3: (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:377:4: otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:381:4: ( (lv_column_filter_3_0= ruleColumn ) )
            	    // InternalMyDsl.g:382:5: (lv_column_filter_3_0= ruleColumn )
            	    {
            	    // InternalMyDsl.g:382:5: (lv_column_filter_3_0= ruleColumn )
            	    // InternalMyDsl.g:383:6: lv_column_filter_3_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_column_filter_3_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataFilteringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"column_filter",
            	    							lv_column_filter_3_0,
            	    							"chartIt.mydsl.MyDsl.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDataFilteringAccess().getSemicolonKeyword_3());
            		
            // InternalMyDsl.g:405:3: (otherlv_5= 'condition :' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:406:4: otherlv_5= 'condition :'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataFilteringAccess().getConditionKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:411:3: ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:412:4: (lv_rowfilter_condition_6_0= ruleRowFilter )
                    {
                    // InternalMyDsl.g:412:4: (lv_rowfilter_condition_6_0= ruleRowFilter )
                    // InternalMyDsl.g:413:5: lv_rowfilter_condition_6_0= ruleRowFilter
                    {

                    					newCompositeNode(grammarAccess.getDataFilteringAccess().getRowfilter_conditionRowFilterParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rowfilter_condition_6_0=ruleRowFilter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    					}
                    					set(
                    						current,
                    						"rowfilter_condition",
                    						lv_rowfilter_condition_6_0,
                    						"chartIt.mydsl.MyDsl.RowFilter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataFiltering"


    // $ANTLR start "entryRuleGraphDrawing"
    // InternalMyDsl.g:434:1: entryRuleGraphDrawing returns [EObject current=null] : iv_ruleGraphDrawing= ruleGraphDrawing EOF ;
    public final EObject entryRuleGraphDrawing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDrawing = null;


        try {
            // InternalMyDsl.g:434:53: (iv_ruleGraphDrawing= ruleGraphDrawing EOF )
            // InternalMyDsl.g:435:2: iv_ruleGraphDrawing= ruleGraphDrawing EOF
            {
             newCompositeNode(grammarAccess.getGraphDrawingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphDrawing=ruleGraphDrawing();

            state._fsp--;

             current =iv_ruleGraphDrawing; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphDrawing"


    // $ANTLR start "ruleGraphDrawing"
    // InternalMyDsl.g:441:1: ruleGraphDrawing returns [EObject current=null] : (otherlv_0= 'Draw a plot :' otherlv_1= 'graph_type=' ( (lv_graph_type_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'abs_column=' ( (lv_abs_column_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'ord_column=' ( (lv_ord_column_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) ) )* otherlv_11= ';' otherlv_12= 'labels=' ( (lv_label_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_label_15_0= ruleEString ) ) )* otherlv_16= ';' ) ;
    public final EObject ruleGraphDrawing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_graph_type_2_0 = null;

        AntlrDatatypeRuleToken lv_abs_column_5_0 = null;

        AntlrDatatypeRuleToken lv_ord_column_8_0 = null;

        AntlrDatatypeRuleToken lv_ord_column_10_0 = null;

        AntlrDatatypeRuleToken lv_label_13_0 = null;

        AntlrDatatypeRuleToken lv_label_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:447:2: ( (otherlv_0= 'Draw a plot :' otherlv_1= 'graph_type=' ( (lv_graph_type_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'abs_column=' ( (lv_abs_column_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'ord_column=' ( (lv_ord_column_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) ) )* otherlv_11= ';' otherlv_12= 'labels=' ( (lv_label_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_label_15_0= ruleEString ) ) )* otherlv_16= ';' ) )
            // InternalMyDsl.g:448:2: (otherlv_0= 'Draw a plot :' otherlv_1= 'graph_type=' ( (lv_graph_type_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'abs_column=' ( (lv_abs_column_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'ord_column=' ( (lv_ord_column_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) ) )* otherlv_11= ';' otherlv_12= 'labels=' ( (lv_label_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_label_15_0= ruleEString ) ) )* otherlv_16= ';' )
            {
            // InternalMyDsl.g:448:2: (otherlv_0= 'Draw a plot :' otherlv_1= 'graph_type=' ( (lv_graph_type_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'abs_column=' ( (lv_abs_column_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'ord_column=' ( (lv_ord_column_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) ) )* otherlv_11= ';' otherlv_12= 'labels=' ( (lv_label_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_label_15_0= ruleEString ) ) )* otherlv_16= ';' )
            // InternalMyDsl.g:449:3: otherlv_0= 'Draw a plot :' otherlv_1= 'graph_type=' ( (lv_graph_type_2_0= ruleEString ) ) otherlv_3= ';' otherlv_4= 'abs_column=' ( (lv_abs_column_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'ord_column=' ( (lv_ord_column_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) ) )* otherlv_11= ';' otherlv_12= 'labels=' ( (lv_label_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_label_15_0= ruleEString ) ) )* otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_1());
            		
            // InternalMyDsl.g:457:3: ( (lv_graph_type_2_0= ruleEString ) )
            // InternalMyDsl.g:458:4: (lv_graph_type_2_0= ruleEString )
            {
            // InternalMyDsl.g:458:4: (lv_graph_type_2_0= ruleEString )
            // InternalMyDsl.g:459:5: lv_graph_type_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_graph_type_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            					}
            					set(
            						current,
            						"graph_type",
            						lv_graph_type_2_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_4());
            		
            // InternalMyDsl.g:484:3: ( (lv_abs_column_5_0= ruleEString ) )
            // InternalMyDsl.g:485:4: (lv_abs_column_5_0= ruleEString )
            {
            // InternalMyDsl.g:485:4: (lv_abs_column_5_0= ruleEString )
            // InternalMyDsl.g:486:5: lv_abs_column_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_abs_column_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            					}
            					set(
            						current,
            						"abs_column",
            						lv_abs_column_5_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_7());
            		
            // InternalMyDsl.g:511:3: ( (lv_ord_column_8_0= ruleEString ) )
            // InternalMyDsl.g:512:4: (lv_ord_column_8_0= ruleEString )
            {
            // InternalMyDsl.g:512:4: (lv_ord_column_8_0= ruleEString )
            // InternalMyDsl.g:513:5: lv_ord_column_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_ord_column_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            					}
            					add(
            						current,
            						"ord_column",
            						lv_ord_column_8_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:530:3: (otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:531:4: otherlv_9= ',' ( (lv_ord_column_10_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getGraphDrawingAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:535:4: ( (lv_ord_column_10_0= ruleEString ) )
            	    // InternalMyDsl.g:536:5: (lv_ord_column_10_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:536:5: (lv_ord_column_10_0= ruleEString )
            	    // InternalMyDsl.g:537:6: lv_ord_column_10_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ord_column_10_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ord_column",
            	    							lv_ord_column_10_0,
            	    							"chartIt.mydsl.MyDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_10());
            		
            otherlv_12=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getGraphDrawingAccess().getLabelsKeyword_11());
            		
            // InternalMyDsl.g:563:3: ( (lv_label_13_0= ruleEString ) )
            // InternalMyDsl.g:564:4: (lv_label_13_0= ruleEString )
            {
            // InternalMyDsl.g:564:4: (lv_label_13_0= ruleEString )
            // InternalMyDsl.g:565:5: lv_label_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_label_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            					}
            					add(
            						current,
            						"label",
            						lv_label_13_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:582:3: (otherlv_14= ',' ( (lv_label_15_0= ruleEString ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:583:4: otherlv_14= ',' ( (lv_label_15_0= ruleEString ) )
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getGraphDrawingAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:587:4: ( (lv_label_15_0= ruleEString ) )
            	    // InternalMyDsl.g:588:5: (lv_label_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:588:5: (lv_label_15_0= ruleEString )
            	    // InternalMyDsl.g:589:6: lv_label_15_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_label_15_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    						}
            	    						add(
            	    							current,
            	    							"label",
            	    							lv_label_15_0,
            	    							"chartIt.mydsl.MyDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphDrawing"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:615:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:615:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:616:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:622:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_index_1_0 = null;

        AntlrDatatypeRuleToken lv_new_name_column_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:628:2: ( (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:629:2: (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:629:2: (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) )
            // InternalMyDsl.g:630:3: otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:634:3: ( (lv_index_1_0= ruleEInt ) )
            // InternalMyDsl.g:635:4: (lv_index_1_0= ruleEInt )
            {
            // InternalMyDsl.g:635:4: (lv_index_1_0= ruleEInt )
            // InternalMyDsl.g:636:5: lv_index_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_index_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"index",
            						lv_index_1_0,
            						"chartIt.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:657:3: ( (lv_new_name_column_3_0= ruleEString ) )
            // InternalMyDsl.g:658:4: (lv_new_name_column_3_0= ruleEString )
            {
            // InternalMyDsl.g:658:4: (lv_new_name_column_3_0= ruleEString )
            // InternalMyDsl.g:659:5: lv_new_name_column_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNew_name_columnEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_new_name_column_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"new_name_column",
            						lv_new_name_column_3_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleRowFilter"
    // InternalMyDsl.g:680:1: entryRuleRowFilter returns [EObject current=null] : iv_ruleRowFilter= ruleRowFilter EOF ;
    public final EObject entryRuleRowFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowFilter = null;


        try {
            // InternalMyDsl.g:680:50: (iv_ruleRowFilter= ruleRowFilter EOF )
            // InternalMyDsl.g:681:2: iv_ruleRowFilter= ruleRowFilter EOF
            {
             newCompositeNode(grammarAccess.getRowFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowFilter=ruleRowFilter();

            state._fsp--;

             current =iv_ruleRowFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRowFilter"


    // $ANTLR start "ruleRowFilter"
    // InternalMyDsl.g:687:1: ruleRowFilter returns [EObject current=null] : ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' ) ;
    public final EObject ruleRowFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_column_name_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_string_value_2_0 = null;

        AntlrDatatypeRuleToken lv_int_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:693:2: ( ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:694:2: ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:694:2: ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' )
            // InternalMyDsl.g:695:3: ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:695:3: ( (lv_column_name_0_0= ruleEString ) )
            // InternalMyDsl.g:696:4: (lv_column_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:696:4: (lv_column_name_0_0= ruleEString )
            // InternalMyDsl.g:697:5: lv_column_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRowFilterAccess().getColumn_nameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_column_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowFilterRule());
            					}
            					set(
            						current,
            						"column_name",
            						lv_column_name_0_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:714:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalMyDsl.g:715:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalMyDsl.g:715:4: (lv_operator_1_0= ruleOperator )
            // InternalMyDsl.g:716:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getRowFilterAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRowFilterRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"chartIt.mydsl.MyDsl.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:733:3: ( (lv_string_value_2_0= ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:734:4: (lv_string_value_2_0= ruleEString )
                    {
                    // InternalMyDsl.g:734:4: (lv_string_value_2_0= ruleEString )
                    // InternalMyDsl.g:735:5: lv_string_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRowFilterAccess().getString_valueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_string_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRowFilterRule());
                    					}
                    					set(
                    						current,
                    						"string_value",
                    						lv_string_value_2_0,
                    						"chartIt.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:752:3: ( (lv_int_value_3_0= ruleEInt ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:753:4: (lv_int_value_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:753:4: (lv_int_value_3_0= ruleEInt )
                    // InternalMyDsl.g:754:5: lv_int_value_3_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getRowFilterAccess().getInt_valueEIntParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_int_value_3_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRowFilterRule());
                    					}
                    					set(
                    						current,
                    						"int_value",
                    						lv_int_value_3_0,
                    						"chartIt.mydsl.MyDsl.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRowFilterAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowFilter"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:779:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:785:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) ) )
            // InternalMyDsl.g:786:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) )
            {
            // InternalMyDsl.g:786:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:787:3: (enumLiteral_0= '>' )
                    {
                    // InternalMyDsl.g:787:3: (enumLiteral_0= '>' )
                    // InternalMyDsl.g:788:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:795:3: (enumLiteral_1= '<' )
                    {
                    // InternalMyDsl.g:795:3: (enumLiteral_1= '<' )
                    // InternalMyDsl.g:796:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:803:3: (enumLiteral_2= '==' )
                    {
                    // InternalMyDsl.g:803:3: (enumLiteral_2= '==' )
                    // InternalMyDsl.g:804:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000260000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000268000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000014070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000014040L});

}