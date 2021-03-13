package com.class07;

public class Homework {
	
	public static void main(String[] args) {
		
		
		/*
		 * for ( start value; end value; increment/decrement) {
		 * 
		 * code.....
		 */
		
		/* calculate sum of odd numbers from 1 to 50 */
		/* calculate sum of even numbers from 1 to 50 */
		/* calculate sum of ALL numbers from 1 to 50 */
		
		int sum=0;
		
		for (int i=1; i<=50; i++) {
			if(i%2!=0 ) {
				sum+=i; 
			}
		}
		
		System.out.println("The sum of all odd numbers from 1-50 is " +sum);
		
		
		int sum2=0;
		for(int even=50; even>1; even-=2) {
			if(even%2==0) {
				sum2+=even;
			}
		}
		
		System.out.println("The sum of all even numbers from 1-50 is "+sum2);
		
		int result=sum+sum2;
		
		System.out.println("The sum of ALL numbers from 1-50 is "+result);
		
		
		int sumEven = 0;
		for (int i = 1; i <= 50; i+=2) {
				sumEven += i;
		}
		
		System.out.println("The sum of even numbers from 1-50 it " + sumEven);
		
		System.out.println("---------------------------------------------ANOTHER WAY ------------------------------------------------");
		
		int odd = 0;
		int even = 0;
		
		for (int i = 1; i<=50; i++) {
			
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("Sum of odd numbers equal to "+ odd);
		System.out.println("Sum of even numbers equal to "+ even);
				
				
		
		
		}
		
		
	}


