package lessons_EU7.day15_methods_Part3;

public class Task_67_NumberLastDigit {

public static void main(String[] args) {
		// OZZY result below: //Mine result is in the day14_Task_67
		
		if(lastDigit(3,113)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They do not have the same last digit");
		}	

	}

	public static boolean lastDigit(int num1, int num2) {
		
			if((num1%10)==(num2%10)) {
				return true;
			}else {
				return false;
			}

	}
	
	
}
