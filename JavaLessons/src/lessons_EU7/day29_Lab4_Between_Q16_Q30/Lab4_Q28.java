package lessons_EU7.day29_Lab4_Between_Q16_Q30;

import java.util.Arrays;

public class Lab4_Q28 {

	public static void main(String[] args) {
		// Write a method that accepts start and end numbers. Given start and end 
		// numbers, return a new array containing the sequence of integers from start up to 
		// but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].
//		fizzArray3(5, 10) →[5, 6, 7, 8, 9]
//		fizzArray3(11, 18) →[11, 12, 13, 14, 15, 16, 17]
//		fizzArray3(1, 3) →[1, 2]
		int[] x= {5,10};
		int[] y= {11,18};
		int[] z= {1,3};
		System.out.println(Arrays.toString(startEnd(x)));
		System.out.println(Arrays.toString(startEnd(y)));
		System.out.println(Arrays.toString(startEnd(z)));
		
	}

	public static int[] startEnd(int[] arr) {
		
		int[] array= new int[arr[arr.length-1]-arr[0]];
		
		for(int i=0; i< array.length; i++) {
			
			array[i]=i+arr[0];
		}
		return array;
	}
	
}
