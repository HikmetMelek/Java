package lessons_EU7.day14_methods_Part2;

public class Task_66_DistanceTraveled {

	public static void main(String[] args) {

		double travel= distance(40, 5);
		
		System.out.println(travel+" km");
		
		if (travel>500) System.out.println("you spent too much gas");
		
		else System.out.println("you spent ok gas");

	}

	public static double distance(double speed, int time) {
		
		double travelDistance= speed*time;
		
		return travelDistance;  // return is breaking the method..
	}
	
}
