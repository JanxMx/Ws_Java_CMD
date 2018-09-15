package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethodsWithList {
    
    public static void main(String[] args) {

        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members:" + memberList + "\n");

        System.out.println("------ members filtered -------");
        memberList.stream().filter((s) -> s.startsWith("A"))
                           .forEach(System.out::println);

    }

}