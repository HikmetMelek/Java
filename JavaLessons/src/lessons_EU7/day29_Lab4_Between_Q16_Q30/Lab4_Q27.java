package lessons_EU7.day29_Lab4_Between_Q16_Q30;

public class Lab4_Q27 {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the array contains, somewhere, 
		// three increasing adjacent numbers like 4,5,6,... or 23,24,25.
		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		int[] a = {1,5,9,11,23,24,25};
		
		System.out.println(threeIncrease(x));
		System.out.println(threeIncrease(y));
		System.out.println(threeIncrease(z));
		System.out.println(threeIncrease(a));	
	}

	public static boolean threeIncrease(int[] arr) {
		
		for (int i=0; i< arr.length-2; i++) {
			
			if(arr[i]==arr[i] && arr[i+1]== arr[i]+1 && arr[i+2]== arr[i]+2) return true;
		}
		return false;
	}
}
