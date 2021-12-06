package replit.methods;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str= scan.nextLine();
	    timeConversion(str);
	    
	}
	  
	public static void timeConversion(String s) {
		if(s.contains("AM")) {
			if(s.substring(0, 2).equals("12")) {
				System.out.println(s.replace("12", "00").replaceAll("[A-Z]", ""));
			}
			else
			System.out.println(s.replaceAll("[A-Z]", ""));
		}
	
		else if(s.contains("PM")) {
			switch(s.substring(0, 2)) {
				case "12":
					System.out.println(s.replaceAll("[A-Z]", "").replace(" ", ""));
				break;
				case "01":
					System.out.println(s.replace("01", "13").replaceAll("[A-Z]", ""));
					break;
				case "02":
					System.out.println(s.replace("02", "14").replaceAll("[A-Z]", ""));
					break;
				case "03":
					System.out.println(s.replace("03", "15").replaceAll("[A-Z]", ""));
					break;
				case "04":
					System.out.println(s.replace("04", "16").replaceAll("[A-Z]", ""));
					break;
				case "05":
					System.out.println(s.replace("05", "17").replaceAll("[A-Z]", ""));
					break;
				case "06":
					System.out.println(s.replace("06", "18").replaceAll("[A-Z]", ""));
					break;
				case "07":
					System.out.println(s.replace("07", "19").replaceAll("[A-Z]", ""));
					break;
				case "08":
					System.out.println(s.replace("08", "20").replaceAll("[A-Z]", ""));
					break;
				case "09":
					System.out.println(s.replace("09", "21").replaceAll("[A-Z]", ""));
					break;
				case "10":
					System.out.println(s.replace("10", "22").replaceAll("[A-Z]", ""));
					break;
				case "11":
					System.out.println(s.replace("11", "23").replaceAll("[A-Z]", ""));
					break;
				
			}		
			
			
		}
		
		
		
		
			 
	}

}
