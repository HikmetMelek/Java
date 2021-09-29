package lessons_EU7.day11_controlFlowStatements_Part5;

public class WhileLoop {

	public static void main(String[] args) {

		//print 0-8
		int i=0;
		
		while(i<=8) {
			System.out.println(i);
			i++;
		}

		// using a loop, iterate until we have 5 students in the room
		
		int numberOfStudents=1;
		
		while(numberOfStudents<=5) {
			System.out.println("Student "+ numberOfStudents);
			numberOfStudents++;
		}
		
		// print 11,10,9,8,....1
		int num=11;
		
		while (num>=1) {
			System.out.print(num+" ");
			num--;
		}
		
		
		
		
		
		
	}

}
