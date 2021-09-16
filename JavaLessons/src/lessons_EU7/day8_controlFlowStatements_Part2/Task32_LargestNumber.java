package lessons_EU7.day8_controlFlowStatements_Part2;

public class Task32_LargestNumber {

	public static void main(String[] args) {
		
		int a=49;
		int b=50;
		int c=51;
		
		if ((a>b) && (a>c)) System.out.println(a +" is the largest number");
		else if (b>a && b>c) System.out.println(b +" is the largest number");
		else if (c>a && c>b) System.out.println(c +" is greatest one");
		else System.out.println("Numbers are equal");
		
		
	}

}
