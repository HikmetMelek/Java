package lessons_EU7.day13_methods_Part1;

import java.util.Scanner;

public class Task_57_sumOFNumbers {

	public static void main(String[] args) {
		
		sumNumbers();
		
	}
	
	public static void sumNumbers() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("write 3 numbers");
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		int sum=n1+n2+n3;
		System.out.println("sum of numbers= "+sum);
	}

}
