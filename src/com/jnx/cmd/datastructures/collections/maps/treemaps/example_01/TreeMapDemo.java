/**
 * TreeMap is a collection of sorted elements
 * It use comparable/comparator to filter elements
 */
package com.jnx.cmd.datastructures.collections.maps.treemaps.example_01;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        Map<String,Integer> treemap = new TreeMap<>();
        
        treemap.put("Luz", 16000);
        System.out.println(treemap);

        treemap.put("Alicia", 7000);
        System.out.println(treemap);

        treemap.put("Tylor", 38000);
        System.out.println(treemap);

        treemap.put("Rachel", 29000);
        System.out.println(treemap);

        treemap.put("Mary", 18000);
        System.out.println(treemap);

    }

}