package lessons_EU7.day25_arrays_Part2;

public class ReturnArray {

	public static void main(String[] args) {
			
			double[] values= getArray();
			
			for(double num : values) {
				
				System.out.print(num + "   ");
			}
			System.out.println("\n"+ values.length);
	}
	
	public static double[] getArray() {
		
		double[] array= {1.2, 2.3, 3.4, 5.6};
		return array;
	}

}
