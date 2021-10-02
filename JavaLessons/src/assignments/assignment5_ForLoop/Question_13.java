package assignments.assignment5_ForLoop;

public class Question_13 {

	public static void main(String[] args) {
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W
//		W B W B W B W B
//		B W B W B W B W

		for (int i=1; i<=8; i++) {
			
			for (int j=1; j<=4; j++) {
				
				if (i%2!=0) System.out.print("W"+" "+"B"+" ");
				else System.out.print("B"+" "+"W"+" ");
			}System.out.println();
		}
	
	
	
	
	}

}
