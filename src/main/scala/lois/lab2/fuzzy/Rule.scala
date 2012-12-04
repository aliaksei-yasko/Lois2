package lois.lab2.fuzzy

/**
 * @author Q-YAA
 */
class Rule(val reason: FuzzySet, val consequent: FuzzySet) {

    val relationMatrix = new Matrix(Array.ofDim[Float](reason.elements.size, consequent.elements.size))

    def applyTNorm(tNorm: (Float, Float) => Float) {
        for (i <- 0 until reason.elements.size) {
            for (j <- 0 until consequent.elements.size) {

                relationMatrix.setValue(i, j,
                    tNorm(reason.elements(i).probability, consequent.elements(j).probability))
            }
        }
    }

    override def toString = reason.name + " => " + consequent.name

    override def equals(other: Any) = other match {
        case that: Rule => this.reason == that.reason && this.consequent == that.consequent
        case _ => false
    }
}
