package com.class11;

public class Task {
	public static void main(String[] args) {
		
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 * Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		
		String[][] celebs= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith","Jordan", "Jackson", "Obama"}
		};
		System.out.println(celebs[0][1]+" "+celebs[1][0]);
		System.out.println(celebs[0][0]+" "+celebs[1][3]);
		System.out.println(celebs[0][2]+" "+celebs[1][2]);
		System.out.println(celebs[0][3]+" "+celebs[1][1]);
		
		System.out.println("-------------another way---------------");
		
		String =celebs[0][0]+" "+celebs[1][0];
		System.out.println(celebs);
		}
	}


