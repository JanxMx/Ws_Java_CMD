package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduce {

    public static void main(String[] args) {
        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members: " + memberList + "\n");

        Optional<String> reduced = memberList.stream()
                        .reduce((s1, s2) -> s1 + "#" + s2 );
        
        reduced.ifPresent(System.out::println);

    }
}