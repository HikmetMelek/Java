package lessons_EU7.day22_stringManupilation_Lab;

public class Question_10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("lesson"));
		System.out.println(frontAgain("cildci"));

	}
	public static boolean frontAgain(String str) {
		
//		if(str.substring(0, 2) == str.substring(str.length()-2)
//			return true; 
//		else return false;
		String first2 = str.substring(0,2);         //edited 
		String last2 = str.substring(str.length()-2);
	
		return first2.equals(last2);	
		
	}
	

	
}
