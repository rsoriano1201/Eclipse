package com.class05;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 * 
		 * 
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5  output “It is a weekday”, any day from 6-7  output “It is a
		 * weekend”, any other day  output “Invalid day”
		 */
		
		Scanner pp = new Scanner(System.in);
		int height;
		
		System.out.println("please enter your height in inches");
		height = pp.nextInt();
		
		if (height < 60) {
			System.out.println("Person is short");
			
		} else if (height > 60 && height <= 72) {
			System.out.println("You are the person who's height is medium");
			
		} else {
			System.out.println("you are the person who's height is tall");
		}
		
		

		
	
	}
		
		
		

	}


