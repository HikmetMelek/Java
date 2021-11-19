package assignments.assignmentOnStringAndMethods;

import java.util.*;

public class Q_13_RouteInstructions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String start = input.nextLine();
		String finish = input.nextLine();
		input.close();
		
		routeInstructions(start, finish);
	}

	public static void routeInstructions(String start, String end) {
			
		start=start.toUpperCase();
		end=end.toUpperCase();
			String [] arr = {"A","B","C","D","A","B","C","D"};
			String directions="";
			String result="";
			
			if(!start.equalsIgnoreCase(end)) {
				
				for(int i=0; i<8; i++) {
					
					if(arr[i].equals(start)) {
						switch(start) {
						case "A": directions = " right >"; break;
						case "B": directions = " down >"; break;
						case "C": directions = " left >"; break;
						case "D": directions = " up >";
						
						}
						result += directions;
						start = arr[i+1];
						if(start.equals(end)) {
							System.out.println(result.substring(1,result.length()-1) + ": " + end + " found");
							break;
						}
					}
					
				}
				
			} else {
				System.out.println(start + " found");
		}
			
	}

}
