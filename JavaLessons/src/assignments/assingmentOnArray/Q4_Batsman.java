package assignments.assingmentOnArray;

public class Q4_Batsman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		short halfCentury=0;
		short century=0;
		short doubleCentury=0;
		
		for (short i: scores) {
			if(i>=50 && i<100) halfCentury++;
			else if(i>=100 &&i<200) century++;
			else if(i>=200) doubleCentury++;
		}
		
		System.out.println("Half-centuries :"+halfCentury+ "\nCenturies :"+century+ "\nDouble-centuries :"+ doubleCentury);
		
		
		
	}

}
