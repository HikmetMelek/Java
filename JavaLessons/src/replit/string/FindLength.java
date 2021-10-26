package replit.string;

import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the text:");
		String sentence= scan.nextLine();
		System.out.println("Length is: "+sentence.length());

	}

}
