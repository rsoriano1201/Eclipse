package com.class10;

public class AllElementsFromAnArray {
	public static void main(String[] args) {
		
		int[] numbers= {10, 14, 78, 5, 90, 76, 1, 8};
		
		for (int i=0; i<numbers.length;i++) {
			
			if(numbers[i]%2==0) {
				System.out.print(numbers[i]+" ");
			}
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		//print in reverse
		
		for (int i=numbers.length-1; i>=0; i--) {
			
			System.out.print(numbers[i]+" ");
		}
	}

}
