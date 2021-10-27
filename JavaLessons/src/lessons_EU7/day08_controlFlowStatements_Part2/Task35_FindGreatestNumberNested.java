package lessons_EU7.day08_controlFlowStatements_Part2;

public class Task35_FindGreatestNumberNested {

	public static void main(String[] args) {
		
		int n1=99;
		int n2=1;
		int n3=520;
		
		if (n1>n2 & n1>n3) {
			System.out.println("Greatest number is "+n1);
		}else {
			if (n2>n3) {
				System.out.println("Greatest number is "+n2);	
		    }else {
		    	System.out.println("Greatest number is "+n3);
		     }
			
		     
		}	
		
		
	}

}
