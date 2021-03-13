package com.class07;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * for ( start value; end value; increment/decrement) {
		 * 
		 * 	code.....
		 * 
		 * Print numbers from 1 to 100 in 1 line with space
		 * 
		 * 
		 * Print numbers from 100 to 1
		 * 
		 * 
		 * Print even numbers from 20 to 1 (2 ways)
		 * 
		 * 
		 * Print odd numbers between 20 and 50 (2 ways)
		 */
		
		
		System.out.println("---------------------------------Print numbers from 1 to 100 in 1 line with space--------------------------------");
		for ( int a=1; a<=100; a++) {
			System.out.print(a+ " ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------Print numbers from 100 to 1----------------------------------------------");
		
		for (int b =100; b>=1; b--) {
			System.out.println(b+ " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------Print even numbers from 20 to 1 (2 ways)------------------------------------------");
		
		for (int c=20; c>=1; c-=2) {
			System.out.println(c+ " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------Print odd numbers between 20 and 50 (2 ways)------------------------------------");
		
		for (int d=20; d<=50; d++) {
			
			if (d % 2 == 1) {
			System.out.print(d+ " ");
			}
		}
		
		//another way
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		
		for (int i=21; i<=50; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------what is the output?--------------------------------------------");
		
		int result = 0;
		
		for (int i = 2; i < 10; i += 2) {
			result += i;
		}
		System.out.println(result);
			
			
			
			
			
		
		
		
		
		}
		}
	


