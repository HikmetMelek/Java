package replit.methods;

public class Palindrom2_FindDigitsNumber {

	public static void main(String[] args) {
		
	    int fourDigit=2651;
	    
	    int firstDigit=fourDigit/1000;
	    System.out.println(firstDigit);
	    
	    int secondDigit=(fourDigit%1000)/100;
	    System.out.println(secondDigit);
	    
	    int thirdDigit=((fourDigit%1000)%100)/10;
	    System.out.println(thirdDigit);
	    
	    int lastDigit=((fourDigit%1000)%100)%10;
	    System.out.println(lastDigit);
	    
	    System.out.println((firstDigit+secondDigit) +""+ (thirdDigit+lastDigit));
	    
	}

}
