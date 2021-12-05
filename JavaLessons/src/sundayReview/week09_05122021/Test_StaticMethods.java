package lessons_EU7.sundayReview.week09_05122021;

public class Test_StaticMethods {

	public static void main(String[] args) {
		
		StaticMethods.displayMessage("Hello");
		StaticMethods obj= new StaticMethods();
		
		System.out.println("--------------------------");
		obj.displayMessage("Hi");
		
		System.out.println("--------------------------");
		
		obj.anotherStaticMethod();
		
		System.out.println("--------------------------");
		obj.instanceMethod();
		
		
	}

}
