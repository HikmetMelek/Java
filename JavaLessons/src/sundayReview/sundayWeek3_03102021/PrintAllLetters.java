package sundayReview.sundayWeek3_03102021;

public class PrintAllLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (char c= 'A'; c<= 'Z'; c++) {
			
			System.out.print(c+" ");
		}
		System.out.println();
		
		System.out.println("------------");
	
		for (int c= 65; c<= 90; c++) {
			
			System.out.print((char)c+" ");
		}
		
		System.out.println("");
		System.out.println("------------");
		
	    for (int i = 'z'; i>='a'; i--) {     // this is an example of implicit casting-compiler
	            
	    	System.out.print((char)i+" ");   // this is an example of explicit casting- we do it
	       
	    }
		
		
	}

}
