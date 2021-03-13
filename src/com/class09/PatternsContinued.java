package com.class09;

public class PatternsContinued {
	public static void main(String[] args) {
		
		//12345 rows = 4
		//12345 columns = 5
		//12345
		//12345
		
		for (int r=1; r<=4; r++) {
			
			for (int c=1; c<=5; c++) {
				
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		for (int r=5; r>=1; r--) {
			
			for(int c=6; c>=1; c--) {
				System.out.print(c + " ");
				} System.out.println();
		}
		System.out.println("-------------------------------------NUMBERS SQUARE------------------------------------------------");
		for(int a=1; a<=5;a++) {
			for(int b=6; b>=1;b--) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	System.out.println("-------------------------------------------------------------triangle----------------------------------------");
	
	for (int r=1; r<=5; r++) {
		
		for (int c=1; c<=r; c++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	}
	}
