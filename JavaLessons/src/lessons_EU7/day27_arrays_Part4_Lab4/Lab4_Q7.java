package lessons_EU7.day27_arrays_Part4_Lab4;

import java.util.Arrays;

public class Lab4_Q7 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3}; 
		int[] y = new int[2]; 	
		
		int[] a = {7,4,6,2};
		int[] b = new int[2];
		
		System.out.println(Arrays.toString(secondArrayElements(x,y)));
		
	}

	public static int[] secondArrayElements(int[] arr1, int[] arr2) {
		
		arr2[0]= arr1[0];
		arr2[1]= arr1[arr1.length-1];
		
		return arr2;
		
	}
}
