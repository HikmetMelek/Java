package lessons_EU7.day10_controlFlowStatements_Part4;

public class Task_42 {

	public static void main(String[] args) {
		
		int sumEven =0;
		int sumOdd =0;
		for (int i=1; i<100; i++) {
			if (i%2==0) {
				sumEven=sumEven+i;
				
			}else {
				sumOdd=sumOdd+i;
			}
					
		}

			System.out.println("sum of evens: "+sumEven);
			System.out.println("sum of odds: "+sumOdd);
	}

}
