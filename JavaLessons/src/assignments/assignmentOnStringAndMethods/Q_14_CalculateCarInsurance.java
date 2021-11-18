package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_14_CalculateCarInsurance {

	public static void main(String[] args) {
		
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");	
		
		
		System.out.println("Enter your name");
	    name=scan.nextLine();
	    System.out.println("Do you have a US driver license?");
	    String haveLicense=scan.next();
	    if(haveLicense.equals("No")){
	      System.out.println("Invalid data!");
	      scan.close();
	    }
	    System.out.println("Enter your zip code");
	    int zipCode=scan.nextInt();
	    if(zipCode==20910 || zipCode==20740){
	      premium+=60;
	    }else if(zipCode==22102 || zipCode==22103){
	      premium+=30;
	    }else{
	      premium+=50;
	    }
	    System.out.println("Is this vehicle Owned, Financed, or Leased?");
	    vehicleOwnership=scan.next();
	    if(vehicleOwnership.equals("Owned")){
	      premium+=10;
	    }else{
	      premium+=20;
	    }
	    System.out.println("How is this vehicle primarily used?");
	    vehicleUsage=scan.next();
	    if(vehicleUsage.equals("Business")){
	      premium+=50;
	    }else if(vehicleUsage.equals("Pleasure")){
	      premium+=10;
	    }else if(vehicleUsage.equals("Commute")){
	      premium+=20;
	      System.out.println("Days Driven To Work And/Or School");
	      daysDrivenToWorkOrSchool=scan.nextInt();
	      premium+=5* daysDrivenToWorkOrSchool;
	      System.out.println("Miles Driven To Work And/Or School");
	      milesToWorkOrSchool=scan.nextInt();
	      premium+=milesToWorkOrSchool;
	    }
	    System.out.println("How old are you?");
	    int age=scan.nextInt();
	    if(age<16){
	      System.out.println("Invalid data!");
	      scan.close();
	    }
	    if(age<18){
	      premium*=20;
	    }else if(age<=21){
	      premium*=6;
	    }else if(age<25){
	      premium*=2;
	    }
	    System.out.println("How many years you've been driving?");
	    int yearDriving=scan.nextInt();
	    if(yearDriving<0 || age-yearDriving<16){
	      System.out.println("Invalid data!");
	      scan.close();
	    }else{
	      premium-=5*yearDriving;
	    }
	    System.out.println("Have you had any accidents in the last 5 years?");
	    String haveAccident=scan.next();
	    if(haveAccident.equals("Yes") || haveAccident.equals("YES")){
	      System.out.println("How many?");
	      accidentsAmount=scan.nextInt();
	      premium+=accidentsAmount*premium/5;
	    }
	    scan.nextLine();
	    System.out.println("Have you had continuous insurance for the past 12 months?");
	    continuousInsurance=scan.nextLine();
	    if(continuousInsurance.equals("No")){
	      premium*=2;
	    }
	    System.out.println("What is the highest level of education you have completed?");
	    education=scan.nextLine();
	    
	    if(education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")){
	      premium-=premium/20;
	    }else if(education.equals("Doctors")){
	      premium-=premium/10;
	    }else if(education.equals("Less than High School")){
	      premium+=premium/20;
	    }
	    education=education.replace(" ", "");
	    referenceNumber+=name.charAt(0)+""+name.charAt(1)+""+age+name.charAt(name.length()-2)+""+name.charAt(name.length()-1)+""+zipCode+education;
	    referenceNumber=referenceNumber.toUpperCase();
	    System.out.println(name + ", here's your quote!");
	    System.out.println("Start Your Policy Today For: $" + premium);
	    System.out.println("Reference number: " + referenceNumber);

	}

}
