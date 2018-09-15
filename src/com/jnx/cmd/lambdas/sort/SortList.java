package com.jnx.cmd.lambdas.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        Members members = new Members();
        System.out.println("members: " + members.getMembers());
        sortUsingJava8(members.getMembers());
    }

    private static void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("------ list sorted ------");
        System.out.println("members: " + names);
    } 

}