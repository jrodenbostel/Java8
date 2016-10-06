package com.rodenbostel.javaEight.comparatorsAndOptionals;

import com.rodenbostel.javaEight.lambdas.Person;

import java.util.Comparator;
import java.util.Optional;

/**
 * Created by justin on 10/6/16.
 */
public class ComparatorAndOptionalFun {
    Comparator<Person> comparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());

    Person p1 = new Person("John");
    Person p2 = new Person("Alice");

    Optional<String> optional = Optional.of("YAY");

    //new helper methods on comparators
    public int comparison() {
        return comparator.compare(p1, p2);             // > 0
    }

    public int anotherComparison() {
        return comparator.reversed().compare(p1, p2);             // > 0
    }

    //can also consumer, filter (with a predicate) and a bunch of other stuff with Optionals
    public String optionalTest() {
        optional.isPresent();           // true
        optional.get();                 // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));

        optional.empty();

        return optional.orElse("fallback");
    }

}
