package com.rodenbostel.javaEight.lambdas;

/**
 * Created by justin on 9/20/16.
 */
@FunctionalInterface
public interface NameConverter<F, T> {
    T convert(F from);
}
