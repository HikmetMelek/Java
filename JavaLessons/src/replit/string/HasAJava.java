package replit.string;

import java.util.Scanner;

public class HasAJava {

	public static void main(String[] args) {
		// Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
		// such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.
		
		boolean exists = false;
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		if (word.contains("java")) {
			if(word.charAt(0)=='j' || word.charAt(1)=='j')
			System.out.println(!exists);
			else System.out.println(exists);
		}
		else System.out.println(exists); 
		// LOOK AT --> DAY23 lab_3/ question 15 
//		for (int i=0; i<2;i++) {
//			
//			if (str.substring(i, i+3).equals("bad")) {
//				flag=true;
	}

}
