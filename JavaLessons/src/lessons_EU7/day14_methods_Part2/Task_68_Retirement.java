package lessons_EU7.day14_methods_Part2;

public class Task_68_Retirement {

	public static void main(String[] args) {
		
		yearsUntilRetirement("Mike", 1980);
	
	}

	public static void yearsUntilRetirement(String name, int year) {

		int retirementAge=60;
		
		int retireAge = 60 - calculateAge(year);
		
		System.out.println("\""+name+" retires in "+retireAge +" years\"");
		
	}
	
	public static int calculateAge(int birthyear) {
	
		int age= 2021 - birthyear;
		
		return age;
		
	}
	
}
