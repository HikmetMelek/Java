package lessons_EU7.day11_controlFlowStatements_Part5;

public class Task_47_starPattern {

	public static void main(String[] args) {
		
//		for(int i=1; i<=7; i++) {
//			
//			for (int s=1; s<=6; s++) {
//				System.out.print("*");
//				if (s==6) System.out.println();
//			}
//		}
	
		int rows=7;
		int columns=6;
		  
		 for(int i=1;i<=rows;i++) {
	
			for(int j=1;j<=columns;j++) {
		
				System.out.print("*");
	
			}
			System.out.println();
	
		}
	
	}
	
}	
