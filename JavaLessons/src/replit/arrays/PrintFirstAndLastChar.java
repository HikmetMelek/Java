package replit.arrays;

import java.util.*;

public class PrintFirstAndLastChar {

	 public static void main(String[] args) {   
	    Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    
	    for(int i=0; i< words.length; i++) {
	    	words[i]= words[i].charAt(0)+""+ words[i].charAt(words[i].length()-1);
	    }
	    System.out.println(Arrays.toString(words));
	    
	    
	    
	    
	    
	    
	    
	 }
	   
}
