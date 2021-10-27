package lessons_EU7.day09_controlFlowStatements_Part3;

public class Task38_DaySelector {

	public static void main(String[] args) {
		
		int day=0;
		
		switch (day) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default: // when you use the "default" into the other lines, you have to use "break" at theend of statement.
			System.out.println("No such a day");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		}

		
	}

}
