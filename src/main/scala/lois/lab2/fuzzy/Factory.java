package lois.lab2.fuzzy;

import java.util.List;

import scala.collection.JavaConversions;

/**
 * @author Q-YAA
 */
public class Factory {

    public static FuzzySet createFuzzySet(String name, List<FuzzyElement> elements) {
        return new FuzzySet(name, JavaConversions.asBuffer(elements).toList());
    }
}
