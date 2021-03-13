package com.class08;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		//print numbers from 1 to 50 except those that are divisible by 3
		
		for (int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		
		//create a program that will keep asking user to apply for a credit card. As soon as you get "yes" from a user the program should stop asking
		
		Scanner input=new Scanner (System.in);
		String card;
		boolean yes=true;
		
				
		while (yes) {
			System.out.println("Do you want a credit card?");
			card=input.nextLine();
			
			if (card.equalsIgnoreCase("yes")) {
				System.out.println("Stop asking if they want credit card.");
				break;
			}
		}
	}
}
	


