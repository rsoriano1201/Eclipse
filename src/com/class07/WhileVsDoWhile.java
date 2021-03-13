package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		// when we do not know in advance how many times we would like to repeat block of code ==> 
		//we go for WHILE or Do While loops

		
		int num=1;
		
		while(num<=5) { //while loop is used more in programming compared to DO while//
			System.out.println("Hello");
			num++;
			}
		
		System.out.println("------------------------------------------------------------DO WHILE-----------------------------------------------------------");
		int num1=6;
		do {
			System.out.println("Hello");
			num1++;
		}while(num1<=5);
		
			//while = first check then execute
			//do = first execute then check
		
		// ******EVEN WHEN CONDITION is false DO WILL EXECUTE YOUR CODE AT LEAST ONCE *****
	
	}
	}
