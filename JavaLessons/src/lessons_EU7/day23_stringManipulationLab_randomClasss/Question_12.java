package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_12 {

	public static void main(String[] args) {
	
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("1CAT1dodogCat1dog"));
		System.out.println(catDog("1cat1cadodog1dog"));
		
	}

	public static boolean catDog(String str) {
		
		int counterCat=0;
		int counterDog=0;
		
		for (int i=0; i< str.length()-2;i++)
			if (str.substring(i, i+3).equalsIgnoreCase("cat"))
				counterCat++;
		
			else if (str.substring(i, i+3).equals("dog"))
				counterDog++;
		
		return counterCat==counterDog;
	}
}
