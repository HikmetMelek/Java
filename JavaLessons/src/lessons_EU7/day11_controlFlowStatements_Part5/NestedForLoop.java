package lessons_EU7.day11_controlFlowStatements_Part5;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("Outer Loop Iteration " + i);
			
			for(int j=1;j<=2;j++) {
				
				System.out.println("i = " + i + "; j = " + j);
				
			}
			
		}
		


	}

}
