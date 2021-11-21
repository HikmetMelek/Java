package replit.arrays;

import java.util.*;

public class Array2D_DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
	    {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
	    int result = 0;

	    int sum1=0;
	    int sum2=0;
	    
	    for(int i=0; i< matrix.length;i++ ) {
	    		sum1+= matrix[i][i];
	    		sum2+= matrix[i][(matrix.length-1)-i];
	    }
	  
	    result=sum1-sum2;
	    System.out.println(Math.abs(result));
	}

}
