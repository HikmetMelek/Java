package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_07_FirstHalfOfWordTwice {

	public static void main(String[] args) {
		// Write a program that will print out the first half of the word twice.

		Scanner scan= new Scanner (System.in);
		System.out.print("Enter a word: ");
		String word= scan.next();
		System.out.println(firstHalf(word));
		
	}

	public static String firstHalf(String str) {
		
		str= str.substring(0, str.length()/2)+str.substring(0, str.length()/2); 
		
		return str;
	}
}
