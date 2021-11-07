package replit.methods;

import java.util.Scanner;

public class String_At3rdChar {

	public static void main(String[] args) {
		// The first string is the one that will be manipulated. 
		// At the 3rd char position of target you will insert the word argument.
		//at3("catdog","bird") return: "catbirddog"
		
		Scanner in = new Scanner(System.in);
		System.out.println(at3(in.next(), in.next()));
	}
	 public static String at3(String target,String word){
		 
		 String first3Char= target.substring(0, 3);
		 String afterWord= target.substring(3);

		 return first3Char + word + afterWord;
		 
	 }
}
