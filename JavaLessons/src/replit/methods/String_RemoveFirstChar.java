package replit.methods;

import java.util.Scanner;

public class String_RemoveFirstChar {

	public static void main(String[] args) {
		// The method accepts a string and returns a string without the first character
		//"aaa" -->"aa"
		
		Scanner in = new Scanner(System.in);
		System.out.println(removeFirst(in.next()));
	}
	 public static String removeFirst(String target) {
		 
		target= target.substring(1);
		return target;
	 }
}
