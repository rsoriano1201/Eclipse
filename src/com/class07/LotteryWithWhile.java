package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		
		// when we do not know in advance how many times we would like to repeat block of code ==> 
		//we go for WHILE or Do While loops

		
		Scanner input;
		int num;
		int lotteryNumber=17;
		
		input=new Scanner(System.in);
		
		
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
			
		while(num!=lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}
		System.out.println("Congratulations you entered " + num + " which is a lucky number");

	}

}
