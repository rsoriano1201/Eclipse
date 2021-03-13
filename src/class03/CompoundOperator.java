package com.class03;

public class CompoundOperator {
	
	public static void main(String[] args) {
		
		int num=100;
		
		num=num+100;
		
		System.out.println(num); 
		
		num=num-50;
		
		System.out.println(num); 
		
		int num1=100;
		
		num1+=100; //num1=num1+100;
		System.out.println(num1); //200
		
		num1-=50;
		System.out.println(num1); //150
		
		
		num1/=5;
		System.out.println(num1); //30
		
		num1*=10;
		
		System.out.println(num1); //300
		
		num1+=20;
		System.out.println(num1); //320
		
		int a=100;
		
		a+=500;
		System.out.println(a);
		
		a-=67;
		System.out.println(a);
		
		int cakePiece=11;
		cakePiece /= 4;
		System.out.println(cakePiece);
		
		
		
	}

}
