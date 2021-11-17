package assignments.assingmentOnArray;

import java.util.Arrays;

public class Q1_Element10Times {

	public static void main(String[] args) {
		// Write a Java Program to store numbers from 1 to 1000 in One-dimensional array
		// and then print array contents as follows (10 elements per row):

		int[] arr= new int[1000];
		for (int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<1000; i+=10) {
			for (int j=i; j< i+10; j++) {
				System.out.print(arr[j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
