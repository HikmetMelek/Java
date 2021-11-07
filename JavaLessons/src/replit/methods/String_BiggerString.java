package replit.methods;

import java.util.Scanner;

public class String_BiggerString {

	public static void main(String[] args) {
		// The method accepts two strings and return the longest one
		Scanner in = new Scanner(System.in);
		System.out.println(bigger(in.next(), in.next()));
	}
	public static String bigger(String a ,String b){
		
		if(a.length()>b.length()) return a;
		else return b;
		
		
	}
}
