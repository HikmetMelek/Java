package lessons_EU7.day22_stringManupilation_Lab;

import java.util.Scanner;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1= "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));
		
		//Mr. = > married man
		//Mrs. = > married woman
		//Ms. = > Some woman
		//Dr. = > Doctor man or woman
		//No title  = > Unknown status
		// title= Dr. Jackson
		
		String title= "Dr. Jackson";
		
		if (title.startsWith("Mr.")) System.out.println("Married man");
		else if (title.startsWith("Mrs.")) System.out.println("Married woman");
		else if (title.startsWith("Ms.")) System.out.println("Some woman");
		else if (title.startsWith("Dr.")) System.out.println("Doctor man or woman");
		else System.out.println("Unknown status");
		
				
		

	}

}
