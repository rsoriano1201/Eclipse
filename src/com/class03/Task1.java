package com.class03;

public class Task1 {
	public static void main(String[] args) {

		int temp = 40;

		if (temp < 32) {
			System.out.println("It is very cold");
			System.out.println("water will freeze with temperature " + temp);

		} else {

			System.out.println("I am else block");
			System.out.println("water will NOT freeze with temperature " + temp);
		}

		double money = 5;
		double $coke = 3;

		if (money == $coke) {
			System.out.println("I am buying soda");
		} else {
			System.out.println("I need exact amount");
		}

		boolean snow = true;

		if (snow) {
			System.out.println("Yay, I will play with the snow");
		} else {
			System.out.println("I am going to ride my bicycle");
			
		}
		{

			boolean summer = false;
			if (summer) {
				System.out.println("I am going to florida");
			} else {
				System.out.println("I will stay at home");
			}
		}
	}
}
