package replit.arrays;

import java.util.*;

public class ZombieAttack2 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), 
	    		input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
		//TODO. Write you code below this line. 
		
	 int i=0;
	 int sum;
	 do {
		 	
		System.out.println("Day "+ i+" "+Arrays.toString(inhabitants));
		sum=0;	
		for(int num=0; num< inhabitants.length-1; num++) {
			if(inhabitants[num]==0) {
				inhabitants[num+1]= inhabitants[num+1]/2;
				sum+= inhabitants[num+1];
			}
			else if(inhabitants[num]!=0 && inhabitants[num+1]==0) {
					inhabitants[num]= inhabitants[num]/2;
					sum+= inhabitants[num];
			}
		}		
		i++;
			 
		}while(sum>0);
	 	System.out.println("Day "+ i+" "+Arrays.toString(inhabitants));
		System.out.println("---- EXTINCT ----");
	}
}
