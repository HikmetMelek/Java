package replit.loops;

public class PrintLetters {

	public static void main(String[] args) {
		
		for(char c= 'z' ; c>='v'; c-- ) {
			
			for (char j= 'z' ; j>='v'; j-- ) {
				
				System.out.print(c);
				System.out.print(j);
				System.out.println();
			}
			
		}

	}

}
