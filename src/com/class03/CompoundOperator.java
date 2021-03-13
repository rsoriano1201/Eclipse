package com.class03;

public class CompoundOperator {

	public static void main(String[] args) {

		// int num=100;
		// num=num+100;
		// System.out.println(num); ========== 200

		int num2 = 100;
		num2 += 100;
		System.out.println(num2); // 200

		num2 -= 50;
		System.out.println(num2); // 150

		num2 /= 5;
		System.out.println(num2); // 30

		num2 *= 10;
		System.out.println(num2); // 300

		num2 += 20;
		System.out.println(num2); // 320

		int a = 100;
		a += 500;
		System.out.println(a); // 100 + 500 = 600

		a -= 67;
		System.out.println(a); // 600 - 67 = 533

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		int cake = 25;
		cake %= 7;
		System.out.println(cake);

		// int i=10.99; //type mismatch because you are trying to use a double(decimal)

		// widening of implicit CASTING
		double d = 10;
		System.out.println(d);

		int num = 10;

		// narrowing or explicit CASTING
		int i = (int) 12.99;
		System.out.println(i);

		byte b = (byte) 130;
		System.out.println(b);

		// always use double for division

		int number = 12;
		double result = number / 5;
		System.out.println(result);

		double newNum = 10;
		newNum = newNum / 3;

		System.out.println(newNum);

		// int num1=10+10.5; - java complains because int + double

		double num1 = 10 + 10.5;
		System.out.println(num1);

	}

}
