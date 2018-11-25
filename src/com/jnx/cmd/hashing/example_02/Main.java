package com.jnx.cmd.hashing.example_02;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Juan");
        System.out.println("hashCode normal: " + employee1.hashCode());

        EmployeeHC employee2 = new EmployeeHC();
        employee1.setName("Pedro");
        System.out.println("hashCode modified: " + employee2.hashCode());

    }

}