package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_08_Alejandro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mail text ");
	    String name = sc.nextLine();
	    System.out.println(mail(name));
	}

	public static String mail(String str) {
		
		if (str.contains("alejandro")) return "read this mail";
		else return "don't read";
	}
}
