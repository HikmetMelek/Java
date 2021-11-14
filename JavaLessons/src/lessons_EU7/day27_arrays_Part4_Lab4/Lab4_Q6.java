package lessons_EU7.day27_arrays_Part4_Lab4;

import java.util.Arrays;

public class Lab4_Q6 {

	public static void main(String[] args) {
		int[] x = {1,2,3}; 
		int[] y = {11,5,9}; 
		int[] a = {110,5,98,0,1200,11,-4};
		
		changedArray(x);
		changedArray(y);
		changedArray(a);
	}
	
	public static void changedArray(int[] numbers) {
		
		int some=0;
		for(int each: numbers) {
			if(each>some)
				some=each;	
		}
		for (int i=0; i< numbers.length; i++) {
			numbers[i]=some;
		}
		System.out.println(Arrays.toString(numbers));
		
	}
	// OZZY result
//	public static int[] maxEnd(int[] arr) {
//		
//		int max = arr[0];
//		
//		for(int i=0;i<arr.length-1;i++) {
//			
//			if(arr[i+1]>max) {
//				
//				max = arr[i+1];
//				
//				
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			arr[i] = max;
//		}
//		
//		return arr;
//	}
}
