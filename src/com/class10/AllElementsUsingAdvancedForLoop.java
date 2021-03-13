package com.class10;

public class AllElementsUsingAdvancedForLoop {
	public static void main(String[] args) {
		
		//for each loop, enhanced for loop, advanced for loop USED only with ARRAYS or COLLECTIONS!!
		
		int[] numbers= {10, 14, 78, 5, 90, 76, 1, 8};
		
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		String[] name = {"Grey", "ali", "jose", "angelo", "ozoda", "bryan", "steve", "oscar", "mariel", "stephanie"};
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		
		for(String n:name) {
			
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		for(char grade:grades) {
			
			System.out.print(grade+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		boolean[] boo= {true, false, false, false, true};
		
		for(boolean b:boo) {
			System.out.print(b+" ");
		}
		
		
		
		
	}

}
