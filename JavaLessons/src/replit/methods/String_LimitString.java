package replit.methods;

import java.util.Scanner;

public class String_LimitString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(limit(in.nextLine(), in.nextInt()));

	}
	public static String limit(String text, int maxLength){
		String dummy="";
		for (int i=0; i<maxLength; i++) {
			dummy+= text.charAt(i);
			
		}
		return dummy;
		
		
	}
}
