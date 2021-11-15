package lessons_EU7.day29_Lab4_Between_Q16_Q30;

public class Lab4_Q26 {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the array contains 3 even
		// or 3 odd values all next to each other.
		int x[] = {2,1,3,5}; //true
		int y[] = {2,1,2,5}; //false
		int z[] = {2,4,2,5}; //true
		
		System.out.println(oddOrEven(x));
		System.out.println(oddOrEven(y));
		System.out.println(oddOrEven(z));
	}

	public static boolean oddOrEven(int[] arr) {
		
		for (int i=0; i<arr.length-2; i++) {
			
			if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0) return true;
			else if (arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) return true;
		}
		
		return false;
	}
}
