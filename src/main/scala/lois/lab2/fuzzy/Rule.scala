package lois.lab2.fuzzy

/**
 * @author Q-YAA
 */
class Rule(val reason: FuzzySet, val consequent: FuzzySet) {

    def matrix = KnowledgeBase.applyTNorm(KnowledgeBase.tNorm, reason.getElementsProbability, consequent.getElementsProbability)

    def isAppliedTo(fact: FuzzySet) = checkFactForRule(fact, reason)

    def applyTo(fact: FuzzySet): FuzzySet = {
        if (!checkFactForRule(fact, reason)) {
            return null
        }

        val ruleSup = matrix.sup
        val resultMatrix = KnowledgeBase.applyTNorm(KnowledgeBase.tNorm, fact.getElementsProbability, ruleSup)
        val newElementsProbability = resultMatrix.sup

        val newElements = Array.ofDim[FuzzyElement](newElementsProbability.length)
        for (i <- 0 until newElements.length) {
            newElements(i) = new FuzzyElement(consequent.elements(i).name, newElementsProbability(i).toString)
        }

        new FuzzySet(consequent.name + "'", newElements.toList)
    }

    override def toString = reason.name + " => " + consequent.name

    override def equals(other: Any) = other match {
        case that: Rule => this.reason == that.reason && this.consequent == that.consequent
        case _ => false
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
}
