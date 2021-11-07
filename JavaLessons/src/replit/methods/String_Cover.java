package replit.methods;

import java.util.Scanner;

public class String_Cover {

	public static void main(String[] args) {
		// hello hello, ello   ---> h[ello] h[ello]
		Scanner in = new Scanner(System.in);
		System.out.println(coverString(in.nextLine(), in.nextLine()));
	}
	public static String coverString(String main, String coverME) {
		String cover="";
		String size="";
		String changedCoverME="[" + coverME + "]";
		
		if(!main.contains(coverME)) {
			cover= "[" + main + "]";
		}
		else {
			for (int i=0; i<main.length()-coverME.length();i++) {
				size= main.substring(i, i+coverME.length());
				
				if (size.contains(coverME))
				cover= main.replace(coverME, changedCoverME );
				
			}		
		}
		return cover;

	}
}
	
	
	
	
	
	
