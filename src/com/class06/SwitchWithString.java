package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*
		 * We need to identify favorite food
		 * 
		 * We need to capture country from a user
		 * based on country identify favorite food
		 * 
		 * 
		 */	
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "usa":
			food="burger";
			break;
		case "afghanistan":
			food="kebob";
			break;
		case "vietnam":
			food="pho";
			break;
		case "poland":
			food="Pierogi";
			break;
		case "kazakstan":
			food="horse";
			break;
		case "belarus":
			food="draniki";
			break;
		case "tajikistan":
			food="plov";
			break;
		case "mexico":
			food="tacos";
			break;
		default:
			food="unknown";
		}
		
		System.out.println("Your favorite food is "+food);
		
		
		
			
		}
	
	}


