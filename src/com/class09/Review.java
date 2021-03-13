package com.class09;

public class Review {
public static void main(String[] args) {
								//outter loop always controls inner loop
	for (int i=1; i<4; i++) { //first condition is true so you're able to go into block of code
		for (int j=1; j<5; j++) { //inner loop
			System.out.println("Good evening");
		}
		System.out.println("--------------------");
	}
	System.out.println("-------------------------------------------------------------------------------------------");
	
	for (int i=1; i<3; i++) {
		
		
		
		for (int j=1; j<=4; j++) {
			
			System.out.println(i+" "+j);
			
			
		}
		
		}
	System.out.println("----------------------------Print numbers from 10 to 99 using nested loop----------------------------------------");
	
	for (int i=1;  i<10; i++) {
		
		for (int j=0; j<=9; j++) {
			
				System.out.println(i+" "+j);
		}
	}
	System.out.println("------------------------------------------------car odometer-----------------------------------------------");
	for (int a=0; a<=9; a++) {
		
		for(int b=0; b<=9; b++) {
			
			for(int c=0; c<=9; c++) {
				
				for(int d=0; d<=9; d++) {
					
					System.out.println(a + "" + b + "" + c + "" + d);
				}
			}
		}
	}
	
	System.out.println("-------------------------------CLOCK --------------------------------------------");
	for (int h = 0; h <= 24; h++) {
		for (int m = 0; m < 60; m++) {
			if (h<10) {
				System.out.print("0"+ h + ":");
			} else {
				System.out.print(h + ":");
			}
					
			if (m<10) {
				System.out.println("0"+ m);
			} else {
				System.out.println(m);
			}
		}
	}
	
	int result;
	for (int a=1; a<=9; a++) {
		
		for (int b=1; b<=9; b++) {
			
			result = a * b;
			System.out.println(a + " x " + b + " = " + result);
			
			
		}
	}
}

}

