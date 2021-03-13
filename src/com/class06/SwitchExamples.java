package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		/* Store gender using M or F 
		 * Based on the gender we will specify
		 * F --> Female otherwise --> no sure
		 * */
		
		//We cannot have duplicate cases
		//values must match a variable type
		// we MUST have break in every case
		
		char gender = 'M';
		String description;
		
		switch (gender) {
		
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
			
		}
		System.out.println(description);
		
		
		/* Limitation:
		 * switch CANNOT use Relational or Logical operators( it can only check ) 
		 * switch CANNOY be used with boolean, float, double, long*/
		
		boolean sunny = true;
		if(sunny) {
			System.out.println("I am happy");
		}
		double price=10.99;
		
		if(price<10 ) {
			System.out.println("Too expensive");
		}
		
	}

}
