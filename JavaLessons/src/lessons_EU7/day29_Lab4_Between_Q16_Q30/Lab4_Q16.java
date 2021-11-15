package lessons_EU7.day29_Lab4_Between_Q16_Q30;

public class Lab4_Q16 {

	public static void main(String[] args) {
		int[] x = {2,1,2,3,4};// = > 3
		int[] y = {2,2,0} ;// = > 3
		int[] z = {1,3,5};// = > 0	
	System.out.println(evenArray(x));
	System.out.println(evenArray(y));	
	System.out.println(evenArray(z));
	
	
	}
	public static int evenArray(int[] num) {
		int counter=0;
		for(int i: num) {
			if(i%2==0) 
				counter++;
		}
		
		return counter;
		
	}
} 
