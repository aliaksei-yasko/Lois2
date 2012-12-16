package lois.lab2.fuzzy

/**
 * Class that represent fuzzy rule.
 *
 * @author Q-YAA
 */
class Rule(val reason: FuzzySet, val consequent: FuzzySet) {

    /**
     * Calculate matrix (relation table) of the rule.
     *
     * @return rule matrix
     */
    def matrix = createRuleMatrix(KnowledgeBase.tNorm, reason.getElementsProbability, consequent.getElementsProbability)

    /**
     * Method that apply rule to the given fact.
     *
     * @param fact fact ro apply rule
     * @return new fact
     */
    def applyTo(fact: FuzzySet): FuzzySet = {
        if (!checkFactForRule(fact, reason)) {
            return null
        }

        val resultMatrix = matrix

        for (i <- 0 until resultMatrix.height) {
            for (j <- 0 until resultMatrix.width) {

                val factElement = fact.getElement(reason.elements(i).name)
                resultMatrix.setValue(i, j, KnowledgeBase.tNorm(resultMatrix.getValue(i, j), factElement.probability))
            }
        }

        val newElementsProbability = resultMatrix.sup

        val newElements = Array.ofDim[FuzzyElement](newElementsProbability.length)
        for (i <- 0 until newElements.length) {
            newElements(i) = new FuzzyElement(consequent.elements(i).name, newElementsProbability(i).toString)
        }

        new FuzzySet(createNameForInferredResult(fact, consequent), newElements.toList)
    }

    override def toString = reason.name + " => " + consequent.name

    override def equals(other: Any) = other match {
        case that: Rule => this.reason == that.reason && this.consequent == that.consequent
        case _ => false
    }

    private def createRuleMatrix(tNorm: (Float, Float) => Float, first: Array[Float], second: Array[Float]): Matrix = {
        val matrix = new Matrix(Array.ofDim[Float](first.size, second.size))

        for (i <- 0 until first.size) {
            for (j <- 0 until second.size) {

                if (first(i) <= second(j)) {
                    matrix.setValue(i, j, 1f)
                }
                else {
                    matrix.setValue(i, j, tNorm(first(i), second(j)))
                }
            }
        }

        matrix
    }

    private def checkFactForRule(fact: FuzzySet, reason: FuzzySet): Boolean = {
        if (reason.elements.size != fact.elements.size) {
            return false
        }

        for (element <- fact.elements) {
            if (reason.getElement(element.name) == null) {
                return false
            }
        }

        true
    }

    private def createNameForInferredResult(fact: FuzzySet, consequent: FuzzySet): String = {
        val resultNameBuilder = new StringBuilder(consequent.name)

        for (i <- 0 until fact.name.count(symbol => symbol == '\'')) {
            resultNameBuilder.append("\'")
        }

        resultNameBuilder.append("\'").toString()
    }
}
