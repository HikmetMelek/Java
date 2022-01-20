package sundayReview.sundayWeek2_live_lesson_190921;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int hourlyRate=100;
		int weeklyHours=40;
		int monthlyTax=200;
		int monthlyPayCheck=0;
		monthlyPayCheck += (hourlyRate*weeklyHours)*4;//  monthlyPayCheck= monthlyPayCheck + (hourlyRate*weeklyHours)*4
		monthlyPayCheck -= monthlyTax;
		System.out.println(monthlyPayCheck);
	}

}
