package lessons_EU7.day22_stringManupilation_Lab;

public class Question_9 {

	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("Hi"));
		
	}

	public static String right2(String str) {
		
		if (str.length()<3) return "Invalid String";
		
		return str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
	}
	

}
