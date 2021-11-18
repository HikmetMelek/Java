package lessons_EU7.day29_Lab4_Between_Q16_Q30;

import java.util.Arrays;

public class ziya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	     *  Given an array of integers, write a function to return the index of an item
	     *   in the array, where the sum of all items on its left is equal to the sum
	     *   of the ones on the right.
	     *   For example :
	           Given [4, 9, 1, 3, 6, 4]
	           your function should return 2
	           because the item at index 2 is 1, and 4+9 =3+6+4
	     */ 
		
		int[] arr1= {4,9,1,3,6,4};
		
		System.out.println(sumElements(arr1));
		
	}

	public static String sumElements(int[] arr) {
		
		int sum1=0;
		int sum2=0;
		
		for (int i=0; i< arr.length/2;i++) {
			sum1+=arr[i];
		}
		for (int i=arr.length/2; i< arr.length;i++) {
			sum2+=arr[i];
		}
		
		if (sum1>sum2) {
			sum1=sum1-sum2;
			
			for(int i=0; i< arr.length/2;i++){
				if(arr[i]==sum1)
				
					return ""+i;
			}
		}else if(sum2>sum1){
			sum2=sum2-sum1;
			
			for(int i=arr.length/2; i< arr.length;i++){
				if(arr[i]==sum2)
					
					return ""+i;
			}
		
		}	
		return "equal";
				
	}
}
