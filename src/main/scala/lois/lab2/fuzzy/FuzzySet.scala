package lois.lab2.fuzzy


/**
 * Class that represent fuzzy set.
 *
 * @author Q-YAA
 */
class FuzzySet(val name: java.lang.String, val elements: List[FuzzyElement]) {

    /**
     * Get element by name.
     *
     * @param name element name
     * @return element with the given name
     */
    def getElement(name: String): FuzzyElement = elements.find(element => element.name == name).get

    /**
     * Returns array of the all elements probability.
     *
     * @return array of the all elements probability
     */
    def getElementsProbability: Array[Float] = (for (element <- elements) yield element.probability).toArray

    override def equals(other: Any) = other match {
        case that: FuzzySet => this.elements == that.elements
        case _ => false
    }

    override def toString: String = {
        val stringBuilder = new StringBuilder(name)
        stringBuilder.append(" = {")

        for (element <- elements) {
            stringBuilder.append("(").append(element.name).append(", ").append(element.probability).append(")")
        }

        stringBuilder.append("}").toString()
    }
}