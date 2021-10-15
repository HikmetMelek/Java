package replit.methods;

import java.util.Scanner;

public class PrintNext3Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		next3(num);

		sc.close();
	}
	
	public static void next3(int number) {
		System.out.println("Next 3 are:");
		
		System.out.print(number+1);
		for (int i=number+2; i<=number+3; i++) {
		System.out.print(" "+i);
		
		}
		
	}
}
