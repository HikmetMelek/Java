package replit.loops;

public class UtopianTree {

	public static void main(String[] args) {
		
		int growth=1;
		int size=0;

		for(int year=1 ; year<=10 ; year++) {
				
			growth = (year<=3) ? 1 : 2;
			size+=growth;
			
			System.out.println("year "+year+ " - growth "+growth+" cm");
			System.out.println("tree size: "+size+"cm");
			
		}
		
	}
			

}
//year 1 - growth 1 cm
//tree size: 1cm
//
//year 2 - growth 1 cm
//tree size: 2cm
//
//year 3  - growth 1 cm
//tree size:3cm
//
//year 4 - growth 2 cm
//tree size: 5cm
//
//year 5 - growth 2 cm
//tree size: 7cm
//
//year 6 - growth 2 cm
//tree size: 9cm
//
//... until you reach year 10