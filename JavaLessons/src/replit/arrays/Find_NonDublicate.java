package replit.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_NonDublicate {

	public static void main(String[] args) {
		//Given an array nums with 7 integers every element is repeated twice - except one. 
		// Find that element and print it to console.
		 Scanner input = new Scanner(System.in);
		 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
				 input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		int counter=0;
		
		for (int i=0; i< nums.length; i++){
			 counter=0;
			 
			 for (int j=0; j<nums.length; j++) {
				 if(nums[i]==nums[j])
					 counter++;  
			 }
			if(counter==1) System.out.println(nums[i]);	 
		 }
		 
		
	}

}
