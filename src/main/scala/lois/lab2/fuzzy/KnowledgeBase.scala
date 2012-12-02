package lois.lab2.fuzzy

import collection.mutable

/**
 * @author Q-YAA
 */
object KnowledgeBase {

    val facts = new mutable.MutableList[FuzzySet]()
    val rules = new mutable.MutableList[Rule]()

    def getFact(name: String): FuzzySet = facts.find(fact => fact.name == name).get

    def addFact(fact: FuzzySet) {
        facts += fact
    }

    def addRule(rule: Rule) {
        rules += rule
    }
}
