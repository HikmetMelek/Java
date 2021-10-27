package lessons_EU7.day04_arithmetic_operators;


 // This program calculates hourly wages plus overtime

public class wages {

	public static void main(String[] args) {
		
		double regularWage; // The calculate regular wage
		double basePay=25.75; // the base pay
		double regularHours=40;  // the hours worked les overtime
		double overtimeWages; // overtime wages
		float overtimePay=37.5f; // overtime pay rate   // double is better , cause when used float, write "f".
		double overtimeHours=10;
		double totalWage; // total wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overtimePay*overtimeHours;
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for week are $ "+ totalWage);
		
		
		
		
		
		
		
		
		

	}

}
