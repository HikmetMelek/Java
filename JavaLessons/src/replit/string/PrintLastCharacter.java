package replit.string;

import java.util.Scanner;

public class PrintLastCharacter {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		 
		 System.out.println(word.charAt(word.length()-1));
		 
	}

}
