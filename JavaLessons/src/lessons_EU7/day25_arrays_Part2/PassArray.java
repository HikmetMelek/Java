package lessons_EU7.day25_arrays_Part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		//create an array
		int [] numbers= new int[4];
		//pass the array to the getValues method
		getValues(numbers);

		// pass the array to showArray methods
		showArray(numbers);
	}
	
	public static void getValues(int [] array) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter series of "+ array.length+ " numbers");
		for (int i=0; i<array.length; i++) {
			System.out.println("enter number "+ (i+1) + " :");
			array[i]= sc.nextInt();
		}

	}
	 public static void showArray(int[] array) {
		 System.out.println("here are the numbers that you entered: "); 
		 for(int value: array) {
			 System.out.println(value);
		 } 
	 }

}
