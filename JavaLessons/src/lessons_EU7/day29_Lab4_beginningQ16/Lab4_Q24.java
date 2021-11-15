package lessons_EU7.day29_Lab4_beginningQ16;

import java.util.*;

public class Lab4_Q24 {

	public static void main(String[] args) {
		// A value is "everywhere" in an array if for every pair of adjacent elements in the array,
		// at least one of the pair is that value.
		// Write a method that accepts an array and a number, and prints true 
		// if the given number is everywhere in the array.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter everywhere number");
		int number= sc.nextInt();
		
		int[] x = {1, 2, 1, 3};//--> false 2
		System.out.println(everywhereNum(x, number));
		
		int[] y = {1, 2, 1, 3};// true 1
		System.out.println(isEverywhere(y, number));
		

	}
	public static boolean everywhereNum(int[] num, int number) {
	 
	 for (int i=0; i< num.length; i++) {
		 if(num[i]==number) {
			 if (num[i+1]==2 || num[i+2]== 2) return true;
			
		 }
	 }
	 return false;
 }
 
 // OZZY result:
 	public static boolean isEverywhere(int[] arr,int number) {
		
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
				return true;
			}
		}
		
		return false;	
	}
}
