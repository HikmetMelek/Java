package replit.methods;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
//Complete the method isPalindrome() that will check if number is a palindrome. 
//Print your result as a boolean (true or false).
//
//Challenge: Do not convert int into a string!	
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
		int num = scan.nextInt();
		scan.close();
	    isPalindrome(num);	
	    
	}
	
	public static void isPalindrome (int num) {
		
		int ilkdeger = num; 
	    int length = String.valueOf(num).length();
		int kalan,deger=0;
		  
			for (int i = 0; i<length; i++){

		      kalan = num % 10;
		      deger = deger * 10 + kalan;
		      num = num /10;
		   }   
		
			if (deger==ilkdeger) System.out.println(true);
		else System.out.println(false);			
			
	}

}
