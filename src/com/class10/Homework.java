package com.class10;

public class Homework {
	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		
		String[] car=new String[6];
		car[0]="Honda";
		car[1]="Toyota";
		car[2]="Acura";
		car[3]="BMW";
		car[4]="Nissan";
		car[5]="Volvo";
		
		System.out.println(car[0]+" "+car[1]+" "+car[2]+" "+car[3]+" "+car[4]+" "+car[5]);
		
		for(int i=0; i<car.length; i++) {
			System.out.print(car[i]+" ");
		}
		System.out.println();
		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */
		
		String[] animals= {"dog", "cat", "mouse", "bear", "fox", "lion"};
		
		for(String a:animals) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int i=0; i<animals.length;i++) {
			System.out.print(animals[i]+" ");
		}
		
		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */
		
		int[] numb= {1,2,3,4,5};
		

			
		}
		
		
		
		

				
	}

}
