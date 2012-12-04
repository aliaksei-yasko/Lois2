// $ANTLR 3.4 D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g 2012-12-04 16:26:05

    package lois.lab2.parser.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FuzzyLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FuzzyLexer() {} 
    public FuzzyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuzzyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:11:7: ( '(' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:12:7: ( ')' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:13:7: ( ',' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:14:7: ( '.' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:15:7: ( '=' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:16:7: ( '=>' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:16:9: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:17:7: ( '{' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:18:7: ( '}' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "BEFORE_ONE"
    public final void mBEFORE_ONE() throws RecognitionException {
        try {
            int _type = BEFORE_ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:107:11: ( '0' ( '.' ( DIGIT )* )? )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:107:13: '0' ( '.' ( DIGIT )* )?
            {
            match('0'); 

            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:107:17: ( '.' ( DIGIT )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:107:18: '.' ( DIGIT )*
                    {
                    match('.'); 

                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:107:22: ( DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEFORE_ONE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:110:7: ( 'A' .. 'z' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:113:6: ( '0' .. '9' )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ONE"
    public final void mONE() throws RecognitionException {
        try {
            int _type = ONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:116:4: ( '1' ( '.' ( '0' )* )? )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:116:6: '1' ( '.' ( '0' )* )?
            {
            match('1'); 

            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:116:10: ( '.' ( '0' )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:116:11: '.' ( '0' )*
                    {
                    match('.'); 

                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:116:15: ( '0' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='0') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:116:16: '0'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ONE"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:120:3: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:121:3: ( ' ' | '\\n' | '\\t' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }



                 _channel = HIDDEN;
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:134:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:134:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:134:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:134:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:134:28: '\\r'
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
                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:135:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:135:14: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:135:42: .
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | BEFORE_ONE | LETTER | DIGIT | ONE | SPACE | COMMENT )
        int alt9=14;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt9=1;
            }
            break;
        case ')':
            {
            alt9=2;
            }
            break;
        case ',':
            {
            alt9=3;
            }
            break;
        case '.':
            {
            alt9=4;
            }
            break;
        case '=':
            {
            int LA9_5 = input.LA(2);

            if ( (LA9_5=='>') ) {
                alt9=6;
            }
            else {
                alt9=5;
            }
            }
            break;
        case '{':
            {
            alt9=7;
            }
            break;
        case '}':
            {
            alt9=8;
            }
            break;
        case '0':
            {
            alt9=9;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '[':
        case '\\':
        case ']':
        case '^':
        case '_':
        case '`':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt9=10;
            }
            break;
        case '1':
            {
            int LA9_10 = input.LA(2);

            if ( (LA9_10=='.') ) {
                alt9=12;
            }
            else {
                alt9=11;
            }
            }
            break;
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt9=11;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt9=13;
            }
            break;
        case '/':
            {
            alt9=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 9, 0, input);

            throw nvae;

        }

        switch (alt9) {
            case 1 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:10: T__10
                {
                mT__10(); 


                }
                break;
            case 2 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:16: T__11
                {
                mT__11(); 


                }
                break;
            case 3 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:22: T__12
                {
                mT__12(); 


                }
                break;
            case 4 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:28: T__13
                {
                mT__13(); 


                }
                break;
            case 5 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:34: T__14
                {
                mT__14(); 


                }
                break;
            case 6 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:40: T__15
                {
                mT__15(); 


                }
                break;
            case 7 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:46: T__16
                {
                mT__16(); 


                }
                break;
            case 8 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:52: T__17
                {
                mT__17(); 


                }
                break;
            case 9 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:58: BEFORE_ONE
                {
                mBEFORE_ONE(); 


                }
                break;
            case 10 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:69: LETTER
                {
                mLETTER(); 


                }
                break;
            case 11 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:76: DIGIT
                {
                mDIGIT(); 


                }
                break;
            case 12 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:82: ONE
                {
                mONE(); 


                }
                break;
            case 13 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:86: SPACE
                {
                mSPACE(); 


                }
                break;
            case 14 :
                // D:\\MyDocuments\\University\\Labs\\ЛОИС\\lab2\\Lois2\\src\\main\\scala\\lois\\lab2\\parser\\Fuzzy.g:1:92: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


 

}