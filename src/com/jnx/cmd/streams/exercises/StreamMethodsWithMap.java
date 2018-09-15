package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;

public class StreamMethodsWithMap {

    public static void main(String[] args) {

        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members: " + memberList + "\n");
 
        System.out.println("----- members filtered -----");
        memberList.stream().filter((s) -> s.startsWith("A"))
                           .map(String::toUpperCase)
                           .forEach(System.out::println);

    }
}