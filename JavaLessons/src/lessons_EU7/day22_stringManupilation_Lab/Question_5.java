package lessons_EU7.day22_stringManupilation_Lab;

public class Question_5 {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}
	public static String firstHalf(String str) {
		
		return str.substring(0, str.length()/2);
		
	}
}
