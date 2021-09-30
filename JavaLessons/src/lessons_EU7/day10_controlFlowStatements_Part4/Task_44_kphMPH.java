package lessons_EU7.day10_controlFlowStatements_Part4;

public class Task_44_kphMPH {

	public static void main(String[] args) {
		
		System.out.println("KPH      MPH");
		System.out.println("-------------");
		
		final int start_kph=60; // you can do this with this way
		final int max_kph=130;
		final int increment= 10;
		int kph;
		double mph;
		
		for(kph=start_kph; kph<=max_kph; kph+=increment) {
			mph= kph*0.6214;
			System.out.printf(kph+"\t"+"%.1f\n",mph);
			
		}

	}

}
