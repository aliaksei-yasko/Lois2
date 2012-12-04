package lois.lab2.fuzzy;

import java.util.List;

import scala.Tuple2;

/**
 * @author Q-YAA
 */
public class Factory {

    public static FuzzySet createFuzzySet(String name, List<Tuple2> elements) {
        return new FuzzySet(name, elements);
    }
}
