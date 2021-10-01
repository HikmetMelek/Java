package lessons_EU7.day14_methods_Part2;

public class Task_67_NumberLastDigit {

	public static void main(String[] args) {
		
		boolean result1= lastDigit(7,17);
		boolean result2= lastDigit(6,17);
		boolean result3= lastDigit(3,113);

	}

	public static boolean lastDigit(int num1, int num2) {
		
		boolean x=true;
		
		if (((num2-num1)%10==0) && ((num2-num1)>0) || ((num1-num2)%10==0) && ((num1-num2)>0)) {
			System.out.println(x);
		}
		else System.out.println(!x);
		
		return x;
	}
	
}
