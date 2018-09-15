/**
 * Using Stream.generate() or Stream.iterate() functions
 */
package com.jnx.cmd.streams.buildstreams; 

import java.util.Date;
import java.util.stream.Stream;

public class StreamBuildersIterate {
    
    public static void main(String[] args) {
        Stream<Date> stream = Stream.generate(() -> { return new Date(); });
        stream.forEach(p -> System.out.println(p));
    }
}