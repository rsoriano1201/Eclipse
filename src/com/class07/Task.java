 package com.class07;

public class Task {
	public static void main(String[] args) {
		
		//print numbers from 1 to 100 on one line with space
		
		int a = 1;
		while(a<=100) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		//print numbers 100 to 1
		int b=100;
		while(b>=1) {
			System.out.println(b + " ");
			b--;
		}
		System.out.println();
		
		//print even numbers 20 to 100
		
		int c=20;
		while(c<=100) {
			System.out.print(c + " ");
			c += 2;
			}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		//another way to do ^^^^^^^^
		int d = 20;
		
		while(d <= 100) {
			if(d % 2 == 0)
				System.out.print(d + " ");
			d++;
		}
		
		
		
		
		
		
	}

}
