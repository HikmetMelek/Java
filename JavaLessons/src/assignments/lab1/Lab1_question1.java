package assignments.lab1;

public class Lab1_question1 {

	public static void main(String[] args) { 
		
	stringTimes("Hi", 2);	
	stringTimes("Hi", 3);
	stringTimes("Hi", 1);
	
	}

	public static void stringTimes(String name, int num ) {
		
		for(int i=1; i<=num; i++) {
			
			System.out.print(name);
				
		}
		System.out.println();
	}	

}
