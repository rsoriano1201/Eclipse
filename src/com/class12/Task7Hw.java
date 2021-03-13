package com.class12;

public class Task7Hw {
	public static void main(String[] args) {
		
		/*
		 * write a java program to print the first 10 numbers of the Fibonacci series.
		 */
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=10; i++) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(a+" ");
			
	
		}
	}

}
