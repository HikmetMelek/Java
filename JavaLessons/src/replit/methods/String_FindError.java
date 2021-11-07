package replit.methods;

import java.util.Scanner;

public class String_FindError {

	public static void main(String[] args) {
		// The isError method checks if the given String begins with error
		// The method will return true if the String starts with error otherwise it will return false
		// "error one two" --> true;  "three four error" --> false
		Scanner in = new Scanner(System.in);
		System.out.println(isError(in.nextLine()));
	}

	public static boolean isError(String line) {
		
		String error=line.substring(0, 5);
		if (error.contains("error")) return true;
		else return false;
		
	}
	
}
