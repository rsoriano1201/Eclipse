package com.class10;

public class Task2 {
	public static void main(String[] args) {
		
		/*
		 * Create an array of names and store all names of your group. Then print your
		 * name from that array. (use 2 different ways of creating an array).
		 */
		
		String[] name=new String[3];
		name[0]="Angelo";
		name[1]="Steve";
		name[2]="Andrew";
		
		System.out.println(name[0]);
		System.out.println("-----another way------");
		

		String[] names1= {"Angelo", "Steve", "Andrew"};
		System.out.println(names1[0]);
		
		System.out.println("================== ALL ELEMENTS FROM AN ARRAY==========================");
		

		
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		String[] a=new String[5];
		a[0]="Saturday";
		a[1]="is";
		a[2]="java";
		a[3]="coding";
		a[4]="day";
		
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
		
		
		
		
	}

}
