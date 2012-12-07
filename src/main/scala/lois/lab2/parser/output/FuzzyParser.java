// $ANTLR 3.4 D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g 2012-12-04 16:26:05

    package lois.lab2.parser.output;    
	
	import lois.lab2.fuzzy.FuzzyInferenceResult;
    import lois.lab2.fuzzy.FuzzySet;
	import lois.lab2.fuzzy.FuzzyElement;
	import lois.lab2.fuzzy.KnowledgeBase;
	import lois.lab2.fuzzy.Rule;
    import lois.lab2.fuzzy.Factory;


import org.antlr.runtime.*;

    import java.io.File;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FuzzyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEFORE_ONE", "COMMENT", "DIGIT", "LETTER", "ONE", "SPACE", "'('", "')'", "','", "'.'", "'='", "'=>'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int BEFORE_ONE=4;
    public static final int COMMENT=5;
    public static final int DIGIT=6;
    public static final int LETTER=7;
    public static final int ONE=8;
    public static final int SPACE=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FuzzyParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuzzyParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FuzzyParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g"; }



    	private static List<String> errorList = new ArrayList<String>();
    	
    	private int errorLine;

        public static void main(String[] args) throws Exception {
        	
    		//String codeFile = args[0];
        	String baseFile = "knowledgeBase/knowledgeBase_2.txt";

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
                printResult();
           	}
       	}

        public static void printResult() throws IOException {
            File outputFile = new File("output.txt");
            FileWriter writer = new FileWriter(outputFile);

            StringBuilder resultString = new StringBuilder();
            resultString.append("------------------------ Факты --------------------------\n\n\n");

            for (int i = 0; i < KnowledgeBase.facts().size(); i++) {
                resultString.append(KnowledgeBase.facts().apply(i)).append("\n\n");
            }

            resultString.append("\n\n\n------------------------ Правила ------------------------\n\n\n");

            for (int i = 0; i < KnowledgeBase.rules().size(); i++) {
                Rule rule = KnowledgeBase.rules().apply(i);
                resultString.append(rule).append("\n");
                resultString.append("Матрица: \n");
                resultString.append(rule.matrix()).append("\n");
            }

            resultString.append("\n\n\n------------------------ Вывод --------------------------\n\n\n");

            FuzzyInferenceResult[] results = KnowledgeBase.directFuzzyInference();
            for (FuzzyInferenceResult result : results) {
                resultString.append("Выведено по правилу: ").append(result.rule()).append("\n");
                resultString.append("Для факта: ").append(result.fact()).append("\n");
                resultString.append("Результат вывода: ").append(result.result()).append("\n\n");
            }

            writer.write(resultString.toString());
            writer.close();
        }

        public String getErrorHeader(RecognitionException e) {
            errorLine = e.line;
            return "";
        }

        public void emitErrorMessage(String message) {
            errorList.add("line " + errorLine + ": " + message);
        }



    // $ANTLR start "base"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:61:1: base : factList ( ruleList )? ;
    public final void base() throws RecognitionException {
        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:62:2: ( factList ( ruleList )? )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:62:4: factList ( ruleList )?
            {
            pushFollow(FOLLOW_factList_in_base48);
            factList();

            state._fsp--;


            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:62:13: ( ruleList )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LETTER) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:62:13: ruleList
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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "base"



    // $ANTLR start "factList"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:65:1: factList : ( fact '.' )+ ;
    public final void factList() throws RecognitionException {
        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:66:2: ( ( fact '.' )+ )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:66:4: ( fact '.' )+
            {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:66:4: ( fact '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:66:5: fact '.'
            	    {
            	    pushFollow(FOLLOW_fact_in_factList64);
            	    fact();

            	    state._fsp--;


            	    match(input,13,FOLLOW_13_in_factList66); 

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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factList"



    // $ANTLR start "ruleList"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:69:1: ruleList : ( rule '.' )+ ;
    public final void ruleList() throws RecognitionException {
        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:70:2: ( ( rule '.' )+ )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:70:4: ( rule '.' )+
            {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:70:4: ( rule '.' )+
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
            	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:70:5: rule '.'
            	    {
            	    pushFollow(FOLLOW_rule_in_ruleList80);
            	    rule();

            	    state._fsp--;


            	    match(input,13,FOLLOW_13_in_ruleList82); 

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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ruleList"



    // $ANTLR start "fact"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:73:1: fact : name '=' '{' elementList '}' ;
    public final void fact() throws RecognitionException {
        String name1 =null;

        List<FuzzyElement> elementList2 =null;


        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:74:2: ( name '=' '{' elementList '}' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:74:4: name '=' '{' elementList '}'
            {
            pushFollow(FOLLOW_name_in_fact96);
            name1=name();

            state._fsp--;


            match(input,14,FOLLOW_14_in_fact98); 

            match(input,16,FOLLOW_16_in_fact100); 

            pushFollow(FOLLOW_elementList_in_fact102);
            elementList2=elementList();

            state._fsp--;


            match(input,17,FOLLOW_17_in_fact104); 


            		FuzzySet fact = Factory.createFuzzySet(name1, elementList2);
            		KnowledgeBase.addFact(fact);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fact"



    // $ANTLR start "name"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:81:1: name returns [String object] : ( LETTER )+ ;
    public final String name() throws RecognitionException {
        String object = null;


        Token LETTER3=null;

         object = ""; 
        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:2: ( ( LETTER )+ )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:4: ( LETTER )+
            {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:4: ( LETTER )+
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
            	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:83:5: LETTER
            	    {
            	    LETTER3=(Token)match(input,LETTER,FOLLOW_LETTER_in_name128); 

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
        	// do for sure before leaving
        }
        return object;
    }
    // $ANTLR end "name"



    // $ANTLR start "elementList"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:86:1: elementList returns [List<FuzzyElement> list] : f= element ( ',' s= element )* ;
    public final List<FuzzyElement> elementList() throws RecognitionException {
        List<FuzzyElement> list = null;


        FuzzyElement f =null;

        FuzzyElement s =null;


         list = new ArrayList<FuzzyElement>(); 
        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:2: (f= element ( ',' s= element )* )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:4: f= element ( ',' s= element )*
            {
            pushFollow(FOLLOW_element_in_elementList154);
            f=element();

            state._fsp--;


             list.add(f); 

            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:40: ( ',' s= element )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:88:41: ',' s= element
            	    {
            	    match(input,12,FOLLOW_12_in_elementList159); 

            	    pushFollow(FOLLOW_element_in_elementList163);
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
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "elementList"



    // $ANTLR start "element"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:91:1: element returns [FuzzyElement object] : '(' (s= ( LETTER | DIGIT ) )+ ',' p= ( BEFORE_ONE | ONE ) ')' ;
    public final FuzzyElement element() throws RecognitionException {
        FuzzyElement object = null;


        Token s=null;
        Token p=null;

         String elementName = ""; String elementProbability = ""; 
        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:93:2: ( '(' (s= ( LETTER | DIGIT ) )+ ',' p= ( BEFORE_ONE | ONE ) ')' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:93:4: '(' (s= ( LETTER | DIGIT ) )+ ',' p= ( BEFORE_ONE | ONE ) ')'
            {
            match(input,10,FOLLOW_10_in_element186); 

            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:93:8: (s= ( LETTER | DIGIT ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= DIGIT && LA6_0 <= LETTER)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:93:9: s= ( LETTER | DIGIT )
            	    {
            	    s=(Token)input.LT(1);

            	    if ( (input.LA(1) >= DIGIT && input.LA(1) <= LETTER) ) {
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


            match(input,12,FOLLOW_12_in_element203); 

            p=(Token)input.LT(1);

            if ( input.LA(1)==BEFORE_ONE||input.LA(1)==ONE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


             elementProbability = p.getText(); 

            match(input,11,FOLLOW_11_in_element217); 


            		object = new FuzzyElement(elementName, elementProbability);	
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return object;
    }
    // $ANTLR end "element"



    // $ANTLR start "rule"
    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:1: rule : f= name '=>' s= name ;
    public final void rule() throws RecognitionException {
        String f =null;

        String s =null;


        try {
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:100:2: (f= name '=>' s= name )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:100:4: f= name '=>' s= name
            {
            pushFollow(FOLLOW_name_in_rule234);
            f=name();

            state._fsp--;


            match(input,15,FOLLOW_15_in_rule236); 

            pushFollow(FOLLOW_name_in_rule240);
            s=name();

            state._fsp--;



            		KnowledgeBase.addRule(new Rule(KnowledgeBase.getFact(f), KnowledgeBase.getFact(s)));
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
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
        "\2\7\2\uffff";
    static final String DFA2_maxS =
        "\1\7\1\17\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\1\6\uffff\1\3\1\2",
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
            return "()+ loopback of 66:4: ( fact '.' )+";
        }
    }
 

    public static final BitSet FOLLOW_factList_in_base48 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleList_in_base50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factList64 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_factList66 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule_in_ruleList80 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleList82 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_name_in_fact96 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_fact98 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fact100 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_elementList_in_fact102 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_fact104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_name128 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_element_in_elementList154 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_elementList159 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_element_in_elementList163 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10_in_element186 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_element191 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_12_in_element203 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_set_in_element207 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_element217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_rule234 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rule236 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_name_in_rule240 = new BitSet(new long[]{0x0000000000000002L});

}