package com.class12;

public class Task8Hw {
	public static void main(String[] args) {
		
		int[] arr = {20, 10, 9, 5, 6, 7, 34, 88, 90, 156};
		
		int max, min;
		min = arr[0];
		max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(!(arr[i]>min)) {
				min=arr[i];
			}else {
				max=arr[i];
			}
		}
		System.out.println(max + " is maximum number");
		System.out.println(min + " is minimum number");
		
		System.out.println("-----------------------------ANother way--------------------------");
		
		
int [] num4=  {4,3,-2,4,7,12,13,15,};
		
		int small=num4[0];
		int large=num4[0];
		
		for (int i=0; i<num4.length; i++) {
		
		if (num4[i] <small) small= num4[i];
		if (num4[i] >large) large=num4[i];
		
			
		
		}
		System.out.println(" the smallest number is "+small+" and the largest number is "+large);
	}

}
