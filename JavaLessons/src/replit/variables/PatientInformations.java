package replit.variables;

import java.util.Scanner;

public class PatientInformations {

	public static void main(String[] args) {
		
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipCode;
		double height,weight;
		boolean isMarried=true;
		long workPhoneNumber;
		long personalPhoneNumber;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.println("Enter your first name");
		firstName=scan.nextLine();
		 
        System.out.println("Enter your last name");
		lastName=scan.nextLine();
		
		System.out.println("Enter your email");
        email = scan.nextLine();
        
        System.out.println("Enter your street");
        street=scan.nextLine();
        
        System.out.println("Enter your city");
        city=scan.nextLine();
        
        System.out.println("Enter your state");
        state=scan.nextLine();
        
        System.out.println("Enter your zip code");
        zipCode=scan.nextInt();
        
        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();
        
        System.out.println("Enter your personal phone number");
        personalPhoneNumber=scan.nextLong();
        
        System.out.println("Enter your age");
        age=scan.nextInt();
        
        System.out.println("Enter your height");
        height=scan.nextDouble();
        
        System.out.println("Enter your weight");
        weight=scan.nextDouble();
        
        System.out.println("Are you married?");
        isMarried=scan.nextBoolean();
        
//        Patient personal information
//        Full name: May, James
//        Address: 7925 Jones Branch Dr, McLean, VA 22102
//        Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
//        Age: 35
//        Height: 5.1
//        Weight: 173.2 pounds
//        Married?: true
        
        
        System.out.println("Patient personal information");
        System.out.println("Full name: "+lastName+", "+firstName);
        System.out.println("Address: "+street+", "+city+", "+state+" "+zipCode);
        System.out.println("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", "+"email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds ");
        System.out.println("Married?: "+ isMarried);
        
        
        
        
        
        
	}

}
