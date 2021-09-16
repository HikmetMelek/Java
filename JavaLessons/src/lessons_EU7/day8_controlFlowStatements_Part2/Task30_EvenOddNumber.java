package lessons_EU7.day8_controlFlowStatements_Part2;

public class Task30_EvenOddNumber {

	public static void main(String[] args) {
		
		int num=52;
		//double result;
		//result= num % 2;  //use modulus, because when you divide a number==> 
		//even numbers have reminder 0; but odd numbers have remainder 1..
		if (num%2==0) System.out.println(num+ " is a even number");
		else System.out.println(num+" is a odd number");

	}

}
