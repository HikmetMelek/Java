package lessons_EU7.day29_Lab4_Between_Q16_Q30;

import java.util.Arrays;

public class Lab4_Q19 {

	public static void main(String[] args) {
		//Write a method that accepts an array and prints the total of the numbers in the array,
		//except ignore sections of numbers starting with a 6 and extending to 
		//the next 7 (every 6 will be followed by at least one 7).
		int[] x = {1,2,2};// = > 5
		int[] y = {1, 2, 2, 6, 99, 99, 7};//  = > 5
		int[] a = {1,1,6,7,2};// = > 4
		int[] b = {1,1,6,2};// = > 2
		int[] c = {1,2,2,6,99,99,7,3,4};// = > 12
		
		System.out.println(totalNumber(x));
		System.out.println(totalNumber(y));
		System.out.println(totalNumber(a));
		System.out.println(totalNumber(b));
		System.out.println(totalNumber(c));

	}

	public static int totalNumber(int[] arr) {
		
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(boolCheckSix) {
				
				if(arr[i] == 7 ) {
					
					boolCheckSix = false;
				}
					
			}else if(arr[i] == 6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum+= arr[i];	
			}
		}
		
		return sum;
		
	}
}
