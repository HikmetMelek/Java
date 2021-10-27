package lessons_EU7.day07_controlFlowStatements_Part1;

public class Task25_If_GreatestNumber {

	public static void main(String[] args) {
		
		int num1= 4;
		int num2= 8;
		int num3= 1;
			if (num1>num2 && num1>num3) {
				System.out.println("The greatest number is= "+ num1);
			}

			if (num2>num1 && num2>num3) {
				System.out.println("The greatest number is= "+ num2);
			}

			if (num3>num1 && num3>num2) {
				System.out.println("The greatest number is= "+ num3);
			}
			
			
	}

}
