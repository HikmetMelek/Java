package replit.loops;

import java.util.Scanner;

public class VowelsPrint {

	public static void main(String[] args) {
		// Create a program that will take the given String In and print out all the vowels from the String.
		// howdyho --> oo; huehuehuehue -->ueueueue
		Scanner inp = new Scanner(System.in);
	    String word = inp.nextLine();
	    String vowel="aeiou";
	    
	    for (int i=0; i< word.length();i++) {
	    	if (vowel.contains(""+word.charAt(i))) {
	    		System.out.print(word.charAt(i));
	    	}
	    	
	    }
		
		
		
		
		
	}

}
