package replit.string;

import java.util.Scanner;

public class PrefixAgain {

	public static void main(String[] args) {
		// Given a String str and a number n check if the prefix (made of up of the first n characters)
		// appears in the remaining part of the String. 
		// Print true or false.
		// Assume that the String is not empty and that n is in the range from 1 to str.length().

	 Scanner scan = new Scanner(System.in);
	 String str = scan.next();
	 int n = scan.nextInt();
		
	 String prefix= str.substring(0, n);
	 if ((str.substring(n, str.length()).contains(prefix))) System.out.println(true);
	 else System.out.println(false);
		
	// 	if ((str.substring(n).contains(str.substring(0, n))) // with this: you do not need new value as "prefix" to String .
		
	}

}
