// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g 2012-12-04 05:25:44

    package lois.lab2.parser.output;    
	
	import lois.lab2.fuzzy.FuzzySet;
	import lois.lab2.fuzzy.KnowledgeBase;
	import lois.lab2.fuzzy.Rule;
	import scala.Tuple2;
	import lois.lab2.fuzzy.Factory;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FuzzyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETTER", "DIGIT", "BEFORE_ONE", "ONE", "SPACE", "COMMENT", "'.'", "'='", "'{'", "'}'", "','", "'('", "')'", "'=>'"
    };
    public static final int T__16=16;
    public static final int BEFORE_ONE=6;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int LETTER=4;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int ONE=7;
    public static final int DIGIT=5;
    public static final int COMMENT=9;
    public static final int SPACE=8;
    public static final int EOF=-1;

    // delegates
    // delegators


        public FuzzyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FuzzyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FuzzyParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g"; }



    	private static List<String> errorList = new ArrayList<String>();
    	
    	private int errorLine;

        public static void main(String[] args) throws Exception {
        	
    		//String codeFile = args[0];
        	String baseFile = "knowledgeBase/knowledgeBase_0.txt";

    		//CharStream input = new ANTLRFileStream(args[0]);
    		FuzzyLexer lexer = new FuzzyLexer(new ANTLRFileStream(baseFile));
            FuzzyParser parser = new FuzzyParser(new CommonTokenStream(lexer));
            parser.base();

            if (!errorList.isEmpty()) {
            	System.out.println("Next errors was found: ");
                
                for (String error : errorList) {
                	System.out.println(error);
                }
            } else {
                System.out.println("Success!");
                System.out.println(KnowledgeBase.toString());
           	}
       	}

        public String getErrorHeader(RecognitionException e) {
            errorLine = e.line;
            return "";
        }

        public void emitErrorMessage(String message) {
            errorList.add("line " + errorLine + ": " + message);
        }



    // $ANTLR start "base"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:60:1: base : factList ( ruleList )? ;
    public final void base() throws RecognitionException {
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:61:2: ( factList ( ruleList )? )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:61:4: factList ( ruleList )?
            {
            pushFollow(FOLLOW_factList_in_base48);
            factList();

            state._fsp--;

            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:61:13: ( ruleList )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LETTER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:61:13: ruleList
                    {
                    pushFollow(FOLLOW_ruleList_in_base50);
                    ruleList();

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
        }
        return ;
    }
    // $ANTLR end "base"


    // $ANTLR start "factList"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:64:1: factList : ( fact '.' )+ ;
    public final void factList() throws RecognitionException {
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:65:2: ( ( fact '.' )+ )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:65:4: ( fact '.' )+
            {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:65:4: ( fact '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:65:5: fact '.'
            	    {
            	    pushFollow(FOLLOW_fact_in_factList64);
            	    fact();

            	    state._fsp--;

            	    match(input,10,FOLLOW_10_in_factList66); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "factList"


    // $ANTLR start "ruleList"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:68:1: ruleList : ( rule '.' )+ ;
    public final void ruleList() throws RecognitionException {
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:69:2: ( ( rule '.' )+ )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:69:4: ( rule '.' )+
            {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:69:4: ( rule '.' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==LETTER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:69:5: rule '.'
            	    {
            	    pushFollow(FOLLOW_rule_in_ruleList80);
            	    rule();

            	    state._fsp--;

            	    match(input,10,FOLLOW_10_in_ruleList82); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "ruleList"


    // $ANTLR start "fact"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:72:1: fact : name '=' '{' elementList '}' ;
    public final void fact() throws RecognitionException {
        String name1 = null;

        List<Tuple2> elementList2 = null;


        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:73:2: ( name '=' '{' elementList '}' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:73:4: name '=' '{' elementList '}'
            {
            pushFollow(FOLLOW_name_in_fact96);
            name1=name();

            state._fsp--;

            match(input,11,FOLLOW_11_in_fact98); 
            match(input,12,FOLLOW_12_in_fact100); 
            pushFollow(FOLLOW_elementList_in_fact102);
            elementList2=elementList();

            state._fsp--;

            match(input,13,FOLLOW_13_in_fact104); 
            Factory.createFuzzySet(name1, elementList2);

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
    // $ANTLR end "fact"


    // $ANTLR start "name"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:76:1: name returns [String object] : ( LETTER )+ ;
    public final String name() throws RecognitionException {
        String object = null;

        Token LETTER3=null;

         object = ""; 
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:78:2: ( ( LETTER )+ )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:78:4: ( LETTER )+
            {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:78:4: ( LETTER )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LETTER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:78:5: LETTER
            	    {
            	    LETTER3=(Token)match(input,LETTER,FOLLOW_LETTER_in_name126); 
            	     object = object + LETTER3.getText(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return object;
    }
    // $ANTLR end "name"


    // $ANTLR start "elementList"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:81:1: elementList returns [List<Tuple2> list] : f= element ( ',' s= element )* ;
    public final List<Tuple2> elementList() throws RecognitionException {
        List<Tuple2> list = null;

        Tuple2 f = null;

        Tuple2 s = null;


         list = new ArrayList<Tuple2>(); 
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:2: (f= element ( ',' s= element )* )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:4: f= element ( ',' s= element )*
            {
            pushFollow(FOLLOW_element_in_elementList152);
            f=element();

            state._fsp--;

             list.add(f); 
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:40: ( ',' s= element )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:41: ',' s= element
            	    {
            	    match(input,14,FOLLOW_14_in_elementList157); 
            	    pushFollow(FOLLOW_element_in_elementList161);
            	    s=element();

            	    state._fsp--;

            	     list.add(s); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return list;
    }
    // $ANTLR end "elementList"


    // $ANTLR start "element"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:86:1: element returns [Tuple2 object] : '(' (s= ( LETTER | DIGIT ) )+ ',' p= ( BEFORE_ONE | ONE ) ')' ;
    public final Tuple2 element() throws RecognitionException {
        Tuple2 object = null;

        Token s=null;
        Token p=null;

         String elementName = ""; String elementProbability = ""; 
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:2: ( '(' (s= ( LETTER | DIGIT ) )+ ',' p= ( BEFORE_ONE | ONE ) ')' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:4: '(' (s= ( LETTER | DIGIT ) )+ ',' p= ( BEFORE_ONE | ONE ) ')'
            {
            match(input,15,FOLLOW_15_in_element184); 
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:8: (s= ( LETTER | DIGIT ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=LETTER && LA6_0<=DIGIT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:9: s= ( LETTER | DIGIT )
            	    {
            	    s=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LETTER && input.LA(1)<=DIGIT) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	     elementName = elementName + s.getText(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match(input,14,FOLLOW_14_in_element201); 
            p=(Token)input.LT(1);
            if ( (input.LA(1)>=BEFORE_ONE && input.LA(1)<=ONE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             elementProbability = p.getText(); 
            match(input,16,FOLLOW_16_in_element215); 

            		object = new Tuple2(elementName, elementProbability);	
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return object;
    }
    // $ANTLR end "element"


    // $ANTLR start "rule"
    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:94:1: rule : name '=>' name ;
    public final void rule() throws RecognitionException {
        try {
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:95:2: ( name '=>' name )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:95:4: name '=>' name
            {
            pushFollow(FOLLOW_name_in_rule230);
            name();

            state._fsp--;

            match(input,17,FOLLOW_17_in_rule232); 
            pushFollow(FOLLOW_name_in_rule234);
            name();

            state._fsp--;


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
    // $ANTLR end "rule"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\1\2\3\uffff";
    static final String DFA2_minS =
        "\2\4\2\uffff";
    static final String DFA2_maxS =
        "\1\4\1\21\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\1\6\uffff\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()+ loopback of 65:4: ( fact '.' )+";
        }
    }
 

    public static final BitSet FOLLOW_factList_in_base48 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleList_in_base50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factList64 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_factList66 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule_in_ruleList80 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleList82 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_name_in_fact96 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_fact98 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_fact100 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_elementList_in_fact102 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_fact104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_name126 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_element_in_elementList152 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_elementList157 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_element_in_elementList161 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15_in_element184 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_element189 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_14_in_element201 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_element205 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_element215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_rule230 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rule232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_name_in_rule234 = new BitSet(new long[]{0x0000000000000002L});

}