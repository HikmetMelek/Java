package sundayReview.sundayWeek6_14112021;

import java.util.Arrays;

public class A08_ReverseArray {

	public static void main(String[] args) {
		
		int[] nums= {5,10,4,100};
	// one way of the reverse array is:
		int[] newNums= new int[nums.length];
		
		int a=0;
		for (int i=nums.length-1; i>=0; i--) {
			newNums[a]=nums[i];
			a++;
		}
//		for (int i=nums.length-1, a=0 ; i>=0; i-- , a++) {
//			newNums[a]=nums[i];
//		}
		System.out.println(Arrays.toString(newNums));
		
		System.out.println("---------------------");
		
	// second way is: creating a third variable to hold my array variables. swapping numbers
		//int[] nums= {5,10,4,100};
		System.out.println(Arrays.toString(nums));
		
		int temp=0;
		for(int i=0; i< nums.length/2; i++) {
			temp= nums[i];
			nums[i]= nums[nums.length-1-i]; // length:4, 4-1-0=3    4-1-1=2
			nums[nums.length-1-i]= temp;	
		}
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
		
	}

}
