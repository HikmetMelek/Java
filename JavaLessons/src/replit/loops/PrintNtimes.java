package replit.loops;

import java.util.Scanner;

public class PrintNtimes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times you want to print asterisks");
		int n = scan.nextInt();
		scan.close();
		for (int i=1; i<=n; i++) {
			
			System.out.print("*");
			
		}

	}

}
