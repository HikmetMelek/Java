package lessons_EU7.day11_controlFlowStatements_Part5;

public class Task_50_NumberPattern {

	public static void main(String[] args) {
		
		int num=5;
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}

}
