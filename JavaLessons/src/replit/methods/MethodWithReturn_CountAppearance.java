package replit.methods;

import java.util.*;

public class MethodWithReturn_CountAppearance {

	public static int countAppearance(String[] arr,String t){  
		int counter=0;
		for(String i: arr) {
			if(t.equals(i))
				counter++;
		}

		return counter;

	} //end  count_appearance

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String [] strs = new String[in.nextInt()];
	    String word = in.next();
	    for(int i=0; i < strs.length; i++) {
	      strs[i] = in.next();
	    }

	    System.out.println(countAppearance(strs,word));

	}  

}
