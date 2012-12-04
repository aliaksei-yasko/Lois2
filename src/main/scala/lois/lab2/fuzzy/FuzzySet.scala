package lois.lab2.fuzzy

/**
 * @author Q-YAA
 */
class FuzzySet(val name: String, val elements: List[(String, Float)]) {

    def getElement(name: String): (String, Float) = elements.find(element => element._1 == name).get

    def getElementProbability(name: String) = getElement(name)._2
    
    override def equals(other: Any) = other match {
        case that: FuzzySet => this.name == that.name && this.elements == that.elements
        case _ => false
    }

    override def toString = name + elements
}