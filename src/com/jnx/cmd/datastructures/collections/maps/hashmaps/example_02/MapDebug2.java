/**
 * Debug this code to see the colission between two objects added
 */
package com.jnx.cmd.datastructures.hashmaps.example_02;

import java.util.HashMap;
import java.util.Map;

public class MapDebug2 {

    public static void main(String[] args) {

        String s1 = "FB";
        String s2 = "Ea";
        System.out.println(s1.hashCode() + " " + s2.hashCode());

        Map<String,String> map = new HashMap<>();

        map.put(s1, 1);
        map.put(s2, 2);
    }

}