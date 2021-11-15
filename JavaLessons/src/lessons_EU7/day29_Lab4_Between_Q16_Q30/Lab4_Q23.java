package lessons_EU7.day29_Lab4_Between_Q16_Q30;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4_Q23 {

	public static void main(String[] args) {
		// Write a method that accepts a number and create and prints a new array of length
		// number, containing the numbers 0,1,2,...number-1.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array");
		int length= sc.nextInt();
		System.out.println(Arrays.toString(fizzArray(length)));
		
	}

	public static int[] fizzArray(int num) {
		
		int[] arr= new int[num];
		
		for(int i=0; i< arr.length; i++) {
			
			arr[i]=i;
			
		}
		
		return arr;
		
		
	}
}
