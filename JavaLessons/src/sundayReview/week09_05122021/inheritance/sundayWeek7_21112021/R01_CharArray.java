package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

import java.util.Arrays;

public class R01_CharArray {

	public static void main(String[] args) {
		
		char[] letters= {'l', 'i', 's','t', 'e','n'};
		
		for (char each: letters) {
			System.out.print(each+" ");
		}
	
		System.out.println();
	// what are Strings? sequences of chars, collection of chars.
		String word= new String("listen");
		System.out.println(word);
		
		String word1= new String (letters);
		System.out.println(word1);
		
		// String to char
		String word2= "silent";
		char[] letters2= word2.toCharArray(); // String method, turns string into array of chars
		System.out.println(Arrays.toString(letters2));
		
		for(char each: word2.toCharArray() ) {
			System.out.print(each+" ");
		}
		

	}

}
