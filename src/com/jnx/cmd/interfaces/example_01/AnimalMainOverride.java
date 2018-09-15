/**
 * Override the interface method
 */
package com.jnx.cmd.interfaces.example_01;

public class AnimalMainOverride implements Moveable {

    public static void main(String[] args) {
        AnimalMainOverride tiger = new AnimalMainOverride();
        tiger.move();
    }

    @Override
    public void move() {
        System.out.println("I am running.");
    }

}