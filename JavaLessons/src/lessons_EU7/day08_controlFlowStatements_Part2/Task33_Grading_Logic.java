package lessons_EU7.day08_controlFlowStatements_Part2;

public class Task33_Grading_Logic {

	public static void main(String[] args) {
		
		int mark=98;
		
		 if (mark<60) System.out.println("Fail");
		 else if (mark>=60 && mark<90) System.out.println("Pass");
		 else if (mark>=90 && mark<=100) System.out.println("Passed with Distinction");
		 else {
			 System.out.println("Invalid Score");
		 }
		 
		 
		 
	}

}
