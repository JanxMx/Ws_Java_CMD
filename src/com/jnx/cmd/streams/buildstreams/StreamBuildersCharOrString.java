/**
 * Using chars or String tokens
 */
package com.jnx.cmd.streams.buildstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuildersCharOrString {

    public static void main(String[] args) {
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));

        // OR

        Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
        stream2.forEach(p -> System.out.println(p));
    }

}