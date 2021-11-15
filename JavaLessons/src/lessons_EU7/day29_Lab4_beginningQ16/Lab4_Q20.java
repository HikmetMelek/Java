package lessons_EU7.day29_Lab4_beginningQ16;

public class Lab4_Q20 {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the array contains a 2 next
		int[] x = {1,2,2};// = > true
		int[] y = {1, 2, 1,2};//  = > false
		int[] a = {2,1,2};// = > false
		int[] b = {2,2,1,2};// = > true
		
		System.out.println(contain2(x));
		System.out.println(contain2(y));
		System.out.println(contain2(a));
		System.out.println(contain2(b));
	}

	public static boolean contain2(int[] arr) {
		
		for(int i=0; i< arr.length-1; i++) {
			if(arr[i]==2 && arr[i+1]==2) {
				return true;
			}
				
		}
		return false;
	}
	// ozzy result
//	boolean flag = false;
//	
//	
//	for(int i=0;i<x.length-1;i++) {
//		
//		if(x[i]==2 && x[i+1]==2) {
//			flag = true;
//			break;
//		}
//	}
	
//	if(flag) {
//		System.out.println(true);
//	}else {
//		System.out.println(false);
//	}

}
