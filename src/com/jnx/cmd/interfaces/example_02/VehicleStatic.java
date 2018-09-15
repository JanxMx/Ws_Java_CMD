package com.jnx.cmd.interfaces.example_02;

public interface VehicleStatic {
    
    default void print() {
        System.out.println("I'm a Vehicle");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}