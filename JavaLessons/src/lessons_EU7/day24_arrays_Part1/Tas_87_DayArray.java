package lessons_EU7.day24_arrays_Part1;

import java.util.Scanner;

public class Tas_87_DayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String[] days= new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		System.out.print("enter which day you want ");
		int day= sc.nextInt();
		
		System.out.println("Todat is "+ days[day]);
		
		
		
		
		
		
	}

}
