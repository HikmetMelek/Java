package replit.string;

import java.util.Scanner;

public class WithoutX_x {

	public static void main(String[] args) {
		// Given a string word, if the first or last chars are 'x' or 'X', 
		// print the string without those 'x' or 'X' chars, otherwise print the string unchanged
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
//	    if ((word.substring(0, 1).equalsIgnoreCase("x")) && (Character.toUpperCase(word.charAt(word.length()-1))== 'X'))
//	    	System.out.println(word.substring(1, word.length()-1));
//	    if (word.substring(0, 1).equalsIgnoreCase("x"))
//	    	System.out.println(word.substring(1));
//	    if (Character.toUpperCase(word.charAt(word.length()-1))== 'X')
//	    	System.out.println(word.substring(0, word.length()-1));
// 		
//	    else System.out.println(word);
	    
	    if (word.startsWith("x") || word.startsWith("X")) 
            word = word.substring(1);
        
        if (word.endsWith("x") || word.endsWith("X")) 
            word = word.substring(0, word.length() - 1);
        
            System.out.println(word);
	    
	   
	   
	  
	    
	    
	    
	    
	
    
		

	}

}
