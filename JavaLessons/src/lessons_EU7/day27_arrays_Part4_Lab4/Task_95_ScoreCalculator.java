package lessons_EU7.day27_arrays_Part4_Lab4;

public class Task_95_ScoreCalculator {

	public static void main(String[] args) {
	
		int[][] scores = {
				{68,75,54,80},  //student-0
				{100,64,20,50}, // student-1
				{10,35,40,90}  // student-2
		};
		
		// calculate student-0 average score
		int student0Total=0;
		for(int student1: scores[0]) {
			student0Total+= student1;	       
		}
		System.out.println(student0Total / scores[0].length);
		
		//calculate all math scores
		int math=0;
		for (int i=0; i< scores.length; i++) {
			math+= scores[i][0];
		}
		System.out.println(math);
		
		
		
		
		
		
		
		
		
	}

}
