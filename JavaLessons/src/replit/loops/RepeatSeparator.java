package replit.loops;

import java.util.Scanner;

public class RepeatSeparator {

	public static void main(String[] args) {
		// Given two strings, word and a separator sep, return a big string made of count occurrences
		// of the word, separated by the separator string.
		// word/x/3 --> WordXWordXWord
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String result="";
	    if (count==1)System.out.println(word);
	    else {
	    	for (int i=1; i<count; i++) {
	    		result+=separator+word;
	    		
	    	}
	    	System.out.print(word+result);
	    
	    }
	}

}
