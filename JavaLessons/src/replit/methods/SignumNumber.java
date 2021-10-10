package replit.methods;

import java.util.Scanner;

public class SignumNumber {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.println("enter number:");
		int n = inp.nextInt();
	    inp.close();
		
	    sign(n);  

	}
	
	public static void sign(int number) {
		
		if (number>0) System.out.println("positive");
		else if (number<0)System.out.println("negative");
		else System.out.println("zero");
		
	}

}
