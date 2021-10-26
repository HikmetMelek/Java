package replit.string;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your characters");
	    String word = scan.next();
	  
	    if (word.length()==1) System.out.print(word.concat(word).concat(word));
	    else if (word.length()==2) System.out.println(word.concat(word));
	    else if (word.length()%2!=0) System.out.println(word.charAt(word.length()/2));
	    else if (word.length()%2==0) {
    		System.out.print(word.charAt(word.length()/2-1));
    		System.out.println(word.charAt(word.length()/2));
    	
    	}
	    
	    
	    
	    
//	    
//	    if (word.length()%2!=0) { 
//	    	
//	    	if (word.length()==1) System.out.print(word.concat(word).concat(word));
//	    	else if (word.length()>=3) System.out.println(word.charAt(word.length()/2));
//	    }
//	    else if (word.length()%2==0) {
//	    	
//	    	if (word.length()==2) System.out.println(word.concat(word));
//	    	
//	    	else if (word.length()>=4) {
//	    		System.out.print(word.charAt(word.length()/2-1));
//	    		System.out.println(word.charAt(word.length()/2));
//	    	}
//	    }
//	    	
//	    	   
	    
	}

}
