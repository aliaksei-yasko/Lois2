grammar Fuzzy;

options {
    language=Java;
}


@header {
    package lois.lab2.parser.output;    
	
	import lois.lab2.fuzzy.FuzzySet;
	import lois.lab2.fuzzy.KnowledgeBase;
	import lois.lab2.fuzzy.Rule;
	import scala.Tuple2;
	import lois.lab2.fuzzy.Factory;
}

@lexer::header {
    package lois.lab2.parser.output;
}

@members {

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
}

base 
	: factList ruleList? 
	;

factList
	: (fact '.')+
	;

ruleList
	: (rule '.')+
	;
	
fact
	: name '=' '{' elementList '}' {Factory.createFuzzySet($name.object, $elementList.list);}
	;

name returns[String object]
@init { $object = ""; }
	: (LETTER { $object = $object + $LETTER.getText(); } )+
	;

elementList returns[List<Tuple2> list]
@init { $list = new ArrayList<Tuple2>(); }
	: f=element { $list.add($f.object); } (',' s=element { $list.add($s.object); })*
	;

element returns[Tuple2 object]
@init { String elementName = ""; String elementProbability = ""; }
	: '(' (s=(LETTER | DIGIT) { elementName = elementName + $s.getText(); })+ ',' p=(BEFORE_ONE | ONE) { elementProbability = $p.getText(); } ')' 
	{
		$object = new Tuple2(elementName, elementProbability);	
	}
	;

rule
	: name '=>' name
	;
	

BEFORE_ONE: '0' ('.' (DIGIT)* )?
;
		
LETTER: 'A'..'z'
;

DIGIT: '0' .. '9'
;

ONE: '1' ('.' ('0')*)?
;

SPACE
  :
  (
    ' '
    | '\n'
    | '\t'
    | '\r'
  )
  
    {
     $channel = HIDDEN;
    }
;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
;