package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

public class R06_WrapperClassCha {

	public static void main(String[] args) {
		
		String s= "abcd1234!@#&�efgh6789#$ABCD";
		
		String letter="";
		String upperCase="";
		String lowerCase="";
		String digits="";
		String specialChars="";
		
		char[] ch= s.toCharArray();
		
		for(char each : ch) {
            if(Character.isLetter(each)) {
                letter+=Character.toString(each);
                if(Character.isUpperCase(each)) {
                    upperCase+=Character.toString(each);
                }else if(Character.isLowerCase(each)) {
                    lowerCase+=Character.toString(each);
                }
            }else if(Character.isDigit(each)) {
                digits+=Character.toString(each);
            }else {
                specialChars+=Character.toString(each);
            }
        }

        System.out.println(letter);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(digits);
        System.out.println(specialChars);
		
		
//        for(char each  : s.toCharArray()) {
//            if(Character.isDigit(each)) {
//                digits += each;
//            }else if(Character.isLetter(each)) {
//                letters += each;
//            }else if(Character.isUpperCase(each)) {
//                upperCase += each;
//            }else if(Character.isLowerCase(each)) {
//                lowerCase += each;
//            }else{ 
//                specialChars += each;
//            }
//        }
        
        
        
        
	}

}
