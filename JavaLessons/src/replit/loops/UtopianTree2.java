package replit.loops;

public class UtopianTree2 {

	public static void main(String[] args) {
		
		int growth=1;
		int year=1;
		int size=5;
			
		outer:
			do {
				System.out.println("year "+year+ " - growth "+growth+" cm");
				System.out.println("tree size: "+year+"cm");
				year++;
					inner:
						while(year>=4) {
							growth=2;
							System.out.println("year "+year+ " - growth "+growth+" cm");
							System.out.println("tree size: "+size+"cm");
							size+=2;
							year++;
							if (year>10)  break outer;
						}
			}while(year<=3);
			
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