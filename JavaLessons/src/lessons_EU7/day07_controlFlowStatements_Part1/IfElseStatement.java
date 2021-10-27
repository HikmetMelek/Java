package lessons_EU7.day07_controlFlowStatements_Part1;

public class IfElseStatement {

	public static void main(String[] args) {
		int score= 50;
		
		if (score>=70) {
		
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
		
		}else {
			System.out.println("You failed");
		}
	
		
		/*  if (score>=70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			
			if (score<70) {
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			}*/   
		
		// they are same. only else more practicable
		System.out.println("************");
		
		int sales,bonus;
		double commisionRate, salary;
		
		sales= 4000;
		salary= 10000;
		
		if (sales>=5000) {			// if (sales>5000){  ==> output salary will be 10000; degismeyecekti. because sales>5000 writing.
			bonus=500;
			commisionRate=1.12;
			
		
		}else {
			bonus= 100;
			commisionRate=1.10;
		 }
		salary= salary*commisionRate+bonus;
		System.out.println("Salary= "+ salary);

	}

}
