package com.class05;

import java.util.Scanner;

public class HW {
	
public static void main(String[] args) {
	
	/*
	 * Create a java program that will ask if user has a credit card or not 
	 * If user does not have a credit card then offer them 
	 * if balance of the card is larger than 1000, tell them to pay off immediately 
	 * otherwise you can tell the that they can spend more
	 */	
	
	String creditCard;
	double balance;
	Scanner scan;
	
	scan=new Scanner(System.in);
	
	System.out.println("Do you have a credit card?");
	creditCard=scan.next();
	
	if (creditCard.equalsIgnoreCase("yes")) {
		
		System.out.println("What is the balance on the CC?");
		
		balance=scan.nextDouble();
		
		if (balance>1000) {
			System.out.println("Pay off immediately");
		}else {
			System.out.println("spend more");
		}
		
	} else {
		System.out.print("Would you like a credit card?");
	}
	
	
	
	
	
}
}
