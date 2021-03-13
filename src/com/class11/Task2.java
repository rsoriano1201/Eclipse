package com.class11;

public class Task2 {
	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array using 2 different loops
		 */
		//NESTED FOR LOOP
		String[][] cars= {
				{"GMC","Chevrolet","Ford"},
				{"BMW","Benz","Audi"},
				{"Kia","Hyundai"},
				{"Ferrari","Lamborgini"}
		};
		System.out.println(cars.length);
		
		for (int row=0; row<cars.length; row++) {
			
			for (int col=0; col<cars[row].length; col++) {
				System.out.println(cars[row][col]+ " ");
			}
			System.out.println();
			}
		// FOR EACH LOOP
		
		
		
		
	}

}
