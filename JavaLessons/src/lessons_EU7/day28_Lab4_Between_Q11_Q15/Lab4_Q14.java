package lessons_EU7.day28_Lab4_Between_Q11_Q15;

import java.util.Arrays;

public class Lab4_Q14 {

	public static void main(String[] args) {
		// Write a method that accepts 2 arrays and prints a new array containing all their elements

		int[] x = {1,2};
		int[] y = {3,4,2,5,7,9,5} ; //= > [1,2,3,4]
		int[] x1 = {9,2,3,5}; 
		int[] y1 = {3,4};  //= > [9,2,3,4]
		
		newArray(x, y);
		newArray(x1, y1);
		
		
	}

	public static void newArray(int[] arr1, int[] arr2) {
		
		String order="";
		int[] k = new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			
			k[i]=arr1[i];
			
		} 
		
		int a = 0;
		for(int j = arr1.length;j<k.length;j++) {
			
			k[j]=arr2[a];
			a++;
		}
		
		System.out.println(Arrays.toString(k));
		
	}
}
