package lessons_EU7.day08_controlFlowStatements_Part2;

public class Task34_AverageGrading {

	public static void main(String[] args) {
		
		int math=95;
		int chemistry=85;
		int biology=75;
		double average= ( math+chemistry+biology)/3;
		System.out.println("Average is "+average);
		
		if (average>=90 && average<=100) System.out.println("Grade is A");
		else if (average>=80 && average<=89) System.out.println("Grade is B");
		else if (average>=70 && average<=79) System.out.println("Grade is C");
		else if (average>=60 && average<=69) System.out.println("Grade is D");
		else if (average>=0 && average<=59) System.out.println("Grade is F");
		/*else {
			System.out.println("Average is invalid"); // putting "else" at the and of statement is not mandatory.
		}*/
		
		
	}

}
