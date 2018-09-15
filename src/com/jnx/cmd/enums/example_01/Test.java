package com.jnx.cmd.enums.example_01;

public class Test {
    
    public static void main(String[] args) {

        for(UserStatus status: UserStatus.values()) {
            System.out.println(status);
        }
    }

}