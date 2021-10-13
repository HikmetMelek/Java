package lessons_EU7.day18_readingUserInput;

import java.util.Scanner;

public class Task_74_positiveNumberTotal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num=0;
		
		do {
			System.out.print("Enter numbers: ");
			num= sc.nextInt();
			
			if (num<0) {
				System.out.println("you enter a negative number");
				break;
			}else	sum+=num;	
			
		}while(num>0);
		
		System.out.println("Total: "+ sum);
		
		sc.close();
	}

}
