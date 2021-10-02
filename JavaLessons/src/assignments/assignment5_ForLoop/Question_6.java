package assignments.assignment5_ForLoop;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		// Write a program to print Fibonacci series of n terms 
		// where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int number=scan.nextInt();
		
		System.out.println("Enter the length of list: ");
		int n=scan.nextInt(); 
		
		int secondNumber, totalNumber;
		
		if (number==0)  secondNumber= 1; 
		else  secondNumber= number;	
		
		System.out.print(number +", "+ secondNumber);
		
		for (int i=1; i<n-1; i++) {
			
			totalNumber= number + secondNumber;
			
			System.out.print(", "+ totalNumber);
			
			number= secondNumber;
			secondNumber= totalNumber;
			
			
		}
		
		
	}

}
