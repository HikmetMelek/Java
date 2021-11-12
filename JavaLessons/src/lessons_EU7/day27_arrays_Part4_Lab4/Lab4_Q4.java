package lessons_EU7.day27_arrays_Part4_Lab4;

public class Lab4_Q4 {

	public static void main(String[] args) {
		int[] x = {1,2,3}; 	
		int[] y = {5,11,2};
		int[] z = {7,0,0};
		int[] a = {3,-2,10,4};
		
		System.out.println(sumAll(x));
		System.out.println(sumAll(y));
		System.out.println(sumAll(z));
		System.out.println(sumAll(a));
		
	}
	
	public static int sumAll(int[] numbers) {
	 
	 int num=0;
	 for (int total: numbers) {
		 num+=total;
	 }
	 return num;
	 
	 
	}
}
