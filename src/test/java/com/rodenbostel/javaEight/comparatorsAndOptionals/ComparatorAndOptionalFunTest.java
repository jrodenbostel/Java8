package com.rodenbostel.javaEight.comparatorsAndOptionals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 10/6/16.
 */
public class ComparatorAndOptionalFunTest {

    ComparatorAndOptionalFun fun = new ComparatorAndOptionalFun();

    @Test
    public void testComparisons() {
        assertTrue(fun.comparison() > 0);
        assertTrue(fun.anotherComparison() < 0);
    }

    @Test
    public void optionalTestTest() {
        assertEquals("YAY", fun.optionalTest());
    }
}
