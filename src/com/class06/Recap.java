package com.class06;

public class Recap {
	
	public static void main(String[] args) {
		
		String str="HELLO";
		String str1="hello";
		
		boolean yesOrNO=str.equals(str1); // FALSE
		System.out.println(yesOrNO);
		
		boolean yesOrNo1=str.equalsIgnoreCase(str1); // TRUE
		System.out.println(yesOrNo1);
	}

}
