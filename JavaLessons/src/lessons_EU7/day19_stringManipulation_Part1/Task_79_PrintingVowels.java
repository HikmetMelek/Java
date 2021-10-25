package lessons_EU7.day19_stringManipulation_Part1;

public class Task_79_PrintingVowels {

	public static void main(String[] args) {
		
		String word= "CybertekSchool"; // a,e,o,i,u
		
		for( int i=0; i< word.length(); i++) {
			
			if (word.charAt(i)=='a' || word.charAt(i)== 'e' || word.charAt(i)=='o' || word.charAt(i)=='i' 
					|| word.charAt(i)=='u') {
				
				System.out.print(word.charAt(i));
				
				if( i != word.length()-2) { // for CyberSchool, until the second to last row put comma, but after vowel.
					System.out.print(",");
				}
				
			}	
			
		}
		
	// OZZY RESULT
//		for(int i=0;i<word.length();i++) {
//			
//			char letter = word.charAt(i);
//			
//			if(letter=='a' || letter=='e' || letter=='o' || letter=='i' || letter=='u') {
//				
//				System.out.print(letter);
//				
//				if( i != word.length()-2) {
//					
//					System.out.print(",");
//				}
//				
//			}
//			
//			
//			
//			
//			
//		}
		

	}

}
