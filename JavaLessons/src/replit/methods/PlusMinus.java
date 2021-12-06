package replit.methods;

import java.util.*;

public class PlusMinus {

	 public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++) {
	      arr[i]=inp.nextInt();
	    }
	    
	   plus_minus(arr);
	 }
	    
	  public static void  plus_minus(int[] arr){
	    int countPositives=0;
	    int countNegatives=0;
	    int countZeros=0;
	    
	    for(int i: arr) {
		   if (i<0) countNegatives++;
		   else if (i>0) countPositives++;
		   else countZeros++;
	   }
	    
	    System.out.println("positives:"+ countPositives+", negatives:"+countNegatives+", zeros:"+countZeros);		
	    	  
	  }
	  


}
