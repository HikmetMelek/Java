package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_14 {
	public static void main(String[] args) {
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
		System.out.println(endsLy("fully"));
		
	}
	
	public static boolean endsLy(String str) {
		
		if (str.length()<2) return false;
	
		return str.substring(str.length()-2).equals("ly");
		
	}

}
