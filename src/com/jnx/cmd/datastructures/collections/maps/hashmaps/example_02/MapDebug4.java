/**
 * Debug this code to see that with null key
 * the object is added to zero index
 */
package com.jnx.cmd.datastructures.hashmaps.example_02;

import java.util.HashMap;
import java.util.Map;

public class MapDebug4 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put(null, 1);
    }

}