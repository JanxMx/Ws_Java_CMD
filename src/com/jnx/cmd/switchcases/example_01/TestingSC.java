package com.jnx.cmd.switchcases.example_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingSC {

	public void TestSwitchCase(int value) {
		
		switch(value) {
		case 1:
			System.out.println("one: " + value);
		case 2:
			System.out.println("two: " + value);
		case 3:
			System.out.println("three: " + value);
		case 4:
			System.out.println("four: " + value);
		case 5:
			System.out.println("five: " + value);
		default:
			System.out.println("six: " + value);
		}
	}
	
	List<String> lista0;
	List<String> lista1 = new ArrayList<>();
	List<Integer> lista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	List<String> lista3 = Arrays.asList("A", "B", "C", "D", "E");
	
	
}