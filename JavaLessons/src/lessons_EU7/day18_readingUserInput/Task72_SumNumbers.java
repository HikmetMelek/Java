package lessons_EU7.day18_readingUserInput;

import java.util.Scanner;

public class Task72_SumNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 number:"); 
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		total(n1, n2, n3);

		sc.close();
	}

	public static void total(int num1, int num2, int num3) {
		
		int sumNumber=num1+num2+num3;
		
		System.out.println("Sum of the numbers: "+sumNumber);
	
		
	}
}
