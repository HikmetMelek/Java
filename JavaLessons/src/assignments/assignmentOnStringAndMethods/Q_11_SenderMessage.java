package assignments.assignmentOnStringAndMethods;

import java.util.Arrays;

public class Q_11_SenderMessage {

	public static void main(String[] args) {
		/*	output:
		  	Sender: Mike Smith
   			Phone Number: 202-123-3456
			Message body: I love programming and problem solving
		 */
		
		String message="Sender:<Mike Smith>. From Number:[202-123-3456]. Message body:{I love programming and problem solving}";
		
		message= message.replaceAll("[ < , > , \\[ , \\] , { , } ]", " ");
	
		String[] arr= message.split("\\. "); 
		
		for (String str: arr) {
		System.out.println(str);
		}
		
	}

}
