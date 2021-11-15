package lessons_EU7.day28_Lab4_Between_Q11_Q15;

public class Lab4_Q12 {

	public static void main(String[] args) {
//Write a method that accepts two arrays and prints how many of the arrays have 1 as their first element
		int[] x = {1,2,3};        
		int[] y = {1,3} ;
		System.out.println(printFirst1(x, y));
		int[] x1 = {7,2,3};        
		int[] y1 = {1} ;
		System.out.println(printFirst1(x1, y1));
		int[] x2 = {3,2,4};        
		int[] y2 = {4,3,4} ;
		System.out.println(printFirst1(x2, y2));

	}

	public static int printFirst1(int[] num1, int[] num2) {
		int counter=0;
		if (num1[0]==1 && num2[0]==1) counter=2;
		else if(num1[0]==1 || num2[0]==1 ) counter=1;
		else counter=0;

		return counter;
		
	}
	// OZZT result:
	/*public static int start1(int[] arr1,int[] arr2) {
		
		int counter = 0;
		
		if(arr1[0] == 1) {
			counter++;
		}
		if(arr2[0] == 1) {
			counter++;
		}
		
		return counter;
		
	}
	*/
	
	
}
