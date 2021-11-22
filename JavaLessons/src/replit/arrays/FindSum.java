package replit.arrays;

import java.util.*;

public class FindSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	   
	    int sum=0;
	    for(int i: nums) {
	    	sum+=i;
	    }
		System.out.println(sum);
			
	}

}
