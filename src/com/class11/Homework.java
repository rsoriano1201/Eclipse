package com.class11;

public class Homework {
	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */
		
		int[][] numbers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		
		for(int[] n:numbers) {
			for(int even:n) {
				if(even%2==0) {
					System.out.print(even+" ");
				}
			}
			}
		
	
	}
	}