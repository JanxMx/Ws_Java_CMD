/**
 * Debug this code to see how duplicate HashMap capacity
 * the the next fields in debug:
 *       loadFactor  0.75
 *       threshold   12         ()
 * the number of elements required is 13 to duplicate capacity
 */
package com.jnx.cmd.datastructures.hashmaps.example_02;

import java.util.HashMap;
import java.util.Map;

public class MapDebug5 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        map.put("d", 1);
        map.put("e", 1);
        map.put("f", 1);
        map.put("g", 1);
        map.put("h", 1);
        map.put("i", 1);
        map.put("j", 1);
        map.put("k", 1);
        map.put("l", 1);
        map.put("m", 1);
        //map.put("n", 1);
        //map.put("o", 1);
    }

}