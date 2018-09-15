/**
 * Java compiler parses the unicode character \u000d
 * as a new line and gets transformed into
 *      // \u000d
 *      System.out.println... 
 */
package com.jnx.cmd.mains.commented;

public class MainCommented {

    public static void main(String[] args) {
        // the line below this gives and output
        // \u000d System.out.println("comment executed");
    }
}