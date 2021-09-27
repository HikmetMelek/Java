package lessons_EU7.day10_controlFlowStatements_Part4;

public class TernaryOperators {

	public static void main(String[] args) {
		String result;
		int score=50;
		// if (score>60) 
		//	result="Pass";
		//else result="Fail";
		 	
		result= score>60 ? "Pass" : "Fail";
		System.out.println(result);
		
		System.out.println("--------------------");
		
		int x=5;
		
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
		
		
	}

}
