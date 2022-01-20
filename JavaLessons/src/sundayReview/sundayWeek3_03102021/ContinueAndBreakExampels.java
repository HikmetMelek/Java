package sundayReview.sundayWeek3_03102021;

public class ContinueAndBreakExampels {

	public static void main(String[] args) {
		for (int i=0; i < 10 ; i++) {

            if ( i==3 || i==7 ) {
                continue;  // do not go below this line.
            }
            if( i == 8 ) {
                break; // stop the iteration here.
            }

            System.out.println(i);

        }
		
	System.out.println("----------------------------");
	
	
	
	
	
	
	}

}
