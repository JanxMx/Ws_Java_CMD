package com.jnx.cmd.loops.nested;

public class NestedLoops2 {

    public static void main(String[] args) {
        loop();
        System.out.println("Done");
    }

    public static void loop() {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(i*j > 6) {
                    System.out.println("Breaking");
                    return;
                }
                System.out.println(i + " " + j);
            }
        }
    }

}