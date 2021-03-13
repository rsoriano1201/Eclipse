package com.class04;

public class HW {
	
		public static void main(String[] args) {
			
			// Create a Java program and declare int variable that will hold a month.
			// Based on the value of the variable your program should print the name of the
			// month.
			
			int negativeOrPositive = 4;
			if (negativeOrPositive > 3) {
				System.out.println(negativeOrPositive + " is positive number");
			} else if (negativeOrPositive <0) {
				System.out.println(+negativeOrPositive + " is negative number");
			} else {
				System.out.println("Number is neither positive or negative");
			}
			
			System.out.println("------------------HW #2 ------------------------");
			
			
			int num = 10;
			if (num % 2 == 0) {
				System.out.println(num+ " is an even number");
			} else {
				System.out.println(num+ " is an odd number");
			}
		}

}
