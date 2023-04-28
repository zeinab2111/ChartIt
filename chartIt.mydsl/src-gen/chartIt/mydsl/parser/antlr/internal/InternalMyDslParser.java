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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'{'", "'id'", "'='", "';'", "'}'", "'-'", "'true'", "'false'", "'uses :'", "'filter :'", "','", "'condition :'", "'draw a plot :'", "'graph_type'", "'abs_column'", "'ord_column'", "'labels'", "'fill'", "'title'", "'column'", "'as'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    // InternalMyDsl.g:72:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= ruleEString ) ) otherlv_6= ';' ( (lv_functions_7_0= ruleFunction ) ) ( (lv_functions_8_0= ruleFunction ) )* otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_functions_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= ruleEString ) ) otherlv_6= ';' ( (lv_functions_7_0= ruleFunction ) ) ( (lv_functions_8_0= ruleFunction ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= ruleEString ) ) otherlv_6= ';' ( (lv_functions_7_0= ruleFunction ) ) ( (lv_functions_8_0= ruleFunction ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= ruleEString ) ) otherlv_6= ';' ( (lv_functions_7_0= ruleFunction ) ) ( (lv_functions_8_0= ruleFunction ) )* otherlv_9= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Program' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'id' otherlv_4= '=' ( (lv_id_5_0= ruleEString ) ) otherlv_6= ';' ( (lv_functions_7_0= ruleFunction ) ) ( (lv_functions_8_0= ruleFunction ) )* otherlv_9= '}'
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getIdKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:115:3: ( (lv_id_5_0= ruleEString ) )
            // InternalMyDsl.g:116:4: (lv_id_5_0= ruleEString )
            {
            // InternalMyDsl.g:116:4: (lv_id_5_0= ruleEString )
            // InternalMyDsl.g:117:5: lv_id_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getIdEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_id_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_5_0,
            						"chartIt.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getSemicolonKeyword_6());
            		
            // InternalMyDsl.g:138:3: ( (lv_functions_7_0= ruleFunction ) )
            // InternalMyDsl.g:139:4: (lv_functions_7_0= ruleFunction )
            {
            // InternalMyDsl.g:139:4: (lv_functions_7_0= ruleFunction )
            // InternalMyDsl.g:140:5: lv_functions_7_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalMyDsl.g:157:3: ( (lv_functions_8_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=20 && LA1_0<=21)||LA1_0==24||(LA1_0>=26 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:158:4: (lv_functions_8_0= ruleFunction )
            	    {
            	    // InternalMyDsl.g:158:4: (lv_functions_8_0= ruleFunction )
            	    // InternalMyDsl.g:159:5: lv_functions_8_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_functions_8_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_8_0,
            	    						"chartIt.mydsl.MyDsl.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:184:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:184:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:185:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalMyDsl.g:191:1: ruleFunction returns [EObject current=null] : (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_CsvLoader_0 = null;

        EObject this_DataFiltering_1 = null;

        EObject this_GraphDrawing_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:197:2: ( (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing ) )
            // InternalMyDsl.g:198:2: (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing )
            {
            // InternalMyDsl.g:198:2: (this_CsvLoader_0= ruleCsvLoader | this_DataFiltering_1= ruleDataFiltering | this_GraphDrawing_2= ruleGraphDrawing )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
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
                    // InternalMyDsl.g:199:3: this_CsvLoader_0= ruleCsvLoader
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
                    // InternalMyDsl.g:208:3: this_DataFiltering_1= ruleDataFiltering
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
                    // InternalMyDsl.g:217:3: this_GraphDrawing_2= ruleGraphDrawing
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
    // InternalMyDsl.g:229:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:229:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:230:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:236:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:242:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:243:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:243:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:244:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:252:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:263:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:263:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:264:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:270:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:276:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:277:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:277:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:278:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:278:3: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:279:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_10); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:296:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:296:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:297:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:303:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:309:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:310:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:310:2: (kw= 'true' | kw= 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:311:3: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:317:3: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleCsvLoader"
    // InternalMyDsl.g:326:1: entryRuleCsvLoader returns [EObject current=null] : iv_ruleCsvLoader= ruleCsvLoader EOF ;
    public final EObject entryRuleCsvLoader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvLoader = null;


        try {
            // InternalMyDsl.g:326:50: (iv_ruleCsvLoader= ruleCsvLoader EOF )
            // InternalMyDsl.g:327:2: iv_ruleCsvLoader= ruleCsvLoader EOF
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
    // InternalMyDsl.g:333:1: ruleCsvLoader returns [EObject current=null] : (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' ) ;
    public final EObject ruleCsvLoader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:339:2: ( (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' ) )
            // InternalMyDsl.g:340:2: (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' )
            {
            // InternalMyDsl.g:340:2: (otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';' )
            // InternalMyDsl.g:341:3: otherlv_0= 'uses :' ( (lv_path_1_0= ruleEString ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCsvLoaderAccess().getUsesKeyword_0());
            		
            // InternalMyDsl.g:345:3: ( (lv_path_1_0= ruleEString ) )
            // InternalMyDsl.g:346:4: (lv_path_1_0= ruleEString )
            {
            // InternalMyDsl.g:346:4: (lv_path_1_0= ruleEString )
            // InternalMyDsl.g:347:5: lv_path_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvLoaderAccess().getPathEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:372:1: entryRuleDataFiltering returns [EObject current=null] : iv_ruleDataFiltering= ruleDataFiltering EOF ;
    public final EObject entryRuleDataFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFiltering = null;


        try {
            // InternalMyDsl.g:372:54: (iv_ruleDataFiltering= ruleDataFiltering EOF )
            // InternalMyDsl.g:373:2: iv_ruleDataFiltering= ruleDataFiltering EOF
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
    // InternalMyDsl.g:379:1: ruleDataFiltering returns [EObject current=null] : (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? ) ;
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
            // InternalMyDsl.g:385:2: ( (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? ) )
            // InternalMyDsl.g:386:2: (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? )
            {
            // InternalMyDsl.g:386:2: (otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )? )
            // InternalMyDsl.g:387:3: otherlv_0= 'filter :' ( (lv_column_filter_1_0= ruleColumn ) ) (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )* otherlv_4= ';' (otherlv_5= 'condition :' )? ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFilteringAccess().getFilterKeyword_0());
            		
            // InternalMyDsl.g:391:3: ( (lv_column_filter_1_0= ruleColumn ) )
            // InternalMyDsl.g:392:4: (lv_column_filter_1_0= ruleColumn )
            {
            // InternalMyDsl.g:392:4: (lv_column_filter_1_0= ruleColumn )
            // InternalMyDsl.g:393:5: lv_column_filter_1_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalMyDsl.g:410:3: (otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:411:4: otherlv_2= ',' ( (lv_column_filter_3_0= ruleColumn ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:415:4: ( (lv_column_filter_3_0= ruleColumn ) )
            	    // InternalMyDsl.g:416:5: (lv_column_filter_3_0= ruleColumn )
            	    {
            	    // InternalMyDsl.g:416:5: (lv_column_filter_3_0= ruleColumn )
            	    // InternalMyDsl.g:417:6: lv_column_filter_3_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getDataFilteringAccess().getColumn_filterColumnParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getDataFilteringAccess().getSemicolonKeyword_3());
            		
            // InternalMyDsl.g:439:3: (otherlv_5= 'condition :' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:440:4: otherlv_5= 'condition :'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getDataFilteringAccess().getConditionKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:445:3: ( (lv_rowfilter_condition_6_0= ruleRowFilter ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:446:4: (lv_rowfilter_condition_6_0= ruleRowFilter )
                    {
                    // InternalMyDsl.g:446:4: (lv_rowfilter_condition_6_0= ruleRowFilter )
                    // InternalMyDsl.g:447:5: lv_rowfilter_condition_6_0= ruleRowFilter
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
    // InternalMyDsl.g:468:1: entryRuleGraphDrawing returns [EObject current=null] : iv_ruleGraphDrawing= ruleGraphDrawing EOF ;
    public final EObject entryRuleGraphDrawing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphDrawing = null;


        try {
            // InternalMyDsl.g:468:53: (iv_ruleGraphDrawing= ruleGraphDrawing EOF )
            // InternalMyDsl.g:469:2: iv_ruleGraphDrawing= ruleGraphDrawing EOF
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
    // InternalMyDsl.g:475:1: ruleGraphDrawing returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGraphDrawing() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_graph_type_4_0 = null;

        AntlrDatatypeRuleToken lv_abs_column_8_0 = null;

        AntlrDatatypeRuleToken lv_ord_column_13_0 = null;

        AntlrDatatypeRuleToken lv_ord_column_15_0 = null;

        AntlrDatatypeRuleToken lv_label_19_0 = null;

        AntlrDatatypeRuleToken lv_label_21_0 = null;

        AntlrDatatypeRuleToken lv_fill_25_0 = null;

        AntlrDatatypeRuleToken lv_fill_27_0 = null;

        AntlrDatatypeRuleToken lv_title_31_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:481:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:482:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:482:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:483:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:483:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:484:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:487:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:488:5: ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:488:5: ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=4;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:489:3: ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:489:3: ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) )
            	    // InternalMyDsl.g:490:4: {...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:490:106: ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) )
            	    // InternalMyDsl.g:491:5: ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:494:8: ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) )
            	    // InternalMyDsl.g:494:9: {...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "true");
            	    }
            	    // InternalMyDsl.g:494:18: (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' )
            	    // InternalMyDsl.g:494:19: otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';'
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_15); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGraphDrawingAccess().getDrawAPlotKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,25,FOLLOW_6); 

            	    								newLeafNode(otherlv_2, grammarAccess.getGraphDrawingAccess().getGraph_typeKeyword_0_1());
            	    							
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_0_2());
            	    							
            	    // InternalMyDsl.g:506:8: ( (lv_graph_type_4_0= ruleEString ) )
            	    // InternalMyDsl.g:507:9: (lv_graph_type_4_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:507:9: (lv_graph_type_4_0= ruleEString )
            	    // InternalMyDsl.g:508:10: lv_graph_type_4_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGraphDrawingAccess().getGraph_typeEStringParserRuleCall_0_3_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_graph_type_4_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"graph_type",
            	    											lv_graph_type_4_0,
            	    											"chartIt.mydsl.MyDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_16); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_0_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:535:3: ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:535:3: ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) )
            	    // InternalMyDsl.g:536:4: {...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:536:106: ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) )
            	    // InternalMyDsl.g:537:5: ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:540:8: ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) )
            	    // InternalMyDsl.g:540:9: {...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "true");
            	    }
            	    // InternalMyDsl.g:540:18: (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' )
            	    // InternalMyDsl.g:540:19: otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';'
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_6); 

            	    								newLeafNode(otherlv_6, grammarAccess.getGraphDrawingAccess().getAbs_columnKeyword_1_0());
            	    							
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_1_1());
            	    							
            	    // InternalMyDsl.g:548:8: ( (lv_abs_column_8_0= ruleEString ) )
            	    // InternalMyDsl.g:549:9: (lv_abs_column_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:549:9: (lv_abs_column_8_0= ruleEString )
            	    // InternalMyDsl.g:550:10: lv_abs_column_8_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGraphDrawingAccess().getAbs_columnEStringParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_abs_column_8_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"abs_column",
            	    											lv_abs_column_8_0,
            	    											"chartIt.mydsl.MyDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,15,FOLLOW_16); 

            	    								newLeafNode(otherlv_9, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:577:3: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:577:3: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) )
            	    // InternalMyDsl.g:578:4: {...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:578:106: ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) )
            	    // InternalMyDsl.g:579:5: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:582:8: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) )
            	    // InternalMyDsl.g:582:9: {...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "true");
            	    }
            	    // InternalMyDsl.g:582:18: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? )
            	    // InternalMyDsl.g:582:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )?
            	    {
            	    // InternalMyDsl.g:582:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) )
            	    // InternalMyDsl.g:583:9: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalMyDsl.g:583:9: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) )
            	    // InternalMyDsl.g:584:10: ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?)
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	    									
            	    // InternalMyDsl.g:587:10: ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?)
            	    // InternalMyDsl.g:588:11: ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?
            	    {
            	    // InternalMyDsl.g:588:11: ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=4;
            	        switch ( input.LA(1) ) {
            	        case 27:
            	            {
            	            int LA12_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0) ) {
            	                alt12=1;
            	            }


            	            }
            	            break;
            	        case 28:
            	            {
            	            int LA12_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1) ) {
            	                alt12=2;
            	            }


            	            }
            	            break;
            	        case 29:
            	            {
            	            int LA12_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2) ) {
            	                alt12=3;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:589:9: ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) )
            	    	    {
            	    	    // InternalMyDsl.g:589:9: ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) )
            	    	    // InternalMyDsl.g:590:10: {...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0)");
            	    	    }
            	    	    // InternalMyDsl.g:590:116: ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) )
            	    	    // InternalMyDsl.g:591:11: ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 0);
            	    	    										
            	    	    // InternalMyDsl.g:594:14: ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) )
            	    	    // InternalMyDsl.g:594:15: {...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphDrawing", "true");
            	    	    }
            	    	    // InternalMyDsl.g:594:24: (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' )
            	    	    // InternalMyDsl.g:594:25: otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';'
            	    	    {
            	    	    otherlv_11=(Token)match(input,27,FOLLOW_6); 

            	    	    														newLeafNode(otherlv_11, grammarAccess.getGraphDrawingAccess().getOrd_columnKeyword_2_0_0_0());
            	    	    													
            	    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

            	    	    														newLeafNode(otherlv_12, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_0_1());
            	    	    													
            	    	    // InternalMyDsl.g:602:14: ( (lv_ord_column_13_0= ruleEString ) )
            	    	    // InternalMyDsl.g:603:15: (lv_ord_column_13_0= ruleEString )
            	    	    {
            	    	    // InternalMyDsl.g:603:15: (lv_ord_column_13_0= ruleEString )
            	    	    // InternalMyDsl.g:604:16: lv_ord_column_13_0= ruleEString
            	    	    {

            	    	    																newCompositeNode(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_2_0_0_2_0());
            	    	    															
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_ord_column_13_0=ruleEString();

            	    	    state._fsp--;


            	    	    																if (current==null) {
            	    	    																	current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    	    																}
            	    	    																add(
            	    	    																	current,
            	    	    																	"ord_column",
            	    	    																	lv_ord_column_13_0,
            	    	    																	"chartIt.mydsl.MyDsl.EString");
            	    	    																afterParserOrEnumRuleCall();
            	    	    															

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:621:14: (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )*
            	    	    loop9:
            	    	    do {
            	    	        int alt9=2;
            	    	        int LA9_0 = input.LA(1);

            	    	        if ( (LA9_0==22) ) {
            	    	            alt9=1;
            	    	        }


            	    	        switch (alt9) {
            	    	    	case 1 :
            	    	    	    // InternalMyDsl.g:622:15: otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) )
            	    	    	    {
            	    	    	    otherlv_14=(Token)match(input,22,FOLLOW_3); 

            	    	    	    															newLeafNode(otherlv_14, grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_0_3_0());
            	    	    	    														
            	    	    	    // InternalMyDsl.g:626:15: ( (lv_ord_column_15_0= ruleEString ) )
            	    	    	    // InternalMyDsl.g:627:16: (lv_ord_column_15_0= ruleEString )
            	    	    	    {
            	    	    	    // InternalMyDsl.g:627:16: (lv_ord_column_15_0= ruleEString )
            	    	    	    // InternalMyDsl.g:628:17: lv_ord_column_15_0= ruleEString
            	    	    	    {

            	    	    	    																	newCompositeNode(grammarAccess.getGraphDrawingAccess().getOrd_columnEStringParserRuleCall_2_0_0_3_1_0());
            	    	    	    																
            	    	    	    pushFollow(FOLLOW_12);
            	    	    	    lv_ord_column_15_0=ruleEString();

            	    	    	    state._fsp--;


            	    	    	    																	if (current==null) {
            	    	    	    																		current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    	    	    																	}
            	    	    	    																	add(
            	    	    	    																		current,
            	    	    	    																		"ord_column",
            	    	    	    																		lv_ord_column_15_0,
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

            	    	    otherlv_16=(Token)match(input,15,FOLLOW_17); 

            	    	    														newLeafNode(otherlv_16, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_0_4());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalMyDsl.g:656:9: ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) )
            	    	    {
            	    	    // InternalMyDsl.g:656:9: ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) )
            	    	    // InternalMyDsl.g:657:10: {...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1)");
            	    	    }
            	    	    // InternalMyDsl.g:657:116: ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) )
            	    	    // InternalMyDsl.g:658:11: ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 1);
            	    	    										
            	    	    // InternalMyDsl.g:661:14: ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) )
            	    	    // InternalMyDsl.g:661:15: {...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphDrawing", "true");
            	    	    }
            	    	    // InternalMyDsl.g:661:24: (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' )
            	    	    // InternalMyDsl.g:661:25: otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';'
            	    	    {
            	    	    otherlv_17=(Token)match(input,28,FOLLOW_6); 

            	    	    														newLeafNode(otherlv_17, grammarAccess.getGraphDrawingAccess().getLabelsKeyword_2_0_1_0());
            	    	    													
            	    	    otherlv_18=(Token)match(input,14,FOLLOW_3); 

            	    	    														newLeafNode(otherlv_18, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_1_1());
            	    	    													
            	    	    // InternalMyDsl.g:669:14: ( (lv_label_19_0= ruleEString ) )
            	    	    // InternalMyDsl.g:670:15: (lv_label_19_0= ruleEString )
            	    	    {
            	    	    // InternalMyDsl.g:670:15: (lv_label_19_0= ruleEString )
            	    	    // InternalMyDsl.g:671:16: lv_label_19_0= ruleEString
            	    	    {

            	    	    																newCompositeNode(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_2_0_1_2_0());
            	    	    															
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_label_19_0=ruleEString();

            	    	    state._fsp--;


            	    	    																if (current==null) {
            	    	    																	current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    	    																}
            	    	    																add(
            	    	    																	current,
            	    	    																	"label",
            	    	    																	lv_label_19_0,
            	    	    																	"chartIt.mydsl.MyDsl.EString");
            	    	    																afterParserOrEnumRuleCall();
            	    	    															

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:688:14: (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )*
            	    	    loop10:
            	    	    do {
            	    	        int alt10=2;
            	    	        int LA10_0 = input.LA(1);

            	    	        if ( (LA10_0==22) ) {
            	    	            alt10=1;
            	    	        }


            	    	        switch (alt10) {
            	    	    	case 1 :
            	    	    	    // InternalMyDsl.g:689:15: otherlv_20= ',' ( (lv_label_21_0= ruleEString ) )
            	    	    	    {
            	    	    	    otherlv_20=(Token)match(input,22,FOLLOW_3); 

            	    	    	    															newLeafNode(otherlv_20, grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_1_3_0());
            	    	    	    														
            	    	    	    // InternalMyDsl.g:693:15: ( (lv_label_21_0= ruleEString ) )
            	    	    	    // InternalMyDsl.g:694:16: (lv_label_21_0= ruleEString )
            	    	    	    {
            	    	    	    // InternalMyDsl.g:694:16: (lv_label_21_0= ruleEString )
            	    	    	    // InternalMyDsl.g:695:17: lv_label_21_0= ruleEString
            	    	    	    {

            	    	    	    																	newCompositeNode(grammarAccess.getGraphDrawingAccess().getLabelEStringParserRuleCall_2_0_1_3_1_0());
            	    	    	    																
            	    	    	    pushFollow(FOLLOW_12);
            	    	    	    lv_label_21_0=ruleEString();

            	    	    	    state._fsp--;


            	    	    	    																	if (current==null) {
            	    	    	    																		current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    	    	    																	}
            	    	    	    																	add(
            	    	    	    																		current,
            	    	    	    																		"label",
            	    	    	    																		lv_label_21_0,
            	    	    	    																		"chartIt.mydsl.MyDsl.EString");
            	    	    	    																	afterParserOrEnumRuleCall();
            	    	    	    																

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop10;
            	    	        }
            	    	    } while (true);

            	    	    otherlv_22=(Token)match(input,15,FOLLOW_17); 

            	    	    														newLeafNode(otherlv_22, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_1_4());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalMyDsl.g:723:9: ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) )
            	    	    {
            	    	    // InternalMyDsl.g:723:9: ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) )
            	    	    // InternalMyDsl.g:724:10: {...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2)");
            	    	    }
            	    	    // InternalMyDsl.g:724:116: ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) )
            	    	    // InternalMyDsl.g:725:11: ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0(), 2);
            	    	    										
            	    	    // InternalMyDsl.g:728:14: ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) )
            	    	    // InternalMyDsl.g:728:15: {...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGraphDrawing", "true");
            	    	    }
            	    	    // InternalMyDsl.g:728:24: (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' )
            	    	    // InternalMyDsl.g:728:25: otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';'
            	    	    {
            	    	    otherlv_23=(Token)match(input,29,FOLLOW_6); 

            	    	    														newLeafNode(otherlv_23, grammarAccess.getGraphDrawingAccess().getFillKeyword_2_0_2_0());
            	    	    													
            	    	    otherlv_24=(Token)match(input,14,FOLLOW_18); 

            	    	    														newLeafNode(otherlv_24, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_0_2_1());
            	    	    													
            	    	    // InternalMyDsl.g:736:14: ( (lv_fill_25_0= ruleEBoolean ) )
            	    	    // InternalMyDsl.g:737:15: (lv_fill_25_0= ruleEBoolean )
            	    	    {
            	    	    // InternalMyDsl.g:737:15: (lv_fill_25_0= ruleEBoolean )
            	    	    // InternalMyDsl.g:738:16: lv_fill_25_0= ruleEBoolean
            	    	    {

            	    	    																newCompositeNode(grammarAccess.getGraphDrawingAccess().getFillEBooleanParserRuleCall_2_0_2_2_0());
            	    	    															
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_fill_25_0=ruleEBoolean();

            	    	    state._fsp--;


            	    	    																if (current==null) {
            	    	    																	current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    	    																}
            	    	    																add(
            	    	    																	current,
            	    	    																	"fill",
            	    	    																	lv_fill_25_0,
            	    	    																	"chartIt.mydsl.MyDsl.EBoolean");
            	    	    																afterParserOrEnumRuleCall();
            	    	    															

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:755:14: (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )*
            	    	    loop11:
            	    	    do {
            	    	        int alt11=2;
            	    	        int LA11_0 = input.LA(1);

            	    	        if ( (LA11_0==22) ) {
            	    	            alt11=1;
            	    	        }


            	    	        switch (alt11) {
            	    	    	case 1 :
            	    	    	    // InternalMyDsl.g:756:15: otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) )
            	    	    	    {
            	    	    	    otherlv_26=(Token)match(input,22,FOLLOW_18); 

            	    	    	    															newLeafNode(otherlv_26, grammarAccess.getGraphDrawingAccess().getCommaKeyword_2_0_2_3_0());
            	    	    	    														
            	    	    	    // InternalMyDsl.g:760:15: ( (lv_fill_27_0= ruleEBoolean ) )
            	    	    	    // InternalMyDsl.g:761:16: (lv_fill_27_0= ruleEBoolean )
            	    	    	    {
            	    	    	    // InternalMyDsl.g:761:16: (lv_fill_27_0= ruleEBoolean )
            	    	    	    // InternalMyDsl.g:762:17: lv_fill_27_0= ruleEBoolean
            	    	    	    {

            	    	    	    																	newCompositeNode(grammarAccess.getGraphDrawingAccess().getFillEBooleanParserRuleCall_2_0_2_3_1_0());
            	    	    	    																
            	    	    	    pushFollow(FOLLOW_12);
            	    	    	    lv_fill_27_0=ruleEBoolean();

            	    	    	    state._fsp--;


            	    	    	    																	if (current==null) {
            	    	    	    																		current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	    	    	    																	}
            	    	    	    																	add(
            	    	    	    																		current,
            	    	    	    																		"fill",
            	    	    	    																		lv_fill_27_0,
            	    	    	    																		"chartIt.mydsl.MyDsl.EBoolean");
            	    	    	    																	afterParserOrEnumRuleCall();
            	    	    	    																

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop11;
            	    	        }
            	    	    } while (true);

            	    	    otherlv_28=(Token)match(input,15,FOLLOW_17); 

            	    	    														newLeafNode(otherlv_28, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_0_2_4());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0()) ) {
            	        throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0())");
            	    }

            	    }


            	    }

            	     
            	    									  getUnorderedGroupHelper().leave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup_2_0());
            	    									

            	    }

            	    // InternalMyDsl.g:798:8: (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==30) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalMyDsl.g:799:9: otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';'
            	            {
            	            otherlv_29=(Token)match(input,30,FOLLOW_6); 

            	            									newLeafNode(otherlv_29, grammarAccess.getGraphDrawingAccess().getTitleKeyword_2_1_0());
            	            								
            	            otherlv_30=(Token)match(input,14,FOLLOW_19); 

            	            									newLeafNode(otherlv_30, grammarAccess.getGraphDrawingAccess().getEqualsSignKeyword_2_1_1());
            	            								
            	            // InternalMyDsl.g:807:9: ( (lv_title_31_0= ruleEString ) )*
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:808:10: (lv_title_31_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:808:10: (lv_title_31_0= ruleEString )
            	            	    // InternalMyDsl.g:809:11: lv_title_31_0= ruleEString
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getGraphDrawingAccess().getTitleEStringParserRuleCall_2_1_2_0());
            	            	    										
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_title_31_0=ruleEString();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getGraphDrawingRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"title",
            	            	    												lv_title_31_0,
            	            	    												"chartIt.mydsl.MyDsl.EString");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop13;
            	                }
            	            } while (true);

            	            otherlv_32=(Token)match(input,15,FOLLOW_16); 

            	            									newLeafNode(otherlv_32, grammarAccess.getGraphDrawingAccess().getSemicolonKeyword_2_1_3());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGraphDrawing", "getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup());
            			

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
    // InternalMyDsl.g:848:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:848:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:849:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalMyDsl.g:855:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_index_1_0 = null;

        AntlrDatatypeRuleToken lv_new_name_column_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:861:2: ( (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) ) )
            // InternalMyDsl.g:862:2: (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:862:2: (otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) ) )
            // InternalMyDsl.g:863:3: otherlv_0= 'column' ( (lv_index_1_0= ruleEInt ) ) otherlv_2= 'as' ( (lv_new_name_column_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            // InternalMyDsl.g:867:3: ( (lv_index_1_0= ruleEInt ) )
            // InternalMyDsl.g:868:4: (lv_index_1_0= ruleEInt )
            {
            // InternalMyDsl.g:868:4: (lv_index_1_0= ruleEInt )
            // InternalMyDsl.g:869:5: lv_index_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getIndexEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:890:3: ( (lv_new_name_column_3_0= ruleEString ) )
            // InternalMyDsl.g:891:4: (lv_new_name_column_3_0= ruleEString )
            {
            // InternalMyDsl.g:891:4: (lv_new_name_column_3_0= ruleEString )
            // InternalMyDsl.g:892:5: lv_new_name_column_3_0= ruleEString
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
    // InternalMyDsl.g:913:1: entryRuleRowFilter returns [EObject current=null] : iv_ruleRowFilter= ruleRowFilter EOF ;
    public final EObject entryRuleRowFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowFilter = null;


        try {
            // InternalMyDsl.g:913:50: (iv_ruleRowFilter= ruleRowFilter EOF )
            // InternalMyDsl.g:914:2: iv_ruleRowFilter= ruleRowFilter EOF
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
    // InternalMyDsl.g:920:1: ruleRowFilter returns [EObject current=null] : ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' ) ;
    public final EObject ruleRowFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_column_name_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_string_value_2_0 = null;

        AntlrDatatypeRuleToken lv_int_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:926:2: ( ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' ) )
            // InternalMyDsl.g:927:2: ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' )
            {
            // InternalMyDsl.g:927:2: ( ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';' )
            // InternalMyDsl.g:928:3: ( (lv_column_name_0_0= ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_string_value_2_0= ruleEString ) )? ( (lv_int_value_3_0= ruleEInt ) )? otherlv_4= ';'
            {
            // InternalMyDsl.g:928:3: ( (lv_column_name_0_0= ruleEString ) )
            // InternalMyDsl.g:929:4: (lv_column_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:929:4: (lv_column_name_0_0= ruleEString )
            // InternalMyDsl.g:930:5: lv_column_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRowFilterAccess().getColumn_nameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalMyDsl.g:947:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalMyDsl.g:948:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalMyDsl.g:948:4: (lv_operator_1_0= ruleOperator )
            // InternalMyDsl.g:949:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getRowFilterAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:966:3: ( (lv_string_value_2_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:967:4: (lv_string_value_2_0= ruleEString )
                    {
                    // InternalMyDsl.g:967:4: (lv_string_value_2_0= ruleEString )
                    // InternalMyDsl.g:968:5: lv_string_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRowFilterAccess().getString_valueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:985:3: ( (lv_int_value_3_0= ruleEInt ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:986:4: (lv_int_value_3_0= ruleEInt )
                    {
                    // InternalMyDsl.g:986:4: (lv_int_value_3_0= ruleEInt )
                    // InternalMyDsl.g:987:5: lv_int_value_3_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getRowFilterAccess().getInt_valueEIntParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
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

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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
    // InternalMyDsl.g:1012:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1018:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalMyDsl.g:1019:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalMyDsl.g:1019:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '!=' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            case 36:
                {
                alt18=4;
                }
                break;
            case 37:
                {
                alt18=5;
                }
                break;
            case 38:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1020:3: (enumLiteral_0= '>' )
                    {
                    // InternalMyDsl.g:1020:3: (enumLiteral_0= '>' )
                    // InternalMyDsl.g:1021:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGreater_thanEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1028:3: (enumLiteral_1= '<' )
                    {
                    // InternalMyDsl.g:1028:3: (enumLiteral_1= '<' )
                    // InternalMyDsl.g:1029:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSmaller_thanEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1036:3: (enumLiteral_2= '==' )
                    {
                    // InternalMyDsl.g:1036:3: (enumLiteral_2= '==' )
                    // InternalMyDsl.g:1037:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1044:3: (enumLiteral_3= '>=' )
                    {
                    // InternalMyDsl.g:1044:3: (enumLiteral_3= '>=' )
                    // InternalMyDsl.g:1045:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGreater_than_or_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGreater_than_or_equalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1052:3: (enumLiteral_4= '<=' )
                    {
                    // InternalMyDsl.g:1052:3: (enumLiteral_4= '<=' )
                    // InternalMyDsl.g:1053:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSmaller_than_or_equalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getSmaller_than_or_equalEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1060:3: (enumLiteral_5= '!=' )
                    {
                    // InternalMyDsl.g:1060:3: (enumLiteral_5= '!=' )
                    // InternalMyDsl.g:1061:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getNot_equalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getNot_equalEnumLiteralDeclaration_5());
                    			

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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\20\1\uffff\5\0\3\uffff";
    static final String dfa_4s = "\1\35\1\uffff\5\0\3\uffff";
    static final String dfa_5s = "\1\uffff\1\4\5\uffff\1\1\1\2\1\3";
    static final String dfa_6s = "\2\uffff\1\4\1\1\1\2\1\0\1\3\3\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\2\1\2\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 488:5: ( ({...}? => ( ({...}? => (otherlv_1= 'draw a plot :' otherlv_2= 'graph_type' otherlv_3= '=' ( (lv_graph_type_4_0= ruleEString ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'abs_column' otherlv_7= '=' ( (lv_abs_column_8_0= ruleEString ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'ord_column' otherlv_12= '=' ( (lv_ord_column_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_ord_column_15_0= ruleEString ) ) )* otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'labels' otherlv_18= '=' ( (lv_label_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_label_21_0= ruleEString ) ) )* otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'fill' otherlv_24= '=' ( (lv_fill_25_0= ruleEBoolean ) ) (otherlv_26= ',' ( (lv_fill_27_0= ruleEBoolean ) ) )* otherlv_28= ';' ) ) ) ) )+ {...}?) ) ) (otherlv_29= 'title' otherlv_30= '=' ( (lv_title_31_0= ruleEString ) )* otherlv_32= ';' )? ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGraphDrawingAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGraphDrawingAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003D300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003D310000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003D000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007D000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000028070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000028040L});

}
