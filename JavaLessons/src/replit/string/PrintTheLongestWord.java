package replit.string;

import java.util.Scanner;

public class PrintTheLongestWord {

	public static void main(String[] args) {
		// Write a program that will print out the longest word. 
		//Note: Assume the length of the two given Strings will be different
		
		 Scanner scan = new Scanner(System.in);
		 String word1 = scan.next();
		 String word2 = scan.next();	
		 
		 if (word1.length()> word2.length()) System.out.println(word1);
		 else System.out.println(word2);
		 
		

	}

}
