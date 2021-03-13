package com.class06;

public class NotOperator {

	public static void main(String[] args) {

		// ! - NOT --> reverse the condition
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("I will go to the park");
			}
		
		boolean boo=!true;
		
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		
		//IF there is no traffic..i will come on time
		
		boolean traffic=false;
		if (!traffic) {
			System.out.println("I will come on time");
		}
		
		//IF day is monday...today is not friday
		String day="Monday";
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		
		
		// IF there is no homework I will be happy
		boolean homework=false;
		if(!homework) {
			
			System.out.println("I will be happy");
		}
		
		
		
	}

}
