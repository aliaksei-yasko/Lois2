package lois.lab2.fuzzy

/**
 * @author Q-YAA
 */
class FuzzyElement(aName: String, aProbability: String) {
    val name = aName
    val probability = aProbability.toFloat

    override def equals(other: Any) = other match {
        case that: FuzzyElement => this.name == that.name && this.probability == that.probability
        case _ => false
    }

    override def toString = "(" + name + ", " + probability + ")"
}
