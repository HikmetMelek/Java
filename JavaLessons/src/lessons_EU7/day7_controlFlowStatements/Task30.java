package lessons_EU7.day7_controlFlowStatements;

public class Task30 {

	public static void main(String[] args) {
		
		int num=51;
		double result;
		result= num % 2;  //use modulus, because when you divide a number==> 
		//even numbers have reminder 0; but odd numbers have remainder 1..
		if (result==0) System.out.println(num+ " is a even number");
		else System.out.println(num+" is a odd number");

	}

}
