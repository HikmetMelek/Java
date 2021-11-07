package replit.methods;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// Anagram is a word, phrase, or name formed by rearranging the letters of another,
		// such as cinema, formed from iceman.
	 Scanner in = new Scanner(System.in);
	 System.out.println(isAnagram(in.nextLine(), in.nextLine()));
	}
	public static boolean isAnagram(String word1, String word2) {
		word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();
        
		if (word1.length() != word2.length()) return false;
			
			for (int i=0; i< word1.length()-1; i++) {
				if (!word1.contains(""+word2.charAt(i))) return false;
				if (!word2.contains(""+word1.charAt(i))) return false;
					
			}
		
		return true;
		

	}
}
