package lessons_EU7.day22_stringManupilation_Lab;

public class Question_1 {

	public static void main(String[] args) {

		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
	}
	public static String helloName(String str) {
		// String name="Hello ";
		return "Hello ".concat(str).concat("!");  //   name.concat(str)+"!";
		
	}
	
}
