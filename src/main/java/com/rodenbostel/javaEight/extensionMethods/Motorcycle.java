package com.rodenbostel.javaEight.extensionMethods;

/**
 * Created by justin on 9/20/16.
 */
public class Motorcycle implements Vehicle {
    boolean lights = false;
    boolean ignition = false;
    boolean brakes = false;

    @Override
    public void ignition() {
        ignition = true;
    }

    @Override
    public void lights() {
        lights = true;
    }

    @Override
    public void brakes() {
        brakes = true;
    }
}
