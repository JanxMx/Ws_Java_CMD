package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectToList {

    public static void main(String[] args) {

        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members: " + memberList + "\n");

        System.out.println("------ members collected ------");
        List<String> membersInUpperCase = 
                memberList.stream().sorted()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList());

        System.out.println("members: " + membersInUpperCase);
    }
}