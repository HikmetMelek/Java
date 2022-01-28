package assignments.assignmentOnOOPConsept.Q5;

import java.util.Scanner;

public class Q5_TV_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		TV tv = new TV();
		
		System.out.println(tv.getVolumeLevel());  
		tv.turnOff();
		tv.setChannel(in.nextInt());

		TV tv2 = new TV(in.next());
		tv2.turnOn();
		tv2.setChannel(in.nextInt());
		tv2.setChannel(in.nextInt());
		tv2.setVolumeLevel(in.nextInt());
		tv2.volumeUp();

	}

}
