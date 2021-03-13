package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		// Nested if is another if statement inside IF statement
		// Use nested if for FURTHER check
		// Initial IF statement always has to be TRUE to move inside block of code

		boolean morning = true;

		boolean classToday = true;

		// is it morning? --> Good morning
		// If there is class: yes --> hello classmates
		// otherwise --> hello my family

		if (morning) {
			System.out.println("Let me check if I have class today");

			if (classToday) {
				System.out.println("Good morning my classmates");
			} else {
				System.out.println("Good morning my family");
			}
		}

		System.out.println("End of the code");

		System.out.println(" -------------------------------------- Example 2 ------------------------");

		boolean anyAllergy = true;
		boolean pollenAllergy = false;

		String allergy = "pollen";

		if (anyAllergy) {
			System.out.println("Let's check which allergies you have ");

			if (pollenAllergy) {
				System.out.println("Don't get close to trees");
			} else {
				System.out.println("ok I know you do not have pollen allergy");
			}

		} else {

			System.out.println("You are lucky not having any allergies");
			
		}			
		
			System.out.println("------------------------------ EXAMPLE 3 -------------------------");

	}

}
