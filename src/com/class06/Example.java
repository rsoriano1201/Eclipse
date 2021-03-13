package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		/*
		 * we need to calculate the final price after the discount
		 * 
		 * we check if there is a sale
		 * if no sale -- > I am not going for shopping
		 * if there is a sale
		 * 		we will ask the item
		 * 		we will ask price
		 * 
		 * 		if price is less than 10 --> apply 5% discount
		 * 		if price between 10 and 100 --> apply 10% discount
		 * 		if price is between 100 to 500 --> apply 20% discount
		 * 		if price is more than 500 --> apply 30% discount
		 * 
		 * 		"which item you purchased, what was the original price, what discount applies and final price"
		 *  
		 */		
		double price, discount = 0, finalPrice = 0;
		String item;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Do we have a sale today?");
		
		boolean sale =scan.nextBoolean();
		
		if(!sale) {
			System.out.println("I am not going shopping");
		}else {
			
			System.out.println("Do you have the item?");
			item = scan.next();
			System.out.println("What is the price of that item");
			price = scan.nextDouble();
			
			if (price < 10) {
				discount = price * 0.05;
				
			}else if (price >= 10 && price < 100) {
				discount = price * 0.1;
				
			}else if (price >= 100 && price <= 500) {
				discount = price * 0.2;
				
			}else if (price > 500) {
				discount = price * 0.3;
			}
			
			finalPrice=price-discount;

			
			System.out.println("You are buying "+item+" with original price ="+price+" after discount "+discount+" your final price is =$"+finalPrice);
			
			if (finalPrice<500) {
				System.out.println("I did not do crazy shopping");
				
				
				
			}
			}
			}
}
