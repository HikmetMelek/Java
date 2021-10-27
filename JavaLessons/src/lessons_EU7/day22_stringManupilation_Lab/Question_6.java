package lessons_EU7.day22_stringManupilation_Lab;

public class Question_6 {

	public static void main(String[] args) {
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("hel"));
	

	}
	public static String withoutEnd(String str) {
		
		return str.substring(1, str.length()-1);
	}

}
