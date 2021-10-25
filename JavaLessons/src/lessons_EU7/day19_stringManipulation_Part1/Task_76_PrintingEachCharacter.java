package lessons_EU7.day19_stringManipulation_Part1;

public class Task_76_PrintingEachCharacter {

	public static void main(String[] args) {
		
		String str= "Cybertek School";
		
		for( int i=0; i< str.length(); i++) {  //last character index is ALWAYS length()-1
			
			System.out.println(str.charAt(i)); // you can check with out.print  ..
			
		}
		
		
	}

}
