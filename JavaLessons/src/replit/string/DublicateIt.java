package replit.string;

import java.util.Scanner;

public class DublicateIt {

	public static void main(String[] args) {
		// You have 2 words
	//Print the first word, second word, second word, first word
	//Input:
	//one
	//two
	//```
	//Output: 
	//onetwotwoone
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter words: ");
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	    System.out.println(word1.concat(word2).concat(word2).concat(word1));

	}

}
