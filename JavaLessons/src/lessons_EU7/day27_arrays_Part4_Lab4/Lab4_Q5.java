package lessons_EU7.day27_arrays_Part4_Lab4;

import java.util.Arrays;

public class Lab4_Q5 {

	public static void main(String[] args) {
		int[] x = {1,2,3}; 
		int[] y = {17,12,10,8};
		int[] a = {7,0,0};
		rotatedLeft(x);
		rotatedLeft(y);
		rotatedLeft(a);
		
	}

	public static void rotatedLeft(int[] numbers) {
		
		int first=numbers[0];   // int[] numbers2= Arrays.copyOf(numbers, numbers.length);
		
		for(int i=0; i< numbers.length-1; i++) {
			numbers[i]= numbers[i+1];	
		}
		numbers[numbers.length-1]= first;  // numbers[numbers.length-1]= numbers2[0];
		
		System.out.println(Arrays.toString(numbers));
	}
}
