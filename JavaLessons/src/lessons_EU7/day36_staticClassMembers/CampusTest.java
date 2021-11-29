package lessons_EU7.day36_staticClassMembers;

public class CampusTest {

	public static void main(String[] args) {
		
		// print and see!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country);
		System.out.println(c1.getCity());
		


	}

}
