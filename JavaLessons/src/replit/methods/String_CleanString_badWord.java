package replit.methods;

import java.util.Scanner;

public class String_CleanString_badWord {

	public static void main(String[] args) {
		// This method accept two strings (text and badWord) and returns a string.
		// The method will take out all the occurrences of badWord in the text.
		Scanner in = new Scanner(System.in);
		System.out.println(clean(in.nextLine(), in.nextLine()));
	}
	public static String clean (String text ,String badWord) {
	 	
	 	
	 	return 	text.replace(badWord, "").replace("  ", " ").trim();
	 		
	 		
	 	
		
		
		
		
	
		
		
		
		
	}
	

}
