package com.class03;

public class RelationalOperators {
	
		public static void main(String[] args) {
			
			int a=10;
			int b=7;
			
			System.out.println(a>b); //true
			System.out.println(a<b); //false
			System.out.println(a==b); //false
			System.out.println(a!=b);// true !=not equal
			
			boolean result=a>=b;
			boolean result1=a<=b;
			
			System.out.println(result); //true
			System.out.println(result1); //false
			
			int c=20;
			int d=29;
			
			System.out.println(c==d);// False - checking equality or comparing 
			System.out.println(c=d);// assigning the value of d to c = 29
			System.out.println(c); //29
			System.out.println(d); //29
			
			//Code is always executed top to bottom!
			
			
		}

}
