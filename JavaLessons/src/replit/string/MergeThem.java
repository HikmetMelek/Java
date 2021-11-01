package replit.string;

import java.util.Scanner;

public class MergeThem {

	public static void main(String[] args) {
		// You have 2 words, both of them have 3 characters.
		//	If either of them does not have exactly 3 characters, print "cannot merge"
		//	Merge their characters one by one and print together like below:
		//		Input: ear
		//			   pie
		//			Output:	epaire
		//			Input: java
		//			        wow
		//			Output:	cannot merge
		//hint:_by inserting +""+ (empty string) between chars, you can concatenate char values._
		Scanner scan = new Scanner(System.in);
		System.out.println("enter words: ");
		String word1 = scan.next();
		String word2 = scan.next();
		
		String newWord="";
		    
		if (word1.length()>3 || word2.length()>3) System.out.println("cannot merge");
				
		else {
			for (int i=0; i<word2.length(); i++) {
					
				newWord+= word1.charAt(i)+""+ word2.charAt(i);
					
			}
				
		System.out.println(newWord);
		
		}

		
	}

}
