package com.class07;

public class ForLoop {
	
	public static void main(String[] args) {
		
		//When we know in advance how many times we would like to repeat block of code
		//we use the FOR loop
		
		/*
		 * for ( start value; end value; increment/decrement) {
		 * 
		 * code.....
		 */
		
		//example:
		//I want to say hello 3 times;
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
		}
		
		//FOR LOOP SYNTAX
		//for (initialization; condition; increment/decrement) {
		//   code....
		
		System.out.println("-------------Print numbers from 1 to 50----------------------");
		for (int i=1; i<=50; i++) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("------------------------Print numbers from 10 to 1------------------------------");
		
		for (int i=10; i>=1; i--) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------print numbers from 50 to 100 by increments of 5--------------------");
		
		for (int b=50; b<=100; b+=5) {
			System.out.print(b+ " ");
			
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------print numbers 100 to 50 minusing by 5-----------------------------------");
		
		for (int c=100; c>=50; c-=5) {
			System.out.print(c+ " ");
		}
		
		
		
		
	}

}
