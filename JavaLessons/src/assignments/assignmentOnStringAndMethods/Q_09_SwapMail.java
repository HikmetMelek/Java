package assignments.assignmentOnStringAndMethods;

public class Q_09_SwapMail {

	public static void main(String[] args) {
		// In this task, you need to swap the first name with the last name in the email.
		// If the email doesn't contain underscore - do not anything.

		String mail1= "mike_tyson@gmail.com";
		System.out.println(swap(mail1));
		
		String mail2= "barakobama@gmail.com";
		System.out.println(swap(mail2));
		
	}

	public static String swap(String email) {
		
		if (!email.contains("_")) return email;
		else {
			
			int underScore= email.indexOf('_');
			int mailSign= email.indexOf('@');
			
			String name= email.substring(0, underScore);
			String lastName= email.substring(underScore+1, mailSign);
			
			return lastName + "_" + name + email.substring(mailSign, email.length());
		}
			
	}
		

}
