package com.rodenbostel.javaEight.functions;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 10/4/16.
 */
public class FunctionFunTest {

    @Test
    public void testTurnAStringIntoANumberAndDoubleIt() {
        assertTrue(24 == new FunctionFun().turnAStringIntoANumberAndDoubleIt("12"));
    }

    @Test
    public void testTurnAStringIntoANumberAndDoubleItFaster() {
        assertTrue(24 == new FunctionFun().aFasterWayToTurnAStringIntoANumberAndDoubleIt("12"));
    }
}
