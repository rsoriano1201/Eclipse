package com.class12;

public class Task6Hw {
	public static void main(String[] args) {

		/* write a java program to check whether a given number is prime or not */

		int num = 1;
		boolean prime = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not prime number");
		}

	}

}
