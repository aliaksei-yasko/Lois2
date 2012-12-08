grammar Fuzzy;

options {
    language=Java;
}


@header {
    package lois.lab2.parser.output;    
	
	import lois.lab2.fuzzy.FuzzySet;
	import lois.lab2.fuzzy.FuzzyElement;
	import lois.lab2.fuzzy.KnowledgeBase;
	import lois.lab2.fuzzy.Rule;
	import scala.Tuple2;
	import lois.lab2.fuzzy.Factory;

    import java.io.File;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.OutputStreamWriter;
    import java.util.List;
    import java.util.ArrayList;
}

@lexer::header {
    package lois.lab2.parser.output;
}

@members {

	private static List<String> errorList = new ArrayList<String>();
	
	private int errorLine;

    public static void main(String[] args) throws Exception {
    	
		//String baseFile = args[0];
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
            printResult();
       	}
   	}

        public static void printResult() throws IOException {
            File outputFile = new File("output.txt");

            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8");
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
	: name '=' '{' elementList '}' 
	{
		FuzzySet fact = Factory.createFuzzySet($name.object, $elementList.list);
		KnowledgeBase.addFact(fact);
	}
	;

name returns[String object]
@init { $object = ""; }
	: (LETTER { $object = $object + $LETTER.getText(); } )+
	;

elementList returns[List<FuzzyElement> list]
@init { $list = new ArrayList<FuzzyElement>(); }
	: f=element { $list.add($f.object); } (',' s=element { $list.add($s.object); })*
	;

element returns[FuzzyElement object]
@init { String elementName = ""; String elementProbability = ""; }
	: '(' (s=(LETTER | DIGIT) { elementName = elementName + $s.getText(); })+ ',' p=(BEFORE_ONE | ONE) { elementProbability = $p.getText(); } ')' 
	{
		$object = new FuzzyElement(elementName, elementProbability);	
	}
	;

rule
	: f=name '=>' s=name
	{
		KnowledgeBase.addRule(new Rule(KnowledgeBase.getFact(f), KnowledgeBase.getFact(s)));
	}
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