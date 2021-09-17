package lessons_EU7.day9_controlFlowStatements_Part3;

public class IfElseRules {

	public static void main(String[] args) {
		// if there is one statement line, you do not have to use "{}".
		
		
		if (false)        //   or    you write same line,    if (false)  System.out.println("Hello");
			System.out.println("Hello");
		
		else    
			System.out.println("Bye"); //   or    you write same line,  else  System.out.println("Bye");
		
		System.out.println("*********************");
		
		int a=6;
		double b=6.0;
		
		if (a==b) System.out.println("ok");
		else System.out.println("!!");
		System.out.println("************************");
		
		int c=6;
		
		if ((c+=2)!=8) { // Despite the if is "false", process was done. c+2=2 ===> c become c=8 ..
			System.out.println("great");
		}else if ((c+=2)==10) {
			System.out.println("you understand");
		}
		
		
		
	}

}
