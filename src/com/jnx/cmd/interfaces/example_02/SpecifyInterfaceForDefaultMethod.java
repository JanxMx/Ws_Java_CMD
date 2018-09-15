package com.jnx.cmd.interfaces.example_02;

public class SpecifyInterfaceForDefaultMethod implements Vehicle, FourWheeler {

    public void print() {
        Vehicle.super.print();
    }
} 