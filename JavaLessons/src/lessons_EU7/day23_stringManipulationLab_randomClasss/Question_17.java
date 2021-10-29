package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_17 {

	public static void main(String[] args) {
		
		String str="racecar";
		String str2= "Taco cat";
		String backward="";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			backward+= str.charAt(i);
			
		}
		
		if (str.equals(backward)) System.out.println(true);
		else System.out.println(false);
		
		System.out.println("\n---------------------------------");
		
		for (int j=str2.length()-1; j>=0; j--) {
			
			backward+= str2.charAt(j);
			
		}
		
		if (str2.replace(" ", "").equalsIgnoreCase(str2.replace(" ", ""))) 
			System.out.println(true);
		else System.out.println(false);

		
		
	}

}
