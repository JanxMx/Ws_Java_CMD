/**
 * Using Stream.of(arrayOfElements)
 */
package com.jnx.cmd.streams.buildstreams;

import java.util.stream.Stream;

public class StreamBuildersArray {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
        stream.forEach(p -> System.out.println(p));
    }
}
