package com.rodenbostel.javaEight.extensionMethods;

/**
 * Created by justin on 9/20/16.
 */
public interface Vehicle {
    void ignition();
    void lights();
    void brakes();

    //Essentially defines the default behavior for 'start'.  The engine is started, the brakes are enabled, and the lights are on.
    //template method - or in this case, when you need to provide consistent behavior by ensuring these methods are called during 'start()'
    default void start() {
        brakes();
        ignition();
        lights();
    }
}
