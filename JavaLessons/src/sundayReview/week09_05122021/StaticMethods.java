package lessons_EU7.sundayReview.week09_05122021;

public class StaticMethods {

	int num=10; // instance variable
	static int count=5; // static variable
	
	
	public static void displayMessage(String message) {
		int num2=8; // this is local variable
		System.out.println("Message : "+ message);
		//System.out.println(num); can not call instance variable in static method.
		System.out.println("Count :"+ count);
		
	}
	
	public static void anotherStaticMethod() {
		System.out.println("I created this method to call another static method");
		displayMessage("EU7 is hanging on, did not give up yet");
	}
	
	public void instanceMethod() {
		System.out.println("instance method");
		System.out.println("Num: "+ num);
		System.out.println("Count: "+ count);
	}
	
}
