package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

public class R05_WrapperClassCharecters {

	public static void main(String[] args) {
		
		// Character : isDigit(), isLetter(),isAlphabetic();isLowerCase();isWhitespace();...
		
		char ch='A'; // try with 'a' , '�', '@'
		boolean isDigit= Character.isDigit(ch);
		boolean isLetter= Character.isLetter(ch);
		boolean isLowerCase= Character.isLowerCase(ch);
		boolean isUpperCase= Character.isUpperCase(ch);
		boolean isAlphabetic= Character.isAlphabetic(ch);
		 // special characters: !,@,# .......
		
		boolean isSpecial= ! Character.isLetterOrDigit(ch);// if it is not digit or letter, it is special character		
		
//		System.out.println(isDigit);
//		System.out.println(isLetter);
//		System.out.println(isLowerCase);
//		System.out.println(isUpperCase);
//		System.out.println(isSpecial);
//		System.out.println(isAlphabetic);
		
		System.out.println("-------------------");
		
		System.out.println(sumOfDigits("a1b2c3"));
		System.out.println(sumOfDigits2("a1b2c3"));
	}
	
	public static int sumOfDigits (String str) { // str = "a1b2c3";
		int sumOfDigits = 0;
		
		for (char each : str.toCharArray()) {
			if(Character.isDigit(each)) {
				sumOfDigits += Integer.parseInt(Character.toString(each)); // char --> String --> integer
												// (""+each)
			}
		}
			return sumOfDigits;
	}
	
	public static int sumOfDigits2(String str) { // str = "a1b2c3";
        int sumOfDigits = 0;
        
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i))) {
                sumOfDigits += Integer.parseInt(""+str.charAt(i));
            }
        }
      return sumOfDigits;
    }
		
		

}
