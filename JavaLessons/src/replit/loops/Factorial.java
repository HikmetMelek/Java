package replit.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter positive number");
		int n = scan.nextInt();
		
		int factorial=1;
		
		for(int i=n; i>=1; i--) {
			
			factorial= factorial*i;
		}
		
	    System.out.println(factorial);
		
	}

}
