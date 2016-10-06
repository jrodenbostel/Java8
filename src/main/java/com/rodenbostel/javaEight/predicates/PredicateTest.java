package com.rodenbostel.javaEight.predicates;

import java.util.function.Predicate;

/**
 * Created by justin on 10/4/16.
 */
//boolean-valued functions that take one argument.
public class PredicateTest {

    Predicate<String> predicate = (s) -> s.length() > 0;

    //can also use method references

    Predicate<String> referencePredicate = String::isEmpty;

    public boolean testPredicate(String input) {
        return predicate.test(input);
    }

    public boolean testNegatePredicate(String input) {
        return predicate.negate().test(input);
    }

    public boolean testReferencePredicate(String input) {
        return referencePredicate.test(input);
    }
}
