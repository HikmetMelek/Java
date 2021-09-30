package lessons_EU7.day13_methods_Part1;

public class Task_65 {

	public static void main(String[] args) {
		
		calculateGrade(100,100,100);
		calculateGrade(50, 50, 50);

	}

	public static void calculateGrade(int grade1, int grade2, int grade3) {
		
		double average= ( grade1+grade2+grade3)/3;
		
		System.out.println("Average is "+average);
		
		if (average>=90 && average<=100) System.out.println("Grade is A");
		else if (average>=80 && average<=89) System.out.println("Grade is B");
		else if (average>=70 && average<=79) System.out.println("Grade is C");
		else if (average>=60 && average<=69) System.out.println("Grade is D");
		else if (average>=0 && average<=59) System.out.println("Grade is F");
		
		
	}
	
	
}
