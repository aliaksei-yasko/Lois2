package lois.lab2.fuzzy

import java.util

/**
 * @author Q-YAA
 */
class FuzzySet(val name: java.lang.String, val elements: List[FuzzyElement]) {

    def getElement(name: String): FuzzyElement = elements.find(element => element.name == name).get

    def getElementProbability(name: String) = getElement(name).probability
    
    override def equals(other: Any) = other match {
        case that: FuzzySet => this.name == that.name && this.elements == that.elements
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