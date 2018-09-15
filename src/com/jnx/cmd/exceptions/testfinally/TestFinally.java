/**
 * Finally is not executed with an invocation of a "System.exit()"
 */
package com.jnx.cmd.exceptions.testfinally;

public class TestFinally {

    public static void main(String[] args) {

        System.out.println("testing Main...");
        int result = 0;
        try {
            result = 10 / 0;
        }catch(ArithmeticException ex){
            ex.printStackTrace();
            System.exit(1);     // here is broken 
        }finally {
            System.out.println("finally...");
        }
    }
}