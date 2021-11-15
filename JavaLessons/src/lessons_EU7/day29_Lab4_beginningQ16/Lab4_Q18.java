package lessons_EU7.day29_Lab4_beginningQ16;

public class Lab4_Q18 {

	public static void main(String[] args) {
		// Write a function that accepts an array and prints the sum of the numbers in the 
		// array. Except the number 13 is very unlucky, so it does not count and numbers that 
		// come immediately after a 13 also do not count
		int[] x = {1,2,2,1}; //= > 6
		int[] y = {1,1};  //= > 2
		int[] a = {1,2,2,1,13}; //= > 6
		int[] b = {1,2,2,1,13,3}; //= > 6
		
		System.out.println(sumArrayElements(x));
		System.out.println(sumArrayElements(y));
		System.out.println(sumArrayElements(a));
		System.out.println(sumArrayElements(b));
		
	}

	public static int sumArrayElements(int[] arr) {
		
		int sum=0;
		for(int i: arr) {
			if(i==13) {
				i=0;
			}
			sum+=i;
		}
//		for(int i=0;i<x.length;i++) {
//			
//			if(x[i] != 13) {
//				sum=sum+x[i];
//			}else {
//				break;
//				
//			}
//		}
		return sum;
	}
}
