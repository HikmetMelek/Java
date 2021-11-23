package replit.arrays;

import java.util.Scanner;

public class Has55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1, 5, 5, 1, 1]  true
//		 [1, 8, 5, 5, 0]  true
//		 [1, 5, 4, 1, 5]  false
//		[1, 4, 4, 1, 99]  false
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};	
		
	    boolean flag=false;
		for (int i=0; i< nums.length-1; i++) {
			if(nums[i]==5 && (nums[i]==5 && nums[i+1]==5)){
				flag=true;
			break;
			}else {
				flag=false;
			}
		}
		System.out.println(flag);	

		
		
	}

}
