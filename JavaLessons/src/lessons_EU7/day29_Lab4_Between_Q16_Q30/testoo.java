package lessons_EU7.day29_Lab4_Between_Q16_Q30;

import java.util.Arrays;

public class testoo {

	private static final int[] a = null;
	public static void main(String[] args) {
		int[] add= {5,10};
		int over= add[1]-add[0];
		System.out.println(over);
		
		
		int[] x = {1, 2, 2, 6, 99, 99,7, 2, 3};
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0;i<x.length;i++) {
			
			if(boolCheckSix) {
				
				if(x[i] == 7 ) {
					
					boolCheckSix = false;
				}
				
				
			}else if(x[i] == 6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum = sum + x[i];
				
				
			}
		}
		
		System.out.println(sum);	
	}
	
	
	
}
