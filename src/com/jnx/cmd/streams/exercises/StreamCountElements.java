package com.jnx.cmd.streams.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCountElements {

    public static void main(String[] args) {

        Members members = new Members();
        List<String> memberList = members.getMembers();
        System.out.println("members: " + memberList + "\n");

        long totalMatched = memberList.stream()
                            .filter((s) -> s.startsWith("A"))
                            .count();

        System.out.println("Total Matched: " + totalMatched);
    }

}