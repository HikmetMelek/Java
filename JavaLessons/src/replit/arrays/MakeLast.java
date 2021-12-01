package replit.arrays;

import java.util.*;

public class MakeLast {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
			
		int[] nums2= new int[size*2];
		for(int i=0; i<(size*2)-2;i++ ) {
			nums2[i]=0;
		}
		nums2[(size*2)-1]= nums[size-1];
		System.out.println(Arrays.toString(nums2));
	}
}
