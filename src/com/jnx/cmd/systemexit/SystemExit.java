/**
 * java.lang.System.exit() method exits the current program 
 * by terminating running Java Virtual Machine.
 *
 * exit(0)                  Generally used to indicate successful termination
 * exit(1) or exit(-1)      Generally indicates unsuccessful termination
 */
package com.jnx.cmd.systemexit;

public class SystemExit {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 , 5, 6, 7, 8};

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>=5) {
                System.out.println("exit...");
                // Terminate JVM
                System.exit(0);
            }else{
                System.out.println("arr["+i+"] = " + arr[i]);
            }
        }
        System.out.println("End of Program");
    }


}