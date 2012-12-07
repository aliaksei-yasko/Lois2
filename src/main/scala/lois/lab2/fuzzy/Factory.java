package lois.lab2.fuzzy;

import java.util.List;

import scala.collection.JavaConversions;

/**
 * Supporting class for the java and scala interoperation.
 *
 * @author Q-YAA
 */
public class Factory {

    public static FuzzySet createFuzzySet(String name, List<FuzzyElement> elements) {
        return new FuzzySet(name, JavaConversions.asBuffer(elements).toList());
    }
}
