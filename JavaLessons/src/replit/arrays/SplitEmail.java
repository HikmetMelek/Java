package replit.arrays;

import java.util.*;

public class SplitEmail {

	 public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	    //Write your code below
	    int count=0;
	    for (int i=0; i<email.length(); i++) {
	    	if(email.charAt(i)=='@')
	    		count++;
	    }
	    if(!email.contains("@") || count>1 ) {
	    	System.out.println("invalid email");
	    }
	    else {
	    	String[] mail= email.split("@");
	    	System.out.println("Email id: "+ mail[0]);
	    	System.out.println("Email domain: "+ mail[1]);
	    }
	    
	    
	    
	  }

}
