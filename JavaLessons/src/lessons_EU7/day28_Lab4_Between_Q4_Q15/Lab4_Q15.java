package lessons_EU7.day28_Lab4_Between_Q4_Q15;

import java.util.Arrays;

public class Lab4_Q15 {

	public static void main(String[] args) {
		int[] x = {1,2,3,4};// = > [4,2,3,1]
		int[] y = {1,2,3};//  = > [3,2,1]
		int[] z = {8,6,7,9,5};// = > [5,6,7,9,8]
		int[] a = {4,3,5,8,7,9};
		
		System.out.println(Arrays.toString(modifiedArray(x)));
		System.out.println(Arrays.toString(modifiedArray(y)));
		System.out.println(Arrays.toString(modifiedArray(z)));
		
		System.out.println(Arrays.toString(swapEnds(a)));

	}
	public static int[] modifiedArray(int[] numbers) {
		
		int first=numbers[0];//1
		int last=numbers[numbers.length-1];//4
		
		numbers[0]=last;//4
		numbers[numbers.length-1]= first;//1
		
		return numbers;
	}
	
	public static int[] swapEnds(int[] arr) {
		
		
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		return arr;
		
	
	}
	
}
