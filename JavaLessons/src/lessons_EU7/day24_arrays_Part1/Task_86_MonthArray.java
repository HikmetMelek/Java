package lessons_EU7.day24_arrays_Part1;

import java.util.Scanner;

public class Task_86_MonthArray {

	public static void main(String[] args) {
		//create 12 month
		
		Scanner month= new Scanner(System.in);
		String[] myArray= new String[12];
		
		myArray[0]="Jan";
		myArray[1]="Feb";
		myArray[2]="March";
		myArray[3]="April";
		myArray[4]="May";
		myArray[5]="June";
		myArray[6]="July";
		myArray[7]="August";
		myArray[8]="Sept";
		myArray[9]="Oct";
		myArray[10]="Nov";
		myArray[11]="Dec";
		
		System.out.print("enter your month index ");
		int indexMonth=month.nextInt();
		
		System.out.println("Your Month is: "+ myArray[indexMonth]);
		//System.out.println(myArray);// give it to me its address: [Ljava.lang.String;@30c7da1e
		
		
		
		
		
		
		
	}

}
