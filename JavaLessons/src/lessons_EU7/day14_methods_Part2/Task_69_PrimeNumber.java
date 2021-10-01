package lessons_EU7.day14_methods_Part2;

import java.util.Scanner;

public class Task_69_PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int prime;
		
		do {
			System.out.println("Enter a positive number to find whether it is a prime number or not:");
			prime=sc.nextInt();
			
		}while (prime<=0);
		
		
		boolean primeNumber=inPrime(prime);
		System.out.println(primeNumber);
		
	}	

	public static boolean inPrime(int num) {
		
		if (num==1) return false;
		if (num==2) return true;	
		else {
			for(int i=2; i<num; i++) {	
				if (num%i==0) return false;	
			}
		}	
		return true;
		
	}
	
	
}
