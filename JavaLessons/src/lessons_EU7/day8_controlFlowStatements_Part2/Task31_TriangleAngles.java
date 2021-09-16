package lessons_EU7.day8_controlFlowStatements_Part2;

public class Task31_TriangleAngles {

	public static void main(String[] args) {
		
		int angles1=20;
		int angles2=40;
		int angles3=90;
		
		if ( (angles1+angles2+angles3) ==180) System.out.println("Triangle is valid");
		//if (angles1+angles2+angles3 ==180) is true.
		// you do not have to use second"()" in if condition.
		// but when you use it , it is more tidy and pleasing to the eye..
		
		else System.out.println("Triangle is not valid");
		
	}

}
