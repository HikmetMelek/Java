package replit.arrays;

import java.util.*;

public class FindingMaxLength {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		String dummy="";
		int wordEach=0;
		int maxLength=0;
		for(int i=0; i< words.length; i++) {
			wordEach=words[i].length();
			if(wordEach>maxLength)
				maxLength=wordEach;
			if(wordEach==maxLength)
				dummy=words[i];
		}
		
		System.out.println(dummy);
	}

}
