package lessons_EU7.day29_Lab4_Between_Q16_Q30;

public class Lab4_Q25 {

	public static void main(String[] args) {
		// Write a method that accepts two arrays of the same length. For  every element in array1,
		//consider the corresponding element in array2 (at the same index).
		//Return the count of the number of times that two elements differ by 2 or less, but are not equal.
		int[] x = {1,2,3};
		int[] y = {2,3,10};//2
		int[] x1 = {1,2,3};
		int[] y1 = {2,3,5};//3
		
		System.out.println(differ(x, y));
		System.out.println(differ(x1, y1));
		
	}

	public static int differ(int[] num1, int[] num2) {
		int counter=0;
		for (int i=0; i< num1.length; i++) {
			
			if((num2[i]-num1[i])==1 || (num2[i]-num1[i])==2 )
				counter++;	
		}
		return counter;
		
		
		
	}
}
