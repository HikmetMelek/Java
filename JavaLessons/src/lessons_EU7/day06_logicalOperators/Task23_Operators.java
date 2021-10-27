package lessons_EU7.day06_logicalOperators;

	public class Task23_Operators {
		public static void main(String[] args) {
			
			double d1= 20;
			double d2= 80.0;
			double res= (d1 + d2) * 25;
			
			double remainder= res % 40;
			boolean cac= remainder<=20;
			
			System.out.println("Remaining total is equel to 20 or less? -"+ cac);
			

		}
		
	
}
