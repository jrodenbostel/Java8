package com.rodenbostel.javaEight.extensionMethods;

import com.rodenbostel.javaEight.extensionMethods.Motorcycle;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 9/20/16.
 */
public class MotorcycleTest {

    @Test
    public void testStart() {
        Motorcycle m = new Motorcycle();
        m.start();

        assertTrue(m.brakes);
        assertTrue(m.ignition);
        assertTrue(m.lights);
    }

}
