package lessons_EU7.day19_stringManipulation_Part1;

public class Task_78_CountHowMany {

	public static void main(String[] args) {
		
		String word= "abcabqcabc";
		char letter='a';
		int times=0; // to find out how many times// use counter
		
		for (int i=0; i< word.length(); i++) {
			
			if (word.charAt(i)==letter) {
				times++;   // Each condition will increase by one // use counter
			}
				
		} 
		System.out.println("Number of " + letter + " in this string is: "+ times);	

	}

}
