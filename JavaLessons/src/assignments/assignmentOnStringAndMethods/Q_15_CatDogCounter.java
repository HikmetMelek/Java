package assignments.assignmentOnStringAndMethods;

public class Q_15_CatDogCounter {

	public static void main(String[] args) {
		// Print true if the string "cat" and "dog" appear the same number of times in the given string word.
		String str1="catdogdogcat";
		String str2="cat-cheetah-dog-cat";
		String str3="catcatcatdog";
		System.out.println(catDog(str1));
		System.out.println(catDog(str2));
		System.out.println(catDog(str3));
		
	}

	public static boolean catDog(String str) {
		int counter1=0;
		int counter2=0;
		for (int i=0; i< str.length()-2; i++) {
			
			if(str.substring(i, i+3).equalsIgnoreCase("cat"))
				counter1++;
			
			if(str.substring(i, i+3).equalsIgnoreCase("dog"))
				counter2++;
		}
		if (counter1== counter2) return true;
		else return false;
	}
	
}
