package replit.methods;

import java.util.Scanner;

public class FindCube {

	public static void main(String[] args) {
		
	cube();	

	}
	
	public static void cube() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		int number= sc.nextInt();
		sc.close();
		int times=1;
		
		for (int i=1; i<=3; i++) {
			
			times *= number;
			
		}
		System.out.println(times);
			
		
	}
	
	
	
	

}
