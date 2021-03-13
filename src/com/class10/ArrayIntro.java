package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
		int num=10;
		num=20;
		System.out.println(num);
		
		int[] array=new int[5];
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		System.out.println(array[0]+array[4]);
		
		double[] numbers=new double[2];
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		//you can reassign value
		numbers[0]=11.99;
		
		System.out.println(numbers[0]);
		
		//arrays are fixed in size
		
		String[] name=new String[3];
		name[0]="Angelo";
		name[1]="Bryan";
		name[2]="Jen";
		//name[3]="Gio";
		
		System.out.println(name[2]); //Jen
		
		boolean[] b=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		
		System.out.println(b[0]);
		
		int size=b.length;
		System.out.println("Size of an array is " +size);
		
		
	}

}
