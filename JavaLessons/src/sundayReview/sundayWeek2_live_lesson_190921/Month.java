package lessons_EU7.sundayReview.sundayWeek2_live_lesson_190921;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a month number");
		int month= scan.nextInt();
				
		boolean month28= month==2;
		boolean month30= month==4 || month==6 || month==9 || month==11;
		boolean month31= month==1 || month==5 || month==7 || month==8 || month==10 || month==12;
		
		
		if (month31) {
			System.out.println("In march there is 31 days");
		}else if (month28) {
			System.out.println("In march there is 28 days");
		}else if (month30) System.out.println ("In march there is 30 days");
		
		else System.out.println("Invalid entry");
		
		int grade=85;
		
		if (grade>=90 || grade>=100) System.out.println("A");
		else if (grade>=80 || grade>=89)System.out.println("B");
		

	}

}
