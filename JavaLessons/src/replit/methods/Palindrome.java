package replit.methods;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Race car ; civic ; madam 
		Scanner in = new Scanner(System.in);
		System.out.println(isPalindrome(in.nextLine()));
	}
	public static boolean isPalindrome(String check) {
		check=check.replace(" ", "").toLowerCase();
		String each="";
		for (int i= check.length()-1; i>=0; i--) {
			each+= ""+check.charAt(i);	
		}
		if(check.equals(each)) return true;
		else return false;	
		
	}
}
