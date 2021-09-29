package replit.statements;

import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
//		String houseType;
//		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your property type:");
//		houseType=scan.nextLine();
//			if (houseType=="Condo") propertyPrice=50000;
//			else if (houseType=="Townhouse") propertyPrice=75000;
//			else if (houseType=="Single Family Home") propertyPrice=95000;
			
			
			System.out.println("Do you have a backyard?");
//			backyard=scan.nextBoolean();
//				if (backyard) {
//					propertyPrice=propertyPrice+5000;
//				}
			String houseType="Condo";
				if (houseType=="Condo") {
					System.out.println("Backyard is not available for condo!");
					propertyPrice=propertyPrice-5000;
				}
				
	}

}
