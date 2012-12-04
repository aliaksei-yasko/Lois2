package lois.lab2.fuzzy

/**
 * @author Q-YAA
 */
class Rule(val reason: FuzzySet, val consequent: FuzzySet) {

    override def toString = reason.name + "=>" + consequent.name
}
