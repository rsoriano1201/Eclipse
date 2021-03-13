package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {

		// if it is friday --> go to the movie, otherwise stay at home and study
		// if it is friday then I will check if day is 13 --> if yes --> watch scary
		// movie
		// if no --> watch any movie you like

		boolean isFriday = true;
		int day = 19;

		if (isFriday) {
			System.out.println("It is a movie day !!!");

			if (day == 13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I will watch any available movie");
			}

		} else {
			System.out.println("I will stay at home and study java");
		}
		
		System.out.println("---------------- EXAMPLE 2 ------------------------------");
		
		//Check assignment and based on the score we will display a message//
		
		boolean completed=true;
		int score = 91;
		
		if(completed) {
			if (score>90) {
				System.out.println("Good job");
			}else if (score>80) {
				System.out.println("Better, but lets try to do better");
			}else if (score>70) {
				System.out.println("Lets try to do better");
			}else {
				System.out.println("Good for trying, but study more!!");
			}
			
		} else {
			System.out.println("please make sure the complete all assignments on time");
		}
	
	
	}

}
