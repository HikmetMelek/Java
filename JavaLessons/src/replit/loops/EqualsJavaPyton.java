package replit.loops;

import java.util.Scanner;

public class EqualsJavaPyton {

	public static void main(String[] args) {
		// Given a string, print out true if the number of appearances of 
		//"java" anywhere in the string is equal to the number of appearances of "python" 
		// anywhere in the string (case sensitive).
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int counter1=0;
	    int counter2=0;

	    for (int i=0; i<sentence.length()-3; i++) {
	    	
	    	if (sentence.substring(i, i+4).equals("java"))
	    		counter1++;
	    }
	    for (int i=0; i<sentence.length()-5; i++) {
	    	
	    	if (sentence.substring(i, i+6).equals("python"))
	    		counter2++;
	    }
	    
	    if (counter1==counter2)  System.out.println(true);
	    	
	    else System.out.println(false);
	    	
	    
	}

}
