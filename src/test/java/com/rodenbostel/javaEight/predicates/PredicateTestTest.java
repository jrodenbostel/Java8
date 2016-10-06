package com.rodenbostel.javaEight.predicates;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 10/4/16.
 */
public class PredicateTestTest {

    @Test
    public void testTestPredicate() {
        assertTrue(new PredicateTest().testPredicate("yay"));
    }

    @Test
    public void testTestNegatePredicate() {
        assertFalse(new PredicateTest().testNegatePredicate("yay"));
    }

    @Test
    public void testReferencePredicate() {
        assertFalse(new PredicateTest().testReferencePredicate("yay"));
    }
}
