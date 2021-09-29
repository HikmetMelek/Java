package lessons_EU7.day11_controlFlowStatements_Part5;

public class Task_48 {

	public static void main(String[] args) {
		
		int rows=7;
			
		for(int i=1;i<=rows;i++) {
						
			for(int j=1;j<=i;j++) {		
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
