// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g 2012-12-04 05:25:44

    package lois.lab2.parser.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FuzzyLexer extends Lexer {
    public static final int T__16=16;
    public static final int BEFORE_ONE=6;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int LETTER=4;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int ONE=7;
    public static final int DIGIT=5;
    public static final int COMMENT=9;
    public static final int SPACE=8;
    public static final int EOF=-1;

    // delegates
    // delegators

    public FuzzyLexer() {;} 
    public FuzzyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuzzyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:11:7: ( '.' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:12:7: ( '=' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:13:7: ( '{' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:14:7: ( '}' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:15:7: ( ',' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:16:7: ( '(' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:17:7: ( ')' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:18:7: ( '=>' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:18:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "BEFORE_ONE"
    public final void mBEFORE_ONE() throws RecognitionException {
        try {
            int _type = BEFORE_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:11: ( '0' ( '.' ( DIGIT )* )? )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:13: '0' ( '.' ( DIGIT )* )?
            {
            match('0'); 
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:17: ( '.' ( DIGIT )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:18: '.' ( DIGIT )*
                    {
                    match('.'); 
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:22: ( DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:99:23: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEFORE_ONE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:102:7: ( 'A' .. 'z' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:102:9: 'A' .. 'z'
            {
            matchRange('A','z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:105:6: ( '0' .. '9' )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:105:8: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:108:4: ( '1' ( '.' ( '0' )* )? )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:108:6: '1' ( '.' ( '0' )* )?
            {
            match('1'); 
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:108:10: ( '.' ( '0' )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:108:11: '.' ( '0' )*
                    {
                    match('.'); 
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:108:15: ( '0' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='0') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:108:16: '0'
                    	    {
                    	    match('0'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONE"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:112:3: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:113:3: ( ' ' | '\\n' | '\\t' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


                 _channel = HIDDEN;
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:126:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:126:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:126:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:126:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:126:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:126:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:127:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:127:14: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:127:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | BEFORE_ONE | LETTER | DIGIT | ONE | SPACE | COMMENT )
        int alt9=14;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:58: BEFORE_ONE
                {
                mBEFORE_ONE(); 

                }
                break;
            case 10 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:69: LETTER
                {
                mLETTER(); 

                }
                break;
            case 11 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:76: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 12 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:82: ONE
                {
                mONE(); 

                }
                break;
            case 13 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:86: SPACE
                {
                mSPACE(); 

                }
                break;
            case 14 :
                // D:\\MyDocuments\\GitRepo\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:92: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\2\uffff\1\17\7\uffff\1\13\7\uffff";
    static final String DFA9_eofS =
        "\22\uffff";
    static final String DFA9_minS =
        "\1\11\1\uffff\1\76\7\uffff\1\56\7\uffff";
    static final String DFA9_maxS =
        "\1\175\1\uffff\1\76\7\uffff\1\56\7\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\uffff\1\13"+
        "\1\15\1\16\1\10\1\2\1\11\1\14";
    static final String DFA9_specialS =
        "\22\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\7\uffff\1\6\1\7\2\uffff\1"+
            "\5\1\uffff\1\1\1\15\1\10\1\12\10\13\3\uffff\1\2\3\uffff\72\11"+
            "\1\3\1\uffff\1\4",
            "",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | BEFORE_ONE | LETTER | DIGIT | ONE | SPACE | COMMENT );";
        }
    }
 

}