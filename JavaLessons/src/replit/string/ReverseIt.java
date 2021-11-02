package replit.string;

import java.util.Scanner;

public class ReverseIt {

	public static void main(String[] args) {
		// Write a program that will reverse a string. Your program should reverse a string _only 5 characters long_. 
		//If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". 
		//Otherwise, reverse this word and print out result into the console. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Write a word");
		String word = scan.next();
		
		if (word.length()<5) System.out.println("Too short!");
		else if (word.length()>5) System.out.println("Too long!");
		else if (word.length()==5) {
			
			String newWord="";
			for (int i=word.length()-1; i>=0; i--){
	
				newWord+=word.charAt(i);
				
			}
			System.out.println(newWord);
		}
		
		
		
		
		
		

	}

}
