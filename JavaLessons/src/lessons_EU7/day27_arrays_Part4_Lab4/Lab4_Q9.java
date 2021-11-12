package lessons_EU7.day27_arrays_Part4_Lab4;

import java.util.Arrays;

public class Lab4_Q9 {

	public static void main(String[] args) {
		
		int[] x = {4,5,6};
		System.out.println(Arrays.toString(newArray(x)));

	}

	public static double[] newArray(int[] arr) {
		
		double[] array= new double[arr.length];
		
		array[array.length-1]= arr[arr.length-1];
		
		return array;	
		
	}
}
