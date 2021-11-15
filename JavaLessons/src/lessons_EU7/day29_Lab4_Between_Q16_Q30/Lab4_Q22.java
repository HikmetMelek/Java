package lessons_EU7.day29_Lab4_Between_Q16_Q30;

public class Lab4_Q22 {

	public static void main(String[] args) {
		// Write a method that accepts an array and prints true if the number 1's is greater
		//than the number 4's
		int[] x = {1,4,1} ;// = > true
		int[] y = {1,4,1,4};//  = > false
		int[] z = {1,1} ;// = > true
		
		System.out.println(greater14(x));
		System.out.println(greater14(y));
		System.out.println(greater14(z));
		
	}
	
	public static boolean greater14(int[] arr) {
		
		int count1=0;
		int count2=0;
		for (int i: arr) {
			if(i==1)
				count1++;
			else if(i==4)
				count2++;	
		}
		if(count1>count2) return true;
		else return false;
		
	}
}
