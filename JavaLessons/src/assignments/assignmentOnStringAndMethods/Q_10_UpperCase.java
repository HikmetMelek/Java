package assignments.assignmentOnStringAndMethods;

public class Q_10_UpperCase {

	public static void main(String[] args) {
		// Write a program that will print out information about the user based on email.
		// Print first and last name from the upper case.
		/* First name: Craig
           Last name: Federighi
           Domain: apple
           Top-Level Domain: com
           */
		String emailAddress= "craig_federighi@apple.com";
		email(emailAddress);
		
	}

	public static void email(String mail) {
		
		String firstName= mail.substring(1, mail.indexOf('_'));
		String firstChar= (""+ mail.charAt(0)).toUpperCase();
		System.out.println("First name: "+ firstChar +firstName);
		
		String lastName= mail.substring(mail.indexOf('_')+2, mail.indexOf('@'));
		String lastNameChar= (""+ mail.charAt(mail.indexOf('_')+1)).toUpperCase();
		System.out.println("Last name: "+ lastNameChar + lastName);
		
		String domain= mail.substring(mail.indexOf('@')+1, mail.indexOf('.'));
		System.out.println("Domain: "+ domain);
		
		System.out.println("Top-Level Domain: "+ mail.substring(mail.indexOf('.')+1, mail.length()));
		
		
		
	}
}
