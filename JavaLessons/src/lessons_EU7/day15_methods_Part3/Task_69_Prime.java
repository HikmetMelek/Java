package lessons_EU7.day15_methods_Part3;

import java.util.Scanner;

public class Task_69_Prime {

	public static void main(String[] args) {
		// OZZY RESULT:
		
		int number = 37;
		
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}

	}
	
	public static boolean isPrime(int number) {
		
		boolean  flag = true;
		
		if(number==0 || number ==1) {
			
			flag=false;
			
		}else {
			
			
			for(int i=2;i<number;i++) {
				
				if(number%i==0) {
					
					flag=false;
					
					break;
					
					
				}
				
			}
			
		
		}
		
		return flag;
		
		
		
	}	
	
}
