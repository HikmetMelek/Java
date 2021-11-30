package lessons_EU7.day37_inheritance;

public class FinalExam extends GradeActivity {

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach=100/numQuestions;
		numericScore= 100.0-(numMissed*pointsEach);
		
		setScore(numericScore);// u do not need to call. u can call setScore() assuming there is a method in the FinalExam class.
		
	}
	
	

}
