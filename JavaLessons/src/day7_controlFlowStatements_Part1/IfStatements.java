package lessons_EU7.day7_controlFlowStatements_Part1;

public class IfStatements {

	public static void main(String[] args) {
		
		int score= 75;
		
			if (score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
			}
		
			System.out.println("************");
		
		int sales,bonus;
		double commisionRate, salary;
		
		sales= 5000;
		salary= 10000;
		
			if (sales>=5000) {			// if (sales>5000){  ==> output salary will be 10000; degismeyecekti. because sales>5000 writing.
			bonus=500;
			commisionRate=1.12;
			
			salary= salary*commisionRate+bonus;
			}
		
			System.out.println("Salary= "+ salary);

	}

}
