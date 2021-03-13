package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		// 1 way to create a variable
		short b=200; // create a variable and assign value
					// declare a variable and initialized
		
		//2nd way to create a variable
		int sum; // declaration happens ONLY once
		sum=20; // initialized the variable
		
		
		sum=30; // reassigning the value
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 * 
		 */
		int x, y, z;
		
		x=10;
		y=20;
		//z30.9; error: type mismatch, since variable can only stire int types
		
		// I would like to change the value of X
		x=70;
		
		System.out.println(x);
		System.out.println(y);
		
		int num=33;
		// we are using value of different variable to initialize 
		int num2=num;
		
		System.out.println(num2);
		
		
	}

}
