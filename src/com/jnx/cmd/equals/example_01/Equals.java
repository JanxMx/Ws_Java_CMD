package com.jnx.cmd.equals.example_01;

public class Equals {

    public static void main(String[] args) {
        
        EqualsController ec = new EqualsController(); 
        ec.testString();
        System.out.println("types String compared successfully!!! \n");
        ec.testInteger();
        System.out.println("types Integer compared successfully!!! \n");
        ec.testFloat();
        System.out.println("types float compared successfully!!! \n");
    }

}

class EqualsController {

    public void testString() {

        String str00 = "test";
        String str01 = new String("test");
        boolean testStr001 = str00 == str01;
        boolean testStr002 = str01.equals(str00); 
        System.out.println("str00 == str01: " + testStr001);
        System.out.println("str01.equals(str00): " + testStr002 + "\n");

        String str02 = new String("test");
        boolean testStr01 = str01 == str02;
        boolean testStr02 = str01.equals(str02);
        System.out.println("str01 == str02: " + testStr01);
        System.out.println("str01.equals(str02): " + testStr02 + "\n");

        String str03 = "test";
        boolean testStr03 = str01 == str03;
        boolean testStr04 = str02 == str03;
        boolean testStr05 = str01.equals(str03);
        boolean testStr06 = str02.equals(str03); 
        System.out.println("str01 == str03: " + testStr03);
        System.out.println("str02 == str03: " + testStr04);
        System.out.println("str01.equals(str03): " + testStr05);
        System.out.println("str02.equals(str03): " + testStr06 + "\n");

        String str04 = "test";
        boolean testStr07 = str03 == str04;
        boolean testStr08 = str03.equals(str04);
        System.out.println("str03 == str04: " + testStr07);
        System.out.println("str03.equals(str04): " + testStr08 + "\n");

        String str05 = new String("test");
        boolean testStr09 = str03 == str05;
        boolean testStr10 = str02 == str05;
        boolean testStr11 = str05.equals(str03);
        boolean testStr12 = str02.equals(str05);
        System.out.println("str03 == str05: " + testStr09);
        System.out.println("str02 == str05: " + testStr10);
        System.out.println("str03.equals(str05): " + testStr11);
        System.out.println("str02.equals(str05): " + testStr12 + "\n");

    }

    public void testInteger() {

        Integer int01 = 1;
        Integer int02 = new Integer(1);
        boolean testInt01 = int01 == int02;
        boolean testInt02 = int02.equals(int01);
        System.out.println("int01 == int02:" + testInt01);
        System.out.println("int02.equals(int01): " + testInt02 + "\n");

        Integer int03 = new Integer(1);
        boolean testInt03 = int02 == int03;
        boolean testInt04 = int02.equals(int03);
        System.out.println("int02 == int03: " + testInt03);
        System.out.println("int02.equals(int03): " + testInt04 + "\n");

        Integer int04 = 1;
        boolean testInt05 = int01 == int04;
        boolean testInt06 = int01.equals(int04);
        System.out.println("int01 == int04: " + testInt05);
        System.out.println("int01.equals(int04): " + testInt06 + "\n");

    }

    public void testFloat() {

        Float float01 = 3.25F;
        Float float02 = 3.25F;
        boolean testFt01 = float01 == float02;
        boolean testFt02 = float01.equals(float02);
        System.out.println("float01 == float02: " + testFt01);
        System.out.println("float01.equals(float02): " + testFt02 + "\n");
    
    }

}