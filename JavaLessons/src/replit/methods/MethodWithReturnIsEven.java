package replit.methods;

import java.util.Scanner;

public class MethodWithReturnIsEven {

	public static void main(String[] args) {
//		isEven accepts a number and checks if it is even. If the given number is even return true, 
//		otherwise return false.
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter number:");
		System.out.println(isEven(in.nextInt()));	
		in.close();
	}

	public static boolean isEven(int n) {
		
		if (n%2==0) return true;
		else return false;
		
	}
		
}
