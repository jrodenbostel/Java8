package com.rodenbostel.javaEight.lambdas;

/**
 * Created by justin on 9/20/16.
 */
public class Person {

    String firstName;
    String lastName;
    NameConverter<Person, String> fullNameBuilder = (Person person) -> person.getFirstName() + " " + person.getLastName();
    NameConverter<String, String> upperCaseConverter = String::toUpperCase;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullNameBuilder.convert(this);
    }

    public String getFullUpperCaseName() {
        return upperCaseConverter.convert(fullNameBuilder.convert(this));
    }

}
