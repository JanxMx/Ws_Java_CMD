/**
 * Using someList.stream()
 */
package com.jnx.cmd.streams.buildstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuildersList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }

}