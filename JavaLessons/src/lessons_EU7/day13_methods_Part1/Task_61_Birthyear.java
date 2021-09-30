package lessons_EU7.day13_methods_Part1;

public class Task_61_Birthyear {

	public static void main(String[] args) {
		
		ageCalculator(2021, 1980);
		
	}

	public static void ageCalculator(int year, int birthyear) {
		
		int calculateAge= year - birthyear;
		System.out.println("Your age is "+ calculateAge);
		
	}
	
	
}
