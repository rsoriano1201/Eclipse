package com.class07;

public class LoopIntro {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
		System.out.println("-----------------------------");
		
		//we want to eliminate code redundancy, so we implement loops and execute repetitive code
		
		//IF always works with a TRUE statement and only executes one time
		int time = 7;
		if (time<12) {
			System.out.println("Hello"); // code executes 1 time
		}
		
		
		System.out.println("____________------------------------------------------WHILE LOOP --------------------_________________________________");
		
		//while loops keep repeating execution of block of code while condition is true
		while (time<12) {
			System.out.println("Hello"); // code executes infinitely
			time++;
		}
		
		System.out.println("---------------------------------------print numbers from 1 to 10----------------------------------------");
		//the condition must be true 10 times 
		int num=1;
		
		while(num<=10) {
			
			System.out.print(num + " ");
			num++;
			
			
		}
		System.out.println();
		System.out.println("--------------------------------PRINT NUMBERS 20 TO 40---------------------------------------");
		
		num=20;
		
		while(num<=40) {
			System.out.print(num + " ");
			num++;
		}
		
		System.out.println();
		System.out.println("-------------------------------print numbers from 10 to 1-----------------------------------");
		
		int a = 10;
		while (a>=1) {
			System.out.print(a + " ");
			a--;
		}
		System.out.println();
		System.out.println("-------------------------------print numbers from 10 to 15---------------------------------------------");

		}
		
		
		
	}


