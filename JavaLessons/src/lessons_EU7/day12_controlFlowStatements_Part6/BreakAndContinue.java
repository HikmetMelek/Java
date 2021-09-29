package lessons_EU7.day12_controlFlowStatements_Part6;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		// break and continue; write break <==> continue and see the result
		
		for (int i=1; i<=5; i++) {
			
			if (i==4) {
				
				continue;
				
			}
			System.out.println(i);
			
		}
	}

}
