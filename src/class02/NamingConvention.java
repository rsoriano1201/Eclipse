package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		//Keywords - a special word that reserved in java memory: Class, public, static
		
		//Identifiers - name what we give to classes, variable, and methods
		
		/*
		 * RULE!!
		 * Do not use keyword as identifiers! 
		 * identifiers cannt contain space
		 * idenifiers cannot start with numbers
		 * identifiers cannot have special characters: _ or $
		 */

		
		int final=10; // doesn't work because you are using one of java indentifiers already
		
		int poop=10; // works because it is not a special java key word identifier
		
		
		//NamingConvention
		// 1. we use camel casing
		// 2. classes starts with Upper case and will follow camel casing
		// 3. variables start with lower case and follow camel casing
		// 4. packages we use lower case and use name as reverse way of URL
		// 5. use meaningful names for your variables
		
		
		int Number=12; // try not to use uppercase names
		int number=12; // more preferable
		
		
		int numberOne=12;
		int numberTwo=13;
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.89;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
