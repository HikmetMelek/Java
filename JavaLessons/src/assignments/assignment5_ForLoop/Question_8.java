package assignments.assignment5_ForLoop;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		// Write a program to calculate the sum of the numbers from 1 till upper bound.
//				If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
//				If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
//				If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
//				You should use a while loop.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the upper bound you want:");
		int bound=scan.nextInt();
		int i=0;
		int sum=0;
		
		while (i<bound) {
		
			i++;
			sum=i+sum;
			
			if (i==bound) System.out.print(bound);
			else System.out.print(i+" + ");
			
			
		} System.out.print(" = "+sum);
		
		
		
		
		

	}

}
