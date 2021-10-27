package lessons_EU7.day08_controlFlowStatements_Part2;

public class Task36_Calculator {

	public static void main(String[] args) {
		 
		int n1=10;
		int n2=5;
		String operator="%";
		int result=0;
		
		switch (operator) {
		
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		
		case "/":
			result=n1/n2;
			break;
			
		default:
			System.out.println("Invalid Operator");
			
		}
		
		System.out.println("Result is "+ result);
		
	}

}
