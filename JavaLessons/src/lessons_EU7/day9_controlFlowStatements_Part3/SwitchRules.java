package lessons_EU7.day9_controlFlowStatements_Part3;

public class SwitchRules {

	public static void main(String[] args) {
		
		final String lastName="Senol";
		String firstName="Melek";
		int id=2;
		
		switch(firstName) {
		case "Test":
			System.out.println("test");
			break;
		case lastName:
			id=5;
			break;
		case "Melek":
			id=75;
			System.out.println(id);
			break;
			
					
		}
		
		
	}

}
