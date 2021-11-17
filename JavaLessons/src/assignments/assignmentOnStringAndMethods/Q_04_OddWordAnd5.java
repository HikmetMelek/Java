package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_04_OddWordAnd5 {

	public static void main(String[] args) {
		// If the word has odd number of characters and has 5 or more characters, 
		//print the middle three characters of the word. Otherwise, print "invalid".

		Scanner scan= new Scanner (System.in);
		System.out.print("Enter a word: ");
		String word= scan.next();
		if(word.length()%2!=0 && word.length()>=5) {
			
			System.out.println(word.substring(word.length()/2-1, word.length()/2+2));
		}
		else System.out.println("invalid");
		
	}

}
