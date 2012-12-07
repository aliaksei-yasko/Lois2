package lois.lab2.fuzzy

/**
 * Class that represent element of the fuzzy set.
 *
 * @author Q-YAA
 */
class FuzzyElement(aName: String, aProbability: String) {

    /**
     * Element name.
     */
    val name = aName

    /**
     * Element probability.
     */
    val probability = aProbability.toFloat

    override def equals(other: Any) = other match {
        case that: FuzzyElement => this.name == that.name && this.probability == that.probability
        case _ => false
    }

    override def toString = "(" + name + ", " + probability + ")"
}
