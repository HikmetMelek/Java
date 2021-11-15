package lessons_EU7.day29_Lab4_Between_Q16_Q30;

public class Lab4_Q17 {

	public static void main(String[] args) {
		// Write a method that accepts an array and print the difference between the largest and 
		// smallest values in the array.
		int[] x = {10,3,5,6}; //= > 7
		int[] y = {7,2,10,9}; // = > 8
		int[] z = {2,10,7,2}; //= > 8
		
		System.out.println(difference(x));
		System.out.println(difference(y));
		System.out.println(difference(z));
	}
	
	public static int difference(int[] arr) {
		
		int max= arr[0];
		for(int i: arr) {
			if(i> max)
				max=i;
		}
		
		int min=arr[0];
		for(int i: arr) {
			if(i< min)
				min=i;
		}
		
		return max-min;
		
	}
	

}
