package com.rodenbostel.javaEight.suppliersAndConsumers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by justin on 10/6/16.
 */
public class SuppliersAndConsumersTest {

    @Test
    public void testProduceSomething() {
        assertNotNull(new SuppliersAndConsumers().getBike());
    }

    @Test
    public void testConsumeSomething() {
        assertEquals("Hello, justin Rodenbostel", new SuppliersAndConsumers().consumeSomething());
    }
}
