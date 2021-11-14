package lessons_EU7.day28_Lab4_Between_Q4_Q15;

import java.util.Arrays;

public class Lab4_Q13 {

	public static void main(String[] args) {
		//Write a method that accepts 2 arrays and consider the sum of the values in each array.
		//Print the array which has the largest sum. In event of a tie, print "equal"
		int[] x = {1,2} ;   
		int[] y = {3,4}; // = > [3,4]
		int[] x1 = {5,6};    
		int[] y1 = {3,8} ; // equal
		int[] x2 = {1,1};
		int[] y2 = {1,0} ; //= > [1,1]	
		
		sumArrays(x, y);
		sumArrays(x1, y1);
		sumArrays(x2, y2);

	}

	public static void sumArrays(int[] num1, int[] num2) {
		
		int sum1=0;
		int sum2=0;
		
		for (int i: num1 ) {
			sum1+= i;
		}
		for (int i=0; i< num2.length-1;i++) {
			sum2+= num2[i]+num2[i+1];
		}
		if(sum1>sum2) System.out.println(Arrays.toString(num1));
		else if (sum1<sum2) System.out.println(Arrays.toString(num2));
		
		else System.out.println("equal");
	}
	
	
	
	
}
