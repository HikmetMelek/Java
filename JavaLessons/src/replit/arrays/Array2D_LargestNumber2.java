package replit.arrays;

import java.util.*;

public class Array2D_LargestNumber2 {

	public static void main(String[] args) {
	 Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++){
	      for(int j=0 ;j<=cols-1;j++){
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    //TODO write your code below
	    int biggest= arr[0][0];
		for(int i=0 ;i<=rows-1;i++) {
			for(int j=0 ;j<=cols-1;j++){
				if(biggest< arr[i][j])
					biggest= arr[i][j];
			}	
		}
		for(int i=0 ;i<=rows-1;i++){
		      for(int j=0 ;j<=cols-1;j++){
		        arr[i][j]=biggest;
		      }
		}    
		    
		    
		    
	    System.out.println(Arrays.deepToString(arr));
	}

}
