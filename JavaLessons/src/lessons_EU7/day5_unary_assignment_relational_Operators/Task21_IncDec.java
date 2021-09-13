package lessons_EU7.day5_unary_assignment_relational_Operators;

public class Task21_IncDec {

	public static void main(String[] args) {
			
		int x=4;
		int y= x * 4 - x++; // y: 4*4 -4:16-4:12 ; but in the next line x will begin by 5 ..
		
		System.out.println("y= "+y);
		System.out.println("x= "+x);
		
		

	}

}
