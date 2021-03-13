package com.class05;

import java.util.Scanner;

public class Class4Review {
	
	public static void main (String[] args) {
		
		//nested if - if inside another if
		
		//if (boolean condition) {
		
		//if (boolean condition) {
		
		//scanner - class used to take input from a user
		
		Scanner anyVariableName;
		
		anyVariableName=new Scanner(System.in);
		
		//to capture entire sentence
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence);
		
		//to capture a number
		int num=anyVariableName.nextInt();
		
		//to capture a double
		double d=anyVariableName.nextDouble();
		
		//to capture single character
		char singleCharacter=anyVariableName.next().charAt(0);
		System.out.println(singleCharacter);
	
	
	}
}
