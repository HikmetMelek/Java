package lessons_EU7.day22_stringManupilation_Lab;

public class Question_7 {

	public static void main(String[] args) {
		
		System.out.println(comboString("Hello", "Hi"));
		System.out.println(comboString("Hi", "Hello"));
		System.out.println(comboString("aaa", "b"));	

	}

	public static String comboString(String str1, String str2) {
		
		if (str1.length()< str2.length())  return str1.concat(str2).concat(str1);
		
		else  return str2.concat(str1).concat(str2);
		
		
	}
	
//	public static String comboString(String str1,String str2) {
//		
//		String str;
//		if(str1.length()>str2.length()) {
//			str = str2.concat(str1).concat(str2);
//		}else {
//			str = str1.concat(str2).concat(str1);
//		}
//		
//		return str;
//	}
//	
//	
	
	
}
