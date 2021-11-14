package lessons_EU7.day28_Lab4_Between_Q4_Q15;

import java.util.Arrays;

public class Lab4_Q11 {

	public static void main(String[] args) {
	
		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] a = {11,2,13,3,2};
		
		System.out.println(Arrays.toString(changed3AndArray(x)));
		System.out.println(Arrays.toString(changed3AndArray(y)));
		System.out.println(Arrays.toString(changed3AndArray(z)));
		System.out.println(Arrays.toString(changed3AndArray(a)));
		
	}
	
	public static int[] changed3AndArray(int[] num) {
		
		for (int i=0; i<num.length-1; i++) {
			
			if(num[i]==2 && num[i+1]==3)
				num[i+1]=0;	
		}
		
		return num;
		
		
	}
}
