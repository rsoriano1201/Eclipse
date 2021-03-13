package com.class07;

import java.util.Scanner;

public class DoOrWhile {
	
	public static void main(String[] args) {
		
		
		// when we do not know in advance how many times we would like to repeat block of code ==> 
		//we go for WHILE or Do While loops
		//
		//we need to keep asking a user to enter any number from 1 to 100
		//UNTIL the correct number is entered
		
		Scanner input;
		int num;
		int lotteryNumber=17;
		
		input=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
			
		}while(num!=lotteryNumber);
		
		System.out.println("Congratulations you entered "+num+" which is a lucky number");
	}

}
