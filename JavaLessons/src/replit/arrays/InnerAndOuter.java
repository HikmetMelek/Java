package replit.arrays;

import java.util.*;

public class InnerAndOuter {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		//WRITE YOUR CODE HERE
		
		int counter=0;
		boolean result=false;
		
		if(sizeOuter>=sizeInner) {
			for (int i=0; i< sizeInner; i++) {
				for (int j=0; j< sizeOuter; j++) {
					if(outer[j]==inner[i]) {
					counter++;
					outer[j]=inner[0]-1; // there is sort method.if i change my outer[], again i cannot merge, for repeated values
					break;
					}
				}
			
			}
			if(counter==sizeInner)
				result=true;
			else 
				result=false;
		}
		
		System.out.println(result);	
						
	  }

}
