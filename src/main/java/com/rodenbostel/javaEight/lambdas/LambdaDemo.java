package com.rodenbostel.javaEight.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by justin on 9/20/16.
 */
public class LambdaDemo {
    private List<Person> getPeople() {
        return Arrays.asList(new Person("Justin"), new Person("Kristen"), new Person("Jack"), new Person("Will"), new Person("Nick"), new Person("Neal"));
    }

    public List<Person> getPeopleSortedByFirstName() {
        List<Person> people = getPeople();
        Collections.sort(people, (Person a, Person b) -> a.getFirstName().compareTo(b.getFirstName()));
        return people;
    }

    //demos altering a collection in place
    public List<Person> getFullNamesForEach() {
        List<Person> people = getPeople();
        people.forEach(person -> {
            person.setLastName("Rodenbostel");
        });

        return people;
    }

    //demos lambda variable access scope (like javascript)
    public  List<Person> getAugmentedFullNamesForEach() {
        String test = "test";
        List<Person> people = getPeople();
        people.forEach(person -> {
            person.setLastName(test + "Rodenbostel");
        });

        return people;
    }

    //demos mapping a collection by applying a function to it and returning a copy via streams
    public List<String> getCapitalNames() {
        return getPeople().stream().map(person -> {
           return person.getFirstName().toUpperCase();
        }).collect(Collectors.toList());
    }

    public boolean areThereAny(String firstName) {
        return getPeople().stream().anyMatch(person -> person.getFirstName().equals(firstName));
    }

    public List<Person> findTheJays() {
        return getPeople().stream().filter(person -> person.getFirstName().startsWith("J")).collect(Collectors.toList());
    }
}
