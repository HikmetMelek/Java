package replit.methods;

import java.util.Scanner;

public class String_RemoveDuplicate {

	public static void main(String[] args) {
		// uniqueChars is a method that will accept any String and return 
		// the String with out any dupclicate characters
		// uniqueChars("java") ==> "jav"   // uniqueChars("mama") ==> "ma"
		Scanner in = new Scanner(System.in);
		System.out.println(uniqueChars(in.next()));	
		
	}
	 public static String uniqueChars(String str) {
		 String dummy="";

		 for (int i=0; i<str.length();i++) {
			 String c= ""+str.charAt(i);
			 if (!dummy.contains(c))  
				dummy+= c; 
		 }
		 return dummy; 
		 
	 }
	 
	
}
