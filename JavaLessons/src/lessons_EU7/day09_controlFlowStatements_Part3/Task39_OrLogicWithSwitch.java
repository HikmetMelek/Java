package lessons_EU7.day09_controlFlowStatements_Part3;

public class Task39_OrLogicWithSwitch {

	public static void main(String[] args) {
		// ex: when you look , there is the same case expression ,you can use cases in a row.
		char grade = 'C';
		// A or B or C --> Pass,  D or E --> Fail
		
		switch (grade) {
		case 'A':case 'B':case 'C':
			System.out.println("pass");
			break;
		case 'D': // you can use like this
		case 'E':	
			System.out.println("fail");
			break;
			
		}
		System.out.println("***************************");
		
		char light='o';
		
		switch (light) {
		
		case 'r':case 'R':
			System.out.println("Red");
			break;
		case 'o':case 'O':
			System.out.println("Orange");
			break;
					
		case 'g': case 'G':
			System.out.println("Green");
			break;
		default: 
			System.out.println("Invalid light");
			// at the end "using break" is not mandatory, while default is at the end line of cases.
			
		}
	

	}

}
