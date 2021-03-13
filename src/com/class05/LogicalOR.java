package com.class05;

public class LogicalOR {

	public static void main(String[] args) {
		/*  Variable day
		 * 
		 * 	if day is Tuesday or Wednesday --> Manual class
		 * 	if day Monday or Friday --> no class
		 * if day is Saturday or sunday --> Java Class
		 * if day is Thursday --> review class
		 * 
		 * OR(||)
		 * true || true --> TRUE
		 * true || false --> TRUE
		 * false || true --> TRUE
		 * false || false --> FALSE
		 */
		
		String day="Thursday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today I have no class");
			
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today I have a Manual class");
			
		} else if (day.equals("Thursday")) {
			System.out.println("Today I have review class");
			
			
		}
		
	}

}
