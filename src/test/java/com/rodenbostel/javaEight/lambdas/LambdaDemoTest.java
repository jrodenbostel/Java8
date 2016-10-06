package com.rodenbostel.javaEight.lambdas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 9/20/16.
 */
public class LambdaDemoTest {

    @Test
    public void testGetNames() {
        assertEquals("Jack", new LambdaDemo().getPeopleSortedByFirstName().get(0).getFirstName());
    }

    @Test
    public void testGetFullNames() {
        assertEquals("Justin Rodenbostel", new LambdaDemo().getFullNamesForEach().get(0).getFullName());
    }

    @Test
    public void testGetCapitalNames() {
        assertEquals("JUSTIN", new LambdaDemo().getCapitalNames().get(0));
    }

    @Test
    public void testAreThereAny() {
        assertTrue(new LambdaDemo().areThereAny("Justin"));
    }

    @Test
    public void testFindTheJays() {
        assertEquals(2, new LambdaDemo().findTheJays().size());
    }

    @Test
    public void testUpperCaseConverter() {
        Person p = new Person("Justin");
        p.setLastName("Rodenbostel");
        assertEquals("JUSTIN RODENBOSTEL", p.getFullUpperCaseName());
    }

    @Test
    public void testGetAugmentedFullNamesForEach() {
        assertEquals("Justin testRodenbostel", new LambdaDemo().getAugmentedFullNamesForEach().get(0).getFullName());
    }
}
