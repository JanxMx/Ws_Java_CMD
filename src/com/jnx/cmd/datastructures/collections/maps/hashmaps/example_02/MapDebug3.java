/**
 * Debug this code to see same key with differente value
 * The value is updated
 */
package com.jnx.cmd.datastructures.hashmaps.example_02;

import java.util.HashMap;
import java.util.Map;

public class MapDebug3 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("bb", 1);
        map.put("bb", 2);
    }

}