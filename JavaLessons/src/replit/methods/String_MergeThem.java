package replit.methods;

import java.util.Scanner;

public class String_MergeThem {

	public static void main(String[] args) {
		//Write a method mergeStrings that will return the strings merged, 
		//one letter at a time, starting with one. Please note one and two can be of different lengths.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two word with different lengths");
		System.out.println(mergeStrings(in.next(), in.next()));
  

	}
	public static String mergeStrings(String one, String two) {
		String newWord="";
		int sub1;
		int sub2;

		if (one.length()> two.length()) {
			sub1= one.length()- two.length();
			for (int i=0; i<two.length(); i++) {
				newWord+= one.charAt(i)+""+ two.charAt(i); 
			}
			newWord+= one.substring(one.length()-sub1, one.length());
		return newWord;
		}
		
		else {
			sub2= two.length()- one.length();
			for (int i=0; i<one.length(); i++) {
				newWord+= one.charAt(i)+""+ two.charAt(i);  
			}
			newWord+= two.substring(two.length()-sub2, two.length());	
		return newWord;
		}
		
	    
	  }
	
}
