package com.class05;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules:
		 * 
		 * if the average score >=90 → grade=A
		 * if the average score >= 70 and <90 → grade=B
		 * if the average score>=50 and <70 → grade=C
		 * if the average score<50 → grade=F
		 */
		Scanner score;
		int quiz;
		int midterm;
		int finaly;
		int gpa;
		char grade;
		score = new Scanner(System.in);
		
		System.out.println("Please enter you quiz score: ");
		quiz = score.nextInt();
		
		System.out.println("Please enter your midterm score: ");
		midterm = score.nextInt();
		
		System.out.println("Please enter your final score: ");
		finaly = score.nextInt();
		
		gpa = (quiz+midterm+finaly)/3;
		
		if (gpa >=90) {
			grade = 'A';
		}else if  (gpa >=70 && gpa<90) {
			grade = 'B';
		}else if (gpa >=50 && gpa<70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
	
		System.out.println("Your grade is "+ grade);
	
	}
}
