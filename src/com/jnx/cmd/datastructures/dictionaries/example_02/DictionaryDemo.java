/**
 * La clase Dictionary esta deprecada
 * Para los dictionarios ahora se utiliza la clase Map
 */
package com.jnx.cmd.datastructures.dictionaries.example_02;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo {

    public static void main(String[] args) {

        // create a new Hashtable
        Dictionary d = new Hashtable();

        // add 2 elements
        d.put(1, "Cocoa");
        d.put(4, "Chocolate" + "Bar");
        System.out.println("\"1\" is " + d.get(1)); 
        System.out.println("\"4\" is " + d.get(4));

        // generate a series of elements, one at time
        for (Enumeration e = d.elements(); e.hasMoreElements();) {
            System.out.println(e.nextElement());
        }

    }

}