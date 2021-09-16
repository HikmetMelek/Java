package lessons_EU7.day8_controlFlowStatements_Part2;

import java.util.Scanner;

public class Task38 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Write a number from 1 to 7 , to print which the day of week.Then push enter ");
		int day=sc.nextInt();
				
		//int day=0;
		
		switch (day) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
						
		}

	}

}
