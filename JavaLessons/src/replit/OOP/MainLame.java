package replit.OOP;

import java.util.Scanner;

public class MainLame {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter 2 number: ");
		int a=in.nextInt();
		int b=in.nextInt();
		LameCalculator lc = new LameCalculator();
		
		System.out.println(lc.plus(a, b));
		System.out.println(lc.minus(a, b));
		System.out.println(lc.multiply(a, b));
		System.out.println(lc.divide(a, b));
		
		
		in.close();
	}

}
