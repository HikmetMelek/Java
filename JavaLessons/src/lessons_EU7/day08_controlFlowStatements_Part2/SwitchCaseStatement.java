package lessons_EU7.day08_controlFlowStatements_Part2;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// switch cases is not work on boolean. case has to switch same expression..
		String weather="snow";
		
		switch (weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		
		default:
			System.out.println("Code Java in any other weather");
				
		}

	}

}
