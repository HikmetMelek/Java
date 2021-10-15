package replit.methods;

import java.util.Scanner;

public class MethodWithReturn_ValidateTask {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter toDo list ");
		System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
		
		in.close();
	}
	
	public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
		
		if (!notEmpty || (taskId!= currentId+1)) return false;
		else return true;	
	}
		
		
}
	
