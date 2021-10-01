package assignments.lab1;

public class Lab1_question5 {

	public static void main(String[] args) {
	
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		
	}

	
	public static void caughtSpeeding(int speed, boolean birthday) {
		
		int noTicket=0;
		int smallTicket=1;
		int bigTicket=2;
		
		if (birthday==true) {
			speed= speed-5;
			if (speed<=60 ) System.out.println(noTicket);
			else if (speed>=61 && speed<=80)	System.out.println(smallTicket);
			else if (speed>=81) System.out.println(bigTicket);
		}
		else if (speed<=60 ) System.out.println(noTicket);
		else if  (speed>=61 && speed<=80)	System.out.println(smallTicket);	
		else if (speed>=81) System.out.println(bigTicket);	
			
		
		
		
		
	}
	
	
	
	
}
