 package com.class08;

public class BreakKeyword {
	public static void main(String[] args) {
		
		//break exits the loop
		
		boolean rain=true;
		int temp=70;
		
		while(rain) {
			
			System.out.println("I will stay at home");
			
			if (temp>75) {
				System.out.println("I will walk under warm rain");
			
			break;
			
			}temp+=2;
			
		}
		System.out.println("--------------------------------------------------------------------------------------");
		
		//break will break the loop
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Hello");
			if(i==5) {
			break;
			}
	}
	}
}


