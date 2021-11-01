package replit.string;

import java.util.Scanner;

public class PrintFirstAndLastLetter {

	public static void main(String[] args) {
		// Write a program that will print out first and last letters together.
		//Input: adobe
		//Output: ae
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
	    String word = scan.next();
	    
	    System.out.println(word.substring(0, 1) + word.charAt(word.length()-1));
	    
	    
	    
	    
	    
	}

}
