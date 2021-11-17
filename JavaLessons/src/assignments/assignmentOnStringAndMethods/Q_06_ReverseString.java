package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_06_ReverseString {

	public static void main(String[] args) {
		// Your program should reverse a string only 5 characters long. If the word is shorter, display message:
		//"Too short!". If the word is longer, display the message: "Too long!
		Scanner in = new Scanner(System.in);
		System.out.print("Enter word: ");
		System.out.println(reverse(in.next()));
		
	}
	public static String reverse(String input){
		 
		if(input.length()==5) {
			String newWord="";
			for (int i=input.length()-1; i>=0; i--){
		
				newWord+=input.charAt(i);
					
				}
	    return newWord;	
		}
		else if (input.length()<5) return "Too short";
		else return "Too long";
	     
	}
}
