package com.jnx.cmd.switchcases.example_01;

public class Main {

	public static void main(String[] args) {

		int[] ar = new int[3];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		
		TestingSC testSwitchCase = new TestingSC(); 
		testSwitchCase.TestSwitchCase(3);
		
		System.out.println(".........");
		testSwitchCase.TestSwitchCase(1);

	}

}