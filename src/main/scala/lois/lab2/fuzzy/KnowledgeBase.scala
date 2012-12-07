package lois.lab2.fuzzy

import collection.mutable

/**
 * @author Q-YAA
 */
object KnowledgeBase {

    val facts = new mutable.MutableList[FuzzySet]()
    val rules = new mutable.MutableList[Rule]()

    val tNorm = (x: Float, y: Float) => math.min(x, y)

    def getFact(name: String): FuzzySet = facts.find(fact => fact.name == name).get

    def addFact(fact: FuzzySet) {
        facts += fact
    }

    def addRule(rule: Rule) {
        rules += rule
    }

    def fuzzyInference: Array[FuzzyInferenceResult] = {
        var inferenceResults = List[FuzzyInferenceResult]()
        var hasNewFacts = true

        while (hasNewFacts) {
            hasNewFacts = false

            val inferredFacts: List[FuzzySet] = (for (element <- inferenceResults) yield element.result).toList

            for (fact <- (facts.toList ::: inferredFacts)) {
                for (rule <- rules) {

                    val newFact = rule.applyTo(fact)

                    if (newFact != null && inferenceResults.find(inferenceResult => inferenceResult.result == newFact) == None) {

                        hasNewFacts = true
                        inferenceResults = new FuzzyInferenceResult(rule, fact, newFact) :: inferenceResults
                    }
                }
            }
        }

        inferenceResults.reverse.toArray
    }

    override def toString = "KnowledgeBase: {[Facts:" + facts + "]" + "[Rules" + rules + "]}"
}
