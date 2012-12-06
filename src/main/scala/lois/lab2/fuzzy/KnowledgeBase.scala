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

    def applyTNorm(tNorm: (Float, Float) => Float, first: Array[Float], second: Array[Float]): Matrix = {
        val matrix = new Matrix(Array.ofDim[Float](first.size, second.size))

        for (i <- 0 until first.size) {
            for (j <- 0 until second.size) {

                matrix.setValue(i, j,
                    tNorm(first(i), second(j)))
            }
        }

        matrix
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

                    if (newFact != null && !facts.contains(newFact)
                        && inferenceResults.find(inferenceResult => inferenceResult.result == newFact) == None) {

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
