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
		
		for (int i=1; i<4; i++) {
			int sum=number+i;
			if (sum==number+1) System.out.print(sum);
			else System.out.print(" "+sum);
		
		}
		
	}
}
