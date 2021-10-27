package lessons_EU7.day22_stringManupilation_Lab;

public class Question_3 {

	public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am Java"));
		System.out.println(extraEnd("a"));

	}

	public static String extraEnd(String str) {
		
		if (str.length()<2) return "Invalid String";
		
		String dummy= str.substring(str.length()-2);
		
		return dummy+dummy+dummy;
		
		
	}
}
