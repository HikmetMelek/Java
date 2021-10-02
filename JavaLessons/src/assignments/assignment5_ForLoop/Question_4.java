package assignments.assignment5_ForLoop;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// Write a while loop that lets the user enter a number. 
		//The number should be multiplied by 10, and the result stored in the variable product. 
		//The loop should iterate as long as product contains a value less than 100.

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		
		while(num<100) {
			
			num= num*10;
			num++;
			
		}System.out.println(num);
				
	}

}
