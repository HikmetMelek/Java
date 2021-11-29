package lessons_EU7.day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		ABC.m1();
		
		/*ABC o1= new ABC(); // error
		o1.m1();
		*/
		
		//whenever all of your methods in your class are static,
		//and you want everyone to call them static way - ClassName.methodname(),
		//then you can simply make your constructor private


	}
	
	public static void print() {
		//static int a=5; // local variables can not be static
	}

}
