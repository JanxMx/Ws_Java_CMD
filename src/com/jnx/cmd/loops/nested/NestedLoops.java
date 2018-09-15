package com.jnx.cmd.loops.nested;

public class NestedLoops {

    public static void main(String[] args) {

        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                if(j>2) {
                    break;
                }
                System.out.println("i: " + i + "-j:" + j);
            }
        }

        System.out.println();

        outerloop:
        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                if(j>2) {
                    break outerloop;
                }
                System.out.println("i: " + i + "-j:" + j);
            }
        }

        System.out.println("Done...");
    }
}