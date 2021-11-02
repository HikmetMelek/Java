package replit.string;

import java.util.Scanner;

public class CarInsuranceQuote {

	public static void main(String[] args) {
		// First things first, your program should ask customer to provide a name, so display a message:
		//"Enter your name".
		//Then ask user about ownership of US driver license. Display message: "Do you have a US driver license?".
		//Then ask user to provide a zip code
		//Then ask user about car usage. Display message: "How is this vehicle primarily used?".
		//Then, ask user about how many miles customers drives to work or school.
		//Then ask customer about his age.
		//Then, ask customer about driving experience. 
		// Make sure that experience is greater than 0 and result of subtraction age from experience
		//is greater or equals to 16. If no, display message: "Invalid data!" and stop the program. 
		//Reduce premium on $5 for every year of experience.
		//Then, ask customer about car accidents. Display message: "Have you had any accidents in the last 5 years?".
		//Then, ask customer if he had continuous insurance for the past 12 months.
		//Then ask user about level of education.
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String name="";
		String vehicleUsage = "";
		String vehicleOwnership = "";
		String continuousInsurance = "";
		String education = "";
		String referenceNumber = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");		
		
		System.out.println("Enter your name");
		name=scan.nextLine();
		System.out.println("Do you have a US driver license?");
		if (scan.next().equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Enter your zip code");
		String code=scan.next();
		if (code.equals(20910) || code.equals(20740)) premium+=60;
		else if (code.equals(22102) || code.equals(22103)) premium+=30;
		else premium+=50;
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		if (vehicleOwnership.equalsIgnoreCase("Owned")) premium+=10;
		else premium+=20;
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("business")) premium+=50;
		else if (vehicleUsage.equalsIgnoreCase("pleasure")) premium+=10;
		else if (vehicleUsage.equalsIgnoreCase("commute")) {
			premium+=20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool=scan.nextInt();
			premium+= daysDrivenToWorkOrSchool*5;
		}
		
		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool= scan.nextInt();
		premium+= milesToWorkOrSchool;
		
		System.out.println("How old are you?");
		int age= scan.nextInt();
		if (age<16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		else if (age>16 && age<18) premium*=20;
		else if (age>=18 && age<=21) premium*=6;
		else if (age>21 && age<25) premium*=2;
		
		System.out.println("How many years you've been driving?");
		int yearOfDrive= scan.nextInt();
		if (yearOfDrive<0 || age-yearOfDrive<16) {
			System.out.println("Invalid data!");
			System.exit(0);	
		}
		premium-=yearOfDrive*5;
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String accidents= scan.next();
		if (accidents.equalsIgnoreCase("yes")) System.out.println("How many?");
		premium+=accidentsAmount*(premium*20/100);
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance=scan.next();
		if (continuousInsurance.equalsIgnoreCase("no")) premium+=premium;
		
		System.out.println("What is the highest level of education you have completed?");
		education= scan.next();
		if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equals("Masters"))
		premium-= premium/20;
		else if (education.equalsIgnoreCase("doctors")) premium-= premium/10;
		else if (education.equals("Less than High School")) premium+= premium/20;
		
		System.out.println(name+", here's your quote!");
		System.out.println("Start Your Policy Today For: $"+ premium);	
		education=education.replace(" ", "");
		referenceNumber= name.substring(0, 2)+ age + name.substring(name.length()-2, name.length())
				+ code + education;
		System.out.println("Reference number: "+ referenceNumber.toUpperCase());
		
		
		
	}

}
