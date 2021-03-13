package reviewclass3;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		// SCANNER PRACTICE
		
		Scanner user = new Scanner(System.in);
		System.out.println("Hello, what day is it today?");
		
		String day = user.nextLine();
		
		System.out.println("Today is " + day);
	}

}
