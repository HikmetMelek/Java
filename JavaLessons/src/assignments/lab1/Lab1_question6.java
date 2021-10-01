package assignments.lab1;

public class Lab1_question6 {

	public static void main(String[] args) {
		
	cigarParty(30, false);	
	cigarParty(50, false);	
	cigarParty(70, true);	
	
	}

	public static void cigarParty(int num, boolean weekend) {
		
		if (weekend) {
			if (num>40) System.out.println("true");
		}
		else if (num>40 && num<60) System.out.println("true");
		else System.out.println("false");
			
		
	}
	
//	OZZY result:
//	public static void cigarParty(int numberCigar,boolean isWekeend) {
//		
//		if(isWekeend) {
//			if(numberCigar>=40) {
//				System.out.println(true);
//			}else {
//				System.out.println(false);
//			}
//		}else {
//			if(numberCigar>=40 && numberCigar<=60) {
//				System.out.println(true);
//			}else {
//				System.out.println(false);
//			}
//			
//		}
}
