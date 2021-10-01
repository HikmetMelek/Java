package assignments.lab1;

public class Lab1_question4 {

	public static void main(String[] args) {
		
	deerPlay(70, false);	
	deerPlay(95, false);	
	deerPlay(70, true);
	
	}
	
	public static void deerPlay(int temp, boolean isSummer) {
		
		//if (temp==100) System.out.println(isSummer);
		//else if (temp==90) System.out.println(!isSummer);
		if (temp>=60 && temp<=90 && isSummer==false) System.out.println("true");
		else if (temp>=60 && temp<=100 && isSummer==true) System.out.println("true");
		else System.out.println("false");
		
	
			
	}
		
}
		


