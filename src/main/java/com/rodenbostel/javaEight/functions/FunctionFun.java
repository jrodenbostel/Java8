package com.rodenbostel.javaEight.functions;

import java.util.function.Function;

/**
 * Created by justin on 10/4/16.
 */
//Functions are chainable, accept one argument, and product a result
public class FunctionFun {

    Function<String, Integer> toInteger = Integer::valueOf;
    Function<Integer, Integer> doubleIt = x -> x * 2;

    public Integer turnAStringIntoANumberAndDoubleIt(String s) {
        Integer i = toInteger.apply(s);
        return doubleIt.apply(i);
    }

    Function<String, Integer> oneShot = toInteger.andThen(x -> x * 2);

    public Integer aFasterWayToTurnAStringIntoANumberAndDoubleIt(String s) {
        return oneShot.apply(s);
    }

}
