package com.rodenbostel.javaEight.suppliersAndConsumers;

import com.rodenbostel.javaEight.extensionMethods.Motorcycle;
import com.rodenbostel.javaEight.lambdas.Person;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by justin on 10/4/16.
 */
public class SuppliersAndConsumers {

    final String[] returnString = new String[1];

    //basically a static method reference to anything that returns a Motorcycle.
    Supplier<Motorcycle> bikeSupplier = Motorcycle::new;

    //Consumers represent a function to be performed on a single input argument.
    Consumer<Person> greeter = (p) -> returnString[0] = "Hello, " + p.getFullName();

    //Suppliers produce a result of a given type.
    public Motorcycle getBike() {
        return bikeSupplier.get();
    }

    public String consumeSomething() {
        Person person = new Person("justin");
        person.setLastName("Rodenbostel");

        greeter.accept(person);

        return returnString[0];
    }

}
