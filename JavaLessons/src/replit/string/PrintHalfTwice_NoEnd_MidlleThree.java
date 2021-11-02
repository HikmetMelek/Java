package replit.string;

import java.util.Scanner;

public class PrintHalfTwice_NoEnd_MidlleThree {

	public static void main(String[] args) {
		// Write a program that will print out first half of the word twice.// java--> jaja; unity--> unun;
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();	
	    
	    System.out.println(word.substring(0, word.length()/2).concat(word.substring(0, word.length()/2)) );
	    
	    System.out.println("*************************************");
	    
	    // REPLIT _ String no end
		System.out.println(word.substring(0, word.length()-1));
		
		System.out.println("*************************************");
		    
		// REPLIT _ Middle three
		
		if (word.length()>=5 && word.length()%2!=0)
			 System.out.println(word.substring(word.length()/2-1, word.length()/2+2));
		else System.out.println("invalid");
		
	    //System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2)+""+ word.charAt(word.length()/2+1));
	    
	}

}
