package lois.lab2.fuzzy

/**
 * Class that store results of the fuzzy inference.
 *
 * @author Q-YAA
 */
class FuzzyInferenceResult(val rule: Rule, val fact: FuzzySet, val result: FuzzySet) {

    override def toString: String = {
        val stringBuilder = new StringBuilder
        stringBuilder.append("Applied rule: ").append(rule.toString).append("\n")
        stringBuilder.append("For fact: ").append(fact.toString).append("\n")
        stringBuilder.append("Result: ").append(result.toString).append("\n")
        stringBuilder.toString()
    }
}
