package lois.lab2.fuzzy

/**
 * @author Q-YAA
 */
class Rule(val reason: String, val consequent: String) {

    override def toString = reason + "=>" + consequent
}
