package lessons_EU7.day10_controlFlowStatements_Part4;

public class Task_47 {
	public static void main(String[] args) {
		
		int number=7;
		System.out.println("Multiplication table for "+number);
		System.out.println("---------------------------");
		
		for (int i=1; i<=10;i++) {
			System.out.println(number + "*" + i + " = " + (number*i));
		}
		
		
	}

}
