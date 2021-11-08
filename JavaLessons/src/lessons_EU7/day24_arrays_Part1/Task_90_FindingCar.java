package lessons_EU7.day24_arrays_Part1;

public class Task_90_FindingCar {

	public static void main(String[] args) {
		
		String[] cars = {"Toyota","Nissan","BMW","Mercedes","Honda"};
		boolean dummy=false;
		
		for (int i=0; i<cars.length; i++) {
			if (cars[i].equals("Honda")) {
				dummy=true;
				break;
			}
		}
				
		if (dummy) System.out.println("I found your car Honda in this array"); // if dummy is true ....
		else System.out.println("I could not find your car Honda in this array"); // if dummy is false .....		
		
	}
	// why dummy is useful? because try under code and see! there are a lot print...
	/*
	 *for (int i=0; i<cars.length; i++) {
			if (cars[i].equals("Honda")){
			 System.out.println("I found your car Honda in this array");
			break;
			}
			else {
			System.out.println("I could not find your car Honda in this array");
			break;
			}
		}
	 */
	
	

}
