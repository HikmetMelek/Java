package replit.methods;

import java.util.Scanner;

public class String_WordCount {

	public static void main(String[] args) {
		// wordCount accepts String and returns how many words are in the given String
		//wordCount("foo bar") returns 2; wordCount("one two three") returns 3; "banana" return 1; Hint: look at spaces.. 
		Scanner in = new Scanner(System.in);
		System.out.println(wordCount(in.nextLine()));		
		
	}
	public static int wordCount(String words) {
		int counter=0;
		
		for (int i=0; i<words.length();i++) {
			
			if(words.charAt(i)==' ') counter++;
				
		}  
		if(counter==0) return 1;
		
		return counter+1;
		
	}
	
}
