package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_12_xX {

	public static void main(String[] args) {
		// Given a string word, if the first or last chars are 'x' or 'X', 
		// print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter the word: ");
		String word= scan.next();
		System.out.println(charxX(word));
		
	
	}
	 public static String charxX(String word) {
		 
		 if (word.startsWith("x") || word.startsWith("X")) 
	            word = word.substring(1);
	        
	     if (word.endsWith("x") || word.endsWith("X")) 
	            word = word.substring(0, word.length() - 1);
	        
	           
		 return word;	 	 
		 
	 }
}
