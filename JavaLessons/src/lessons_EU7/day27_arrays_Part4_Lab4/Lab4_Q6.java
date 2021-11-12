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
}
