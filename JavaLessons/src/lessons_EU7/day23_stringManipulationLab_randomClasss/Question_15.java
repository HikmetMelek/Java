package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_15 {

	public static void main(String[] args) {
		
		hasBad("badxx");
		hasBad("xbadxx");
		hasBad("xxbadxx");
		
	}
	
	public static void hasBad(String str) {
		boolean flag= true;
		for (int i=0; i<2;i++) {
			
			if (str.substring(i, i+3).equals("bad")) {
				flag=true;
				break;
			}
			else flag= false;	
		}
		if (flag) System.out.println(true);
		else System.out.println(false);
		
	}

	
		
	

}
